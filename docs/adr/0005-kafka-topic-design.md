# ADR-0005: Kafka topic design, retries and dead-letter topic

- **Status:** Accepted (2026-10-11)
- **Related:** SPEC F-5, F-8, AC-5, AC-6 · ARCHITECTURE §7 · ADR-0004, ADR-0006

## Context

- **Infrastructure:** one Kafka broker in KRaft mode (`apache/kafka:4.2.2`), both locally and on
  the demo instance.
- **Requirement:** SPEC F-8 asks for bounded retries, then a dead-letter topic (DLT).
- **Spring Kafka 4.1.1 facts** (https://docs.spring.io/spring-kafka/reference/kafka/annotation-error-handling.html,
  checked 2026-10-11):
  - `DeadLetterPublishingRecoverer` sends to `<originalTopic>-dlt` by default, **on the same
    partition**. So the DLT needs at least as many partitions as the source topic.
  - `DefaultErrorHandler` defaults to `FixedBackOff(0L, 9)`: 10 attempts with no delay.
  - `DeserializationException` is fatal by default, so it isn't retried.
  - Older tutorials name the DLT `<topic>.DLT`.

## Options considered

1. **One topic per event type** (for example `pricing.price-list-activated` and
   `pricing.rule-changed`).
   - Pro: narrow consumers.
   - Con: more topics, and no ordering across event types.
2. **One topic for all pricing changes, keyed by subject.**
   - Pro: one stream, ordered per price list or rule.
   - Con: the consumer switches on `eventType`.
3. **Non-blocking retries (`@RetryableTopic` retry topics)**, as opposed to **blocking retries
   followed by a DLT**.
   - Non-blocking keeps the partition flowing, but adds topics and reorders events. That's
     overkill for a few events a day.

## Decision

Option 2 with blocking retries.

**Topics**
- `pricing.changes.v1`: 3 partitions, replication factor 1, 7-day retention. The record key is the
  event's `subject` (for example `discount-rule:CAT-FASTENERS-3`).
- `pricing.changes.v1-dlt`: 3 partitions, replication factor 1, 30-day retention.
- **Topic names** follow `<domain>.<stream>.v<major>`, and DLT names follow `<topic>-dlt`.
- **Creation:** the producing application declares the topics. Broker auto-creation is disabled.

**Consumer**
- Group `quote-service`, `auto.offset.reset=earliest`.
- `DefaultErrorHandler` with `FixedBackOff(1000L, 2)`: 3 attempts, 1 s apart.
- After that, `DeadLetterPublishingRecoverer` sends the record to the DLT.
- Deserialization failures go straight to the DLT.

**Producer:** `acks=all`, idempotent.

## Consequences

- **Ordering:** events about the same price list or rule are processed in order, and different
  subjects can run in parallel.
- **No replication:** with replication factor 1, losing the broker loses data. That's accepted
  for dev and demo; production would need 3 brokers and `min.insync.replicas=2`.
- **Parallelism:** with one quote-service instance, all 3 partitions go to one consumer. The
  partition count only demonstrates keys and ordering.
- **Inspecting the DLT:** with `kafka-console-consumer.sh` (part of the demo script). Replaying
  dead letters is out of scope for v1.
