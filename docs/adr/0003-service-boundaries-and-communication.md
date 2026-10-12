# ADR-0003: Service boundaries and how the services talk

- **Status:** Accepted (2026-10-11)
- **Related:** SPEC F-4, F-5, F-7, F-8, §4.3 · ARCHITECTURE §1, §2, §8

## Context

- The brief says quote-service "requests prices and reacts to pricing events", and that the
  services communicate over Kafka.
- SPEC F-7 requires that **creating a quote returns the priced quote**, and that creation fails
  cleanly if pricing is unavailable.
- SPEC F-8 requires that quotes react to pricing changes.
- v1 is limited to two services (SPEC §6).

## Options considered

**For getting a price:**
1. **Synchronous REST** from quote-service to pricing-service.
   - Pro: simple, immediate answer, easy to test.
   - Con: temporal coupling (pricing must be up to create a quote).
2. **Kafka request/reply** (a reply topic and correlation IDs) or an **async saga** (202 + polling).
   - Pro: "all Kafka".
   - Con: the API becomes asynchronous, contradicting F-7. It adds correlation, timeouts and an
     extra quote state, roughly 6–8 more tasks.

**For telling quotes about changes:**
3. **Kafka events** from pricing to quote.
   - Pro: decoupled, and works even if quote-service is down at that moment.
   - Con: eventual consistency.
4. **quote-service polls pricing for changes.**
   - Con: wasteful, slow to notice, and pricing would need a changes endpoint.

## Decision

Options 1 and 3.

- **pricing-service owns:**
  - products, price lists, discount rules
  - the pricing engine and its cache
  - publishing change events
- **quote-service owns:**
  - quotes, quote lines and history
  - stale-quote marking
  - explanations
- **Getting a price:** quote-service calls `POST /api/v1/price-calculations`.
  - Connect timeout 1 s, read timeout 3 s, no automatic retries.
  - On failure it returns 503 `pricing-unavailable` and stores nothing.
- **Change notifications:** go over Kafka (ADR-0004, ADR-0005, ADR-0006).
- **Databases:** one per service, both on the same PostgreSQL server (to fit 8 GB of RAM).
  - Each service has its own database user.
  - No cross-database queries.

## Consequences

- **Kafka is used where it fits:** fan-out notifications that must survive the consumer being
  down.
- **Quote creation depends on pricing-service being up.** SPEC F-7 accepts this.
- **Sharing one PostgreSQL server** is a deployment shortcut, not a shared schema. Splitting the
  servers later needs no code change.
- **Revisit** if quote creation ever has to work while pricing is down.
