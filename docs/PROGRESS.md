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
