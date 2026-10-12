# PriceForge: Specification

> **This file owns** what PriceForge is and why: scope, features, non-goals and project-level
> acceptance criteria. **It changes** only with Shashank's explicit approval, recorded in the
> [Changelog](#changelog). How it's built lives in [ARCHITECTURE.md](ARCHITECTURE.md), decisions in
> [adr/](adr/), and task status in [TASKS.md](TASKS.md).
> Precedence: SPEC > accepted ADRs > ARCHITECTURE > TASKS > chat.

**Status:** Approved 2026-10-11 (v1 scope)

## 1. Problem statement

In B2B sales, customers rarely pay the list price. What they pay depends on who they are
(customer segment), what they buy (product category) and how much they buy (quantity tier), and
several rules can apply to the same line at once. A sales rep needs four things:

1. **A price they can trust.** The same inputs always give the same price, to the cent.
2. **A breakdown.** It shows every rule that applied, and every rule that matched but lost.
3. **A plain-English explanation** they can pass on to the customer.
4. **A warning when pricing has changed** since they quoted, so they never accept an outdated quote.

PriceForge is a small backend that does exactly this. It's also a public portfolio project that
shows production-style Java backend work:
- two services that talk over Kafka
- PostgreSQL with migrations and a Redis cache
- container-based tests and CI
- a cost-capped AWS deployment
- an LLM feature that degrades gracefully when the LLM isn't available

Two roles use it. v1 has no authentication, so the roles are conceptual and not enforced:
- **Pricing admin:** maintains products, price lists and discount rules.
- **Sales rep:** creates quotes, re-prices and accepts them, and asks for explanations.

## 2. Constraints

| ID | Constraint |
| --- | --- |
| C-1 | Solo project. Shashank writes all code and tests. Claude only plans, explains and reviews. |
| C-2 | v1 (every feature in §5, every criterion in §8) is done by **Sunday 2026-11-22**. |
| C-3 | Runs on the dev laptop: Linux, **8 GB RAM**. The full local stack must stay within the memory budget in ARCHITECTURE. |
| C-4 | AWS costs **at most $10/month while deployed**: deploy, demo, then tear down. There's no AWS account yet. Open one shortly before the AWS milestone, because the Free plan ends 6 months after sign-up. |
| C-5 | **With $0 LLM spend the system must still work fully**, using fallback explanations. Any paid LLM use has a hard cap. The provider and cap are decided in an ADR. |
| C-6 | Stack: Java 21, Maven, Spring Boot 4.x and Spring AI 2.x ([ADR-0001](adr/0001-spring-boot-4-and-spring-ai-2.md)), PostgreSQL, Spring Data JPA, Flyway, Kafka in KRaft mode, Redis, Testcontainers, Docker Compose, GitHub Actions, AWS. Exact versions are in ARCHITECTURE § Versions. |
| C-7 | The domain is invented and neutral. No employer names, code, field names, schemas or data, and nothing copied from practice assignments. |
| C-8 | No secrets in the repo. All configuration comes from environment variables, documented in `.env.example`. |
| C-9 | The public demo has no auth, so it must not allow unbounded cost. Deploy only for demo windows, and cap or disable LLM calls in the cloud. |

## 3. Domain model (conceptual)

The demo data is a fictional wholesaler of workshop supplies. Tables, columns and indexes are in
ARCHITECTURE.

### 3.1 Entities

| Entity | Owned by | Key attributes | Rules |
| --- | --- | --- | --- |
| Product | pricing-service | `sku` (unique), name, category, active | SKU and category never change after creation. |
| PriceList | pricing-service | `code` (unique), name, currency, status | At most one ACTIVE list at any time. A list with no entries can't be activated. |
| PriceListEntry | pricing-service | price list, product, unit list price | One entry per product per list. Editable only while the list is DRAFT. |
| DiscountRule | pricing-service | `code` (unique), description, conditions (segment, category, min quantity; each optional), percent off, priority, exclusive group (optional), active | See §4. |
| Quote | quote-service | id, customer name, segment, currency, status, price list code used, priced at, totals | The customer name is free text. There's no customer master data. |
| QuoteLine | quote-service | SKU, quantity, and a pricing snapshot: product name, category, unit list price, unit net price, line total, breakdown | The snapshot stays frozen until the quote is re-priced. |
| QuoteHistoryEntry | quote-service | quote, type (CREATED, PRICING_CHANGED, REPRICED, ACCEPTED), occurred at, cause | An audit trail. It also makes a duplicate event delivery visible. |

Quote lines refer to products by SKU only. There are no foreign keys across services.

### 3.2 Fixed vocabularies (v1)

- **Segments:** `RETAIL_SHOP`, `CONTRACTOR`, `DISTRIBUTOR`
- **Categories:** `FASTENERS`, `HAND_TOOLS`, `SAFETY_GEAR`
- **Currency:** one per deployment (the demo uses USD). Price lists in any other currency are
  rejected. Amounts are exact decimals with 2 places.

### 3.3 Lifecycles

- **PriceList:** `DRAFT → ACTIVE → RETIRED`. Activating a DRAFT or RETIRED list retires the current
  ACTIVE list in the same step. To roll back, re-activate a RETIRED list.
- **Quote:** a new quote is `PRICED`. It moves `PRICED → STALE` when pricing changes (§4.3), and
  `PRICED or STALE → PRICED` when it's re-priced. `PRICED → ACCEPTED` is final. A STALE quote can't
  be accepted.

## 4. Business rules

### 4.1 Pricing one line

Input: a segment, a SKU and a quantity from 1 to 100,000. Prices come from the ACTIVE price list.

1. **List price** is the active list's entry for the SKU. It's an error if the SKU is unknown, the
   product is inactive, there's no active list, or the SKU isn't in the active list.
2. **Match.** An active rule matches when every condition it sets holds: same segment, same
   category, quantity ≥ min quantity. An empty condition matches anything, so a rule with no
   conditions applies to every line.
3. **Exclusive groups.** If several matching rules share a group, only the one with the highest
   percent off applies. Ties go to the lower priority number, then to the code in A→Z order. The
   others are recorded as SUPERSEDED, with the winner's code.
4. **Apply** the remaining rules in ascending priority (ties: code A→Z). Each step multiplies the
   price by (1 − percent/100) and rounds half-up to the cent. Discounts compound.
5. **Cap.** If the total discount is more than the cap (configurable, default 25%), the net unit
   price becomes list × (1 − cap). A CAP step records the amount added back.
6. **Line total** is net unit price × quantity. Quote totals are sums over the lines.

Percent off must be above 0 and below 100, with at most 2 decimal places.

### 4.2 Worked examples (acceptance fixtures)

Demo rules:

| Code | Condition | % off | Priority | Group |
| --- | --- | --- | --- | --- |
| SEG-CONTRACTOR-5 | segment = CONTRACTOR | 5 | 10 | (none) |
| SEG-DISTRIBUTOR-20 | segment = DISTRIBUTOR | 20 | 10 | (none) |
| CAT-FASTENERS-3 | category = FASTENERS | 3 | 20 | (none) |
| VOL-10 | quantity ≥ 10 | 4 | 30 | VOLUME |
| VOL-100 | quantity ≥ 100 | 8 | 30 | VOLUME |

The product is `FST-HEXBOLT-M8-100` (a box of 100 M8 hex bolts), category FASTENERS, list price 12.00.

**A. Compounding and an exclusive group.** CONTRACTOR, quantity 150:

| Step | Rule | Unit price | Change |
| --- | --- | --- | --- |
| List price | (none) | 12.00 | (none) |
| Applied | SEG-CONTRACTOR-5 | 11.40 | −0.60 |
| Applied | CAT-FASTENERS-3 | 11.06 | −0.34 (11.058 rounds to 11.06) |
| Applied | VOL-100 | 10.18 | −0.88 (10.1752 rounds to 10.18) |
| Superseded | VOL-10 | (none) | lost to VOL-100 in group VOLUME |

The net unit price is 10.18 and the line total is 1,527.00. The total discount is 15.17%, not
5 + 3 + 8 = 16%, because discounts compound.

**B. The tier cliff.** Same customer and product. 99 boxes get VOL-10: unit 10.62, line total
1,051.38. 100 boxes get VOL-100: unit 10.18, line total 1,018.00. Buying one more box lowers the
bill by 33.38. That's correct, and the explanation must make it understandable.

**C. The cap.** DISTRIBUTOR, quantity 150: 12.00 → 9.60 (SEG-DISTRIBUTOR-20) → 9.31
(CAT-FASTENERS-3) → 8.57 (VOL-100). The total discount, 28.58%, is over the 25% cap, so a CAP step
adds back 0.43. The net unit price is 9.00 and the line total is 1,350.00.

**D. Why priority matters even for percentages.** Apply the same three discounts as Example A in
a different order: 8%, then 3%, then 5%. That gives 11.04 → 10.71 → 10.17, one cent less than
Example A. Each step rounds, so order changes the result. Priority makes the order explicit and
the result reproducible.

### 4.3 When quotes go stale

- Every pricing change has a **scope**: a set of segments and a set of categories, where either set
  can be "all".
  - A price list activation affects everything.
  - A rule change covers the segments and categories its conditions named, before and after the
    change. An empty condition means "all".
  - Quantity conditions are ignored. That can only mark too many quotes, never miss one.
- A PRICED quote becomes STALE if its segment is in scope and at least one of its lines has a
  category in scope.
- Each affected quote gets one PRICING_CHANGED history entry per distinct change, even if it's
  already STALE. Delivering the same change again adds nothing.
- ACCEPTED quotes never change. Editing only a rule's description emits no change. Product edits
  (renaming, deactivating) don't affect quotes in v1.

### 4.4 Explanations

- An explanation is based only on the quote's stored snapshot, never on current prices.
- It covers:
  - the list price
  - each applied rule, in order, with its saving
  - superseded rules and why they lost
  - any cap
  - the net price and line total
  - for a STALE quote, a note that pricing has changed since
- Every response has a `source`:
  - `LLM` normally.
  - `FALLBACK` when no LLM is configured, the call fails, or it takes longer than the time limit
    (configurable, default 10 s). A fallback is a deterministic template built from the snapshot.
- The customer name is never sent to the LLM.

## 5. Features (v1)

**pricing-service**
- **F-1 Products:** create, read, list, rename, deactivate and reactivate.
- **F-2 Price lists:** create as DRAFT, set or remove entry prices while DRAFT, read, list, activate.
- **F-3 Discount rules:** create, read, list, update, activate and deactivate.
- **F-4 Price calculation:** one segment plus 1–50 lines (SKU and quantity) returns a per-line
  breakdown and totals, following §4.1.
- **F-5 Pricing-change events:** one event per price list activation and one per price-relevant
  rule change, each carrying its §4.3 scope.
- **F-6 Price lookup cache:**
  - Repeated lookups come from Redis, with a TTL.
  - A committed change shows up in the very next calculation.
  - If Redis is down, pricing still works, just more slowly.

**quote-service**
- **F-7 Quotes:**
  - Create a quote from a customer name, a segment and 1–50 lines. Each line is priced by
    pricing-service, and the snapshot is stored. The create call returns the priced quote.
  - If pricing-service is unavailable, creation fails with a clear error and nothing is stored.
  - Read one quote with its history, or list quotes by status (paged).
- **F-8 Reacting to pricing changes:** quotes go stale following §4.3. Delivery is at-least-once and
  handled idempotently, with bounded retries and then a dead-letter topic.
- **F-9 Re-pricing and accepting:** following §3.3.
- **F-10 Explanations:** following §4.4.

**Both services and the project as a whole**
- **F-11** Request validation and consistent error responses (RFC 9457 Problem Details).
- **F-12** Health endpoints for both services.
- **F-13** One-command local stack (Docker Compose), within the memory budget.
- **F-14** Automated tests (unit, slice and Testcontainers integration) and GitHub Actions CI.
- **F-15** A cost-capped AWS deployment: budget alert first, then deploy, smoke test and teardown.
- **F-16** Portfolio docs: README, architecture diagram, design decisions and a demo script.

## 6. Non-goals (v1)

- Any frontend UI. The API is driven with HTTP files or curl.
- Authentication or authorization of any kind: no OAuth, no auth server, no API keys.
- Kubernetes, a service mesh, an API gateway or service discovery.
- More than two application services. Infrastructure containers don't count.
- Multi-region, high availability or autoscaling.
- Any AWS service that would push the monthly cost past C-4.
- Multi-currency, exchange rates, taxes, invoices, payments, orders or inventory.
- Customer master data or a CRM.
- Scheduled pricing changes (validity dates on price lists or rules).
- Fixed-amount discounts, contract prices, discounts on the order total, coupons, approval
  workflows, quote expiry, and PDF or email output.
- Exactly-once processing across services.
- Metrics dashboards, distributed tracing or central logging. v1 has health endpoints only.
- Performance or load-testing targets.

**Known v1 limitation:** a database write and its event are not published atomically, because
there's no transactional outbox. The event-publishing ADR records which failure v1 accepts.
Stretch goal S-1 closes the gap.

## 7. Stretch goals (only after every §8 criterion passes)

- **S-1** A transactional outbox for pricing-change events.
- **S-2** An OpenAPI description and Swagger UI for both services.
- **S-3** An automatic check on LLM explanations: if one contains an amount that isn't in the
  snapshot, return the FALLBACK instead.
- **S-4** Cache explanations per quote pricing version, so repeat requests don't trigger more LLM
  calls.

## 8. Acceptance criteria (project level)

| ID | Criterion |
| --- | --- |
| AC-1 | From a fresh clone, after copying `.env.example` to `.env`, one documented command starts PostgreSQL, Kafka, Redis and both services. Both report healthy within 3 minutes on the 8 GB dev laptop, and the stack stays within the documented memory budget. |
| AC-2 | Automated tests reproduce Examples A–D in §4.2 to the cent, both in the pricing engine and through the price-calculation API. |
| AC-3 | Every error response from both services is an RFC 9457 Problem Details body with a stable `type`. A validation error lists each invalid field. |
| AC-4 | Later pricing changes never alter a quote's stored breakdown. Only an explicit re-price replaces it. |
| AC-5 | With the local stack running, a price list activation or rule change marks the affected PRICED quotes STALE within 10 seconds. ACCEPTED quotes never change. Accepting a STALE quote returns 409 Conflict. |
| AC-6 | A test delivers the same pricing-change event twice, and the quote gets exactly one PRICING_CHANGED entry. A malformed event is retried a bounded number of times and lands on the dead-letter topic, and the events after it are still processed. |
| AC-7 | Integration tests show three things: a repeated lookup is served from Redis, a committed change appears in the very next calculation, and prices are still correct with Redis stopped. |
| AC-8 | Automated tests with a mocked LLM show `source: LLM` when the LLM responds. They show `source: FALLBACK` when there's no key, the LLM errors, or it times out, with the response arriving within the time limit plus 1 second. The fallback text contains exactly the snapshot's amounts. |
| AC-9 | One Maven command runs every unit, slice and Testcontainers test for both services. GitHub Actions runs it on every push and pull request, and `main` is green. |
| AC-10 | An AWS budget alert exists before the first billable resource. The deployed stack passes the demo script, and the month's AWS bill is at most $10. The teardown runbook leaves zero billable resources, and that is checked. |
| AC-11 | There are no secrets anywhere in git history. Every setting comes from environment variables listed in `.env.example`. |
| AC-12 | The README explains the problem, shows an architecture diagram, says how to run it, summarises the design decisions with links to the ADRs, and includes a demo script of 5 minutes or less. |

## Changelog

Format: `YYYY-MM-DD: change. Reason. Approved by.`

_No entries yet._
