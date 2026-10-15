# PriceForge: Progress log

> An **append-only** session log. Add one entry per working session, newest at the bottom. Never
> edit past entries; a correction goes in a new entry. Task status lives in
> [TASKS.md](TASKS.md), not here.

Each entry uses this format:

```markdown
## YYYY-MM-DD
- Tasks: PF-xxx (est N min, actual M min), PF-yyy (est N min, actual M min)
- Notes: what you learned, decided or measured
- Blockers: none, or what and why
```

## Entries

## 2026-10-12
- Tasks: PF-001 (est 20 min, actual 25 min), PF-002 (est 15 min, actual 10 min), PF-003 (est 15 min, actual 10 min)
- Notes: `/` has 17 GB free (measured with `df -h /` after PF-003). `_JAVA_OPTIONS` is gone, so
  `-Xmx256m` now gives `MaxHeapSize` = 268435456. The planning brief now lives in
  `~/upskilling-nightmare/priceforge-personal/`, outside the repo. The first `.gitignore` had
  `vscode/` without the dot, which ignored nothing; the commit was amended to fix it. Still open:
  `.DS_STORE` should be `.DS_Store` (Git on Linux matches ignore patterns case-sensitively), and
  the file has no final newline.
- Blockers: none

## 2026-10-12
- Tasks: PF-004 (est 10 min, actual 15 min)
- Notes: The first `.editorconfig` was a 1,339-line IntelliJ export. Its `[*.java]` section never
  set `indent_size`, so Java inherited 2 spaces from `[*]`, and it had
  `insert_final_newline = false`. At Shashank's request, Claude replaced it with a 13-line file.
  `.gitignore` now says `.DS_Store` (uncommitted).
- Blockers: none

## 2026-10-12
- Tasks: PF-005 (est 20 min, actual 10 min)
- Notes: The README pitch is in Shashank's own words rather than copied from SPEC §1. The commit
  went in as `docs : README skeleton`; the card's message is `docs: add README skeleton`.
- Blockers: none

## 2026-10-12
- Tasks: PF-006 (est 25 min, actual 15 min)
- Notes: M0 complete: `Dabbin-Giraffe/priceforge` is public and `main` is pushed (`be894cb`). The
  first push failed because the remote was HTTPS, and GitHub doesn't accept account passwords for
  Git over HTTPS. SSH also timed out, because `/etc/ssh/ssh_config` line 54 sets `Port 2222` for
  every host. At Shashank's request, Claude set up SSH:
  - a new `~/.ssh/id_ed25519` key with no passphrase
  - a `Host github.com` block in `~/.ssh/config` with `Port 22` (ssh uses the first value it
    finds, and the user file is read first)
  - GitHub's host keys added to `known_hosts`, after checking them against GitHub's published
    fingerprints
  - the remote switched to SSH

  The old SSH config is saved as `~/.ssh/config.bak`. A second `git commit --amend` renamed the
  progress commit to `docs: add README skeleton`, so `be894cb` (progress log and `.DS_Store`
  fix) carries the README commit's message, and that commit has been pushed.
- Blockers: none

## 2026-10-12
- Tasks: PF-007 (est 25 min, actual 30 min)
- Notes: Compose is the `docker compose` plugin (v5.6.0); the old `docker-compose` isn't installed
  and isn't needed. Mistakes worth remembering:
  - "false schema" means "unknown key", and the error's dotted path shows where Compose thinks
    the key lives (`health-check` instead of `healthcheck`, then `healthcheck` indented as a
    service of its own).
  - `CMD` with one string looks for a program named after the whole string; `CMD-SHELL` runs it
    through `/bin/sh -c`.
  - `pg_isready` reports "accepting connections" even with a wrong user and database, so
    "healthy" says nothing about credentials.
  - Postgres 18 declares its volume at `/var/lib/postgresql`. Mounting at
    `/var/lib/postgresql/data` left an orphaned anonymous volume after each `down` and `up`
    cycle; there were five, now removed.

  Open: a proposed note in ARCHITECTURE §12.1 on the Postgres 18 mount path, for PF-009, is
  waiting for approval.
- Blockers: none

## 2026-10-12
- Tasks: PF-008 (est 30 min, actual 25 min, reported before the index fix; extra time not reported)
- Notes:
  - Seen: four NULLs accepted in a UNIQUE column, `jsonb` stored, and a duplicate-key error.
  - The error came from a plain UNIQUE index on `status`. A partial index
    (`WHERE status = 'ACTIVE'`) was created afterwards, but the plain one wasn't dropped and the
    insert test wasn't run. Shashank chose to move on; PF-038 tests the same rule in the project.
  - Errors worth remembering: `"ACTIVE"` is a column name and `'ACTIVE'` is a string; `->`
    returns jsonb and `->>` returns text; the type is `text` or `varchar`, not `string`.
- Blockers: none

## 2026-10-12
- Tasks: PF-009 (est 25 min, actual 25 min)
- Notes:
  - The first version used `postgres:18-alpine` and had no `mem_limit`; `shm_size` sizes
    `/dev/shm` and doesn't limit memory. The amended commit `6a42e19` pins `18.6-alpine` and sets
    `mem_limit: 256mb`. After `up -d`, Claude checked: healthy, 18.6, `Memory=268435456`, and
    `.env` untracked.
  - Still open, Shashank's call: the volume is mounted at `/var/lib/postgresql/data` with
    `PGDATA` overridden, so the Postgres 18 image adds an anonymous volume at
    `/var/lib/postgresql` (`567c860e…`) that will be orphaned after each `down` and `up` cycle.
    A note for ARCHITECTURE §12.1 was proposed but not approved.
  - `.env` and `.env.example` have a space after `=`. Compose strips it, but `source .env` in bash
    wouldn't.
- Blockers: none

## 2026-10-12
- Tasks: PF-010 (est 25 min, actual 30 min)
- Notes:
  - Checked by Claude: `pricing` and `quote` databases, each owned by its own role; both roles
    can log in and have SCRAM-SHA-256 passwords; the init script ran on a fresh volume; one data
    mount at `/var/lib/postgresql` with `PGDATA=/var/lib/postgresql/18/docker` (ARCHITECTURE
    §12.1).
  - Traps met along the way:
    - the mount line was first placed under the top-level `volumes:`
    - the role passwords weren't passed into `environment:`; an empty password silently becomes
      NULL and `\du` still looks fine
    - the `pgdata` mount was briefly dropped, which would have put the data in an anonymous
      volume
    - the `.env` edit dropped `POSTGRES_PASSWORD`
  - Leftover: anonymous volume `567c860e…` from before the mount fix survived `down -v`, probably
    because it was carried over when the container was recreated at 21:23. It's unused and safe to
    remove.
  - Not committed yet.
- Blockers: none

## 2026-10-12
- Tasks: PF-011 (est 15 min, actual 10 min)
- Notes:
  - M1 complete: 120 min actual against 120 estimated. M0 and M1 together took 205 min against
    225 estimated.
  - Checkpoint verified by Claude: `docker compose up -d` from a clean state (no volume) comes up
    healthy with `pricing` and `quote` owned by their roles. `main` (`322318c`) is pushed and
    clean. No `.env` and no employer names are tracked.
  - Follow-ups:
    - README "How to Run" step 3 says `docker compose down -v && docker compose up -d`, which
      wipes the local database on every run. Running should be `up -d`, with `down -v` only in a
      separate reset step.
    - Commit `e0d4e21 update progress docs` has no Conventional Commits type, and it carries
      `infra/postgres/init/01-create-databases.sh`. So PF-010's own commit `9b86d2b` mounts an
      init folder that doesn't exist yet. It's pushed, so it's left as is.
- Blockers: none

## 2026-10-13
- Tasks: PF-012 (est 25 min, skipped)
- Notes:
  - Shashank skipped the Maven multi-module spike. Only an empty `pom.xml` was created in the
    scratch folder.
  - TASKS.md gained a SKIPPED status, so tasks that depend on PF-012 (PF-013) can proceed without
    calling it DONE.
  - The concepts it covered come back in the project: parent and `<modules>` in PF-013 and
    PF-014, and `-pl … -am` in the standard commands (TASKS § How to work).
- Blockers: none

## 2026-10-13
- Tasks: PF-013 (est 25 min, actual not reported)
- Notes:
  - At Shashank's request, Claude wrote the root `pom.xml`. The docs don't set a project version,
    so Claude chose `0.1.0-SNAPSHOT`.
  - Shashank generated the wrapper. It's wrapper 3.3.4 with `distributionType=only-script`, so
    there's no `maven-wrapper.jar`, and `mvnw` downloads Maven 3.10.0 into `~/.m2/wrapper/dists`
    itself.
  - Checked by Claude:
    - `./mvnw -v` prints Maven 3.10.0 on Java 21.0.2
    - `./mvnw -B validate` gives `BUILD SUCCESS`
    - `mvnw` is `100755` in `73dae67`
  - The README "How to Run" follow-up from PF-011 is fixed: run is `up -d`, and `down -v` is a
    separate reset step. Not committed yet.
- Blockers: none

## 2026-10-14
- Tasks: PF-014 (est 20 min, actual 25 min)
- Notes:
  - The first `contracts/pom.xml` was a copy of the root POM with the same coordinates. Maven
    stops with "Project 'dev.priceforge:priceforge-parent:0.1.0-SNAPSHOT' is duplicated in the
    reactor".
  - `<module>some-folder</module>` was copied from Claude's placeholder, which gives "Child module
    …/some-folder … does not exist".
  - Edge cases worth remembering:
    - Leaving a module out of `<modules>` still gives `BUILD SUCCESS`; Maven just never builds
      it.
    - `<module>` takes a folder path, not an artifactId.
    - `name` isn't inherited from the parent, but `description` is: the effective POM of
      `contracts` carries the parent's description.
  - Checked by Claude: `./mvnw -B verify` gives `BUILD SUCCESS`, the Reactor Summary lists
    `contracts`, and the jar contains `Segment.class` and `Category.class`.
  - Leftover: the out-of-date `<!-- <modules> arrive … -->` comment is still on root `pom.xml`
    line 23. Not committed yet.
- Blockers: none

## 2026-10-14
- Tasks: PF-015 (est 30 min, actual 25 min)
- Notes:
  - Checked by Claude on `103e6d1`:
    - `./mvnw -B -DskipTests install` gives `BUILD SUCCESS` for PriceForge, `contracts` and
      `pricing-service`
    - the jar starts, and Tomcat runs on 8081
    - `/actuator/health` returns `{"groups":["liveness","readiness"],"status":"UP"}`
  - Three stacked mistakes; Maven reports only the first:
    - The `<parent>` kept `org.springframework.boot` as groupId and an empty `<relativePath/>`,
      which tells Maven to skip `../pom.xml`. Result: "Non-resolvable parent POM".
    - The step 4 dependency went into `contracts/pom.xml` instead of `pricing-service/pom.xml`.
    - Initializr's own `<version>0.0.1-SNAPSHOT</version>` stayed. `${project.version}` is the
      current module's version, so the build looked for `contracts:0.0.1-SNAPSHOT`.
  - An empty `<name/>` shows as a blank name in the Reactor Summary.
  - Commit `103e6d1` went in with the message "WebApplicationContext" (not pushed; to be amended).
    `contracts/pom.xml` was left with an empty `<dependencies>` block.
  - Found: `LICENSE` is MIT, but every module's effective POM says "Apache License, Version 2.0"
    and has a spring.io `<url>`. Both are inherited from `spring-boot-starter-parent` through the
    root POM that Claude wrote in PF-013. Raised with Shashank.
- Blockers: none

## 2026-10-14
- Tasks: PF-016 (est 25 min, skipped)
- Notes:
  - Shashank skipped the JUnit Jupiter and AssertJ spike. PF-017, PF-029 and PF-042 depend on it
    and can proceed because it's SKIPPED.
  - Its concepts come back in the project:
    - `@Test` and AssertJ in PF-017
    - the `BigDecimal` scale trap and `isEqualByComparingTo` in PF-023
  - Not yet met in the project: `@ParameterizedTest` with `@CsvSource`, and the Surefire
    class-name rule (`*Test`, `Test*`, `*Tests`, `*TestCase`).
  - `103e6d1` was amended to `ffa11ad feat(pricing): add pricing-service walking skeleton`.
- Blockers: none

## 2026-10-14
- Tasks: PF-017 (est 25 min, actual 25 min)
- Notes:
  - M2 complete. Done: PF-013, PF-014, PF-015 and PF-017, at 100 min estimated and 75 min actual
    plus PF-013 (not reported). Skipped: PF-012 and PF-016.
  - Checked by Claude on `4ffb57c`: `./mvnw -B verify` runs `HealthEndpointTest` and
    `PricingServiceApplicationTests`, with `Tests run: 2, Failures: 0`, and gives `BUILD SUCCESS`.
  - Traps met along the way:
    - `mockMvc` was null: the field had no `@Autowired`. `@AutoConfigureMockMvc` only puts the
      bean in the context.
    - `jsonPath("$.status").value("up")` is case-sensitive; the value is `UP`.
    - `perform` throws a checked `Exception`, so the test method needs `throws Exception`.
    - `status()`, `jsonPath()` and `get()` need `import static`.
  - `main` is 4 commits ahead of `origin/main` (not pushed).
- Blockers: none

## 2026-10-14
- Tasks: PF-018 (est 25 min, actual 25 min)
- Notes:
  - Checked by Claude through GitHub's public API. `Dabbin-Giraffe/actions-sandbox` has four runs:
    - #1 green: `uname -a` and `java -version`.
    - #2 red with no jobs at all. `actions/setup-java@v6` was a bare top-level line, so the
      workflow file was invalid.
    - #3 red at the setup-java step: `uses: actions/setup-java@v6` without `with:` gives
      "java-version or java-version-file input expected".
    - #4 green, with `distribution: temurin` and `java-version: '21'`.
  - The deliberate `exit 1` (step 5) wasn't done; the red runs came from real mistakes. The sandbox
    repo isn't deleted yet.
  - Every run carries a notice: `ubuntu-latest` moves from Ubuntu 24.04 to 26.04, rolled out
    between 2026-10-19 and 2026-11-19 (github.com/actions/runner-images/issues/14748, checked
    2026-10-14). The runner's preinstalled Java is 17 on both images, so CI must use setup-java
    for 21. Maven comes from the wrapper, so the image change shouldn't matter for PriceForge.
    If CI goes red in that window, check this first.
  - License fix, done by Claude at Shashank's request:
    - The root POM now declares `url`, the MIT license, the developer (name taken from
      `LICENSE`) and `scm`.
    - `child.project.url.inherit.append.path="false"` on `<project>`, and the
      `child.scm.*.inherit.append.path` attributes on `<scm>`, stop Maven appending the
      artifactId. The first try put the project attribute on `<url>`, where it has no effect.
    - Initializr's empty `<developers>` and `<scm>` blocks were removed from
      `pricing-service/pom.xml`; they were blocking the new values.
    - The effective POM shows MIT and the GitHub URLs in all three modules, and `./mvnw -B
      verify` still gives `BUILD SUCCESS`. Not committed.
- Blockers: none

## 2026-10-14
- Tasks: PF-019 (est 25 min, actual 25 min)
- Notes:
  - Checked by Claude through GitHub's public API:
    - run `ci #2` on `fd7b13d` is green
    - checkout, setup-java and `./mvnw -B verify` all succeeded
    - Maven exits 0 only on `BUILD SUCCESS`
    - the job log itself needs a login (HTTP 403), so the "BUILD SUCCESS" line was not read
      directly
  - Run #1 (`12a84ef`) failed with no jobs, and showed up as `.github/workflows/ci.yml` instead
    of `ci`: `on: [push, pull-request]` uses a hyphen, which isn't a valid event name, so the
    file was invalid. Fixed in `fd7b13d ci: fix` (pushed). A run named after the file path is the
    sign of an invalid workflow.
  - Only the `push` trigger has run so far; `pull_request` gets its first run in PF-020.
- Blockers: none

## 2026-10-14
- Tasks: PF-020 (est 20 min, actual 20 min; follow-up time not counted, at Shashank's request)
- Notes:
  - Checked by Claude through GitHub's public API:
    - Rulesets on `main`: require a pull request; require status check `build`, with branches
      required to be up to date; block force pushes; block deletion. Shashank reports both bypass
      lists are empty.
    - PR #1 (`c751324`) was merged as `c039437`, and PR #2 (`662e249`, the badge fix) as
      `265f7be`. Both had a green `pull_request` run of `build`.
    - The README on `main` uses `badge.svg?branch=main`. The badge reads "passing", and `ci` #10
      on `265f7be` is green.
  - Edge cases worth remembering:
    - The first badge came from the "Create status badge" dialog with `?branch=m8-ci-badge`. The
      fix was pushed 2.5 min after PR #1 merged, so it needed PR #2. A merged PR doesn't pick up
      later commits.
    - PR #1 could merge before its own `pull_request` run finished. Required checks attach to the
      commit, and the `push` run on the same SHA had already passed.
  - Not explained: PR #2 was 1 commit behind `main` (`behind_by: 1`, per the compare API) with the
    up-to-date rule on and empty bypass lists, yet it merged without "Update branch". Claude had
    predicted it would be blocked. The "blocked until it passes" moment wasn't directly observed
    in either PR.
- Blockers: none

## 2026-10-15
- Tasks: PF-021 (est 15 min, actual 15 min)
- Notes:
  - M8 complete: PF-018 to PF-021, 85 min estimated and 85 min actual.
  - Checked by Claude:
    - local `./mvnw -B verify` gives `Tests run: 2, Failures: 0` and `BUILD SUCCESS`
    - `ci` #10 on `main` (`265f7be`) is green
    - `m3-pricing` is pushed with `2cf33e8 docs: log PF-020` and `a953040 docs: checkpoint 2 -
      build and run instructions`, and `ci` #11 on it is green
  - `m3-pricing` was first cut from `m8-ci-badge`, because local `main` hadn't been pulled. It was
    rebased onto `origin/main` before the push, so it's 0 commits behind `main`.
  - SPEC check:
    - F-12 (health endpoints for both services) is half done: pricing-service only.
    - AC-9 is partly met: one command, CI on push and PR, and a green `main`. Still missing:
      quote-service and Testcontainers tests.
- Blockers: none

## 2026-10-15
- Tasks: PF-022 (est 25 min, actual 25 min)
- Notes:
  - Both Done-when checks passed on Shashank's version. At his request, Claude then corrected
    three things that disagreed with the docs:
    - `CandidateRule.priority` was a `String`. ARCHITECTURE §6.1 says `integer`, and as strings
      `"10"` sorts before `"9"`. Now `int`.
    - The SUPERSEDED step dropped `percentOff`, which ARCHITECTURE §8.3 shows (`"percentOff":
      4.00`). The convenience constructors took `type` as an argument, so a CAP step with
      superseded fields would compile. They're now the factories `Step.applied`,
      `Step.superseded` and `Step.cap`, which set the type themselves.
    - `Pricer.price` returned `void` and never threw. `throws UnsupportedOperationException` on
      the signature throws nothing, so the method returned silently. It now returns
      `ResultPrice` and throws.
  - After the fixes, `./mvnw -B -pl pricing-service -am verify` gives `BUILD SUCCESS`, and the
    Spring/JPA grep finds nothing. Not committed.
  - Open, Shashank's call: the types sit in `engine.models`, while the card's Files say
    `engine/*.java`.
- Blockers: none

## 2026-10-15
- Tasks: PF-023 (est 20 min, actual not reported)
- Notes:
  - Shashank wrote `MoneyRounder.roundOff` (`setScale(2, HALF_UP)`, with a null guard) and moved
    it, along with the PF-022 types, into the flat `engine` package. At his request, Claude filled
    in the `@CsvSource` rows from SPEC §4.2 and added the step 3 test: `12.0` vs `12.00` is
    `isNotEqualTo` but `isEqualByComparingTo`.
  - Checked by Claude: `./mvnw -B -pl pricing-service -am verify` gives `MoneyRounderTest`
    `Tests run: 6`, 8 tests in total, and `BUILD SUCCESS`.
  - The parameterized test uses `isEqualByComparingTo`, so it wouldn't catch a missing
    `setScale(2)` (a `12` vs `12.00` row would pass). Left as Shashank's choice.
  - PF-022 and PF-023 are both still uncommitted.
- Blockers: none
