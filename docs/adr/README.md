# Architecture Decision Records

Each ADR records **one decision**: its context, the options considered, the decision and its
consequences. An ADR is immutable once it's Accepted. To change a decision, write a new ADR that
supersedes it, and update the old ADR's status line to point at the new one. That status line is
the only edit an Accepted ADR ever gets.

The current *how* is described in [ARCHITECTURE.md](../ARCHITECTURE.md), which must stay
consistent with every Accepted ADR.

| ADR | Title | Status |
| --- | --- | --- |
| [0001](0001-spring-boot-4-and-spring-ai-2.md) | Spring Boot 4.1 and Spring AI 2.0 instead of 3.x | Accepted |
| [0002](0002-monorepo-maven-multi-module.md) | One repository, Maven multi-module build | Accepted |
| [0003](0003-service-boundaries-and-communication.md) | Service boundaries and how the services talk | Accepted |
| [0004](0004-event-schema-format.md) | Event schema format: versioned JSON | Accepted |
| [0005](0005-kafka-topic-design.md) | Kafka topic design, retries and dead-letter topic | Accepted |
| [0006](0006-event-publishing-consistency.md) | Publishing events without an outbox (v1) | Accepted |
| [0007](0007-caching-strategy.md) | Caching strategy for price lookups | Accepted |
| [0008](0008-llm-explanations-design.md) | LLM explanations: provider-neutral, deadline, fallback | Accepted |
| [0009](0009-aws-deployment-target.md) | AWS deployment target and cost guardrails | Accepted |

## Template

```markdown
# ADR-NNNN: <decision in a few words>

- **Status:** Proposed | Accepted (YYYY-MM-DD) | Superseded by ADR-NNNN
- **Related:** SPEC §…, ARCHITECTURE §…, ADR-…

## Context
What forces this decision. Facts include their source and the date they were checked.

## Options considered
Two to four real options, each with its main pro and con.

## Decision
What we do. Concrete enough to act on.

## Consequences
What gets easier, what gets harder, what we accept, and when to revisit.
```
