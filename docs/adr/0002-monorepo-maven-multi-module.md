# ADR-0002: One repository, Maven multi-module build

- **Status:** Accepted (2026-10-11)
- **Related:** SPEC C-1, AC-9 · ARCHITECTURE §3, §5

## Context

- There are two services and one developer. CI must run every test with one command (AC-9).
- Both services share a small contract: the segment and category enums, the price-calculation
  request and response, and the pricing-change event.
- The repo is a public portfolio piece, so a reviewer should see everything in one place.
- The system Maven is 3.6.3. Boot 4.1.1 accepts it, but CI and the laptop should run the same
  Maven version.

## Options considered

1. **Two repositories.**
   - Pro: true independence.
   - Con: two CI pipelines, contract changes split across PRs, and a reviewer has to jump between
     repos.
2. **One repo with two independent Maven builds (no parent).**
   - Pro: no coupling.
   - Con: duplicated build config, and no single `verify`.
3. **One repo with a parent POM and three modules: `contracts`, `pricing-service`, `quote-service`.**
   - Pro: one build, one CI, and contract changes are compiled against both sides in the same PR.
   - Con: the modules are versioned together.

## Decision

Option 3.

- **Parent POM:** the root `pom.xml` (`priceforge-parent`) inherits `spring-boot-starter-parent`
  4.1.1 and imports `spring-ai-bom` 2.0.1.
- **`contracts`:** holds only records, enums and constants that cross the boundary. No Spring, no
  JPA, no logic.
- **Services:** each service is its own Boot application with its own Dockerfile and image.
- **Maven Wrapper:** pinned to Maven 3.10.0, the current release. Everyone runs `./mvnw`: the
  laptop, CI and the docs.

## Consequences

- **One build:** `./mvnw verify` builds and tests everything, and a single module builds with
  `-pl <module> -am`.
- **Shared release version:** the services share a version number but still deploy as separate
  containers. That's fine for one team.
- **Contracts stay dumb.** Changes to them are additive only, and readers ignore unknown JSON
  fields (see ADR-0004), so a contract change never forces both services to redeploy in lockstep.
- **Revisit** if a third service or a second team appears.
