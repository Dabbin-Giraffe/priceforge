# ADR-0006: Publishing events without an outbox (v1)

- **Status:** Accepted (2026-10-11)
- **Related:** SPEC §4.3, §6 (known v1 limitation), §7 S-1 · ARCHITECTURE §7.3, §8.4 · ADR-0005

## Context

A pricing change is a database write, and its event is a Kafka send. The two can't be made
atomic without a transactional outbox, and the outbox is stretch goal S-1. So v1 has to choose
which failure it accepts.

The domain is lopsided:
- **A phantom event** (the event went out, but the change rolled back) marks quotes STALE for
  nothing. Re-pricing gives the same price. **That's cheap.** SPEC §4.3 already allows marking too
  many quotes.
- **A lost event** (the change committed, but no event went out) leaves quotes PRICED at outdated
  prices, so a rep could accept one. **That breaks the core promise** in SPEC §1.

## Options considered

1. **Send after the commit**, for example with an after-commit listener.
   - If the process crashes after the commit, or **Kafka is down**, the event is lost.
2. **Send synchronously inside the transaction, before the commit.**
   - If the send fails, the change rolls back.
   - If the commit fails after a successful send, a phantom event goes out.
3. **Kafka transactions synchronized with the database transaction.**
   - The two commits still happen one after the other, so one of the failure modes above remains,
     at a much higher complexity cost.
4. **Transactional outbox with a relay.**
   - Correct, but it's stretch goal S-1.

## Decision

Option 2.

- The `@Transactional` service method that changes pricing data builds the event and sends it.
- It waits for the broker's acknowledgement, up to `priceforge.pricing.publish-timeout` (5 s).
- Any failure throws, the database rolls back, and the API returns
  **503 `event-publish-failed`**.

## Consequences

- **No lost events,** unless the broker itself loses data (replication factor 1, ADR-0005).
  Phantom events can happen, and they're harmless.
- **Admin writes need Kafka to be up.** That's an availability trade-off, accepted because admin
  writes are rare. Price calculations and quotes don't depend on the send.
- **The database transaction stays open during the Kafka round trip.** That's fine at this volume.
- **Known gap.** The consumer can process the event before pricing's commit is visible. If someone
  re-prices a quote in that window of a few milliseconds, the quote can end up PRICED at the old
  price. **S-1 (the outbox) closes this gap.** The gap is written down here, so it isn't a
  surprise later.
- **Revisit** when S-1 is implemented. That will be a new ADR superseding this one.
