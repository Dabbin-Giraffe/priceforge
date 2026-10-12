# ADR-0001: Spring Boot 4.1 and Spring AI 2.0 instead of 3.x

- **Status:** Accepted (2026-10-11)
- **Related:** SPEC C-6, ARCHITECTURE §16

## Context

The original brief said "Spring Boot 3.x". Support dates checked on 2026-10-11:

- **Spring Boot 3.5.x**, the last 3.x line: OSS support **ended 2026-06-30**. Commercial support
  runs to 2032-06-30.
- **Spring Boot 4.1.x**: released 2026-06-30, OSS support until **2027-07-31**. The current release
  is 4.1.1. 4.0.x OSS ends 2026-12-31, and 4.2.0 is due 2026-11-30 (milestones only today).
  Source: https://api.spring.io/projects/spring-boot/generations and Maven Central metadata.
- **Spring AI** 1.0.x and 1.1.x: OSS support **ended 2026-06-30**. Spring AI 2.0.x runs until
  2027-07-31, and the current release is 2.0.1. The docs say "Spring AI 2.0.x supports Spring Boot
  4.0.x and 4.1.x". Source: https://api.spring.io/projects/spring-ai/generations and
  https://docs.spring.io/spring-ai/reference/getting-started.html.
- Boot 4.1.1 needs Java 17 to 26 and Maven 3.6.3 or later
  (https://docs.spring.io/spring-boot/system-requirements.html).

PriceForge is a portfolio project starting in October 2026. Shashank chose Boot 4.1 with Spring
AI 2.0 in the Phase A interview.

## Options considered

1. **Boot 3.5.x + Spring AI 1.1.x, as briefed.**
   - Pro: most tutorials and Q&A match.
   - Con: no free patches since 2026-06-30, and it looks dated in a late-2026 portfolio.
2. **Boot 4.0.x.**
   - Pro: current.
   - Con: OSS support ends 2026-12-31, about a month after v1 ships.
3. **Boot 4.1.x + Spring AI 2.0.x.**
   - Pro: the current releases, supported to mid-2027, and the official docs match.
   - Con: fewer third-party tutorials.
4. **Boot 4.2 milestones.**
   - Con: pre-release software on a deadline.

## Decision

Option 3. Pin Spring Boot **4.1.1** and Spring AI **2.0.1**. ARCHITECTURE §16 holds the full
version table.

- Upgrading to a newer 4.1.x patch release is allowed as a task.
- Moving to 4.2 needs a new ADR, after v1.

## Consequences

- **Gain:** supported, current versions, and an upgrade story worth telling in interviews.
- **Cost:** many blog posts are written for 3.x. **The rule is: when a blog post and the official
  4.1 or 2.0 docs disagree, the docs win.** Every task card links the official docs. Known
  differences found while planning:
  - `spring-boot-starter-web` is deprecated in favour of `spring-boot-starter-webmvc`, and
    there are now per-technology test starters (for example `spring-boot-starter-webmvc-test`).
  - Testcontainers 2.x moved classes, for example `org.testcontainers.postgresql.PostgreSQLContainer`.
  - Spring Kafka 4.1 names its default dead-letter topic `<topic>-dlt`.
  - Jackson 3 (`tools.jackson`) is the default JSON library.
- **Revisit** if a library we need doesn't support Boot 4.1 yet.
