# ADR-0004: Event schema format: versioned JSON

- **Status:** Accepted (2026-10-11)
- **Related:** SPEC F-5, F-8, C-3, C-4 · ARCHITECTURE §7.2, §7.3 · ADR-0002, ADR-0005

## Context

- There's one event stream (pricing changes). Both producer and consumer are Java and live in the
  same repo (ADR-0002).
- The dev laptop has 8 GB of RAM, and the cloud budget is $10/month. Every extra container costs
  memory, and in the cloud, money.
- Spring Kafka 4.1.1's JSON serializer is `JacksonJsonSerializer`. Its `ADD_TYPE_INFO_HEADERS`
  setting defaults to `true`, which writes the **producer's Java class name** into a record header
  (https://docs.spring.io/spring-kafka/reference/kafka/serdes.html, checked 2026-10-11).

## Options considered

1. **JSON with an explicit envelope and a `schemaVersion` field**, with the record defined in
   `contracts`.
   - Pro: readable in console tools, no extra infrastructure.
   - Con: no registry enforces compatibility.
2. **Avro plus a Schema Registry.**
   - Pro: enforced compatibility, compact.
   - Con: an extra JVM container, code generation, and registry operations, for one topic.
3. **Protobuf.**
   - Pro: compact and typed.
   - Con: code generation, and without a registry it brings little benefit here.
4. **The CloudEvents envelope.**
   - Pro: a standard.
   - Con: an extra concept and library for one internal stream.

## Decision

Option 1. ARCHITECTURE §7.2 defines the `PricingChangedEvent` v1 fields.

**Compatibility rules**
- Within a version, changes are **additive only**.
- Consumers **ignore unknown fields** (the tolerant reader pattern).
- A breaking change gets a **new topic** (`pricing.changes.v2`). The producer publishes to both
  topics until consumers have moved over.

**Serialization**
- Type-info headers are **off** (`ADD_TYPE_INFO_HEADERS=false`).
- The consumer uses `JacksonJsonDeserializer` with `VALUE_DEFAULT_TYPE` set to the contract record,
  wrapped in `ErrorHandlingDeserializer` so a poison message goes to the dead-letter topic
  (ADR-0005).

**Compatibility checks:** JSON fixtures in `contracts` tests. One test pins the exact v1 JSON;
another checks that a payload with an extra unknown field still deserializes.

## Consequences

- **No extra containers,** and events are readable with `kafka-console-consumer.sh`.
- **No registry enforces compatibility.** It's enforced by tests and code review.
- **Turning type headers off** means the consumer doesn't depend on the producer's class names.
  This is the most common cause of a `ClassNotFoundException` in Kafka tutorials.
- **Revisit** if there are more than about five event types, or a consumer that isn't Java.
