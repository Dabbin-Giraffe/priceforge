# PriceForge: Tasks

> **This file owns** the backlog and is **the only place task status lives** (summary table
> below). Statuses: TODO, IN-PROGRESS, DONE, SKIPPED, BLOCKED. IDs are never renumbered; new tasks get the
> next free ID and declare their dependencies. What and why: [SPEC.md](SPEC.md). How:
> [ARCHITECTURE.md](ARCHITECTURE.md).

**Status:** Backlog approved 2026-10-12.

<!-- SUMMARY:START -->
| ID | Title | Milestone | Est. | Status |
| --- | --- | --- | --- | --- |
| PF-001 | Free disk space to at least 15 GB | M0 | 20 min | DONE |
| PF-002 | Stop the global JVM heap override | M0 | 15 min | DONE |
| PF-003 | First commit on main, without the planning prompt | M0 | 15 min | DONE |
| PF-004 | Add .editorconfig and a LICENSE | M0 | 10 min | DONE |
| PF-005 | Write the README skeleton | M0 | 20 min | DONE |
| PF-006 | Create the GitHub repo and push main | M0 | 25 min | DONE |
| PF-007 | learn: Docker Compose spike | M1 | 25 min | DONE |
| PF-008 | learn: PostgreSQL spike | M1 | 30 min | DONE |
| PF-009 | Add Postgres to compose.yaml | M1 | 25 min | DONE |
| PF-010 | Create the pricing and quote databases on first start | M1 | 25 min | DONE |
| PF-011 | Checkpoint 1: foundation and database | M1 | 15 min | DONE |
| PF-012 | learn: Maven multi-module spike | M2 | 25 min | SKIPPED |
| PF-013 | Add the parent POM and the Maven Wrapper | M2 | 25 min | DONE |
| PF-014 | Add the contracts module with Segment and Category | M2 | 20 min | DONE |
| PF-015 | Generate pricing-service and wire it in | M2 | 30 min | DONE |
| PF-016 | learn: JUnit Jupiter and AssertJ spike | M2 | 25 min | SKIPPED |
| PF-017 | First test: the health endpoint says UP | M2 | 25 min | DONE |
| PF-018 | learn: GitHub Actions spike in a throwaway repo | M8 | 25 min | DONE |
| PF-019 | Add the CI workflow | M8 | 25 min | DONE |
| PF-020 | Add the CI badge and protect main | M8 | 20 min | DONE |
| PF-021 | Checkpoint 2: skeleton under CI | M8 | 15 min | DONE |
| PF-022 | design: define the pricing engine's types | M3 | 25 min | DONE |
| PF-023 | Money rounding helper | M3 | 20 min | DONE |
| PF-024 | Rule matching | M3 | 25 min | TODO |
| PF-025 | Exclusive groups | M3 | 30 min | TODO |
| PF-026 | Apply rules in priority order (Examples A and D) | M3 | 30 min | TODO |
| PF-027 | The discount cap (Example C) | M3 | 25 min | TODO |
| PF-028 | Line total and the tier cliff (Example B) | M3 | 20 min | TODO |
| PF-029 | learn: Testcontainers spike | M3 | 30 min | TODO |
| PF-030 | learn: Flyway spike | M3 | 25 min | TODO |
| PF-031 | Checkpoint 3: the engine matches the SPEC | M3 | 15 min | TODO |
| PF-032 | Give pricing-service a database | M3 | 30 min | TODO |
| PF-033 | Flyway V1: the product table | M3 | 25 min | TODO |
| PF-034 | learn: JPA and Hibernate spike | M3 | 30 min | TODO |
| PF-035 | Product entity and repository | M3 | 30 min | TODO |
| PF-036 | Flyway V2: price lists and entries | M3 | 25 min | TODO |
| PF-037 | PriceList and PriceListEntry entities | M3 | 30 min | TODO |
| PF-038 | Test: only one ACTIVE price list | M3 | 20 min | TODO |
| PF-039 | Flyway V3: discount rules | M3 | 20 min | TODO |
| PF-040 | DiscountRule entity and repository | M3 | 25 min | TODO |
| PF-041 | Checkpoint 4: persistence in place | M3 | 20 min | TODO |
| PF-042 | learn: Mockito spike | M4 | 25 min | TODO |
| PF-043 | ProductService.create with duplicate detection | M4 | 25 min | TODO |
| PF-044 | POST /api/v1/products | M4 | 30 min | TODO |
| PF-045 | Problem Details for validation, duplicates and not-found | M4 | 30 min | TODO |
| PF-046 | Read products: by SKU and paged | M4 | 25 min | TODO |
| PF-047 | PATCH a product | M4 | 25 min | TODO |
| PF-048 | Price lists: create, read and list | M4 | 30 min | TODO |
| PF-049 | Edit entries of a DRAFT price list | M4 | 25 min | TODO |
| PF-050 | Checkpoint 5: catalog and price list API | M4 | 20 min | TODO |
| PF-051 | Activate a price list | M4 | 30 min | TODO |
| PF-052 | Discount rules: create, read and list | M4 | 30 min | TODO |
| PF-053 | Update a discount rule | M4 | 25 min | TODO |
| PF-054 | Price-calculation contract records | M4 | 20 min | TODO |
| PF-055 | PriceCalculationService | M4 | 30 min | TODO |
| PF-056 | POST /api/v1/price-calculations | M4 | 25 min | TODO |
| PF-057 | demo/seed.sh: load the SPEC data through the API | M4 | 25 min | TODO |
| PF-058 | Checkpoint 6: pricing API complete | M4 | 20 min | TODO |
| PF-059 | Split unit and integration tests | M5 | 20 min | TODO |
| PF-060 | IT: the API reproduces Examples A–D (AC-2) | M5 | 30 min | TODO |
| PF-061 | IT: every pricing error is Problem Details (AC-3) | M5 | 25 min | TODO |
| PF-062 | Checkpoint 7: integration tests | M5 | 15 min | TODO |
| PF-063 | Generate quote-service and wire it in | M6 | 30 min | TODO |
| PF-064 | Flyway V1: quotes and quote lines | M6 | 25 min | TODO |
| PF-065 | Quote and QuoteLine entities | M6 | 30 min | TODO |
| PF-066 | Quote history entries | M6 | 20 min | TODO |
| PF-067 | Pricing client with timeouts | M6 | 30 min | TODO |
| PF-068 | Pricing client error mapping | M6 | 25 min | TODO |
| PF-069 | Checkpoint 8: quote-service foundations | M6 | 15 min | TODO |
| PF-070 | Create a quote (service) | M6 | 30 min | TODO |
| PF-071 | POST /api/v1/quotes | M6 | 25 min | TODO |
| PF-072 | Read and list quotes | M6 | 30 min | TODO |
| PF-073 | Re-price a quote | M6 | 25 min | TODO |
| PF-074 | Accept a quote | M6 | 30 min | TODO |
| PF-075 | Checkpoint 9: the quote lifecycle without Kafka | M6 | 20 min | TODO |
| PF-076 | learn: Kafka in KRaft mode with Docker | M6 | 30 min | TODO |
| PF-077 | Add Kafka to compose.yaml | M6 | 30 min | TODO |
| PF-078 | PricingChangedEvent in contracts | M6 | 30 min | TODO |
| PF-079 | learn: Spring Kafka producer, sending and waiting for the ack | M6 | 25 min | TODO |
| PF-080 | Topics and producer settings in pricing-service | M6 | 25 min | TODO |
| PF-081 | Compute the change scope | M6 | 30 min | TODO |
| PF-082 | Publish PRICE_LIST_ACTIVATED inside the transaction | M6 | 30 min | TODO |
| PF-083 | Publish DISCOUNT_RULE_CHANGED | M6 | 25 min | TODO |
| PF-084 | IT: activation publishes one well-formed event | M6 | 30 min | TODO |
| PF-085 | IT: a failed publish rolls back activation | M6 | 25 min | TODO |
| PF-086 | Checkpoint 10: pricing events | M6 | 15 min | TODO |
| PF-087 | quote-service consumer setup | M6 | 30 min | TODO |
| PF-088 | Mark affected quotes STALE | M6 | 30 min | TODO |
| PF-089 | Idempotent consumer | M6 | 30 min | TODO |
| PF-090 | learn: Spring Kafka error handling and the DLT | M6 | 25 min | TODO |
| PF-091 | Retries and the DLT in quote-service | M6 | 25 min | TODO |
| PF-092 | IT: the same event twice gives one entry (AC-6, part 1) | M6 | 25 min | TODO |
| PF-093 | IT: a poison message goes to the DLT (AC-6, part 2) | M6 | 30 min | TODO |
| PF-094 | IT: stale marking and acceptance rules (AC-5) | M6 | 25 min | TODO |
| PF-095 | Checkpoint 11: events end to end on the laptop | M6 | 25 min | TODO |
| PF-096 | learn: Redis spike | M7 | 25 min | TODO |
| PF-097 | Add Redis to compose.yaml | M7 | 20 min | TODO |
| PF-098 | Redis cache configuration in pricing-service | M7 | 30 min | TODO |
| PF-099 | Cache the three lookups | M7 | 25 min | TODO |
| PF-100 | Evict on every write path | M7 | 30 min | TODO |
| PF-101 | Pricing keeps working when Redis is down | M7 | 25 min | TODO |
| PF-102 | IT: cache hits and fresh reads (AC-7 a, b) | M7 | 30 min | TODO |
| PF-103 | IT: correct prices with Redis stopped (AC-7 c) | M7 | 25 min | TODO |
| PF-104 | Checkpoint 12: caching | M7 | 20 min | TODO |
| PF-105 | design: choose the LLM provider (ADR-0010) | M9 | 30 min | TODO |
| PF-106 | Fallback explainer | M9 | 30 min | TODO |
| PF-107 | Explanation endpoint, fallback only | M9 | 25 min | TODO |
| PF-108 | learn: Spring AI ChatClient spike | M9 | 30 min | TODO |
| PF-109 | Call the LLM through ChatClient | M9 | 30 min | TODO |
| PF-110 | Hard deadline and catch-all fallback | M9 | 25 min | TODO |
| PF-111 | Tests with a mocked ChatModel (AC-8) | M9 | 30 min | TODO |
| PF-112 | Checkpoint 13: explanations | M9 | 20 min | TODO |
| PF-113 | learn: layered Dockerfile spike | M10 | 30 min | TODO |
| PF-114 | pricing-service Dockerfile | M10 | 30 min | TODO |
| PF-115 | quote-service Dockerfile | M10 | 20 min | TODO |
| PF-116 | Compose "apps" profile: the full stack | M10 | 30 min | TODO |
| PF-117 | Full-stack smoke script (AC-1, AC-5) | M10 | 30 min | TODO |
| PF-118 | Measure the memory budget | M10 | 20 min | TODO |
| PF-119 | Images workflow: build and push to GHCR | M10 | 30 min | TODO |
| PF-120 | Checkpoint 14: one-command full stack | M10 | 20 min | TODO |
| PF-121 | learn: AWS account, root MFA and budget alerts | M11 | 30 min | TODO |
| PF-122 | learn: Lightsail by hand | M11 | 30 min | TODO |
| PF-123 | learn: run the AWS CLI as a non-root identity | M11 | 25 min | TODO |
| PF-124 | user-data.sh: prepare a fresh instance | M11 | 30 min | TODO |
| PF-125 | deploy.sh: create the instance and start the stack | M11 | 30 min | TODO |
| PF-126 | teardown.sh and verify-teardown.sh | M11 | 25 min | TODO |
| PF-127 | Deploy, smoke test, tear down, verify (AC-10) | M11 | 30 min | TODO |
| PF-128 | AWS runbook | M11 | 20 min | TODO |
| PF-129 | Checkpoint 15: cloud | M11 | 15 min | TODO |
| PF-130 | README: problem, features and how to run | M12 | 30 min | TODO |
| PF-131 | README: architecture diagram and design decisions | M12 | 25 min | TODO |
| PF-132 | The 5-minute demo script | M12 | 25 min | TODO |
| PF-133 | Secrets sweep (AC-11) | M12 | 20 min | TODO |
| PF-134 | Final acceptance sweep (AC-1 to AC-12) | M12 | 30 min | TODO |
| PF-135 | Release v1.0.0 | M12 | 20 min | TODO |

**135 tasks, 3410 min ≈ 56.8 h estimated.**
<!-- SUMMARY:END -->

## Milestones and schedule

Capacity is about 3 h/day, and the target is **Sunday 2026-11-22** (SPEC C-2). The "planned by"
dates leave slack for slow days.

<!-- MILESTONES:START -->
| Order | Milestone | Tasks | Est. | Planned by |
| --- | --- | --- | --- | --- |
| 1 | M0 · Repo and docs foundation | PF-001–006 (6) | 1.8 h | Tue 13 Oct |
| 2 | M1 · Local infrastructure (Postgres first) | PF-007–011 (5) | 2.0 h | Tue 13 Oct |
| 3 | M2 · pricing-service walking skeleton | PF-012–017 (6) | 2.5 h | Thu 15 Oct |
| 4 | M8 · CI with GitHub Actions (moved up) | PF-018–021 (4) | 1.4 h | Fri 16 Oct |
| 5 | M3 · Pricing engine and persistence | PF-022–041 (20) | 8.3 h | Wed 21 Oct |
| 6 | M4 · Pricing REST API | PF-042–058 (17) | 7.3 h | Mon 26 Oct |
| 7 | M5 · Integration-test harness | PF-059–062 (4) | 1.5 h | Tue 27 Oct |
| 8 | M6 · quote-service and Kafka events | PF-063–095 (33) | 14.6 h | Fri 6 Nov |
| 9 | M7 · Redis caching | PF-096–104 (9) | 3.8 h | Mon 9 Nov |
| 10 | M9 · Spring AI explanations | PF-105–112 (8) | 3.7 h | Thu 12 Nov |
| 11 | M10 · Containerise both services; full Compose stack | PF-113–120 (8) | 3.5 h | Sun 15 Nov |
| 12 | M11 · AWS deployment with cost guardrails | PF-121–129 (9) | 3.9 h | Wed 18 Nov |
| 13 | M12 · Polish and release | PF-130–135 (6) | 2.5 h | Sat 21 Nov |
| | Buffer | | | **Sun 22 Nov (SPEC C-2)** |
<!-- MILESTONES:END -->

**Why the order differs from the suggested M0–M12**
1. **CI (M8) moves up** to right after the walking skeleton. Without it, "main stays green" can't
   be checked. It's about an hour of work that protects the other 130 tasks.
2. **Testing (M5) is spread out.** Unit and slice tests are written alongside each feature from
   M2 on, and each test tool gets its learn task just before its first use. What remains of M5 is
   the integration-test harness (Failsafe, API-level tests), which runs after M4.
3. **M3 starts with the pricing engine,** which is plain Java with no database. It's the heart of
   AC-2 and plays to your strengths, so you get a working, tested core before the new persistence
   stack arrives.
4. **M6 is the biggest milestone** (33 tasks), so it runs in two parts, each ending with a
   checkpoint and a PR: quote-service core first, then the Kafka events.
5. **M9 opens with a design task:** the LLM provider decision (ADR-0010) that ADR-0008 deferred.

## How to work

- **Picking a task:** take the lowest-numbered TODO whose dependencies are all DONE or SKIPPED. Say
  "start session" to Claude at the beginning and "done PF-xxx" when you finish.
- **Timebox:** each card is designed for 30 minutes or less. At 45 minutes, stop and say
  "stuck PF-xxx", or finish and report the real time. Claude will then propose splitting similar
  upcoming tasks.
- **Learn tasks** happen in `~/upskilling-nightmare/scratch/<id>-<topic>/`. They're never in the
  repo and never committed.
- **Commits:** one per task, using the card's commit message (Conventional Commits).
- **Branches:**
  - PF-001 to PF-019 commit straight to `main`.
  - From PF-020, `main` is protected. Work on one branch per milestone (`m3-pricing`,
    `m4-pricing-api`, …).
  - Open the PR at the milestone's last checkpoint, and merge with a merge commit (each task keeps
    its own commit) once `ci` is green.
- **Red CI:** never start a new task while CI is red on your branch.
- **Standard commands** (run from the repo root):
  - Build and test everything: `./mvnw -B verify`, which should end in `BUILD SUCCESS`.
  - One service and what it depends on: `./mvnw -B -pl pricing-service -am verify`.

## Writing or splitting cards

These rules apply whenever a card is added (after an approved "change …") or split (after an
overrun). They come from the original planning brief, which is kept outside the repo.

- **IDs:** use the next free PF number and never renumber. Declare the dependencies, and add the
  card's row to the summary table.
- **Fields, in this order:**
  - Milestone · Est · Type (build, learn, test, infra, docs or design)
  - Tags
  - Depends on
  - Goal: one sentence.
  - Concept: only for a NEW tag. 2–4 lines, plus one concrete example of a surprising edge case.
  - Steps: numbered and concrete, at most 6.
  - Files: the paths created or changed.
  - Done when: the exact commands to run and the expected result.
  - Commit message
  - Docs: official links.
  - Pitfall: one common mistake.
- **Size:** at most 30 minutes, including reading the Concept. If in doubt, split.
- **End state:** every task ends committable, with the build passing and `main` green.
- **New concepts:** at most one per task. Before the first task that uses a NEW technology, add a
  `learn` task: a hands-on spike in the scratch folder, outside the repo.
- **Split by layer and behaviour,** never "implement the quote service". Design work, such as an
  ADR, counts as a task.
- **Checkpoints:** every 8–10 tasks, add a checkpoint task that runs the full test suite, updates
  the README and compares progress against SPEC.

## Cards

### M0 · Repo and docs foundation

### PF-001 · Free disk space to at least 15 GB
- Milestone: M0 · Est: 20 min · Type: infra
- Tags: none
- Depends on: none
- Goal: Get `/` from 1.1 GB free to at least 15 GB, so Docker images and Maven downloads fit.
- Steps:
  1. See where the space goes: `docker system df` and `du -sh ~/.npm ~/.cache ~/.local/share/Trash ~/.m2`.
  2. Empty the Trash.
  3. Clear the npm cache: `npm cache clean --force` (it was 4.2 GB on 2026-10-11).
  4. Remove stopped containers and unused images: `docker container prune`, then `docker image prune -a`. Read the prompts first.
  5. Review `~/.cache` by size (`du -sh ~/.cache/* | sort -h | tail`) and delete only caches you recognise.
  6. Check again with `df -h /`.
- Files: none (machine setup).
- Done when: `df -h /` shows at least `15G` in the Avail column.
- Commit message: none (nothing in the repo changes).
- Docs: https://docs.docker.com/reference/cli/docker/system/df/ · https://docs.docker.com/reference/cli/docker/system/prune/
- Pitfall: `docker system prune --volumes` also deletes named volumes, which are other projects' databases. Prune containers and images separately and leave volumes alone.

### PF-002 · Stop the global JVM heap override
- Milestone: M0 · Est: 15 min · Type: infra
- Tags: none
- Depends on: none
- Goal: Make `-Xmx` work again by removing the `_JAVA_OPTIONS=-Xmx3048m` that `/etc/profile` applies to every JVM (ARCHITECTURE §12.2).
- Steps:
  1. See the problem: `java -Xmx256m -XX:+PrintFlagsFinal -version 2>/dev/null | grep -w MaxHeapSize` shows about 3 GB.
  2. Decide whether anything else on this machine needs it. If unsure, back up first: `sudo cp /etc/profile /etc/profile.bak`.
  3. Comment out the `export _JAVA_OPTIONS=-Xmx3048m` line (line 3) in `/etc/profile` with `sudo`.
  4. Log out and back in. `/etc/profile` is read at login, not when a terminal opens.
- Files: `/etc/profile` (outside the repo).
- Done when: `echo "${_JAVA_OPTIONS:-unset}"` prints `unset`, and the Step 1 command prints `MaxHeapSize` = `268435456`.
- Commit message: none (machine setup).
- Docs: https://docs.oracle.com/en/java/javase/21/docs/specs/man/java.html (documents `JDK_JAVA_OPTIONS`, the supported way to set default JVM flags)
- Pitfall: Opening a new terminal tab isn't enough. Until you log out, every Maven run and every service you start still gets a 3 GB heap.

### PF-003 · First commit on main, without the planning prompt
- Milestone: M0 · Est: 15 min · Type: docs
- Tags: none
- Depends on: none
- Goal: Make the first commit on `main`, containing the planning docs and nothing that names an employer.
- Steps:
  1. Move `PLANNING_PROMPT.md` outside the repo, for example to `~/upskilling-nightmare/priceforge-private/`. It names your employer, and this repo will be public (SPEC C-7).
  2. Rename the empty branch: `git branch -m master main`.
  3. Create `.gitignore` covering Maven `target/`, IDE folders, OS files and `.env`.
  4. `git add .gitignore CLAUDE.md docs`, then commit.
- Files: `.gitignore`; first commit of `docs/**` and `CLAUDE.md`.
- Done when: `git branch --show-current` prints `main`; `git log --oneline` shows 1 commit; `git ls-files | grep -ci -e planning_prompt -e '^\.env$'` prints `0`.
- Commit message: `docs: add spec, architecture, ADRs, backlog and session rules`
- Docs: https://git-scm.com/docs/git-branch · https://git-scm.com/docs/gitignore
- Pitfall: Adding `.env` to `.gitignore` *after* committing it. Deleting a committed file doesn't remove it from history (AC-11), so ignore it before it exists.

### PF-004 · Add .editorconfig and a LICENSE
- Milestone: M0 · Est: 10 min · Type: docs
- Tags: none
- Depends on: PF-003
- Goal: Consistent formatting across editors and a clear license for a public repo.
- Steps:
  1. `.editorconfig`: UTF-8, LF line endings, final newline, 4-space indent for Java and XML, 2 spaces for YAML and JSON.
  2. `LICENSE`: MIT with your name and 2026. MIT is the usual portfolio choice, but pick another if you prefer.
  3. Commit both.
- Files: `.editorconfig`, `LICENSE`
- Done when: `git show --stat HEAD` lists `.editorconfig` and `LICENSE`.
- Commit message: `chore: add editorconfig and MIT license`
- Docs: https://editorconfig.org/ · https://choosealicense.com/licenses/mit/
- Pitfall: VS Code ignores `.editorconfig` unless the EditorConfig extension is installed.

### PF-005 · Write the README skeleton
- Milestone: M0 · Est: 20 min · Type: docs
- Tags: none
- Depends on: PF-003
- Goal: A README that says what PriceForge is and links to the docs, so the repo is presentable from the first push.
- Steps:
  1. Title, and a two-sentence pitch in your own words (the source is SPEC §1).
  2. A status line: "Work in progress, v1 target 2026-11-22".
  3. Links to `docs/SPEC.md`, `docs/ARCHITECTURE.md` and `docs/adr/README.md`.
  4. Empty headings to fill later: How to run, Design decisions, Demo.
- Files: `README.md`
- Done when: VS Code's Markdown preview renders it, and each link opens its file.
- Commit message: `docs: add README skeleton`
- Docs: [SPEC.md](SPEC.md) §1
- Pitfall: Copying SPEC text into the README. Link to it instead; copies drift.

### PF-006 · Create the GitHub repo and push main
- Milestone: M0 · Est: 25 min · Type: infra
- Tags: none
- Depends on: PF-003
- Goal: `main` is on GitHub as the public repo `Dabbin-Giraffe/priceforge`.
- Steps:
  1. Check SSH: `ssh -T git@github.com`. If that fails, create a key (`ssh-keygen -t ed25519`) and add the public half under GitHub → Settings → SSH keys.
  2. Create the repo on github.com: public, and **without** a README, .gitignore or license (you already have them).
  3. `git remote add origin git@github.com:Dabbin-Giraffe/priceforge.git`
  4. `git push -u origin main`
- Files: none.
- Done when: `git status -sb` shows `## main...origin/main` with nothing ahead, and the repo page shows your README.
- Commit message: none (push only).
- Docs: https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-new-repository · https://docs.github.com/en/authentication/connecting-to-github-with-ssh
- Pitfall: Ticking "Add a README" on GitHub creates a commit that your local `main` doesn't have, and your first push gets rejected.

### M1 · Local infrastructure in Docker Compose (Postgres first)

### PF-007 · learn: Docker Compose spike
- Milestone: M1 · Est: 25 min · Type: learn
- Tags: NEW(Docker Compose)
- Depends on: PF-001
- Goal: See how Compose starts services, waits for them and tears them down, in a scratch folder.
- Concept: Compose describes a set of containers, with their ports, volumes and environment, in one YAML file. `docker compose up -d` creates them and `down` removes them. A healthcheck tells Compose when a service is *ready*, not just started. Edge case: `depends_on: [db]` only waits for the db container to *start*. Postgres needs a few seconds before it accepts connections, so an app that connects straight away dies with "connection refused". Only `condition: service_healthy` plus a healthcheck waits for readiness.
- Steps:
  1. `mkdir -p ~/upskilling-nightmare/scratch/pf-007-compose` and work there.
  2. Write a `compose.yaml` with one `postgres:18.6-alpine` service: a host port, a named volume, a `pg_isready` healthcheck.
  3. `docker compose up -d`, then re-run `docker compose ps` until STATUS says `healthy`.
  4. Add a second service (for example `alpine` running `echo ok`) that depends on the db with `condition: service_healthy`. Run `up -d` again and read the order in `docker compose logs`.
  5. Compare `docker compose down` with `docker compose down -v`, running `docker volume ls` after each.
- Files: scratch only.
- Done when: you've seen `(healthy)` in `docker compose ps`, and can say in one sentence what `down -v` deletes.
- Commit message: none (scratch).
- Docs: https://docs.docker.com/compose/ · https://docs.docker.com/reference/compose-file/services/ · https://docs.docker.com/compose/how-tos/startup-order/
- Pitfall: Changing `POSTGRES_PASSWORD` and running `up -d` again does nothing to an existing volume. The password was written when the volume was first initialised.

### PF-008 · learn: PostgreSQL spike
- Milestone: M1 · Est: 30 min · Type: learn
- Tags: NEW(PostgreSQL)
- Depends on: PF-007
- Goal: Get comfortable with `psql` and the PostgreSQL features this project relies on.
- Concept: Most of your Oracle SQL carries over. The differences you'll meet here:
  - `numeric(p,s)` for exact money
  - `jsonb` for JSON documents
  - partial indexes (`... WHERE status = 'ACTIVE'`)
  - identity columns instead of sequences plus triggers
  - no `DUAL`

  Edge case: `SELECT 0.1::float8 + 0.2::float8 = 0.3;` returns **false**, while the same with `numeric` returns **true**. That's why every money column is `numeric`.
- Steps:
  1. Start the PF-007 Postgres and open psql: `docker compose exec <service> psql -U postgres`.
  2. Run the float-versus-numeric comparison above.
  3. Create a table with a `status` column and a partial unique index that allows only one `ACTIVE` row. Insert two ACTIVE rows and read the error.
  4. Insert two rows with NULL in a UNIQUE column, and see that both are accepted.
  5. Store a `jsonb` value and read one field with `->>`.
  6. Try `\l`, `\du`, `\dt`, `\d <table>` and `\q`.
- Files: scratch only.
- Done when: you've seen the duplicate-key error from step 3, and both NULL rows from step 4 in a `SELECT *`.
- Commit message: none (scratch).
- Docs: https://www.postgresql.org/docs/18/app-psql.html · https://www.postgresql.org/docs/18/indexes-partial.html · https://www.postgresql.org/docs/18/datatype-numeric.html · https://www.postgresql.org/docs/18/datatype-json.html
- Pitfall: Unquoted identifiers are folded to lower case. `CREATE TABLE PriceList` creates `pricelist`, and `"PriceList"` (quoted) would be a different table.

### PF-009 · Add Postgres to compose.yaml
- Milestone: M1 · Est: 25 min · Type: infra
- Tags: NEW(Docker Compose)
- Depends on: PF-006, PF-008
- Goal: `docker compose up -d` in the repo starts a healthy PostgreSQL 18.6 on host port 15432 (ARCHITECTURE §12.1).
- Concept: Same as PF-007, now under the project's rules: non-default host ports, secrets from `.env`, and memory limits. Edge case: Compose reads `.env` automatically to fill `${VAR}` placeholders in `compose.yaml`, but that does **not** put the variables inside the container. You still have to pass them under `environment:`.
- Steps:
  1. Create a root `compose.yaml` with a `postgres` service:
     - image `postgres:18.6-alpine`
     - ports `15432:5432`
     - a named volume
     - `mem_limit: 256m`
     - a `pg_isready` healthcheck
  2. Pass `POSTGRES_PASSWORD` in from `.env`.
  3. Create `.env.example` with `POSTGRES_PASSWORD=change-me`. Copy it to `.env` and choose a real local password.
  4. `docker compose up -d`, then wait for `healthy`.
- Files: `compose.yaml`, `.env.example` (`.env` stays untracked)
- Done when: `docker compose ps` shows postgres `(healthy)`; `docker compose exec postgres psql -U postgres -c 'select version();'` prints `PostgreSQL 18.6`; `git status --short` doesn't list `.env`.
- Commit message: `chore(infra): add PostgreSQL 18 to docker compose`
- Docs: https://docs.docker.com/compose/how-tos/environment-variables/ · https://hub.docker.com/_/postgres
- Pitfall: Mapping the container to host port 5432 out of habit. ARCHITECTURE §12.1 uses 15432, so a Postgres installed on the host can never clash with it.

### PF-010 · Create the pricing and quote databases on first start
- Milestone: M1 · Est: 25 min · Type: infra
- Tags: NEW(PostgreSQL)
- Depends on: PF-009
- Goal: On a fresh volume, Postgres creates the `pricing` and `quote` databases, each owned by its own user (ADR-0003).
- Concept: In PostgreSQL, users are roles. A database's owner can create tables in it, which is what Flyway needs later. Edge case: the official image runs the scripts in `/docker-entrypoint-initdb.d` **only when the data volume is empty**. Edit the script, restart, and nothing happens until you recreate the volume.
- Steps:
  1. Add `PRICING_DB_PASSWORD` and `QUOTE_DB_PASSWORD` to `.env.example` and `.env`.
  2. Write `infra/postgres/init/01-create-databases.sh`. It creates roles `pricing` and `quote` with those passwords, and a database owned by each.
  3. Mount `infra/postgres/init` at `/docker-entrypoint-initdb.d`, and pass the two passwords to the postgres service.
  4. `docker compose down -v && docker compose up -d`, so the volume is fresh and the script runs.
- Files: `infra/postgres/init/01-create-databases.sh`, `compose.yaml`, `.env.example`
- Done when: `docker compose exec postgres psql -U postgres -c '\l'` lists `pricing` and `quote`, and `docker compose exec postgres psql -U postgres -c '\du'` lists both roles.
- Commit message: `chore(infra): create pricing and quote databases on first start`
- Docs: https://hub.docker.com/_/postgres (see "Initialization scripts") · https://www.postgresql.org/docs/18/sql-createrole.html
- Pitfall: Hardcoding the passwords in the script. Read them from environment variables, so nothing secret is committed.

### PF-011 · Checkpoint 1: foundation and database
- Milestone: M1 · Est: 15 min · Type: test
- Tags: none
- Depends on: PF-004, PF-005, PF-010
- Goal: Prove that everything so far works from a clean state, and that the README tells the truth.
- Steps:
  1. `docker compose down -v && docker compose up -d`. Wait for healthy and check both databases exist.
  2. README "How to run": the two commands and the `.env` copy step.
  3. Compare against SPEC: nothing in §5 is done yet. C-7 and C-8 hold (no secrets or employer names tracked).
  4. Commit and push.
- Files: `README.md`
- Done when: a fresh-volume start comes up healthy, the README is updated, `git status` is clean, and GitHub shows the commit.
- Commit message: `docs: checkpoint 1 - local database runbook`
- Docs: [SPEC.md](SPEC.md) §2, §5
- Pitfall: Skipping the clean-state run. A setup that only works thanks to leftovers in an old volume will fail in CI and on AWS.

### M2 · pricing-service walking skeleton

### PF-012 · learn: Maven multi-module spike
- Milestone: M2 · Est: 25 min · Type: learn
- Tags: NEW(Maven multi-module)
- Depends on: none
- Goal: Understand parent POMs, modules and the reactor build before restructuring the repo.
- Concept: A parent POM (`<packaging>pom</packaging>`) lists `<modules>` and shares configuration, and Maven's reactor builds the modules in dependency order. `<dependencyManagement>` only pins versions: each module still has to declare every dependency it uses. Edge case: `mvn -pl app package` fails with "Could not resolve dependencies … lib" when `app` depends on its sibling `lib` and `lib` isn't installed in `~/.m2`. Add `-am` ("also make") and Maven builds `lib` first.
- Steps:
  1. In `~/upskilling-nightmare/scratch/pf-012-maven`, create a parent POM with two modules: `lib` (one class) and `app` (depends on `lib` and uses that class). Set `maven.compiler.source` and `maven.compiler.target` to `21` in the parent.
  2. Build everything with `mvn -q package` (the system Maven is fine here).
  3. Build only `app`: first `mvn -pl app package` (watch it fail), then `mvn -pl app -am package`.
  4. Pin a version in the parent's `<dependencyManagement>` and use that dependency in `lib` without a version.
- Files: scratch only.
- Done when: you can explain why step 3 failed without `-am`.
- Commit message: none (scratch).
- Docs: https://maven.apache.org/guides/mini/guide-multiple-modules.html · https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html
- Pitfall: Your system Maven 3.6.3 uses a very old compiler-plugin default. Without the source/target properties you get "Source option 5 is no longer supported". The project's wrapper and the Boot parent (PF-013) avoid this.

### PF-013 · Add the parent POM and the Maven Wrapper
- Milestone: M2 · Est: 25 min · Type: build
- Tags: NEW(Maven multi-module)
- Depends on: PF-006, PF-012
- Goal: The repo root becomes `priceforge-parent`, using Boot parent 4.1.1 and Spring AI BOM 2.0.1, built with a wrapper pinned to Maven 3.10.0 (ADR-0002).
- Concept: Inheriting `spring-boot-starter-parent` gives every module Boot's dependency and plugin versions (ARCHITECTURE §16). Importing `spring-ai-bom` (type `pom`, scope `import`) adds Spring AI's versions on top. Edge case: a BOM import only works inside `<dependencyManagement>`. Put it under `<dependencies>` and Maven goes looking for a jar that doesn't exist.
- Steps:
  1. Root `pom.xml`:
     - groupId `dev.priceforge`, artifactId `priceforge-parent`, packaging `pom`
     - parent `spring-boot-starter-parent` 4.1.1
     - property `java.version` set to 21
  2. Import `org.springframework.ai:spring-ai-bom:2.0.1` in `<dependencyManagement>`.
  3. Generate the wrapper pinned to 3.10.0 (`mvn wrapper:wrapper -Dmaven=3.10.0`, see the Maven Wrapper docs).
  4. Commit `mvnw`, `mvnw.cmd` and `.mvn/wrapper/`.
- Files: `pom.xml`, `mvnw`, `mvnw.cmd`, `.mvn/wrapper/maven-wrapper.properties`
- Done when: `./mvnw -v` prints `Apache Maven 3.10.0`; `./mvnw -B validate` prints `BUILD SUCCESS`; `git ls-files -s mvnw` starts with `100755`.
- Commit message: `build: add parent POM on Spring Boot 4.1.1 and Maven Wrapper 3.10.0`
- Docs: https://maven.apache.org/tools/wrapper/ · https://docs.spring.io/spring-boot/reference/using/build-systems.html
- Pitfall: Typing `mvn` (the system 3.6.3) out of habit. From this task on it's always `./mvnw`.

### PF-014 · Add the contracts module with Segment and Category
- Milestone: M2 · Est: 20 min · Type: build
- Tags: none
- Depends on: PF-013
- Goal: A plain-Java `contracts` module holds the two enums both services share (SPEC §3.2).
- Steps:
  1. `contracts/pom.xml`: parent `priceforge-parent`, packaging `jar`, no Spring dependencies.
  2. Add `contracts` to the parent's `<modules>`.
  3. Add enum `Segment` (RETAIL_SHOP, CONTRACTOR, DISTRIBUTOR) and enum `Category` (FASTENERS, HAND_TOOLS, SAFETY_GEAR) in `dev.priceforge.contracts`.
- Files: `contracts/pom.xml`, `contracts/src/main/java/dev/priceforge/contracts/{Segment,Category}.java`, `pom.xml`
- Done when: `./mvnw -B verify` prints `BUILD SUCCESS`, and the Reactor Summary lists `contracts`.
- Commit message: `feat(contracts): add Segment and Category enums`
- Docs: https://maven.apache.org/guides/mini/guide-multiple-modules.html
- Pitfall: Declaring `spring-boot-maven-plugin` in the parent's `<build><plugins>`. That makes it repackage `contracts` too, and the build fails looking for a main class. Declare it only in the two service modules.

### PF-015 · Generate pricing-service and wire it in
- Milestone: M2 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-014
- Goal: pricing-service runs on port 8081, and `/actuator/health` says UP.
- Steps:
  1. On start.spring.io choose:
     - Maven, Java 21, Spring Boot 4.1.1
     - group `dev.priceforge`, artifact `pricing-service`, package `dev.priceforge.pricing`
     - dependencies: Spring Web (MVC) and Actuator

     Unzip it into `pricing-service/`.
  2. Delete its `mvnw`, `mvnw.cmd` and `.mvn/`; the root wrapper builds everything.
  3. Change its `<parent>` to `priceforge-parent` (relativePath `../pom.xml`), and add the module to the root POM.
  4. Add a dependency on `contracts`, with version `${project.version}`.
  5. In `application.yaml`, set `server.port: 8081` and `spring.application.name: pricing-service`.
- Files: `pricing-service/**`, `pom.xml`
- Done when: `./mvnw -B -DskipTests install` prints `BUILD SUCCESS`, `java -jar pricing-service/target/pricing-service-*.jar` starts, and `curl -s localhost:8081/actuator/health` from another terminal contains `"status":"UP"`.
- Commit message: `feat(pricing): add pricing-service walking skeleton`
- Docs: https://start.spring.io · https://docs.spring.io/spring-boot/reference/actuator/endpoints.html
- Pitfall: Copying starter names from Boot 3 tutorials. In Boot 4 the web starter is `spring-boot-starter-webmvc`, so trust the POM Initializr generated (ADR-0001).

### PF-016 · learn: JUnit Jupiter and AssertJ spike
- Milestone: M2 · Est: 25 min · Type: learn
- Tags: NEW(JUnit 5 + AssertJ)
- Depends on: none
- Goal: Write and run JUnit Jupiter tests with AssertJ assertions in a scratch project.
- Concept: JUnit Jupiter is the "JUnit 5" API; Boot 4.1.1 ships Jupiter 6.0.3. It runs `@Test` methods, and `@ParameterizedTest` with `@CsvSource` runs one test per row, which is perfect for price tables. AssertJ gives fluent assertions such as `assertThat(x).isEqualTo(y)`. Edge case: `assertThat(new BigDecimal("2.0")).isEqualTo(new BigDecimal("2.00"))` **fails**, because `BigDecimal.equals` also compares scale. Use `isEqualByComparingTo` for money.
- Steps:
  1. Generate a scratch project on start.spring.io with no dependencies. Its test starter already brings JUnit, AssertJ and Mockito, at Boot-managed versions.
  2. Write tests for a tiny class: one plain `@Test`, and one `@ParameterizedTest` with `@CsvSource`.
  3. Reproduce the BigDecimal scale edge case, then fix it with `isEqualByComparingTo`.
  4. Break one test on purpose and read the failure message.
  5. Run `./mvnw test` and find the "Tests run:" line.
- Files: scratch only.
- Done when: `./mvnw test` shows the parameterized test as separate runs and `Failures: 0` after your fix.
- Commit message: none (scratch).
- Docs: https://docs.junit.org/current/user-guide/ · https://assertj.github.io/doc/
- Pitfall: A test class named `PriceChecks`. Surefire only runs classes matching `*Test`, `Test*`, `*Tests` or `*TestCase` by default, so it's silently skipped.

### PF-017 · First test: the health endpoint says UP
- Milestone: M2 · Est: 25 min · Type: test
- Tags: NEW(JUnit 5 + AssertJ)
- Depends on: PF-015, PF-016
- Goal: pricing-service has one meaningful passing test: GET `/actuator/health` returns 200 with status UP.
- Concept: `@SpringBootTest` starts the whole application in the test, and `@AutoConfigureMockMvc` lets you call endpoints without a real HTTP port. In Boot 4 this test support comes from `spring-boot-starter-webmvc-test`. Edge case: Boot 4 moved its test annotations to new packages. Imports copied from Boot 3 blog posts give "cannot find symbol", so let the IDE suggest the import.
- Steps:
  1. Add `spring-boot-starter-webmvc-test` (test scope) to pricing-service.
  2. Write `HealthEndpointTest`: `@SpringBootTest` plus `@AutoConfigureMockMvc`, GET `/actuator/health`, expect 200 and `$.status` equal to `UP`.
  3. Run `./mvnw -B verify` from the root.
- Files: `pricing-service/pom.xml`, `pricing-service/src/test/java/dev/priceforge/pricing/HealthEndpointTest.java`
- Done when: `./mvnw -B verify` shows `HealthEndpointTest` passing and `BUILD SUCCESS`.
- Commit message: `test(pricing): verify health endpoint reports UP`
- Docs: https://docs.spring.io/spring-boot/reference/testing/spring-boot-applications.html · https://docs.spring.io/spring-framework/reference/testing/mockmvc.html
- Pitfall: Asserting on the whole JSON body. Health output gains fields as features are added, so assert on `$.status` only.

### M8 · CI with GitHub Actions (moved up)

### PF-018 · learn: GitHub Actions spike in a throwaway repo
- Milestone: M8 · Est: 25 min · Type: learn
- Tags: NEW(GitHub Actions)
- Depends on: PF-006
- Goal: Watch a workflow run, fail and pass, in a repo you'll delete afterwards.
- Concept: A workflow is a YAML file in `.github/workflows/`:
  - `on:` lists its triggers, such as push and pull_request.
  - `jobs:` run on fresh virtual machines (`runs-on: ubuntu-latest`).
  - Each step either `uses:` an action or `run:`s a shell command.

  Every run starts on a clean machine, so nothing from your laptop is there. Edge case: `./mvnw: Permission denied` in CI when the executable bit wasn't committed. It works on your laptop because your local copy is executable.
- Steps:
  1. Create a public throwaway repo `actions-sandbox` (with a README) and clone it into scratch.
  2. Add a workflow that runs on push and prints `uname -a` and `java -version`.
  3. Push it and watch the run in the Actions tab.
  4. Add `actions/setup-java@v6` (Temurin 21), run again, and compare the Java version.
  5. Make a step fail with `run: exit 1`, and look at how the run and the commit status show it. Delete the repo afterwards.
- Files: scratch only.
- Done when: the sandbox's Actions tab shows one green run and one red run.
- Commit message: none (scratch).
- Docs: https://docs.github.com/en/actions/get-started/quickstart · https://docs.github.com/en/actions/reference/workflows-and-actions/workflow-syntax · https://github.com/actions/setup-java
- Pitfall: YAML indentation. A step indented one level wrong becomes a different key, and GitHub rejects the file with "Invalid workflow file" before anything runs.

### PF-019 · Add the CI workflow
- Milestone: M8 · Est: 25 min · Type: infra
- Tags: NEW(GitHub Actions)
- Depends on: PF-017, PF-018
- Goal: Every push and pull request runs `./mvnw -B verify` on GitHub (ARCHITECTURE §14).
- Concept: The real workflow adds Maven dependency caching (`cache: maven` in setup-java), so later runs don't download every dependency again. Edge case: the cache key is derived from your build files, so a POM change means one slow run with a cache miss. That's normal, not a breakage.
- Steps:
  1. Create `.github/workflows/ci.yml`, named `ci`, triggered on `push` and `pull_request`.
  2. Add one job `build` on `ubuntu-latest` with these steps:
     - `actions/checkout@v7`
     - `actions/setup-java@v6` with distribution `temurin`, java-version `21`, cache `maven`
     - `./mvnw -B verify`
  3. Push to `main` and watch the run.
- Files: `.github/workflows/ci.yml`
- Done when: the Actions tab shows `ci` green for your commit, and the job log contains `BUILD SUCCESS`.
- Commit message: `ci: build and test on every push and pull request`
- Docs: https://github.com/actions/setup-java · https://github.com/actions/checkout · https://docs.github.com/en/actions/reference/workflows-and-actions/workflow-syntax
- Pitfall: A branch with an open PR runs the workflow twice (once for `push`, once for `pull_request`). That's expected, so don't "fix" it by deleting a trigger.

### PF-020 · Add the CI badge and protect main
- Milestone: M8 · Est: 20 min · Type: infra
- Tags: none
- Depends on: PF-019
- Goal: `main` only changes through pull requests with a green `ci` run, and the README shows CI status.
- Steps:
  1. In repo Settings, add a branch protection rule (or ruleset) for `main`: require a pull request, and require the status check `build`.
  2. Create branch `m8-ci-badge`, and add the workflow's status badge to the README (Actions → ci → "Create status badge").
  3. Push the branch, open a PR, wait for `build`, and merge with a merge commit.
  4. From now on: one branch per milestone, one commit per task, one PR per milestone (see "How to work").
- Files: `README.md`
- Done when: the PR showed the `build` check, merging was blocked until it passed, and the README badge on `main` reads "passing".
- Commit message: `docs: add CI status badge`
- Docs: https://docs.github.com/en/repositories/configuring-branches-and-merges-in-your-repository/managing-protected-branches/about-protected-branches · https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request
- Pitfall: The required-check picker only offers checks that have run recently. If `build` isn't listed, push once more and refresh.

### PF-021 · Checkpoint 2: skeleton under CI
- Milestone: M8 · Est: 15 min · Type: test
- Tags: none
- Depends on: PF-020
- Goal: The walking skeleton builds and tests green in CI and runs locally, and work on M3 can start.
- Steps:
  1. `git switch -c m3-pricing` from the updated `main`.
  2. `./mvnw -B verify` locally, and check that the latest `ci` run on `main` is green.
  3. README: "How to build" (`./mvnw -B verify`) and "How to run" pricing-service.
  4. Compare against SPEC: F-12 has started for pricing-service, and AC-9 is partly met (one command builds and tests).
  5. Commit on `m3-pricing` and push it.
- Files: `README.md`
- Done when: the local build is green, `ci` is green on `main`, and `m3-pricing` is pushed with the README commit.
- Commit message: `docs: checkpoint 2 - build and run instructions`
- Docs: [SPEC.md](SPEC.md) §5, §8
- Pitfall: Opening a PR per task. With the branch-per-milestone flow, a PR opens only at the milestone's last checkpoint.

### M3 · Pricing engine and persistence (branch `m3-pricing`)

### PF-022 · design: define the pricing engine's types
- Milestone: M3 · Est: 25 min · Type: design
- Tags: none
- Depends on: PF-021
- Goal: Write the `engine` package's records and enums with no logic yet, so the next tasks have a shape to fill (SPEC §4.1, ARCHITECTURE §4, §8.3).
- Steps:
  1. A record for a candidate rule: code, segment, category and minQuantity (each nullable), percentOff, priority, exclusiveGroup (nullable).
  2. A record for the line being priced: segment, category, quantity, unitListPrice.
  3. A step-type enum (APPLIED, SUPERSEDED, CAP), and a step record carrying the fields from ARCHITECTURE §8.3.
  4. A result record: unitListPrice, steps, unitNetPrice, lineTotal.
  5. A pricer class with one method, `price(line, rules, capPercent)`, that throws `UnsupportedOperationException` for now.
- Files: `pricing-service/src/main/java/dev/priceforge/pricing/engine/*.java`
- Done when: `./mvnw -B -pl pricing-service -am verify` prints `BUILD SUCCESS`, and `grep -rE "springframework|jakarta.persistence" pricing-service/src/main/java/dev/priceforge/pricing/engine` prints nothing.
- Commit message: `feat(pricing): define pricing engine types`
- Docs: [SPEC.md](SPEC.md) §4.1 · [ARCHITECTURE.md](ARCHITECTURE.md) §8.3
- Pitfall: Using `double` anywhere. Every amount and percentage is a `BigDecimal` (ARCHITECTURE §6).

### PF-023 · Money rounding helper
- Milestone: M3 · Est: 20 min · Type: build
- Tags: none
- Depends on: PF-022
- Goal: One place rounds a `BigDecimal` to cents, half-up, and it's tested.
- Steps:
  1. A small final class with a static method that returns the amount at scale 2 using `RoundingMode.HALF_UP`.
  2. A parameterized test with rows from SPEC §4.2: 11.058 → 11.06, 10.1752 → 10.18, 10.1745 → 10.17, 10.6176 → 10.62, and 12.00 → 12.00.
  3. One test showing why money assertions use `isEqualByComparingTo`.
- Files: `.../engine/` helper class and its test
- Done when: `./mvnw -B -pl pricing-service -am verify` shows the new tests passing and `BUILD SUCCESS`.
- Commit message: `feat(pricing): round money half-up to cents`
- Docs: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/math/BigDecimal.html
- Pitfall: `new BigDecimal(0.1)` captures the binary double (0.1000000000000000055…). Build test values from strings: `new BigDecimal("0.1")`.

### PF-024 · Rule matching
- Milestone: M3 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-023
- Goal: Decide whether a rule matches a line (SPEC §4.1 step 2), with tests.
- Steps:
  1. A rule matches when every condition it sets holds. An empty condition matches anything.
  2. Tests:
     - segment only
     - category only
     - a minQuantity of 100 at quantities 99, 100 and 101
     - a rule with no conditions
     - a rule that sets all three conditions
  3. Note in a comment that the engine only receives active rules, so the caller filters them.
- Files: `.../engine/` matcher and test
- Done when: module verify is green, with at least 6 matching tests.
- Commit message: `feat(pricing): match discount rules to a line`
- Docs: [SPEC.md](SPEC.md) §4.1
- Pitfall: An off-by-one on the tier. SPEC says "quantity ≥ min quantity", so 100 boxes match VOL-100.

### PF-025 · Exclusive groups
- Milestone: M3 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-024
- Goal: Among matching rules that share a group, keep only the best one, and record the others as SUPERSEDED (SPEC §4.1 step 3).
- Steps:
  1. Group the matching rules by exclusive group. Rules without a group pass straight through.
  2. The winner has the highest percent off; ties go to the lower priority number, then to the code in A→Z order.
  3. The losers become SUPERSEDED steps that name the winner and the group.
  4. Tests: VOL-10 against VOL-100 at quantity 150; an exact tie on percent; a tie on both percent and priority.
- Files: `.../engine/` and tests
- Done when: module verify is green, and the VOL test shows VOL-10 superseded by VOL-100.
- Commit message: `feat(pricing): resolve exclusive rule groups`
- Docs: [SPEC.md](SPEC.md) §4.1
- Pitfall: Comparing `BigDecimal` percentages with `equals` in the tie check, where `4.0` and `4.00` differ. Use `compareTo`.

### PF-026 · Apply rules in priority order (Examples A and D)
- Milestone: M3 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-025
- Goal: Compound the remaining rules in ascending priority, rounding each step, and record APPLIED steps (SPEC §4.1 step 4).
- Steps:
  1. Sort the rules by priority, then by code.
  2. For each rule: new price = round(price × (1 − percent/100)). Record a step with its amount and the price after it.
  3. Test Example A step by step: 11.40, 11.06, 10.18, with amounts −0.60, −0.34 and −0.88.
  4. Test Example D: the same discounts applied in the order 8, 3, 5 give 10.17.
- Files: `.../engine/` and tests
- Done when: module verify is green, with Examples A and D asserted to the cent.
- Commit message: `feat(pricing): apply discounts in priority order with per-step rounding`
- Docs: [SPEC.md](SPEC.md) §4.2
- Pitfall: `BigDecimal.divide` with no scale or rounding mode throws `ArithmeticException` on results like 1/3. Percent/100 is always exact, but `movePointLeft(2)` sidesteps the question.

### PF-027 · The discount cap (Example C)
- Milestone: M3 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-026
- Goal: If the total discount exceeds the cap, raise the net price to list × (1 − cap) and record a CAP step (SPEC §4.1 step 5).
- Steps:
  1. After applying the rules, compute the floor: round(list × (1 − cap/100)).
  2. If the net price is below the floor, add a CAP step with the amount added back, and set the net price to the floor.
  3. Test Example C: 8.57, then CAP +0.43, gives 9.00.
  4. Test a case landing exactly on the cap: no CAP step.
- Files: `.../engine/` and tests
- Done when: module verify is green, with Example C asserted.
- Commit message: `feat(pricing): cap total discount`
- Docs: [SPEC.md](SPEC.md) §4.2
- Pitfall: Deciding "discount > cap" by comparing percentages computed from rounded prices. Compare the price with the floor instead, so rounding can't flip the decision.

### PF-028 · Line total and the tier cliff (Example B)
- Milestone: M3 · Est: 20 min · Type: build
- Tags: none
- Depends on: PF-027
- Goal: Finish `price(...)`: the line total is the net price × quantity, and the tests prove the tier cliff (SPEC §4.2 B).
- Steps:
  1. Compute the line total and remove the `UnsupportedOperationException`.
  2. A parameterized test:
     - quantity 99 → 10.62 / 1051.38
     - quantity 100 → 10.18 / 1018.00
     - quantity 150 → 1527.00
- Files: `.../engine/` and tests
- Done when: module verify is green, and all four SPEC examples pass at engine level.
- Commit message: `feat(pricing): compute line totals`
- Docs: [SPEC.md](SPEC.md) §4.2
- Pitfall: Asserting totals with `isEqualTo`. `1527.00` and `1527.0` have different scales, so use `isEqualByComparingTo`.

### PF-029 · learn: Testcontainers spike
- Milestone: M3 · Est: 30 min · Type: learn
- Tags: NEW(Testcontainers)
- Depends on: PF-016, PF-008
- Goal: Run a JUnit test against a throwaway PostgreSQL container, in scratch.
- Concept: Testcontainers starts real Docker containers from your test and removes them afterwards, with help from a small "Ryuk" container. With Spring Boot, putting `@ServiceConnection` on a container bean wires the datasource to it, so no URLs go in properties. Edge case: the container listens on a **random host port** on every run. Anything in a test that hardcodes `localhost:5432` (or our 15432) talks to the wrong database, or to none.
- Steps:
  1. Generate a scratch Boot project on start.spring.io with JDBC API, PostgreSQL Driver and Testcontainers. If it doesn't include a test configuration class, write a `@TestConfiguration` with a `PostgreSQLContainer` bean annotated `@ServiceConnection`.
  2. Write a test that runs `select version()` through `JdbcTemplate` and prints the result.
  3. Run it, and watch `docker ps` in another terminal while it runs.
  4. Print the JDBC URL the test used, and spot the random port.
- Files: scratch only.
- Done when: the test passes, and you saw the container appear and disappear in `docker ps`.
- Commit message: none (scratch).
- Docs: https://java.testcontainers.org/ · https://java.testcontainers.org/modules/databases/postgres/ · https://docs.spring.io/spring-boot/reference/testing/testcontainers.html
- Pitfall: Testcontainers 2.x moved its classes. It's `org.testcontainers.postgresql.PostgreSQLContainer` now; older blog posts import `org.testcontainers.containers.PostgreSQLContainer`.

### PF-030 · learn: Flyway spike
- Milestone: M3 · Est: 25 min · Type: learn
- Tags: NEW(Flyway)
- Depends on: PF-029
- Goal: Watch Flyway apply, record and refuse migrations, in scratch.
- Concept: Flyway runs versioned SQL files (`V1__init.sql`, `V2__…`) in order, once each, and records each one with a checksum in `flyway_schema_history`. Spring Boot runs Flyway at startup, before JPA. Edge case: editing `V1__…sql` after it has run changes its checksum, and the next startup fails validation ("Migration checksum mismatch"). Never edit an applied migration; add a new one.
- Steps:
  1. In the PF-029 scratch project, add `spring-boot-starter-flyway` and `flyway-database-postgresql`.
  2. Add `V1__create_demo.sql` with one table. Run the test, then look at `flyway_schema_history`.
  3. Add `V2__add_column.sql` and run again.
  4. Edit V1, run again, and read the error. Then undo the edit.
- Files: scratch only.
- Done when: you've seen the checksum-mismatch error, and can say how to fix it properly.
- Commit message: none (scratch).
- Docs: https://documentation.red-gate.com/flyway/flyway-concepts/migrations · https://docs.spring.io/spring-boot/how-to/data-initialization.html
- Pitfall: Leaving out `flyway-database-postgresql`. Since Flyway 10, database support is split out, and without it Flyway fails with "Unsupported Database: PostgreSQL".

### PF-031 · Checkpoint 3: the engine matches the SPEC
- Milestone: M3 · Est: 15 min · Type: test
- Tags: none
- Depends on: PF-028
- Goal: Confirm the engine half of AC-2, with green CI on the branch.
- Steps:
  1. `./mvnw -B verify`.
  2. Write down which test covers each of Examples A–D.
  3. README: add a "Pricing rules" link to SPEC §4.
  4. Push `m3-pricing` and check that `ci` is green on the branch.
- Files: `README.md`
- Done when: `ci` is green on `m3-pricing`, and each of Examples A–D maps to a named test.
- Commit message: `docs: checkpoint 3 - pricing engine complete`
- Docs: [SPEC.md](SPEC.md) §4.2, §8
- Pitfall: Calling the engine "done" when a test checks only the final price. AC-2 needs every step amount, not just 10.18.

### PF-032 · Give pricing-service a database
- Milestone: M3 · Est: 30 min · Type: build
- Tags: NEW(Testcontainers)
- Depends on: PF-010, PF-029, PF-031
- Goal: pricing-service has a datasource. Tests use PostgreSQL 18.6 from Testcontainers, and local runs use the Compose `pricing` database.
- Concept: Adding JPA means the test application context needs a database. One shared test configuration with a `@ServiceConnection` container gives every test a real database. Edge case: if each test class declares its own container, you get one container per class. That's slow, and on 8 GB of RAM it's painful, so share one.
- Steps:
  1. Add to pricing-service:
     - `spring-boot-starter-data-jpa` and the `postgresql` driver
     - test scope: `spring-boot-testcontainers` and `testcontainers-postgresql`
  2. Add one test configuration with a `PostgreSQLContainer` (`postgres:18.6-alpine`) bean annotated `@ServiceConnection`, and import it into the existing tests.
  3. In `application.yaml`:
     - datasource URL `jdbc:postgresql://localhost:15432/pricing`, user `pricing`
     - password from the `PRICING_DB_PASSWORD` environment variable
     - `spring.jpa.open-in-view: false`
  4. Run the tests. Then run the app locally with the environment variable set and Compose up.
- Files: `pricing-service/pom.xml`, test configuration class, `pricing-service/src/main/resources/application.yaml`
- Done when: `./mvnw -B verify` is green (`docker ps` shows a postgres container during the tests), and with the local app running, `curl -s localhost:8081/actuator/health` contains `"status":"UP"`.
- Commit message: `feat(pricing): connect to PostgreSQL with Testcontainers in tests`
- Docs: https://docs.spring.io/spring-boot/reference/testing/testcontainers.html · https://docs.spring.io/spring-boot/reference/data/sql.html
- Pitfall: `spring.jpa.open-in-view` defaults to **true** in Boot 4.1.1. That holds a DB connection for the whole HTTP request and hides lazy-loading bugs, so turn it off now.

### PF-033 · Flyway V1: the product table
- Milestone: M3 · Est: 25 min · Type: build
- Tags: NEW(Flyway)
- Depends on: PF-030, PF-032
- Goal: Flyway creates the `product` table exactly as ARCHITECTURE §6.1 describes.
- Concept: Same as PF-030, now inside the service, with migrations in `src/main/resources/db/migration`. Edge case: Flyway runs as the datasource user (`pricing`), so that user needs the right to create tables. Our init script made it the database owner, so it has that right.
- Steps:
  1. Add `spring-boot-starter-flyway` and `flyway-database-postgresql` to pricing-service.
  2. Write `V1__create_product.sql` from ARCHITECTURE §6.1: identity PK, unique sku, a CHECK on category, version and timestamps.
  3. Run the tests (Testcontainers applies the migration) and the app locally (against the Compose DB).
- Files: `pricing-service/pom.xml`, `pricing-service/src/main/resources/db/migration/V1__create_product.sql`
- Done when: `./mvnw -B verify` is green; `docker compose exec postgres psql -U pricing -d pricing -c '\d product'` shows the columns; `docker compose exec postgres psql -U pricing -d pricing -c 'select version, success from flyway_schema_history'` shows `1 | t`.
- Commit message: `feat(pricing): add product table migration`
- Docs: https://docs.spring.io/spring-boot/how-to/data-initialization.html · https://documentation.red-gate.com/flyway/reference/database-driver-reference/postgresql-database
- Pitfall: Spelling the CHECK values differently from the Java enum. They must be exactly `FASTENERS`, `HAND_TOOLS` and `SAFETY_GEAR`.

### PF-034 · learn: JPA and Hibernate spike
- Milestone: M3 · Est: 30 min · Type: learn
- Tags: NEW(JPA/Hibernate)
- Depends on: PF-030
- Goal: See the entity lifecycle, dirty checking and optimistic locking, in scratch.
- Concept: JPA maps classes to tables. Hibernate tracks the "managed" entities in a transaction and writes their changes at flush or commit. Spring Data repositories generate CRUD and query methods, and `@Version` adds optimistic locking. Edge case: inside a transaction, changing a field of an entity you loaded is saved **without calling `save()`** (dirty checking). Coming from JDBC, that looks like magic or a bug.
- Steps:
  1. In the PF-030 scratch project, write one entity (with `@Id`, a name and `@Version`) and a `JpaRepository` for it.
  2. A test that saves, updates and reloads the entity, checking that the version goes 0 → 1.
  3. Turn on `spring.jpa.show-sql=true`.
  4. In a transactional test: load the entity, change a field, call `flush()`, and find the UPDATE in the SQL log, even though you never called `save()`.
- Files: scratch only.
- Done when: you can point to an UPDATE in the log that you never called `save()` for.
- Commit message: none (scratch).
- Docs: https://docs.spring.io/spring-data/jpa/reference/jpa/getting-started.html · https://docs.spring.io/spring-data/jpa/reference/jpa/entity-persistence.html · https://docs.hibernate.org/orm/7.0/introduction/html_single/
- Pitfall: `@DataJpaTest` rolls back each test by default. Data that was never flushed never reached the database, so a "missing" row may never have been written at all.

### PF-035 · Product entity and repository
- Milestone: M3 · Est: 30 min · Type: build
- Tags: NEW(JPA/Hibernate)
- Depends on: PF-033, PF-034
- Goal: Map `Product` to the `product` table, and prove the unique SKU with a `@DataJpaTest` on real Postgres.
- Concept: `spring.jpa.hibernate.ddl-auto: validate` makes Hibernate compare your entities with the Flyway schema at startup and refuse to start if they differ. Edge case: `@DataJpaTest` may set up an embedded database. Add `@AutoConfigureTestDatabase(replace = Replace.NONE)`, as Boot's testing docs show, so the test uses your Testcontainers Postgres.
- Steps:
  1. `Product` entity matching §6.1: `Category` stored as a string, `@Version`, timestamps.
  2. `ProductRepository` with `findBySku`.
  3. `spring.jpa.hibernate.ddl-auto: validate`.
  4. A `@DataJpaTest` importing your Testcontainers configuration:
     - save, then `findBySku`
     - a duplicate SKU with `saveAndFlush` throws `DataIntegrityViolationException`
- Files: `.../catalog/Product.java`, `.../catalog/ProductRepository.java`, test, `application.yaml`
- Done when: module verify is green, and the test log shows the container's `jdbc:postgresql` URL.
- Commit message: `feat(pricing): map Product entity`
- Docs: https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html · https://docs.spring.io/spring-boot/reference/testing/spring-boot-applications.html
- Pitfall: `@Enumerated` without `EnumType.STRING`. The default stores the ordinal (0, 1, 2), so reordering the enum silently corrupts data.

### PF-036 · Flyway V2: price lists and entries
- Milestone: M3 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-033
- Goal: Add `price_list` and `price_list_entry` per ARCHITECTURE §6.1, including the partial unique index that allows one ACTIVE list.
- Steps:
  1. `V2__create_price_lists.sql`: both tables, with FKs, CHECKs and unique (price_list_id, product_id).
  2. The partial unique index on `status` where `status = 'ACTIVE'`.
  3. Run the tests and the app.
- Files: `pricing-service/src/main/resources/db/migration/V2__create_price_lists.sql`
- Done when: module verify is green, and `docker compose exec postgres psql -U pricing -d pricing -c '\d price_list'` lists the partial index with its `WHERE` clause.
- Commit message: `feat(pricing): add price list tables`
- Docs: https://www.postgresql.org/docs/18/indexes-partial.html
- Pitfall: A partial unique *index* can't be deferred to commit time, so the order of the two updates during activation matters (PF-051 deals with this).

### PF-037 · PriceList and PriceListEntry entities
- Milestone: M3 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-035, PF-036
- Goal: Map both tables, plus repository methods to find the ACTIVE list and its entry for a SKU.
- Steps:
  1. `PriceList` (status enum as a string, `@Version`) and `PriceListEntry` (many-to-one to `PriceList` and to `Product`).
  2. Repository methods: find by code; find the ACTIVE list; find the active entry for a SKU (a derived or JPQL query).
  3. A `@DataJpaTest`: save a list with two entries, then find the active entry by SKU.
- Files: `.../pricelist/*.java` and test
- Done when: module verify is green.
- Commit message: `feat(pricing): map price lists and entries`
- Docs: https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
- Pitfall: Making `PriceList.entries` eager, which loads every entry and product whenever a list is read. Keep associations lazy and query what you need.

### PF-038 · Test: only one ACTIVE price list
- Milestone: M3 · Est: 20 min · Type: test
- Tags: none
- Depends on: PF-037
- Goal: Prove that the database enforces "at most one ACTIVE list" (SPEC §3.1) even if the code forgets.
- Steps:
  1. A `@DataJpaTest`: save list A as ACTIVE, then save list B as ACTIVE with `saveAndFlush`, and expect `DataIntegrityViolationException`.
  2. Two DRAFT lists are allowed.
- Files: test class
- Done when: module verify is green.
- Commit message: `test(pricing): one active price list is enforced by the database`
- Docs: https://www.postgresql.org/docs/18/indexes-partial.html
- Pitfall: Leaving out the flush. Without `saveAndFlush`, the INSERT runs after the assertion, so the test passes for the wrong reason.

### PF-039 · Flyway V3: discount rules
- Milestone: M3 · Est: 20 min · Type: build
- Tags: none
- Depends on: PF-036
- Goal: Add the `discount_rule` table per ARCHITECTURE §6.1.
- Steps:
  1. `V3__create_discount_rules.sql` with:
     - nullable condition columns
     - a CHECK on percent (> 0 and < 100)
     - a CHECK on min quantity (≥ 1)
     - CHECKs on the segment and category values
  2. Run the tests.
- Files: `pricing-service/src/main/resources/db/migration/V3__create_discount_rules.sql`
- Done when: module verify is green, and `\d discount_rule` shows the CHECK constraints.
- Commit message: `feat(pricing): add discount rule table`
- Docs: https://www.postgresql.org/docs/18/ddl-constraints.html
- Pitfall: Not knowing why a NULL segment passes `CHECK (segment IN (…))`. The expression evaluates to NULL, and a CHECK only rejects FALSE. That's what we want here (an empty condition), but know why.

### PF-040 · DiscountRule entity and repository
- Milestone: M3 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-035, PF-039
- Goal: Map `DiscountRule`, and fetch all active rules for the calculation.
- Steps:
  1. An entity with nullable segment, category and minQuantity, plus `@Version`.
  2. Repository methods: find by code; find all where active is true.
  3. A `@DataJpaTest`: inactive rules aren't returned, and the database rejects a percent of 100.
- Files: `.../rule/*.java` and test
- Done when: module verify is green.
- Commit message: `feat(pricing): map discount rules`
- Docs: https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
- Pitfall: Mapping `percent_off numeric(5,2)` to `Double`. `validate` rightly refuses to start, and the fix is `BigDecimal`, not loosening validation.

### PF-041 · Checkpoint 4: persistence in place
- Milestone: M3 · Est: 20 min · Type: test
- Tags: none
- Depends on: PF-038, PF-040
- Goal: Every pricing entity is persisted and tested, and M3 is merged.
- Steps:
  1. `docker compose down -v && docker compose up -d`, then run the app. `flyway_schema_history` shows V1 to V3.
  2. `./mvnw -B verify`, and note the test count in PROGRESS.
  3. Compare against SPEC §3.1: all four pricing entities exist, but nothing in §5 is user-visible yet.
  4. Open the M3 PR and merge once it's green. Then `git switch main && git pull && git switch -c m4-pricing-api`.
- Files: `README.md` (if run steps changed)
- Done when: the M3 PR is merged with green CI, and `m4-pricing-api` exists.
- Commit message: `docs: checkpoint 4 - pricing persistence`
- Docs: [SPEC.md](SPEC.md) §3.1
- Pitfall: Merging a stale branch. If `main` has moved, merge `main` into your branch and let CI run again first.

### M4 · Pricing REST API (branch `m4-pricing-api`)

### PF-042 · learn: Mockito spike
- Milestone: M4 · Est: 25 min · Type: learn
- Tags: NEW(Mockito)
- Depends on: PF-016
- Goal: Stub and verify collaborators in a unit test, in scratch.
- Concept: Mockito creates fake objects (`mock`). Their methods return what you stub with `when(…).thenReturn(…)`, and you can check calls with `verify`. With `@ExtendWith(MockitoExtension.class)`, `@Mock` and `@InjectMocks` do the wiring for you. Edge case: the extension uses **strict stubs**, so a stub your test never uses fails the test with `UnnecessaryStubbingException`. It's telling you the test misdescribes what the code does.
- Steps:
  1. In the PF-016 scratch project, write a `Service` that depends on a `Repository` interface.
  2. A unit test with a `@Mock` repository and an `@InjectMocks` service: stub a find, assert the result.
  3. `verify` that save was called once with the right argument, using an `ArgumentCaptor`.
  4. Add a stub you don't use, and read the strict-stubs failure.
- Files: scratch only.
- Done when: you've seen `UnnecessaryStubbingException`, and then fixed the test.
- Commit message: none (scratch).
- Docs: https://site.mockito.org/ · https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html
- Pitfall: `when(spy.method())` on a spy calls the real method while stubbing. For spies, use `doReturn(…).when(spy).method()`.

### PF-043 · ProductService.create with duplicate detection
- Milestone: M4 · Est: 25 min · Type: build
- Tags: NEW(Mockito)
- Depends on: PF-041, PF-042
- Goal: A service creates a product and refuses a duplicate SKU with a dedicated exception, unit-tested with Mockito.
- Concept: Unit tests mock the repository, so they run in milliseconds without a database, and the database constraint (PF-035) is the backstop. Edge case: checking `existsBySku` and then saving is a race, because two requests can both pass the check. Keep the unique constraint, and turn its violation into the same "duplicate" exception.
- Steps:
  1. `ProductService.create(sku, name, category)`: throw `DuplicateCodeException` if the SKU exists, otherwise save.
  2. Also catch `DataIntegrityViolationException` from the save, and throw the same exception.
  3. Mockito tests: the happy path (verify save), a duplicate caught by the exists check, and a duplicate caught by the constraint.
- Files: `.../catalog/ProductService.java`, exception, test
- Done when: module verify is green.
- Commit message: `feat(pricing): create products with duplicate detection`
- Docs: https://site.mockito.org/
- Pitfall: Mocking the class under test. Only mock its collaborators; the service itself must be real.

### PF-044 · POST /api/v1/products
- Milestone: M4 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-043
- Goal: Create a product over HTTP: a validated request, a 201 with `Location`, tested with `@WebMvcTest` (ARCHITECTURE §8.1).
- Steps:
  1. Add `spring-boot-starter-validation`.
  2. A request record with bean validation: `sku` not blank and at most 64 characters (for example uppercase letters, digits and hyphens), `name` not blank and at most 200, `category` not null.
  3. The controller returns 201 with `Location: /api/v1/products/{sku}` and the product in the body.
  4. A `@WebMvcTest` with `@MockitoBean ProductService`: one 201 case, and an invalid body → 400.
- Files: controller, request/response records, test
- Done when: module verify is green, and with the app running, this returns `201` and a `Location` header: `curl -si -X POST localhost:8081/api/v1/products -H 'Content-Type: application/json' -d '{"sku":"FST-HEXBOLT-M8-100","name":"M8 hex bolts, box of 100","category":"FASTENERS"}'`.
- Commit message: `feat(pricing): add create-product endpoint`
- Docs: https://docs.spring.io/spring-framework/reference/core/validation/beanvalidation.html · https://docs.spring.io/spring-framework/reference/testing/annotations/integration-spring/annotation-mockitobean.html
- Pitfall: Using `@MockBean` because 3.x tutorials do. Use Spring Framework's `@MockitoBean`, which the Boot 4.1 testing docs describe.

### PF-045 · Problem Details for validation, duplicates and not-found
- Milestone: M4 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-044
- Goal: Every pricing-service error so far is an RFC 9457 Problem Details body with our `type` URIs (ARCHITECTURE §8.4).
- Steps:
  1. `spring.mvc.problemdetails.enabled: true`.
  2. A `@RestControllerAdvice`. Extending `ResponseEntityExceptionHandler` is the documented route. It maps:
     - validation errors → 400 `validation-failed`, with an `errors` list
     - `DuplicateCodeException` → 409 `duplicate-code`
     - a not-found exception → 404 `product-not-found`
  3. `type` = `https://priceforge.example/problems/<slug>`.
  4. A `@WebMvcTest` asserting `type`, `status` and one field error.
- Files: `.../web/` advice and test
- Done when: module verify is green, and `curl -s -X POST localhost:8081/api/v1/products -H 'Content-Type: application/json' -d '{}'` returns `"type":"https://priceforge.example/problems/validation-failed"`.
- Commit message: `feat(pricing): return RFC 9457 problem details`
- Docs: https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-ann-rest-exceptions.html · https://docs.spring.io/spring-boot/reference/web/servlet.html · https://www.rfc-editor.org/rfc/rfc9457
- Pitfall: Adding your own `@ExceptionHandler(MethodArgumentNotValidException.class)` while extending `ResponseEntityExceptionHandler`. Spring then fails with an ambiguous-handler error; override the matching `handle…` method instead.

### PF-046 · Read products: by SKU and paged
- Milestone: M4 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-045
- Goal: `GET /api/v1/products/{sku}`, and `GET /api/v1/products?page=&size=` using our page shape (ARCHITECTURE §8).
- Steps:
  1. Service methods: get by SKU (404 when missing), and list with a `Pageable`.
  2. A page DTO `{content, page, size, totalElements, totalPages}`, mapped from Spring's `Page`, with `size` capped at 100.
  3. `@WebMvcTest` cases: found; not found (a 404 problem); the page shape.
- Files: controller, service, page DTO, tests
- Done when: module verify is green, and `curl -s 'localhost:8081/api/v1/products?size=5'` contains `"page":0` and `"size":5`.
- Commit message: `feat(pricing): read and list products`
- Docs: https://docs.spring.io/spring-data/jpa/reference/repositories/core-concepts.html
- Pitfall: Returning Spring's `Page` directly. Its JSON shape belongs to the framework and has changed between versions, which is why ARCHITECTURE defines our own shape.

### PF-047 · PATCH a product
- Milestone: M4 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-046
- Goal: `PATCH /api/v1/products/{sku}` changes `name` and/or `active`. SKU and category never change (SPEC §3.1).
- Steps:
  1. A request with optional `name` and `active`. A body with neither returns 400.
  2. Load, change, and let dirty checking write it (no `save` needed inside the transaction).
  3. Map an optimistic-lock failure to 409 `concurrent-update`.
  4. Tests: rename; deactivate; an empty body returns 400.
- Files: controller, service, tests
- Done when: module verify is green, and `curl -s -X PATCH localhost:8081/api/v1/products/FST-HEXBOLT-M8-100 -H 'Content-Type: application/json' -d '{"active":false}'` contains `"active":false`.
- Commit message: `feat(pricing): update product name and active flag`
- Docs: https://docs.spring.io/spring-framework/reference/data-access/transaction/declarative/annotations.html
- Pitfall: Silently ignoring `sku` or `category` in a PATCH body. They're immutable, so don't accept them in the request type at all.

### PF-048 · Price lists: create, read and list
- Milestone: M4 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-037, PF-047
- Goal: `POST /api/v1/price-lists` creates a DRAFT; `GET` returns one list with its entries, or a paged list (ARCHITECTURE §8.1).
- Steps:
  1. Request `{code, name, currency}`. The currency must equal `priceforge.pricing.currency` (USD), otherwise 400 `validation-failed` (SPEC §3.2).
  2. Bind `priceforge.pricing.*` with a `@ConfigurationProperties` record.
  3. Reading a list returns its entries with SKU and unit price.
  4. Tests: create; wrong currency; duplicate code (409); unknown code (404 `price-list-not-found`).
- Files: `.../pricelist/` controller, service, records, tests
- Done when: module verify is green, and `curl -si -X POST localhost:8081/api/v1/price-lists -H 'Content-Type: application/json' -d '{"code":"PL-2026","name":"2026 list","currency":"USD"}'` returns 201.
- Commit message: `feat(pricing): create and read price lists`
- Docs: https://docs.spring.io/spring-boot/reference/features/external-config.html
- Pitfall: `LazyInitializationException` when mapping entries after the transaction has ended (open-in-view is off). Map inside the service transaction, or use a fetch join.

### PF-049 · Edit entries of a DRAFT price list
- Milestone: M4 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-048
- Goal: `PUT …/entries/{sku}` sets a unit price and `DELETE` removes it, both only while the list is DRAFT.
- Steps:
  1. PUT body `{unitPrice}`, validated as positive with at most 2 decimals (`@Positive`, `@Digits(integer = 10, fraction = 2)`).
  2. An unknown SKU returns 404 `product-not-found`; a list that isn't DRAFT returns 409 `price-list-not-editable`.
  3. PUT is idempotent: setting the same SKU twice updates the existing entry.
  4. One test per rule.
- Files: controller, service, tests
- Done when: module verify is green, and a PUT of `12.00` for the bolts SKU returns 200, with the list showing the entry.
- Commit message: `feat(pricing): edit draft price list entries`
- Docs: https://docs.spring.io/spring-framework/reference/core/validation/beanvalidation.html
- Pitfall: Silently rounding `12.005`. It must be rejected, not rounded, so test that `@Digits` catches it.

### PF-050 · Checkpoint 5: catalog and price list API
- Milestone: M4 · Est: 20 min · Type: test
- Tags: none
- Depends on: PF-049
- Goal: The first half of the pricing API works end to end, and the README shows how to try it.
- Steps:
  1. `./mvnw -B verify`.
  2. Walk through F-1 and F-2 (all but activation) with curl, and note anything that surprised you.
  3. README: a "Try it" section with two curl examples.
  4. Compare against SPEC: F-1 is done, F-2 partly, AC-3 partly.
  5. Push, and check `ci` is green.
- Files: `README.md`
- Done when: `ci` is green on `m4-pricing-api`, and the README is updated.
- Commit message: `docs: checkpoint 5 - catalog and price list API`
- Docs: [SPEC.md](SPEC.md) §5, §8
- Pitfall: Curl examples that only work with your local data. Use the SPEC §4.2 SKU so anyone can follow them after `demo/seed.sh` (PF-057).

### PF-051 · Activate a price list
- Milestone: M4 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-050
- Goal: `POST /api/v1/price-lists/{code}/activate` retires the current ACTIVE list and activates this one, in a single transaction (SPEC §3.3).
- Steps:
  1. Allowed from DRAFT or RETIRED. An empty list returns 409 `price-list-empty`. A list that's already ACTIVE returns 200 and changes nothing.
  2. In one `@Transactional` method: retire the current ACTIVE list, **flush**, then activate the target and set `activated_at`.
  3. Map a unique-index violation (two concurrent activations) to 409 `concurrent-update`.
  4. Tests: activation swaps the statuses; an empty list returns 409; re-activating a RETIRED list works.
- Files: service, controller, tests
- Done when: module verify is green, and after activating PL-2026, `curl -s localhost:8081/api/v1/price-lists/PL-2026` contains `"status":"ACTIVE"`.
- Commit message: `feat(pricing): activate price lists`
- Docs: https://docs.spring.io/spring-framework/reference/data-access/transaction/declarative/annotations.html
- Pitfall: Skipping the explicit flush. Hibernate may then send the UPDATE that activates the new list *before* the one that retires the old one, and the partial unique index rejects it mid-transaction (it can't be deferred; see PF-036).

### PF-052 · Discount rules: create, read and list
- Milestone: M4 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-040, PF-050
- Goal: `POST /api/v1/discount-rules`, `GET …/{code}`, and `GET …?active=` paged (ARCHITECTURE §8.1).
- Steps:
  1. A request with:
     - code, description
     - optional segment, category and minQuantity
     - percentOff: above 0, below 100, at most 2 decimals
     - priority, and an optional exclusiveGroup
     - active, defaulting to true
  2. Validation errors return 400; a duplicate code returns 409; an unknown code returns 404 `discount-rule-not-found`.
  3. A test for each.
- Files: `.../rule/` controller, service, records, tests
- Done when: module verify is green, and creating SEG-CONTRACTOR-5 from SPEC §4.2 returns 201.
- Commit message: `feat(pricing): create and read discount rules`
- Docs: https://docs.spring.io/spring-framework/reference/core/validation/beanvalidation.html
- Pitfall: `@DecimalMax("100")` is inclusive by default, but percent must be **below** 100. Use `@DecimalMax(value = "100", inclusive = false)`.

### PF-053 · Update a discount rule
- Milestone: M4 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-052
- Goal: `PUT /api/v1/discount-rules/{code}` replaces every field except `code`, including `active` (ARCHITECTURE §8.1).
- Steps:
  1. The same validation as create. A `code` in the body must match the path, or be absent.
  2. An optimistic-lock conflict returns 409 `concurrent-update`.
  3. Leave a comment where M6 will publish the change event (PF-083). There's no Kafka yet.
  4. Tests: change the percent; deactivate; a code mismatch returns 400.
- Files: service, controller, tests
- Done when: module verify is green.
- Commit message: `feat(pricing): update discount rules`
- Docs: [ARCHITECTURE.md](ARCHITECTURE.md) §8.1
- Pitfall: Treating PUT like PATCH, so missing fields quietly keep their old values. PUT replaces the whole rule: a missing optional field means "clear it".

### PF-054 · Price-calculation contract records
- Milestone: M4 · Est: 20 min · Type: design
- Tags: none
- Depends on: PF-014, PF-028
- Goal: The calculation request and response records live in `contracts` and match ARCHITECTURE §8.3 exactly.
- Steps:
  1. Request: segment, plus lines (sku, quantity).
  2. Response: every §8.3 field, including steps, totals and `calculatedAt`.
  3. Add `tools.jackson.core:jackson-databind` to `contracts` in test scope (its version is Boot-managed).
  4. Copy the §8.3 example into `contracts/src/test/resources/calculation-example-a.json`, and write a test that deserializes it, re-serializes it and compares the two JSON documents.
- Files: `contracts/src/main/java/dev/priceforge/contracts/pricing/*.java`, test, fixture, `contracts/pom.xml`
- Done when: `./mvnw -B -pl contracts verify` is green.
- Commit message: `feat(contracts): add price calculation request and response`
- Docs: [ARCHITECTURE.md](ARCHITECTURE.md) §8.3
- Pitfall: Jackson 3 classes live in `tools.jackson.*`, while blogs import `com.fasterxml.jackson.databind`. Take the import your IDE offers from the managed dependency.

### PF-055 · PriceCalculationService
- Milestone: M4 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-051, PF-053, PF-054
- Goal: A service that loads the inputs for every line and calls the engine, unit-tested with Mockito.
- Steps:
  1. Load:
     - the ACTIVE list (none → `no-active-price-list`)
     - each product (unknown → `unknown-sku`; inactive → `product-inactive`)
     - its entry (missing → `sku-not-priced`)
     - the active rules, once per request
  2. Call the engine for each line, with `priceforge.pricing.discount-cap-percent`.
  3. Build the response with the totals: listTotal, netTotal, totalSavings.
  4. Mockito tests: Example A through the service, and each error case.
- Files: `.../calculation/PriceCalculationService.java`, exceptions, test
- Done when: module verify is green.
- Commit message: `feat(pricing): calculate prices from active data`
- Docs: [SPEC.md](SPEC.md) §4.1
- Pitfall: Loading the active rules once per *line*, so N lines make N identical queries. Load them once per request.

### PF-056 · POST /api/v1/price-calculations
- Milestone: M4 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-055
- Goal: The calculation endpoint, with validation and the 422 problem types (ARCHITECTURE §8.1, §8.4).
- Steps:
  1. Validate: 1–50 lines, quantity 1–100,000, SKU not blank.
  2. Map the four calculation exceptions to 422 with their slugs.
  3. `@WebMvcTest` cases: the 200 shape; 51 lines → 400; an unknown SKU → 422 `unknown-sku`.
- Files: `.../calculation/` controller, advice entries, tests
- Done when: module verify is green, and with the PF-057 data (or data entered by hand), the Example A request returns `"unitNetPrice":10.18`.
- Commit message: `feat(pricing): add price calculation endpoint`
- Docs: [ARCHITECTURE.md](ARCHITECTURE.md) §8.4
- Pitfall: Returning 404 for an unknown SKU in the request body. 404 means the URL wasn't found; here the resource exists and the content is the problem, so it's 422.

### PF-057 · demo/seed.sh: load the SPEC data through the API
- Milestone: M4 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-056
- Goal: One script creates the demo product, price list and rules through the public API, then prints Example A's result.
- Steps:
  1. `demo/seed.sh` in bash with `set -euo pipefail`, using curl, with the base URL from `PRICING_URL` (default `http://localhost:8081`).
  2. Create the product; create DRAFT list PL-2026 with the price 12.00; activate it; create the five SPEC §4.2 rules.
  3. Finish by running the Example A calculation and printing the response.
  4. Make it safe to run twice: treat a 409 duplicate as fine.
- Files: `demo/seed.sh`
- Done when: on a fresh database, `./demo/seed.sh` prints JSON containing `"unitNetPrice":10.18` and `"lineTotal":1527.00`, and a second run exits 0.
- Commit message: `feat(demo): seed demo data through the API`
- Docs: [SPEC.md](SPEC.md) §4.2
- Pitfall: curl exits 0 even on HTTP 4xx and 5xx. Use `--fail-with-body` (or check the status code) so the script stops on real errors.

### PF-058 · Checkpoint 6: pricing API complete
- Milestone: M4 · Est: 20 min · Type: test
- Tags: none
- Depends on: PF-057
- Goal: The whole pricing API works from a clean start, and M4 is merged.
- Steps:
  1. `./mvnw -B verify`; `docker compose down -v && docker compose up -d`; run the app; `./demo/seed.sh`.
  2. Try Examples B and C with curl, and compare them with SPEC §4.2.
  3. README: "Try it" now uses `demo/seed.sh`.
  4. Compare against SPEC: F-1 to F-4 are done; AC-3 is done for pricing.
  5. Open the M4 PR and merge once it's green. Then create `m5-integration-tests` from the updated `main`.
- Files: `README.md`
- Done when: M4 is merged, and you've reproduced Examples A–C by hand.
- Commit message: `docs: checkpoint 6 - pricing API`
- Docs: [SPEC.md](SPEC.md) §4.2, §5
- Pitfall: "Fixing" a SPEC number to match the code. If the code disagrees with SPEC, the code is wrong until a SPEC change has been approved.

### M5 · Integration-test harness (branch `m5-integration-tests`)

### PF-059 · Split unit and integration tests
- Milestone: M5 · Est: 20 min · Type: infra
- Tags: none
- Depends on: PF-058
- Goal: `*Test` classes run in the `test` phase and `*IT` classes in `integration-test`/`verify`, so fast feedback stays fast (ARCHITECTURE §13).
- Steps:
  1. Enable `maven-failsafe-plugin` for the service modules. Boot's parent manages its version.
  2. Add an empty `SmokeIT` to pricing-service to prove it runs.
  3. Run `./mvnw -B verify`, and find both test summaries (Surefire and Failsafe).
- Files: `pom.xml` and/or the service POMs, `SmokeIT.java`
- Done when: the verify log shows the Failsafe `integration-test` goal running `SmokeIT`.
- Commit message: `build: run *IT classes with Failsafe`
- Docs: https://maven.apache.org/surefire/maven-failsafe-plugin/
- Pitfall: Running `./mvnw test` and assuming the ITs passed. Failsafe only runs in `integration-test` and `verify`.

### PF-060 · IT: the API reproduces Examples A–D (AC-2)
- Milestone: M5 · Est: 30 min · Type: test
- Tags: none
- Depends on: PF-059
- Goal: An end-to-end test with real HTTP and real Postgres, with data created through the API and every step amount asserted.
- Steps:
  1. `@SpringBootTest(webEnvironment = RANDOM_PORT)` with your Testcontainers configuration, and a `RestClient` aimed at the random port.
  2. Create the SPEC §4.2 data through the API, using one helper.
  3. Assert Examples A, B (99 and 100 boxes) and C: every step and every total.
  4. Example D: reorder the priorities with PUT (VOL-100 first, then CAT-FASTENERS-3, then SEG-CONTRACTOR-5), and assert 10.17.
  5. Each test sets up its own data, so they don't depend on running order.
- Files: `pricing-service/src/test/java/.../PriceCalculationIT.java`
- Done when: `./mvnw -B -pl pricing-service -am verify` runs `PriceCalculationIT` with every example passing.
- Commit message: `test(pricing): API reproduces SPEC examples A-D`
- Docs: https://docs.spring.io/spring-boot/reference/testing/spring-boot-applications.html
- Pitfall: Data leaking between ITs that share one container: a rule created in one test changes prices in another. Use unique codes per test, or clean the tables in `@BeforeEach`.

### PF-061 · IT: every pricing error is Problem Details (AC-3)
- Milestone: M5 · Est: 25 min · Type: test
- Tags: none
- Depends on: PF-060
- Goal: One parameterized IT triggers each pricing error and checks the content type, status and `type`.
- Steps:
  1. Cases:
     - validation-failed, duplicate-code
     - product-not-found
     - price-list-not-editable, price-list-empty
     - unknown-sku, product-inactive, sku-not-priced, no-active-price-list
  2. Assert `Content-Type: application/problem+json` and the `type` URI.
- Files: `.../ProblemDetailsIT.java`
- Done when: module verify is green with all cases.
- Commit message: `test(pricing): error responses follow RFC 9457`
- Docs: https://www.rfc-editor.org/rfc/rfc9457
- Pitfall: A case that returns a 500 `internal-error` because nobody mapped it. Finding exactly those is what this test is for.

### PF-062 · Checkpoint 7: integration tests
- Milestone: M5 · Est: 15 min · Type: test
- Tags: none
- Depends on: PF-061
- Goal: AC-2 and the pricing half of AC-3 are proven, and M5 is merged.
- Steps:
  1. `./mvnw -B verify`, and write the CI duration from the PR's checks into PROGRESS.
  2. Compare against SPEC: AC-2 is done; AC-3 is done for pricing.
  3. Merge the M5 PR once it's green, then create `m6-quotes`.
- Files: none
- Done when: M5 is merged, and the CI duration is recorded.
- Commit message: `docs: checkpoint 7 - integration tests`
- Docs: [SPEC.md](SPEC.md) §8
- Pitfall: Letting CI time creep up unnoticed. Recording it now gives you a baseline.

### M6 · quote-service and Kafka events, part 1: quote-service core (branch `m6-quotes`)

### PF-063 · Generate quote-service and wire it in
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-062
- Goal: quote-service runs on 8082 with health UP, on the `quote` database, with Testcontainers in its tests and Flyway ready.
- Steps:
  1. On start.spring.io choose:
     - artifact `quote-service`, package `dev.priceforge.quote`
     - dependencies: Spring Web (MVC), Actuator, Validation, Spring Data JPA, PostgreSQL Driver, Flyway Migration, Testcontainers

     Remove its wrapper files, set the parent to `priceforge-parent`, and depend on `contracts`.
  2. Add `flyway-database-postgresql`. Configure:
     - port 8082
     - datasource `jdbc:postgresql://localhost:15432/quote`, user `quote`, password from `QUOTE_DB_PASSWORD`
     - open-in-view off, `ddl-auto: validate`
  3. Copy the pattern from pricing-service's Testcontainers configuration and health test. Don't share test code across modules yet.
- Files: `quote-service/**`, `pom.xml`
- Done when: `./mvnw -B verify` is green for every module, and with the local app running, `curl -s localhost:8082/actuator/health` contains `"status":"UP"`.
- Commit message: `feat(quote): add quote-service walking skeleton`
- Docs: https://start.spring.io
- Pitfall: A port clash. If quote-service also starts on 8081, the second app fails with "Port 8081 was already in use".

### PF-064 · Flyway V1: quotes and quote lines
- Milestone: M6 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-063
- Goal: The `quote` and `quote_line` tables per ARCHITECTURE §6.2, with the breakdown stored as `jsonb`.
- Steps:
  1. `V1__create_quotes.sql`: uuid PK, CHECKs, the FK, unique (quote_id, line_no), and an index on status.
  2. Run the tests.
- Files: `quote-service/src/main/resources/db/migration/V1__create_quotes.sql`
- Done when: module verify is green, and `docker compose exec postgres psql -U quote -d quote -c '\d quote_line'` shows `breakdown | jsonb`.
- Commit message: `feat(quote): add quote tables`
- Docs: https://www.postgresql.org/docs/18/datatype-json.html
- Pitfall: Using `json` instead of `jsonb`. `json` stores the raw text (keeping duplicate keys) and is slower to query.

### PF-065 · Quote and QuoteLine entities
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-064
- Goal: Map `Quote` (uuid id, `@Version`) and `QuoteLine`, with the steps list stored in the `jsonb` column.
- Steps:
  1. `Quote`: status enum stored as a string, totals as `BigDecimal`, lines as a one-to-many with cascade and orphan removal.
  2. `QuoteLine.breakdown`: a list of the contracts step record, annotated `@JdbcTypeCode(SqlTypes.JSON)`.
  3. A `@DataJpaTest`: save a quote with one line and the Example A steps, reload it, and assert the steps round-trip.
- Files: `.../quote/*.java` and test
- Done when: module verify is green.
- Commit message: `feat(quote): map quotes and lines`
- Docs: https://docs.hibernate.org/orm/7.0/userguide/html_single/ · https://docs.hibernate.org/orm/7.0/javadocs/org/hibernate/type/SqlTypes.html
- Pitfall: Mutating the list inside a loaded entity. Hibernate may not detect it as a change, so assign a new list when you re-price.

### PF-066 · Quote history entries
- Milestone: M6 · Est: 20 min · Type: build
- Tags: none
- Depends on: PF-065
- Goal: `V2__create_quote_history.sql` and a `QuoteHistoryEntry` entity, with unique (quote_id, cause_event_id).
- Steps:
  1. The migration and the entity, per §6.2.
  2. A `@DataJpaTest`: two CREATED entries with a NULL cause are allowed; two PRICING_CHANGED entries with the same cause are a violation.
- Files: migration, entity, test
- Done when: module verify is green.
- Commit message: `feat(quote): add quote history`
- Docs: https://www.postgresql.org/docs/18/ddl-constraints.html
- Pitfall: Expecting the NULL rows to violate the unique constraint. PostgreSQL treats NULLs as distinct (you saw this in PF-008).

### PF-067 · Pricing client with timeouts
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-054, PF-063
- Goal: A `RestClient`-based client calls `POST /api/v1/price-calculations` with the contracts records, using a 1 s connect timeout and a 3 s read timeout (ADR-0003).
- Steps:
  1. Add `spring-boot-starter-restclient`.
  2. `@ConfigurationProperties` for `priceforge.quote.pricing-base-url` and both timeouts.
  3. Build the `RestClient` with a request factory that applies both timeouts.
  4. Test with `MockRestServiceServer`, which supports `RestClient` (bind it to the builder, per its Javadoc): a 200 response is mapped into the contracts response record.
- Files: `.../pricingclient/*.java` and test
- Done when: module verify is green.
- Commit message: `feat(quote): add pricing-service client`
- Docs: https://docs.spring.io/spring-boot/reference/io/rest-client.html · https://docs.spring.io/spring-framework/reference/integration/rest-clients.html · https://docs.spring.io/spring-framework/reference/testing/spring-mvc-test-client.html
- Pitfall: A client with no read timeout can wait a very long time on a hung server, holding a request thread the whole time. That's why ADR-0003 sets one.

### PF-068 · Pricing client error mapping
- Milestone: M6 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-067
- Goal: Turn pricing failures into quote-service problems: a 4xx becomes 422 `pricing-rejected` (passing `type` and `detail` through), and unreachable, timed out or 5xx becomes 503 `pricing-unavailable`.
- Steps:
  1. Handle a 4xx with the client's status handlers, reading pricing's Problem Details body.
  2. Catch connection and timeout exceptions, and turn them into a `PricingUnavailableException`.
  3. Problem Details advice in quote-service (`spring.mvc.problemdetails.enabled: true`), with the same `type` base as pricing.
  4. Tests: a 422 from pricing becomes 422 `pricing-rejected` with the original type; a 500 becomes 503; a timeout becomes 503.
- Files: client, advice, tests
- Done when: module verify is green.
- Commit message: `feat(quote): map pricing failures to problem details`
- Docs: https://docs.spring.io/spring-framework/reference/integration/rest-clients.html
- Pitfall: Retrying on a 4xx. The request itself is wrong, so a retry gets the same answer, and ADR-0003 says no automatic retries anyway.

### PF-069 · Checkpoint 8: quote-service foundations
- Milestone: M6 · Est: 15 min · Type: test
- Tags: none
- Depends on: PF-066, PF-068
- Goal: quote-service is persisted, tested and green in CI before any business logic is added.
- Steps:
  1. `./mvnw -B verify`, then push `m6-quotes` and check `ci`.
  2. With Compose and both services running, check `free -h`. Write the free memory in PROGRESS.
  3. Compare against SPEC: F-7 is in progress.
- Files: none
- Done when: `ci` is green on `m6-quotes`, and the memory reading is recorded.
- Commit message: `docs: checkpoint 8 - quote-service foundations`
- Docs: [ARCHITECTURE.md](ARCHITECTURE.md) §12.3
- Pitfall: Running everything at once on 8 GB. Use the run modes in ARCHITECTURE §12.3, and stop what you don't need.

### PF-070 · Create a quote (service)
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-069
- Goal: `QuoteService.create` prices every line in one pricing call, stores the snapshot and a CREATED history entry, and sets the status to PRICED.
- Steps:
  1. Map the pricing response into `Quote` and `QuoteLine`: product name, category, prices, and the steps as the breakdown.
  2. Generate the UUID in the application.
  3. Take the totals, `priced_at`, `price_list_code` and `currency` from the response.
  4. If pricing fails, nothing is saved. The call happens before any write.
  5. A Mockito unit test: the snapshot is copied correctly, and a failure saves nothing.
- Files: `.../quote/QuoteService.java` and test
- Done when: module verify is green.
- Commit message: `feat(quote): create priced quotes`
- Docs: [SPEC.md](SPEC.md) §5 F-7
- Pitfall: Calling pricing inside a database transaction, which holds a DB connection through up to 3 s of HTTP waiting. Price first, then open the transaction to save.

### PF-071 · POST /api/v1/quotes
- Milestone: M6 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-070
- Goal: The create endpoint: validation (customer name, segment, 1–50 lines), a 201 with `Location`, and the problem types.
- Steps:
  1. A request record with validation, and a controller.
  2. A `@WebMvcTest` with `@MockitoBean QuoteService`: 201, 400 and 503 cases.
- Files: controller, records, test
- Done when: module verify is green, and with pricing running and seeded, this returns 201 with `"netTotal":1527.00`: `curl -si -X POST localhost:8082/api/v1/quotes -H 'Content-Type: application/json' -d '{"customerName":"Acme Builders","segment":"CONTRACTOR","lines":[{"sku":"FST-HEXBOLT-M8-100","quantity":150}]}'`.
- Commit message: `feat(quote): add create-quote endpoint`
- Docs: [ARCHITECTURE.md](ARCHITECTURE.md) §8.2
- Pitfall: Hard-coding `localhost:8081`. The base URL must come from `priceforge.quote.pricing-base-url`, because inside Compose it's `http://pricing-service:8081`.

### PF-072 · Read and list quotes
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-071
- Goal: `GET /api/v1/quotes/{id}` with lines and history, and `GET /api/v1/quotes?status=` paged in our page shape.
- Steps:
  1. Load the lines and the history without N+1 queries.
  2. An unknown id returns 404 `quote-not-found`.
  3. Tests for both endpoints.
- Files: controller, service/queries, tests
- Done when: module verify is green, and a GET of the PF-071 quote shows one `CREATED` history entry.
- Commit message: `feat(quote): read and list quotes`
- Docs: https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
- Pitfall: Fetch-joining both collections (lines and history) in one query. Hibernate refuses to fetch two bags at once (`MultipleBagFetchException`), so load them with two queries.

### PF-073 · Re-price a quote
- Milestone: M6 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-072
- Goal: `POST /api/v1/quotes/{id}/reprice` (PRICED or STALE → PRICED) replaces the snapshot and adds a REPRICED entry (SPEC §3.3).
- Steps:
  1. Load the quote, and call pricing with its segment and lines.
  2. In one transaction:
     - re-check the status
     - replace the lines' snapshots and the totals
     - set the status to PRICED
     - add a REPRICED entry
  3. Re-pricing an ACCEPTED quote returns 409 `quote-not-acceptable`. §8.4 has no separate slug; propose one with "change" if you want it.
  4. Tests for each path.
- Files: service, controller, tests
- Done when: module verify is green. After changing a rule's percent with PUT on pricing, a re-price shows a new `unitNetPrice` and a REPRICED entry.
- Commit message: `feat(quote): re-price quotes`
- Docs: [SPEC.md](SPEC.md) §3.3
- Pitfall: Trusting the status you read before the pricing call. It can change while you wait, so check it again inside the transaction.

### PF-074 · Accept a quote
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-073
- Goal: `POST /api/v1/quotes/{id}/accept` moves PRICED → ACCEPTED with an ACCEPTED entry (SPEC §3.3, AC-5).
- Steps:
  1. Check the state, and update it in the same transaction.
  2. A STALE or ACCEPTED quote returns 409 `quote-not-acceptable`.
  3. Map a version conflict to 409 `concurrent-update`.
  4. Tests, including two transactions updating the same quote.
- Files: service, controller, tests
- Done when: module verify is green.
- Commit message: `feat(quote): accept quotes`
- Docs: https://docs.spring.io/spring-framework/reference/data-access/transaction/declarative/annotations.html
- Pitfall: Checking the status in one transaction and updating in another. A stale-mark can land in between, so do both in one transaction and let `@Version` catch the rest.

### PF-075 · Checkpoint 9: the quote lifecycle without Kafka
- Milestone: M6 · Est: 20 min · Type: test
- Tags: none
- Depends on: PF-074
- Goal: Quotes work end to end over REST, including the "pricing is down" path, and part 1 of M6 is merged.
- Steps:
  1. Compose up, both services running, then `./demo/seed.sh`.
  2. With curl: create a quote, read it, re-price it, accept it.
  3. Stop pricing-service and create a quote. Expect 503, with nothing stored.
  4. Compare against SPEC: F-7 and F-9 are done; AC-3 is done for quote-service.
  5. Merge the `m6-quotes` PR once it's green, then create `m6-events`.
- Files: `README.md` (quote examples)
- Done when: the 503 case leaves the row count unchanged (`docker compose exec postgres psql -U quote -d quote -c 'select count(*) from quote'`), and part 1 is merged.
- Commit message: `docs: checkpoint 9 - quote lifecycle`
- Docs: [SPEC.md](SPEC.md) §5
- Pitfall: Treating the 503 as a bug. SPEC F-7 says quote creation fails cleanly when pricing is down.

### M6 · part 2: Kafka events (branch `m6-events`)

### PF-076 · learn: Kafka in KRaft mode with Docker
- Milestone: M6 · Est: 30 min · Type: learn
- Tags: NEW(Kafka KRaft)
- Depends on: PF-007
- Goal: Run a single-node KRaft broker in scratch, then produce and consume from inside the container and from the host.
- Concept: KRaft is Kafka without ZooKeeper: the broker is its own controller (`KAFKA_PROCESS_ROLES: broker,controller`). A client contacts a bootstrap address first, then reconnects to whatever address the broker **advertises** for that listener. Edge cases:
  - Advertise only `kafka:9092`, and a host client bootstraps fine, then fails because `kafka` doesn't resolve on your laptop. You need one listener per audience.
  - On a single broker, `KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR` must be 1 (the default is 3).
- Steps:
  1. Copy the official single-node example into scratch, using image `apache/kafka:4.2.2`.
  2. `docker compose up -d`. Find the CLI scripts (`docker compose exec <svc> ls /opt/kafka/bin`) and create a topic.
  3. Produce with `kafka-console-producer.sh`, and consume with `kafka-console-consumer.sh --from-beginning`.
  4. From the host, consume through the host listener: `docker run --rm --network host apache/kafka:4.2.2 /opt/kafka/bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic <t> --from-beginning`.
  5. Change the host listener's advertised name to something wrong, recreate the container, and repeat step 4 to see it fail.
- Files: scratch only.
- Done when: you consumed your own message from the host, and can explain why step 5 fails *after* bootstrapping.
- Commit message: none (scratch).
- Docs: https://github.com/apache/kafka/blob/trunk/docker/examples/docker-compose-files/single-node/plaintext/docker-compose.yml · https://hub.docker.com/r/apache/kafka · https://kafka.apache.org/documentation/
- Pitfall: `docker compose restart` doesn't apply changed environment variables. Use `docker compose up -d`, which recreates the container.

### PF-077 · Add Kafka to compose.yaml
- Milestone: M6 · Est: 30 min · Type: infra
- Tags: NEW(Kafka KRaft)
- Depends on: PF-075, PF-076
- Goal: The project's Compose starts a healthy KRaft broker with an internal listener (`kafka:9092`) and a host listener (`localhost:19092`) (ARCHITECTURE §12.1).
- Concept: The same setup as PF-076, with project settings: heap `-Xms256m -Xmx256m`, `mem_limit: 768m`, auto topic creation off, and a healthcheck. Edge case: the Kafka start scripts read `KAFKA_HEAP_OPTS` and pass their own default `-Xmx` if it's unset. Put heap flags in `JAVA_TOOL_OPTIONS` instead, and the script's `-Xmx` wins, exceeding the container limit.
- Steps:
  1. A `kafka` service on `apache/kafka:4.2.2`:
     - listeners per §12.1: internal 9092, external 19092 advertised as `localhost:19092`, controller 9093
     - single-node replication factors set to 1
     - `KAFKA_AUTO_CREATE_TOPICS_ENABLE: "false"`
  2. `KAFKA_HEAP_OPTS` and `mem_limit` as above.
  3. A healthcheck that succeeds only when the broker answers, for example listing topics on `localhost:9092` from inside the container.
  4. `docker compose up -d`, then wait for healthy.
- Files: `compose.yaml`
- Done when: `docker compose ps` shows kafka `(healthy)`, and `docker compose exec kafka /opt/kafka/bin/kafka-topics.sh --bootstrap-server localhost:9092 --list` exits 0.
- Commit message: `chore(infra): add single-node Kafka (KRaft) to docker compose`
- Docs: https://github.com/apache/kafka/blob/trunk/docker/examples/docker-compose-files/single-node/plaintext/docker-compose.yml · https://hub.docker.com/r/apache/kafka
- Pitfall: Guessing environment variable names. The image's rule: `.` becomes `_`, `-` becomes `___`, and everything gets the prefix `KAFKA_` (see the image docs).

### PF-078 · PricingChangedEvent in contracts
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-054
- Goal: The v1 event record, plus JSON fixtures that pin its format (ADR-0004, ARCHITECTURE §7.2).
- Steps:
  1. A record with the §7.2 fields, a nested scope record, and enums for `eventType` and `change`.
  2. Topic-name constants: `pricing.changes.v1` and `pricing.changes.v1-dlt`.
  3. A fixture `contracts/src/test/resources/events/pricing-changed-v1.json`, copied from §7.2, with a test that deserializes it, re-serializes it and compares the JSON.
  4. A test that a payload with an extra unknown field still deserializes (the tolerant reader).
- Files: `contracts/src/main/java/dev/priceforge/contracts/events/*.java`, fixtures, tests
- Done when: `./mvnw -B -pl contracts verify` is green.
- Commit message: `feat(contracts): add PricingChangedEvent v1`
- Docs: [ADR-0004](adr/0004-event-schema-format.md) · [ARCHITECTURE.md](ARCHITECTURE.md) §7.2
- Pitfall: Assuming every Jackson mapper treats unknown fields the same way. Boot's auto-configured mapper and a plain mapper are configured differently, so the test pins the behaviour you need.

### PF-079 · learn: Spring Kafka producer, sending and waiting for the ack
- Milestone: M6 · Est: 25 min · Type: learn
- Tags: NEW(Kafka producer)
- Depends on: PF-076
- Goal: In scratch, send keyed JSON records, wait for the broker's acknowledgement, and see what happens when the broker is down.
- Concept: `KafkaTemplate.send(…)` returns a `CompletableFuture<SendResult>`, so the record may not be sent yet when `send` returns. The docs recommend `get(timeout)` if you need to block. Edge case: without waiting, a failed send never surfaces in your method. A `@Transactional` method commits anyway, and the event is silently lost. ADR-0006 exists because of this.
- Steps:
  1. A scratch Boot app (Spring for Apache Kafka) pointed at the PF-076 broker.
  2. Send a keyed JSON message with `JacksonJsonSerializer`, with type headers off. Read it with the console consumer, adding `--property print.key=true --property print.headers=true`.
  3. Stop the broker. Send without waiting and log "sent". Then send with `get(5, SECONDS)` and catch the exception.
- Files: scratch only.
- Done when: you saw "sent" logged for a message that never arrived, and an exception only in the waiting version.
- Commit message: none (scratch).
- Docs: https://docs.spring.io/spring-kafka/reference/kafka/sending-messages.html · https://docs.spring.io/spring-kafka/reference/kafka/serdes.html
- Pitfall: Leaving type info headers on (the default). Consumers then see a header naming the producer's Java class, which couples them to it. ADR-0004 turns these headers off.

### PF-080 · Topics and producer settings in pricing-service
- Milestone: M6 · Est: 25 min · Type: build
- Tags: NEW(Kafka producer)
- Depends on: PF-077, PF-078, PF-079
- Goal: pricing-service declares both topics (3 partitions each) and has a producer with `acks=all` and JSON values without type headers (ADR-0004, ADR-0005).
- Concept: `NewTopic` beans (built with `TopicBuilder`) are created at startup by Boot's `KafkaAdmin`. Edge case: if a topic already exists with fewer partitions, the admin can add partitions but never removes them, and adding partitions changes which partition each key maps to.
- Steps:
  1. Add `spring-boot-starter-kafka` to pricing-service.
  2. `NewTopic` beans for `pricing.changes.v1` and `pricing.changes.v1-dlt`, with 3 partitions and replication factor 1.
  3. Producer settings:
     - bootstrap `localhost:19092` locally
     - `spring.kafka.producer.acks: all`
     - `JacksonJsonSerializer` for values, with `ADD_TYPE_INFO_HEADERS=false`
     - string keys
  4. Tests: add `testcontainers-kafka` and a `KafkaContainer` (`apache/kafka:4.2.2`) with `@ServiceConnection` to the test configuration.
- Files: `pricing-service/pom.xml`, Kafka configuration class, `application.yaml`, test configuration
- Done when: module verify is green. With Compose up and the app running, `docker compose exec kafka /opt/kafka/bin/kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic pricing.changes.v1` shows `PartitionCount: 3`.
- Commit message: `feat(pricing): declare pricing change topics and producer`
- Docs: https://docs.spring.io/spring-kafka/reference/kafka/configuring-topics.html · https://docs.spring.io/spring-boot/reference/messaging/kafka.html · https://java.testcontainers.org/modules/kafka/
- Pitfall: Letting every IT class start its own Postgres and Kafka. Reuse one container of each (ARCHITECTURE §13), or the laptop runs out of memory.

### PF-081 · Compute the change scope
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-053, PF-078
- Goal: A pure function builds an event's scope from a rule's before and after conditions, or "everything" for a price list, with tests (SPEC §4.3).
- Steps:
  1. Input: an optional "before" and an optional "after" (segment, category) pair. Output: the §7.2 scope.
  2. Take the union of the named segments and categories. An empty condition on either side means "all" for that dimension.
  3. Tests:
     - a create (no before)
     - a category change from FASTENERS to SAFETY_GEAR
     - a rule without a category
     - a price list ("all", "all")
- Files: `.../events/` scope builder and test
- Done when: module verify is green.
- Commit message: `feat(pricing): compute pricing change scope`
- Docs: [SPEC.md](SPEC.md) §4.3
- Pitfall: Using only the "after" version. A rule that moves from FASTENERS to SAFETY_GEAR changes FASTENERS prices too, so those quotes must go stale as well.

### PF-082 · Publish PRICE_LIST_ACTIVATED inside the transaction
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-051, PF-080, PF-081
- Goal: Activation sends the event and waits for the ack before the commit. A failed send rolls back and returns 503 `event-publish-failed` (ADR-0006).
- Steps:
  1. A small publisher that:
     - builds the event (new UUID, `occurredAt`, subject `price-list:<code>`, scope "all")
     - sends it keyed by subject
     - waits up to `priceforge.pricing.publish-timeout`
  2. Call it at the end of the activation transaction.
  3. Map the publish failure to 503 `event-publish-failed`.
  4. A unit test with a mocked `KafkaTemplate` returning a failed future: the exception propagates.
- Files: `.../events/` publisher, activation service, advice, test
- Done when: module verify is green.
- Commit message: `feat(pricing): publish price list activation events`
- Docs: [ADR-0006](adr/0006-event-publishing-consistency.md) · https://docs.spring.io/spring-kafka/reference/kafka/sending-messages.html
- Pitfall: Catching the send exception and just logging it "to be safe". That silently turns ADR-0006's guarantee into the lost-event case.

### PF-083 · Publish DISCOUNT_RULE_CHANGED
- Milestone: M6 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-082
- Goal: Creating, updating, activating or deactivating a rule each publishes one event, except description-only edits (SPEC §4.3).
- Steps:
  1. Capture the rule's conditions before the change, and compute the scope (PF-081).
  2. Set `change` to CREATED, UPDATED, ACTIVATED or DEACTIVATED.
  3. Don't publish when only `description` changed.
  4. Unit tests for each case.
- Files: rule service, publisher, tests
- Done when: module verify is green.
- Commit message: `feat(pricing): publish discount rule change events`
- Docs: [SPEC.md](SPEC.md) §4.3
- Pitfall: Detecting "description only" by comparing whole entities. `@Version` and `updated_at` always differ, so compare only the fields that affect price.

### PF-084 · IT: activation publishes one well-formed event
- Milestone: M6 · Est: 30 min · Type: test
- Tags: none
- Depends on: PF-083
- Goal: With Testcontainers Kafka, prove that activation produces exactly one well-formed event on `pricing.changes.v1`.
- Steps:
  1. The IT activates a list through the API.
  2. A test consumer (`earliest`, with a fresh group id) reads the topic.
  3. Assert the key, the `eventType`, "all" scope, and that the value parses into the contracts record.
- Files: `.../PricingEventsIT.java`
- Done when: `./mvnw -B -pl pricing-service -am verify` runs the IT green.
- Commit message: `test(pricing): activation publishes a pricing change event`
- Docs: https://java.testcontainers.org/modules/kafka/
- Pitfall: A test consumer starting at "latest", which misses the event sent before it subscribed.

### PF-085 · IT: a failed publish rolls back activation
- Milestone: M6 · Est: 25 min · Type: test
- Tags: none
- Depends on: PF-084
- Goal: When the event can't be sent, the price lists stay as they were and the API returns 503 (ADR-0006).
- Steps:
  1. In an IT, make the send fail. For example, `@MockitoBean` the `KafkaTemplate` so it returns a failed future.
  2. Call activate through HTTP, and assert 503 `event-publish-failed`.
  3. Read the lists through HTTP, and assert that the previous ACTIVE list is still ACTIVE.
- Files: `.../PublishFailureIT.java`
- Done when: module verify is green.
- Commit message: `test(pricing): failed event publish rolls back activation`
- Docs: [ADR-0006](adr/0006-event-publishing-consistency.md)
- Pitfall: Checking the rollback from inside a `@Transactional` test, which sees its own uncommitted state. Call through HTTP and re-read with a fresh request.

### PF-086 · Checkpoint 10: pricing events
- Milestone: M6 · Est: 15 min · Type: test
- Tags: none
- Depends on: PF-085
- Goal: You've seen pricing-service's events on a real broker, and F-5 is done.
- Steps:
  1. `./mvnw -B verify`.
  2. Compose up (Postgres and Kafka), run pricing, and activate a list.
  3. Watch the event with `docker compose exec kafka /opt/kafka/bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic pricing.changes.v1 --from-beginning --property print.key=true`.
  4. Compare against SPEC: F-5 is done. Push.
- Files: none
- Done when: you saw the event JSON and its key in the console consumer.
- Commit message: `docs: checkpoint 10 - pricing change events`
- Docs: [ARCHITECTURE.md](ARCHITECTURE.md) §7
- Pitfall: Mixing up the listeners. Inside the container use `localhost:9092`; from the host use `localhost:19092`.

### PF-087 · quote-service consumer setup
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-066, PF-086
- Goal: quote-service consumes `pricing.changes.v1` as `PricingChangedEvent`, with `ErrorHandlingDeserializer` wrapping `JacksonJsonDeserializer` and the default type set to the contracts record.
- Steps:
  1. Add `spring-boot-starter-kafka` to quote-service, and Testcontainers Kafka to its test configuration.
  2. Consumer settings:
     - `spring.kafka.consumer.group-id: quote-service`
     - `spring.kafka.consumer.auto-offset-reset: earliest`
     - the default value type, with trusted packages limited to the contracts event package
  3. A `@KafkaListener` that only logs the event for now.
  4. An IT: publish the fixture event with a test producer, and assert the listener received it (with a latch).
- Files: `quote-service/pom.xml`, `.../staleness/` listener, configuration, IT
- Done when: module verify is green.
- Commit message: `feat(quote): consume pricing change events`
- Docs: https://docs.spring.io/spring-kafka/reference/kafka/receiving-messages/listener-annotation.html · https://docs.spring.io/spring-kafka/reference/kafka/serdes.html
- Pitfall: Trusting all packages (`*`) to "make it work". Deserializing arbitrary types from a topic is a known attack surface, so restrict it to the contracts package.

### PF-088 · Mark affected quotes STALE
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-087
- Goal: For each event, PRICED and STALE quotes in scope get a PRICING_CHANGED entry, and the PRICED ones become STALE (SPEC §4.3, ARCHITECTURE §7.3).
- Steps:
  1. A repository query: status in (PRICED, STALE), segment in scope, and at least one line whose category is in scope. Handle "all" for each dimension.
  2. A service method that, in one transaction, updates the statuses and inserts history entries with `cause_event_id` and `details = summary`.
  3. Tests:
     - in scope and PRICED → STALE, plus an entry
     - in scope and STALE → stays STALE, plus an entry
     - ACCEPTED → untouched
     - out of scope → untouched
- Files: `.../staleness/` service, repository query, tests
- Done when: module verify is green.
- Commit message: `feat(quote): mark quotes stale on pricing changes`
- Docs: [SPEC.md](SPEC.md) §4.3
- Pitfall: Treating "all" as an empty list. An empty `IN` matches nothing, the opposite of "all", so branch on the all flags.

### PF-089 · Idempotent consumer
- Milestone: M6 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-088
- Goal: `V3__create_processed_event.sql` and a dedupe step in the same transaction, so a redelivered event changes nothing (ARCHITECTURE §7.3 step 1).
- Steps:
  1. A migration for `processed_event`.
  2. As the transaction's first step, insert the event id. If it already exists, skip the event.
  3. Test: processing the same event twice in a row gives one history entry.
- Files: migration, entity or repository, service change, test
- Done when: module verify is green.
- Commit message: `feat(quote): make pricing change handling idempotent`
- Docs: https://www.postgresql.org/docs/18/ddl-constraints.html
- Pitfall: Checking "exists?" and inserting later. Two racing deliveries both pass the check, so insert first and let the primary key reject the duplicate (for example with `ON CONFLICT DO NOTHING`, then check the row count).

### PF-090 · learn: Spring Kafka error handling and the DLT
- Milestone: M6 · Est: 25 min · Type: learn
- Tags: NEW(Kafka DLT)
- Depends on: PF-079
- Goal: In scratch, watch a failing listener retry and then publish to a dead-letter topic, and watch invalid JSON skip retries.
- Concept: `DefaultErrorHandler` retries a failed record with a back-off, then hands it to a recoverer. `DeadLetterPublishingRecoverer` publishes it to `<topic>-dlt` **on the same partition** (Spring Kafka 4.1's naming). Edge cases:
  - If the DLT has fewer partitions than the source topic, publishing to it fails.
  - The default is 10 attempts with no delay, so a poison message burns through its retries in milliseconds.
- Steps:
  1. In the PF-079 scratch app, a listener that throws for messages containing "boom".
  2. Configure `DefaultErrorHandler` with `FixedBackOff(1000L, 2)` and a `DeadLetterPublishingRecoverer`.
  3. Send "boom", count the attempts in the log, and read `<topic>-dlt` with the console consumer.
  4. Wrap the value deserializer in `ErrorHandlingDeserializer`, send invalid JSON, and see it reach the DLT without retries.
- Files: scratch only.
- Done when: you saw 3 attempts for "boom", and the invalid JSON in the DLT straight away.
- Commit message: none (scratch).
- Docs: https://docs.spring.io/spring-kafka/reference/kafka/annotation-error-handling.html
- Pitfall: Following a blog that names the DLT `<topic>.DLT`. That's older Spring Kafka, so check the real name with `kafka-topics.sh --list`.

### PF-091 · Retries and the DLT in quote-service
- Milestone: M6 · Est: 25 min · Type: build
- Tags: NEW(Kafka DLT)
- Depends on: PF-089, PF-090
- Goal: quote-service retries 3 times, 1 s apart, then publishes to `pricing.changes.v1-dlt`. Deserialization errors go straight to the DLT (ADR-0005).
- Concept: When deserialization failed, the dead-letter publisher sends the **original bytes**, so the DLT producer must be able to write raw bytes. Edge case: a DLT template set up only for your event type mangles or drops exactly the poison messages you most need to keep.
- Steps:
  1. A `DefaultErrorHandler` bean with `FixedBackOff(1000L, 2)` and a `DeadLetterPublishingRecoverer` whose template can write byte values.
  2. Check in Boot's Kafka docs how a `CommonErrorHandler` bean is attached to the listener container factory.
  3. Point the DLT producer at the same bootstrap servers.
- Files: Kafka error-handling configuration
- Done when: module verify is green. The behaviour is tested in PF-093.
- Commit message: `feat(quote): retry then dead-letter failed pricing events`
- Docs: https://docs.spring.io/spring-kafka/reference/kafka/annotation-error-handling.html · https://docs.spring.io/spring-boot/reference/messaging/kafka.html
- Pitfall: Retrying deserialization errors. They're fatal by default for a reason: the bytes won't change.

### PF-092 · IT: the same event twice gives one entry (AC-6, part 1)
- Milestone: M6 · Est: 25 min · Type: test
- Tags: none
- Depends on: PF-091
- Goal: Publish an event, publish the identical event again, and assert exactly one PRICING_CHANGED entry.
- Steps:
  1. An IT with Testcontainers Kafka and Postgres. Arrange a PRICED quote in scope by saving it with the repository.
  2. Publish the fixture event twice.
  3. Poll with Awaitility (managed by Boot) until the first entry appears, wait a little longer, then assert there's exactly one.
- Files: `.../IdempotencyIT.java`
- Done when: module verify is green.
- Commit message: `test(quote): duplicate events are processed once`
- Docs: https://docs.spring.io/spring-boot/reference/testing/testcontainers.html
- Pitfall: `Thread.sleep(5000)` as the wait. It's slow and flaky, so poll until the condition holds or a timeout passes.

### PF-093 · IT: a poison message goes to the DLT (AC-6, part 2)
- Milestone: M6 · Est: 30 min · Type: test
- Tags: none
- Depends on: PF-092
- Goal: Publish invalid JSON, then a valid event. Assert that the first lands on `pricing.changes.v1-dlt` and the second is still processed.
- Steps:
  1. Produce the raw string `not json` to the topic with a string serializer.
  2. Produce a valid fixture event.
  3. Consume the DLT in the test, and assert that the quote got its entry from the valid event.
- Files: `.../DeadLetterIT.java`
- Done when: module verify is green.
- Commit message: `test(quote): poison messages are dead-lettered`
- Docs: https://docs.spring.io/spring-kafka/reference/kafka/annotation-error-handling.html
- Pitfall: Forgetting that blocking retries hold up the record's partition until the retries finish. That's the trade-off ADR-0005 accepted, so allow for it in your timeouts.

### PF-094 · IT: stale marking and acceptance rules (AC-5)
- Milestone: M6 · Est: 25 min · Type: test
- Tags: none
- Depends on: PF-093
- Goal: With a real event, an in-scope PRICED quote becomes STALE, an ACCEPTED quote is untouched, and accepting the STALE quote returns 409.
- Steps:
  1. Arrange two quotes with the repository, one PRICED and one ACCEPTED.
  2. Publish an in-scope event, and poll until it has been processed.
  3. Assert both statuses, then call accept on the STALE quote and expect 409 `quote-not-acceptable`.
- Files: `.../StalenessIT.java`
- Done when: module verify is green.
- Commit message: `test(quote): stale marking and acceptance rules`
- Docs: [SPEC.md](SPEC.md) §3.3, §4.3
- Pitfall: Arranging the quotes through the create endpoint, which needs pricing-service running. This IT tests the consumer, so insert the quotes directly.

### PF-095 · Checkpoint 11: events end to end on the laptop
- Milestone: M6 · Est: 25 min · Type: test
- Tags: none
- Depends on: PF-094
- Goal: Quotes react to real pricing changes across both services, and M6 is merged.
- Steps:
  1. Compose up, both services running locally, `./demo/seed.sh`, then create a quote.
  2. Update CAT-FASTENERS-3 to 4%. Within 10 s, `GET` the quote: it's STALE, with a PRICING_CHANGED entry.
  3. Re-price it (now PRICED at the new price), then accept it.
  4. Compare against SPEC: F-5 and F-8 are done; AC-5 and AC-6 are done. Describe the flow in the README in two sentences.
  5. Merge the `m6-events` PR once it's green, then create `m7-cache`.
- Files: `README.md`
- Done when: you timed the STALE transition at under 10 s, and M6 is merged.
- Commit message: `docs: checkpoint 11 - quotes react to pricing changes`
- Docs: [SPEC.md](SPEC.md) §8
- Pitfall: Expecting the default `auto.offset.reset=latest`. Events published before the consumer group existed would be skipped, which is why we use `earliest` (ADR-0005).

### M7 · Redis caching (branch `m7-cache`)

### PF-096 · learn: Redis spike
- Milestone: M7 · Est: 25 min · Type: learn
- Tags: NEW(Redis)
- Depends on: PF-007
- Goal: Use `redis-cli` with strings, TTLs and key scanning, in scratch.
- Concept: Redis is an in-memory key-value store. Every key can have a TTL. It's single-threaded, so one slow command blocks everyone. Edge case: `SET` on a key that had a TTL **removes the TTL** unless you pass `KEEPTTL`, so an "update" can turn a cache entry into one that never expires.
- Steps:
  1. Run `redis:8.8.3-alpine` in scratch on host port 16379, and open a shell with `docker exec -it <container> redis-cli`.
  2. SET and GET a key, EXPIRE it, read its TTL, then SET it again and read the TTL again (the edge case).
  3. Create 1,000 keys in a loop, then compare `KEYS prefix:*` with `SCAN 0 MATCH prefix:* COUNT 100`.
  4. `INFO memory`, then `CONFIG SET maxmemory 32mb`.
- Files: scratch only.
- Done when: you've seen the TTL go from a positive number to `-1` after the second SET.
- Commit message: none (scratch).
- Docs: https://redis.io/docs/latest/develop/tools/cli/ · https://redis.io/docs/latest/commands/set/ · https://redis.io/docs/latest/commands/scan/
- Pitfall: Running `redis-cli` on the host without `-p 16379`. It connects to the host's own redis-server on 6379, not to your container.

### PF-097 · Add Redis to compose.yaml
- Milestone: M7 · Est: 20 min · Type: infra
- Tags: none
- Depends on: PF-095, PF-096
- Goal: The project's Compose runs Redis 8.8.3 on host port 16379, with `maxmemory 32mb`, an LRU eviction policy, a healthcheck and `mem_limit: 64m` (ARCHITECTURE §12).
- Steps:
  1. A `redis` service started with `--maxmemory 32mb --maxmemory-policy allkeys-lru`.
  2. Ports `16379:6379`, and a `redis-cli ping` healthcheck.
  3. `docker compose up -d`, then wait for healthy.
- Files: `compose.yaml`
- Done when: `docker compose ps` shows redis `(healthy)`, and `docker compose exec redis redis-cli config get maxmemory-policy` prints `allkeys-lru`.
- Commit message: `chore(infra): add Redis to docker compose`
- Docs: https://hub.docker.com/_/redis
- Pitfall: Keeping Redis's default `noeviction` policy. When memory is full, writes fail instead of evicting old keys, which is wrong for a cache.

### PF-098 · Redis cache configuration in pricing-service
- Milestone: M7 · Est: 30 min · Type: build
- Tags: NEW(Redis)
- Depends on: PF-097
- Goal: A `RedisCacheManager` with a 10-minute TTL, the key prefix `priceforge:pricing:`, JSON values, transaction awareness and SCAN-based clearing (ADR-0007).
- Concept: Spring's cache abstraction (`@Cacheable`, `@CacheEvict`) puts a proxy in front of your methods, and the cache manager decides where entries live. Here that's Redis. Edge case: by default the manager isn't transaction-aware, so an eviction runs *before* your transaction commits, and a concurrent reader can re-cache the old value. `.transactionAware()` delays the eviction until after the commit.
- Steps:
  1. Add `spring-boot-starter-data-redis` and `spring-boot-starter-cache`, and enable caching.
  2. Build the manager from `RedisCacheWriter.nonLockingRedisCacheWriter(factory, BatchStrategies.scan(1000))`, with defaults covering:
     - `entryTtl`
     - the prefix
     - a JSON value serializer (`GenericJacksonJsonRedisSerializer` or `JacksonJsonRedisSerializer`; read their Javadoc)
     - `.transactionAware()`
  3. Local connection: `spring.data.redis.port: 16379`. Tests: `RedisContainer` (`com.redis:testcontainers-redis`) with `@ServiceConnection`.
  4. A test that the context starts and the cache manager is the Redis one.
- Files: `.../cache/` configuration, `pricing-service/pom.xml`, `application.yaml`, test configuration
- Done when: module verify is green.
- Commit message: `feat(pricing): configure Redis cache manager`
- Docs: https://docs.spring.io/spring-data/redis/reference/redis/redis-cache.html · https://docs.spring.io/spring-data/redis/reference/redis/template.html · https://docs.spring.io/spring-boot/reference/io/caching.html
- Pitfall: Keeping the default JDK serializer. Values become binary blobs that break when classes change, and the Spring Data Redis docs warn about Java deserialization security.

### PF-099 · Cache the three lookups
- Milestone: M7 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-098
- Goal: `products` (by SKU), `listPrices` (by SKU, from the active list) and `activeRules` are read through `@Cacheable` (ARCHITECTURE §9).
- Steps:
  1. Put `@Cacheable` on the three lookup methods the calculation service uses. Move them into a separate bean if needed.
  2. Cache small records, not JPA entities.
  3. A test: two calculations hit the repository only once per lookup (`@MockitoSpyBean` on the repositories).
- Files: lookup bean, calculation service, test
- Done when: module verify is green, and after one calculation `docker compose exec redis redis-cli --scan --pattern 'priceforge:pricing:*'` lists keys.
- Commit message: `feat(pricing): cache price lookups in Redis`
- Docs: https://docs.spring.io/spring-framework/reference/integration/cache.html
- Pitfall: Calling a `@Cacheable` method from inside **the same class**. The proxy only sees calls coming from outside the bean, so caching silently does nothing.

### PF-100 · Evict on every write path
- Milestone: M7 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-099
- Goal: A product update evicts that product, activation clears `listPrices`, and any rule change evicts `activeRules` (ADR-0007).
- Steps:
  1. Add `@CacheEvict` (or evict in code) for:
     - product PATCH
     - price list activation (`allEntries = true`)
     - rule create and update
  2. Confirm in the logs that the evictions happen after the commit.
  3. An IT: after a change, the next calculation shows the new price.
- Files: services, IT
- Done when: module verify is green.
- Commit message: `feat(pricing): evict caches when pricing data changes`
- Docs: https://docs.spring.io/spring-framework/reference/integration/cache.html
- Pitfall: Evicting by the wrong key. The eviction key must be exactly the key `@Cacheable` used (the SKU string, not the product object).

### PF-101 · Pricing keeps working when Redis is down
- Milestone: M7 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-100
- Goal: A custom `CacheErrorHandler` logs and carries on, and the Redis timeouts are short, so a dead Redis makes pricing slower, not broken (SPEC F-6).
- Steps:
  1. Implement `CacheErrorHandler`: log at WARN and swallow get, put, evict and clear errors. Register it through `CachingConfigurer`.
  2. Set `spring.data.redis.timeout` and `spring.data.redis.connect-timeout` to about 250 ms.
  3. Check by hand: with Compose up and the app running, `docker compose stop redis`, then a calculation still returns 200.
- Files: `.../cache/` error handler and configuration, `application.yaml`
- Done when: the manual check returns Example A's price with Redis stopped, and module verify is green.
- Commit message: `feat(pricing): degrade gracefully when Redis is unavailable`
- Docs: https://docs.spring.io/spring-framework/reference/integration/cache.html · https://docs.spring.io/spring-boot/reference/data/nosql.html
- Pitfall: Swallowing an evict error means a stale entry can survive until its TTL once Redis comes back. That's the documented trade-off, so log it loudly.

### PF-102 · IT: cache hits and fresh reads (AC-7 a, b)
- Milestone: M7 · Est: 30 min · Type: test
- Tags: none
- Depends on: PF-101
- Goal: Prove that a repeated lookup is served from Redis, and that a committed change shows up in the very next calculation.
- Steps:
  1. An IT with Postgres, Redis and Kafka (writes publish events).
  2. Count repository calls across two calculations.
  3. Change a rule's percent through the API, and check that the next calculation reflects it.
- Files: `.../CachingIT.java`
- Done when: module verify is green.
- Commit message: `test(pricing): cache hits and read-after-write freshness`
- Docs: https://docs.spring.io/spring-boot/reference/testing/testcontainers.html
- Pitfall: Cache entries surviving between tests in the shared Redis container. Flush Redis in `@BeforeEach`.

### PF-103 · IT: correct prices with Redis stopped (AC-7 c)
- Milestone: M7 · Est: 25 min · Type: test
- Tags: none
- Depends on: PF-102
- Goal: Stop Redis partway through a test, and assert that calculations still return the right numbers.
- Steps:
  1. An IT that owns its own Redis container.
  2. Stop that container, run a calculation, and assert Example A.
- Files: `.../RedisDownIT.java`
- Done when: module verify is green, and the test finishes quickly because the timeouts are short.
- Commit message: `test(pricing): pricing works without Redis`
- Docs: https://java.testcontainers.org/test_framework_integration/manual_lifecycle_control/
- Pitfall: Stopping the shared container, which breaks every later test in the JVM. Give this test its own container.

### PF-104 · Checkpoint 12: caching
- Milestone: M7 · Est: 20 min · Type: test
- Tags: none
- Depends on: PF-103
- Goal: Caching works on the real stack, F-6 and AC-7 are done, and M7 is merged.
- Steps:
  1. `./mvnw -B verify`.
  2. Compose up (Postgres, Kafka, Redis) with both services, then seed. Calculate twice and list the keys with `docker compose exec redis redis-cli --scan`.
  3. Change a rule, and check that the price is fresh.
  4. Stop Redis, and check that pricing still works. Record `docker stats --no-stream` in PROGRESS.
  5. Merge the M7 PR, then create `m9-explanations`.
- Files: none
- Done when: M7 is merged, and the memory reading is recorded.
- Commit message: `docs: checkpoint 12 - caching`
- Docs: [ADR-0007](adr/0007-caching-strategy.md)
- Pitfall: Not recording memory. You'll want this number when you size containers in M10.

### M9 · Spring AI explanations (branch `m9-explanations`)

### PF-105 · design: choose the LLM provider (ADR-0010)
- Milestone: M9 · Est: 30 min · Type: design
- Tags: none
- Depends on: PF-104
- Goal: Decide the provider, the model and the hard spend cap, and record them as ADR-0010 (ADR-0008 deferred this decision to now).
- Steps:
  1. Tell Claude "change: choose LLM provider". Claude re-checks the ADR-0008 candidates' prices, because prices change.
  2. Decide the provider, the model, the spend-cap mechanism and the environment variable name for the key.
  3. Claude drafts ADR-0010 and you approve it. Claude then updates ARCHITECTURE §10 and §11 with the variable name.
  4. Create the account and key, and set the cap (a Console spend limit, or the free tier).
- Files: `docs/adr/0010-*.md`, `docs/ARCHITECTURE.md`, `.env.example` (the variable name only)
- Done when: ADR-0010 is Accepted, the provider console shows the cap, and `.env.example` lists the variable with an empty value.
- Commit message: `docs: ADR-0010 LLM provider for explanations`
- Docs: [ADR-0008](adr/0008-llm-explanations-design.md)
- Pitfall: Putting the real key in `.env.example`. The real value goes only in the gitignored `.env`.

### PF-106 · Fallback explainer
- Milestone: M9 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-104
- Goal: A deterministic plain-English explanation built only from a quote's snapshot (SPEC §4.4), with tests.
- Steps:
  1. Input: a quote and its lines (the snapshot). Output: text.
  2. Cover:
     - the list price
     - each APPLIED step in order, with its saving
     - SUPERSEDED rules and the winner
     - the CAP
     - the net price and line total
     - the STALE note
  3. Never include the customer name.
  4. Tests: Example A's text contains 12.00, 0.60, 0.34, 0.88, 10.18 and the line total in your chosen format, and names VOL-10 and VOL-100. Example C mentions the cap.
- Files: `.../explanation/FallbackExplainer.java` and test
- Done when: module verify is green.
- Commit message: `feat(quote): deterministic fallback explanations`
- Docs: [SPEC.md](SPEC.md) §4.4
- Pitfall: Formatting money with `toString()` on a computed `BigDecimal`, which can print `1527.0000` or `1.527E+3`. Use `setScale(2)` with `toPlainString()`, or a formatter, consistently.

### PF-107 · Explanation endpoint, fallback only
- Milestone: M9 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-106
- Goal: `GET /api/v1/quotes/{id}/explanation` returns `{quoteId, source: "FALLBACK", text, generatedAt}`, with no LLM yet (`spring.ai.model.chat=none`).
- Steps:
  1. A controller and service. An unknown quote returns 404.
  2. A `@WebMvcTest`.
- Files: `.../explanation/` controller and service, test
- Done when: module verify is green, and `curl -s localhost:8082/api/v1/quotes/<id>/explanation` contains `"source":"FALLBACK"`.
- Commit message: `feat(quote): add explanation endpoint with fallback`
- Docs: [ARCHITECTURE.md](ARCHITECTURE.md) §10
- Pitfall: Building the explanation from current prices by calling pricing. SPEC §4.4 says snapshot only.

### PF-108 · learn: Spring AI ChatClient spike
- Milestone: M9 · Est: 30 min · Type: learn
- Tags: NEW(Spring AI)
- Depends on: PF-105
- Goal: Call the chosen provider through Spring AI 2.0's `ChatClient` in scratch, and see how it fails.
- Concept: `ChatClient` is Spring AI's fluent API over a provider's `ChatModel`: `chatClient.prompt().system(…).user(…).call().content()`. The provider starter auto-configures the model from properties, and `spring.ai.model.chat=none` turns that off. Edge case: a provider's own timeout is not your deadline. With Spring AI's Anthropic defaults (60 s timeout, 2 retries, and timeouts are retried), one call can block for about 3 minutes. That's why ADR-0008 adds a deadline of our own.
- Steps:
  1. A scratch Boot 4.1.1 app with Spring AI BOM 2.0.1 and the ADR-0010 starter, with the key read from an environment variable.
  2. Make one call with a system and a user message, and print the content.
  3. Set a tiny timeout and see the exception.
  4. Set `spring.ai.model.chat=none`, and see the app start without a `ChatModel` bean.
  5. If the provider is Claude, leave `temperature` unset: newer Claude models reject sampling parameters (ADR-0008).
- Files: scratch only.
- Done when: your notes hold one real response and one timeout exception.
- Commit message: none (scratch).
- Docs: https://docs.spring.io/spring-ai/reference/api/chatclient.html · https://docs.spring.io/spring-ai/reference/getting-started.html · plus the provider page named in ADR-0010
- Pitfall: Putting the key in the scratch app's `application.properties` and later copying that file into the repo. Keys only ever come from the environment.

### PF-109 · Call the LLM through ChatClient
- Milestone: M9 · Est: 30 min · Type: build
- Tags: NEW(Spring AI)
- Depends on: PF-107, PF-108
- Goal: When a `ChatClient` is available, the endpoint asks the LLM to explain the snapshot (with the customer name removed) and returns `source: "LLM"`.
- Concept: Inject the client optionally (for example through `ObjectProvider`), so the app starts and works with no provider at all (C-5). Edge case: LLMs readily produce plausible but wrong numbers. The system prompt must say "use only the numbers given", and stretch goal S-3 would enforce it.
- Steps:
  1. Add the ADR-0010 starter to quote-service. Keep `spring.ai.model.chat: none` as the default, and enable the provider through your local `.env`.
  2. Build the system prompt (the rules in SPEC §4.4 and ARCHITECTURE §10) and the user message (the snapshot as JSON, without the customer name).
  3. No client available → fallback. Otherwise → the LLM's text with `source: LLM`.
- Files: `quote-service/pom.xml`, `.../explanation/`, `application.yaml`
- Done when: with the key set and the provider enabled, `curl -s localhost:8082/api/v1/quotes/<id>/explanation` contains `"source":"LLM"`; with `none` it contains `"source":"FALLBACK"`; module verify is green, and no test calls a real LLM.
- Commit message: `feat(quote): explain quotes with an LLM via Spring AI`
- Docs: https://docs.spring.io/spring-ai/reference/api/chatclient.html
- Pitfall: Logging the full prompt at INFO. It contains pricing data and inflates logs in the cloud, so use DEBUG.

### PF-110 · Hard deadline and catch-all fallback
- Milestone: M9 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-109
- Goal: The LLM call is bounded by `priceforge.explanation.timeout` (10 s), and any failure returns the fallback (ADR-0008).
- Steps:
  1. Set the provider's retries to 0, using the property named in ADR-0010.
  2. Run the call with a deadline, for example a `CompletableFuture` with `orTimeout`.
  3. Catch everything: timeouts, every HTTP error (including the 400 a spend limit returns) and blank text. Each returns the fallback.
- Files: `.../explanation/` service
- Done when: module verify is green, and with an invalid key the endpoint returns FALLBACK in about a second.
- Commit message: `feat(quote): bound LLM calls with a deadline and fall back`
- Docs: [ADR-0008](adr/0008-llm-explanations-design.md)
- Pitfall: Catching only rate-limit and 5xx errors. A Claude Console spend limit returns HTTP **400**, so every error has to fall back.

### PF-111 · Tests with a mocked ChatModel (AC-8)
- Milestone: M9 · Est: 30 min · Type: test
- Tags: none
- Depends on: PF-110
- Goal: Three tests:
  - The LLM answers → `LLM`.
  - The LLM throws → `FALLBACK`.
  - The LLM is slower than the deadline → `FALLBACK` within the limit plus 1 s.
- Steps:
  1. Provide a Mockito `ChatModel` test bean, so `ChatClient` uses it.
  2. Set a short timeout property (for example 500 ms) in the test.
  3. Measure the elapsed time in the slow case.
- Files: `.../ExplanationServiceTest.java` (or `*IT`)
- Done when: module verify is green, and CI is green with no keys configured.
- Commit message: `test(quote): explanation falls back on LLM failure`
- Docs: https://docs.spring.io/spring-ai/reference/api/chatmodel.html
- Pitfall: A test that sleeps 10 s to prove the timeout. Shorten the timeout in the test configuration instead.

### PF-112 · Checkpoint 13: explanations
- Milestone: M9 · Est: 20 min · Type: test
- Tags: none
- Depends on: PF-111
- Goal: Explanations work with and without an LLM, F-10 and AC-8 are done, and M9 is merged.
- Steps:
  1. `./mvnw -B verify`.
  2. Make one real LLM call locally, and one fallback call with `none`.
  3. Check the spend in the provider console.
  4. Compare against SPEC: F-10 and AC-8 are done.
  5. Merge the M9 PR, then create `m10-containers`.
- Files: none
- Done when: M9 is merged, and the provider console shows spend within the cap.
- Commit message: `docs: checkpoint 13 - explanations`
- Docs: [SPEC.md](SPEC.md) §4.4, §8
- Pitfall: Leaving the provider enabled in `.env` while running manual scripts in a loop. The tests mock the model, but scripts don't.

### M10 · Containerise both services, full Compose stack (branch `m10-containers`)

### PF-113 · learn: layered Dockerfile spike
- Milestone: M10 · Est: 30 min · Type: learn
- Tags: NEW(Docker images)
- Depends on: PF-007
- Goal: Build a small, layered image for a Boot jar in scratch, and see layer caching at work.
- Concept: Spring Boot jars can be extracted into layers with `java -Djarmode=tools -jar app.jar extract --layers --destination extracted`. If each layer is copied separately, a code change rebuilds only the small application layer. Inside a container, the JVM sizes its heap from the container's memory limit, so `-XX:MaxRAMPercentage` is a better fit than a fixed `-Xmx`. Edge case: copy the fat jar as a single layer, and every one-line change re-ships all the unchanged dependencies.
- Steps:
  1. Use the PF-016 scratch app, and run `./mvnw package`.
  2. Write a two-stage Dockerfile following the Boot docs, but based on `eclipse-temurin:21.0.12.1_1-jre-noble`.
  3. Build twice, changing one line of code in between, and compare which layers say `CACHED`.
  4. Run the image with `--memory 384m`, and compare the max heap at different `MaxRAMPercentage` values.
- Files: scratch only.
- Done when: the second build reused the dependencies layer.
- Commit message: none (scratch).
- Docs: https://docs.spring.io/spring-boot/reference/packaging/container-images/dockerfiles.html · https://docs.docker.com/reference/dockerfile/ · https://docs.docker.com/build/building/best-practices/
- Pitfall: Copying the docs' AOT-cache or CDS variants. Their example uses a Java 25 base image; we run Java 21, so skip them.

### PF-114 · pricing-service Dockerfile
- Milestone: M10 · Est: 30 min · Type: build
- Tags: NEW(Docker images)
- Depends on: PF-112, PF-113
- Goal: A layered, non-root image for pricing-service, based on `eclipse-temurin:21.0.12.1_1-jre-noble`.
- Concept: The same recipe as PF-113, plus a non-root user and a `.dockerignore`. Edge case: without `.dockerignore`, `docker build` sends the whole folder (other modules' `target/`, `.git`, …) as build context. That's slow, and it can leak files into the image.
- Steps:
  1. `pricing-service/Dockerfile`: copy `target/pricing-service-*.jar`, extract the layers, and run as a non-root user.
  2. Add a `.dockerignore` for the build context you chose.
  3. `./mvnw -B -DskipTests package`, then `docker build -t priceforge-pricing-service:dev pricing-service`.
  4. Run it on the Compose network with the right environment, and call `/actuator/health`.
- Files: `pricing-service/Dockerfile`, `.dockerignore`
- Done when: `docker image ls priceforge-pricing-service:dev` lists the image; run against the Compose infrastructure it reports `"status":"UP"`; `docker run --rm --entrypoint id priceforge-pricing-service:dev` prints a non-zero uid.
- Commit message: `build(pricing): add layered Dockerfile`
- Docs: https://docs.spring.io/spring-boot/reference/packaging/container-images/dockerfiles.html
- Pitfall: Building from a stale jar. `docker build` doesn't run Maven, so package first every time.

### PF-115 · quote-service Dockerfile
- Milestone: M10 · Est: 20 min · Type: build
- Tags: none
- Depends on: PF-114
- Goal: The same image recipe for quote-service.
- Steps:
  1. Copy the pricing-service pattern, and adjust the jar name and port.
  2. Build the image and run it. Check health on 8082.
- Files: `quote-service/Dockerfile`
- Done when: the image builds, and health reports UP on 8082 inside the Compose network.
- Commit message: `build(quote): add layered Dockerfile`
- Docs: https://docs.spring.io/spring-boot/reference/packaging/container-images/dockerfiles.html
- Pitfall: Copy-paste leftovers in the quote Dockerfile, such as port 8081 or the pricing jar name.

### PF-116 · Compose "apps" profile: the full stack
- Milestone: M10 · Est: 30 min · Type: infra
- Tags: none
- Depends on: PF-115
- Goal: `docker compose --profile apps up -d` starts all five containers healthy (AC-1, ARCHITECTURE §12).
- Steps:
  1. Add both services under `profiles: [apps]`, each with `image:` (the GHCR name) and `build:` (local).
  2. Set the environment:
     - datasource URLs pointing at `postgres:5432`, Kafka at `kafka:9092`, Redis at `redis:6379`
     - `PRICEFORGE_QUOTE_PRICING_BASE_URL=http://pricing-service:8081`
     - `SPRING_AI_MODEL_CHAT=none`
     - `JAVA_TOOL_OPTIONS=-XX:MaxRAMPercentage=60`
     - secrets from `.env`
  3. Healthchecks on `/actuator/health/readiness`, and `depends_on` with `service_healthy`.
  4. `mem_limit` values per §12.2.
- Files: `compose.yaml`, `.env.example`
- Done when: after `docker compose --profile apps up -d --build`, `docker compose ps` shows five `(healthy)` containers within 3 minutes.
- Commit message: `chore(infra): run both services in docker compose`
- Docs: https://docs.docker.com/compose/how-tos/profiles/ · https://docs.docker.com/compose/how-tos/startup-order/
- Pitfall: Assuming the JRE image includes `curl` for a healthcheck. Check first with `docker run --rm --entrypoint sh <image> -c 'command -v curl wget'`.

### PF-117 · Full-stack smoke script (AC-1, AC-5)
- Milestone: M10 · Est: 30 min · Type: test
- Tags: none
- Depends on: PF-116
- Goal: `demo/smoke.sh` proves the running stack works, in order:
  1. seed the data
  2. create a quote
  3. change a rule and see STALE within 10 s
  4. re-price, then accept
  5. get an explanation
- Steps:
  1. Reuse `seed.sh`. Make the base URLs variables, so the script also works against AWS later.
  2. Exit non-zero on any failure, and print a PASS/FAIL line per step.
- Files: `demo/smoke.sh`
- Done when: after `docker compose down -v` and `docker compose --profile apps up -d`, `./demo/smoke.sh` prints PASS for every step.
- Commit message: `test(demo): end-to-end smoke script`
- Docs: [SPEC.md](SPEC.md) §8
- Pitfall: Hard-coding `localhost`. PF-127 runs this same script against the AWS instance's public IP.

### PF-118 · Measure the memory budget
- Milestone: M10 · Est: 20 min · Type: docs
- Tags: none
- Depends on: PF-117
- Goal: Replace the starting limits in ARCHITECTURE §12.2 with measured numbers.
- Steps:
  1. Right after `smoke.sh`, run `docker stats --no-stream`.
  2. Note each container's usage against its limit. Check for out-of-memory kills with `docker inspect <c> --format '{{.State.OOMKilled}}'`.
  3. Give Claude the numbers ("change: update memory budget"). Claude updates §12.2 once you agree.
- Files: `docs/ARCHITECTURE.md`
- Done when: §12.2 shows measured values, and no container was OOM-killed.
- Commit message: `docs: record measured memory budget`
- Docs: [ARCHITECTURE.md](ARCHITECTURE.md) §12.2
- Pitfall: Measuring an idle stack. Measure right after `smoke.sh`, when caches and consumers are warm.

### PF-119 · Images workflow: build and push to GHCR
- Milestone: M10 · Est: 30 min · Type: infra
- Tags: none
- Depends on: PF-116
- Goal: `images.yml` (run manually or on a `v*` tag) packages both jars, builds both images and pushes them to GHCR tagged with the SHA and `latest`. Both packages are public (ARCHITECTURE §14).
- Steps:
  1. A workflow with `permissions: packages: write` that logs in to `ghcr.io` with the built-in `GITHUB_TOKEN`.
  2. `./mvnw -B -DskipTests package`, then build and push both images, with lowercase names `ghcr.io/dabbin-giraffe/priceforge-*`.
  3. Run it once manually (`workflow_dispatch`).
  4. In GitHub → Packages, set both packages to public.
- Files: `.github/workflows/images.yml`
- Done when: `docker pull ghcr.io/dabbin-giraffe/priceforge-pricing-service:latest` works from your laptop **without** `docker login`.
- Commit message: `ci: publish service images to GHCR`
- Docs: https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-container-registry
- Pitfall: Uppercase letters in the image name. GHCR names must be lowercase, so `Dabbin-Giraffe` won't work.

### PF-120 · Checkpoint 14: one-command full stack
- Milestone: M10 · Est: 20 min · Type: test
- Tags: none
- Depends on: PF-118, PF-119
- Goal: AC-1 holds using the published images, and M10 is merged.
- Steps:
  1. `./mvnw -B verify`.
  2. Remove the local image tags, then `docker compose down -v` and `docker compose --profile apps up -d` (pulling from GHCR, no `--build`).
  3. Run `./demo/smoke.sh`.
  4. Compare against SPEC: F-13 and AC-1 are done. The README's "How to run" becomes one command.
  5. Merge the M10 PR, then create `m11-aws`.
- Files: `README.md`
- Done when: AC-1 passes using the GHCR images, and M10 is merged.
- Commit message: `docs: checkpoint 14 - one-command full stack`
- Docs: [SPEC.md](SPEC.md) §8
- Pitfall: Testing with locally built images and calling AC-1 done. A fresh clone pulls from GHCR.

### M11 · AWS deployment with cost guardrails (branch `m11-aws`)

### PF-121 · learn: AWS account, root MFA and budget alerts
- Milestone: M11 · Est: 30 min · Type: learn
- Tags: NEW(AWS)
- Depends on: PF-120
- Goal: Open the AWS account and create budget alerts, so no AWS resource ever exists without them (AC-10, ADR-0009).
- Concept: AWS bills for what *exists*, by the hour or second, not for what you use. You stop paying only when a resource is deleted. A new account gets $100 in credits, and the Free plan ends after 6 months or when the credits run out. After that the account is suspended, and erased after 90 days unless upgraded. Edge case: a **stopped** Lightsail instance is still billed; only deleting it stops the charges.
- Steps:
  1. Create the account. The Free plan is fine. Note the date: the 6-month clock starts now.
  2. Enable MFA on the root user, and don't use root for daily work.
  3. In AWS Budgets, create a $10 monthly cost budget with email alerts at $3, $6 and $9 actual spend, plus 100% forecasted.
  4. Write the account's creation date and plan in PROGRESS.
- Files: none (account setup).
- Done when: the Budgets page lists the budget with 4 alerts, and the root user shows MFA enabled.
- Commit message: none (account setup).
- Docs: https://docs.aws.amazon.com/IAM/latest/UserGuide/enable-mfa-for-root.html · https://docs.aws.amazon.com/cost-management/latest/userguide/budgets-create.html
- Pitfall: Treating budget alerts as a brake. Billing data lags by hours, so alerts are a safety net; deleting what you created is the brake.

### PF-122 · learn: Lightsail by hand
- Milestone: M11 · Est: 30 min · Type: learn
- Tags: NEW(Lightsail)
- Depends on: PF-121
- Goal: Create a Lightsail instance in the console, SSH in, check the CPU architecture, delete it, and confirm nothing is left.
- Concept: Lightsail bundles a VM, a disk, a transfer allowance and a public IP into one hourly price. Edge case: a static IP you created isn't deleted with the instance. Left unattached, it costs $0.005/hour.
- Steps:
  1. In the console: region us-east-1, an Ubuntu LTS blueprint, the 4 GB bundle. 30 minutes costs cents.
  2. Use the browser SSH, run `uname -m` and note the result. We expect `x86_64` (ADR-0009).
  3. Look at the Networking tab and note which ports are open by default.
  4. Delete the instance. Check that Instances, Static IPs, Snapshots and Disks are all empty.
- Files: none.
- Done when: you've noted the `uname -m` output, and all four lists are empty.
- Commit message: none (scratch).
- Docs: https://docs.aws.amazon.com/lightsail/latest/userguide/getting-started.html
- Pitfall: Clicking "Stop" instead of "Delete". A stopped instance is still billed.

### PF-123 · learn: run the AWS CLI as a non-root identity
- Milestone: M11 · Est: 25 min · Type: learn
- Tags: NEW(AWS CLI)
- Depends on: PF-122
- Goal: Run AWS CLI commands as a non-root admin, either from AWS CloudShell (nothing to install) or from a local AWS CLI v2.
- Concept: The CLI calls the same APIs as the console, using credentials from the environment, and `--query` with `--output` shape what you get back. CloudShell is a browser shell that's already signed in as your console identity. Edge case: if you're signed in as root, CloudShell runs as root too, so create and use a non-root admin first.
- Steps:
  1. Create a non-root admin identity (IAM Identity Center, or an IAM user with MFA), and sign in with it.
  2. Choose: CloudShell, or a local install. Ask Claude before installing anything.
  3. Run `aws sts get-caller-identity`.
  4. Run `aws lightsail get-regions --output table` as a sanity check.
- Files: none.
- Done when: `aws sts get-caller-identity` prints an ARN that doesn't end in `:root`.
- Commit message: none (setup).
- Docs: https://docs.aws.amazon.com/cloudshell/latest/userguide/welcome.html · https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html
- Pitfall: Creating access keys for the root user. Never do that.

### PF-124 · user-data.sh: prepare a fresh instance
- Milestone: M11 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-123
- Goal: A cloud-init script that, on first boot, installs Docker Engine and the Compose plugin and fetches what the stack needs from the public repo.
- Steps:
  1. `deploy/aws/user-data.sh` in bash with `set -euxo pipefail`. Install Docker Engine and the Compose plugin following Docker's Ubuntu guide (Docker's own apt repository).
  2. Clone the public repo read-only into `/opt/priceforge`.
  3. Write a log you can read later at `/var/log/priceforge-init.log`.
- Files: `deploy/aws/user-data.sh`
- Done when: `bash -n deploy/aws/user-data.sh` exits 0. It runs for real in PF-127.
- Commit message: `feat(deploy): add instance bootstrap script`
- Docs: https://docs.docker.com/engine/install/ubuntu/
- Pitfall: Mixing Ubuntu's `docker.io` package with Docker's packages. Use Docker's apt repository for both the engine and the Compose plugin, as the guide does.

### PF-125 · deploy.sh: create the instance and start the stack
- Milestone: M11 · Est: 30 min · Type: build
- Tags: none
- Depends on: PF-124
- Goal: One script creates the Lightsail instance with the user-data, opens 22, 8081 and 8082 only to your IP, copies `.env` and starts the stack (ADR-0009).
- Steps:
  1. Look up the 4 GB bundle id and the Ubuntu blueprint id with `aws lightsail get-bundles` and `get-blueprints`. Don't hardcode them from memory.
  2. `aws lightsail create-instances … --user-data file://deploy/aws/user-data.sh`, tagged `project=priceforge`.
  3. Wait until it's running. Then `put-instance-public-ports` with your IP as `/32` for 22, 8081 and 8082. This replaces the default rules.
  4. Copy a cloud `.env` with fresh random passwords and the LLM off, using `scp` with the Lightsail default key. Then run `docker compose --profile apps up -d` over SSH.
  5. Print the public IP.
- Files: `deploy/aws/deploy.sh`
- Done when: `bash -n deploy/aws/deploy.sh` exits 0. It runs for real in PF-127.
- Commit message: `feat(deploy): add Lightsail deploy script`
- Docs: https://docs.aws.amazon.com/cli/latest/reference/lightsail/create-instances.html · https://docs.aws.amazon.com/cli/latest/reference/lightsail/put-instance-public-ports.html
- Pitfall: Adding firewall rules instead of replacing them, which leaves the default rule (SSH open to the world) in place.

### PF-126 · teardown.sh and verify-teardown.sh
- Milestone: M11 · Est: 25 min · Type: build
- Tags: none
- Depends on: PF-125
- Goal: One script deletes everything `deploy.sh` created, and another proves nothing billable remains (ADR-0009).
- Steps:
  1. `teardown.sh`: `aws lightsail delete-instance` for the PriceForge instance, then wait until it's gone.
  2. `verify-teardown.sh` lists:
     - instances
     - static IPs
     - disks
     - instance snapshots and disk snapshots

     It prints the counts and exits non-zero if any count is above zero.
- Files: `deploy/aws/teardown.sh`, `deploy/aws/verify-teardown.sh`
- Done when: `bash -n` passes for both scripts, and running `verify-teardown.sh` now prints all zeros and exits 0.
- Commit message: `feat(deploy): add teardown and verification scripts`
- Docs: https://docs.aws.amazon.com/cli/latest/reference/lightsail/delete-instance.html
- Pitfall: Checking only instances. ADR-0009's money traps are static IPs, snapshots and stopped instances, so check all of them.

### PF-127 · Deploy, smoke test, tear down, verify (AC-10)
- Milestone: M11 · Est: 30 min · Type: test
- Tags: none
- Depends on: PF-126
- Goal: Run the whole cloud cycle once, and record what it cost.
- Steps:
  1. Confirm the budget alerts exist (PF-121). Run `deploy.sh`, and note the time.
  2. Run `PRICING_URL=http://<ip>:8081 QUOTE_URL=http://<ip>:8082 ./demo/smoke.sh`, and expect PASS.
  3. Run `teardown.sh`, then `verify-teardown.sh` (all zeros). Note the time.
  4. The next day, check Billing and write the cost in PROGRESS.
- Files: none
- Done when: the smoke test passed against the public IP, `verify-teardown.sh` exited 0, and the cost is recorded.
- Commit message: `docs: record first AWS deploy`
- Docs: [ADR-0009](adr/0009-aws-deployment-target.md)
- Pitfall: Leaving the instance up "until tomorrow". At about $0.033 an hour it's cheap, but it's the habit that eventually breaks the budget.

### PF-128 · AWS runbook
- Milestone: M11 · Est: 20 min · Type: docs
- Tags: none
- Depends on: PF-127
- Goal: A one-page runbook covering prerequisites, deploy, demo, teardown, verification, and what to do when a budget alert fires.
- Steps:
  1. Write `deploy/aws/RUNBOOK.md` in that order, with the exact commands.
  2. Link ADR-0009 and ARCHITECTURE §15 instead of copying prices.
- Files: `deploy/aws/RUNBOOK.md`
- Done when: someone could follow it without asking you anything (read it once as a stranger).
- Commit message: `docs: add AWS runbook`
- Docs: [ADR-0009](adr/0009-aws-deployment-target.md)
- Pitfall: Copying prices into the runbook. Prices change, so link to them.

### PF-129 · Checkpoint 15: cloud
- Milestone: M11 · Est: 15 min · Type: test
- Tags: none
- Depends on: PF-128
- Goal: F-15 and AC-10 are done, nothing is running in AWS, and M11 is merged.
- Steps:
  1. Run `verify-teardown.sh` again (it should exit 0).
  2. Compare against SPEC: F-15 and AC-10 are done.
  3. Merge the M11 PR, then create `m12-polish`.
- Files: none
- Done when: M11 is merged, and `verify-teardown.sh` exits 0.
- Commit message: `docs: checkpoint 15 - AWS deployment`
- Docs: [SPEC.md](SPEC.md) §8
- Pitfall: Merging scripts that were never run end to end. PF-127 must have passed first.

### M12 · Polish and release (branch `m12-polish`)

### PF-130 · README: problem, features and how to run
- Milestone: M12 · Est: 30 min · Type: docs
- Tags: none
- Depends on: PF-129
- Goal: A README a recruiter can read in two minutes and a developer can run in five.
- Steps:
  1. The problem, in your own words.
  2. Features (link SPEC §5) and the tech list (link ARCHITECTURE §16).
  3. "Run it": the one command, plus seed and smoke.
  4. "Tests": `./mvnw -B verify`, and the CI badge.
- Files: `README.md`
- Done when: a fresh clone in a temporary folder follows the README to a running stack.
- Commit message: `docs: complete README`
- Docs: [SPEC.md](SPEC.md) §1, §5
- Pitfall: Listing technologies without the *why*. Link the ADRs.

### PF-131 · README: architecture diagram and design decisions
- Milestone: M12 · Est: 25 min · Type: docs
- Tags: none
- Depends on: PF-130
- Goal: A diagram and a "Design decisions" section with one line and a link per ADR.
- Steps:
  1. Embed or link the mermaid diagram from ARCHITECTURE §1.
  2. One "decided X because Y" line for each of ADR-0001 to ADR-0010.
  3. Call out two interesting trade-offs: ADR-0006 and ADR-0007.
- Files: `README.md`
- Done when: GitHub renders the diagram on the repo page.
- Commit message: `docs: add architecture and decisions to README`
- Docs: [adr/README.md](adr/README.md)
- Pitfall: Copying whole ADRs into the README, where they drift. One line plus a link.

### PF-132 · The 5-minute demo script
- Milestone: M12 · Est: 25 min · Type: docs
- Tags: none
- Depends on: PF-131
- Goal: `demo/DEMO.md`: what to show, in order, with the commands, in 5 minutes or less (AC-12).
- Steps:
  1. Write the script in this order:
     - start the stack, seed it
     - Example A and the tier cliff
     - create a quote, change a rule, see STALE
     - the explanation
     - a look at the DLT
     - teardown
  2. Do a timed dry run.
- Files: `demo/DEMO.md`
- Done when: your timed dry run took 5:00 or less.
- Commit message: `docs: add five-minute demo script`
- Docs: [SPEC.md](SPEC.md) §8 (AC-12)
- Pitfall: Starting the demo from a cold stack. Start it before you begin talking, so images are pulled and JVMs are warm.

### PF-133 · Secrets sweep (AC-11)
- Milestone: M12 · Est: 20 min · Type: test
- Tags: none
- Depends on: PF-130
- Goal: Prove that no secret was ever committed, and that every setting is documented in `.env.example`.
- Steps:
  1. Run `git log -p --all | grep -n -i -E 'password|secret|api[_-]?key|token'` and review every hit.
  2. Compare `.env.example` with every `${…}` in `compose.yaml` and every environment variable the services read.
- Files: `.env.example` (if anything is missing)
- Done when: no real secret was found, and `.env.example` lists every variable with an empty or placeholder value.
- Commit message: `docs: verify no secrets and complete .env.example`
- Docs: [SPEC.md](SPEC.md) C-8, AC-11
- Pitfall: Finding a real secret and only deleting the file. It's public by now, so rotate it first, then clean up the history if needed.

### PF-134 · Final acceptance sweep (AC-1 to AC-12)
- Milestone: M12 · Est: 30 min · Type: test
- Tags: none
- Depends on: PF-132, PF-133
- Goal: Check every SPEC §8 criterion and record the evidence.
- Steps:
  1. For each AC, run the command or test that proves it, and record the result in PROGRESS.
  2. Anything failing becomes a new task with the next free ID, done before the release.
- Files: none
- Done when: all 12 ACs PASS, with evidence recorded in PROGRESS.
- Commit message: `docs: v1 acceptance sweep`
- Docs: [SPEC.md](SPEC.md) §8
- Pitfall: Marking an AC as passing because it worked last week. Re-run every one now.

### PF-135 · Release v1.0.0
- Milestone: M12 · Est: 20 min · Type: infra
- Tags: none
- Depends on: PF-134
- Goal: Tag `v1.0.0`, publish the images, and write the release notes.
- Steps:
  1. Merge the M12 PR once it's green.
  2. Tag `v1.0.0` on `main`, and push the tag (this runs `images.yml`).
  3. Create a GitHub Release with highlights and links.
- Files: none
- Done when: the release page exists, and GHCR has images for the release commit.
- Commit message: none (tag and release).
- Docs: https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-container-registry
- Pitfall: Tagging a commit that isn't on `main`, or whose CI isn't green.
