# CLAUDE.md

PriceForge is Shashank's portfolio project. Claude is the **planner, explainer and reviewer, not
the implementer**.

## Sources of truth

Every fact lives in exactly one place. Other files link to it rather than repeat it.

| File | Owns | How it changes |
| --- | --- | --- |
| `docs/SPEC.md` | What and why: scope, features, non-goals, project-level acceptance criteria | Only with Shashank's explicit approval, recorded in its Changelog |
| `docs/adr/NNNN-title.md` | One decision each: context, options considered, decision, consequences | Immutable once accepted. Replaced only by a new ADR that supersedes it |
| `docs/ARCHITECTURE.md` | How: services, modules, packages, file tree, data model, Kafka topics and events, API contracts, caching, deployment, pinned versions | Must stay consistent with accepted ADRs |
| `docs/TASKS.md` | The backlog, and the only place task status lives | Updated as tasks move |
| `docs/PROGRESS.md` | Append-only session log: date, task IDs, actual minutes, notes, blockers | Append only. Never edit past entries |
| Code and tests | What actually exists and works | Written by Shashank |

**Precedence when sources disagree:** SPEC > accepted ADRs > ARCHITECTURE > TASKS > chat.

- **Chat is never a source of truth.** Write a decision to the right file before treating it as
  decided.
- **Disagreements:** if two sources disagree, or the code disagrees with the docs, stop. Show both
  and ask. Never silently reconcile.
- **External facts** (versions, API names) come from official docs and Maven Central, never from
  memory. Record each pinned version in ARCHITECTURE §16, with its source URL and the date
  checked.

## Limits

- **What Claude may edit:** files under `docs/`, and this file.
- **What Claude may not write:** code, tests, POMs, Compose files, Dockerfiles, scripts or
  workflows, unless Shashank says "implement PF-xxx".
- **Snippets:** up to about 10 lines to illustrate an API are fine. Never the solution to a task.
- **Ask first** before running anything that installs software, touches AWS, or could cost money.
  Never create AWS resources.
- **No secrets** in the repo: `.env` is gitignored, and `.env.example` holds only names and
  placeholders.
- **No employer names, code or data** anywhere in the repo (SPEC C-7).

## Session protocol

- **"start session":** read SPEC, ARCHITECTURE, TASKS and the last 3 PROGRESS entries. Say which
  milestone is current, and show the card of the next unblocked task. Don't start it.
- **"done PF-xxx":** run the card's Done-when checks yourself and report pass or fail.
  - On pass: mark the task DONE in TASKS.md, and append a PROGRESS entry (ask for the actual
    minutes).
  - On fail: point to the gap without fixing it.
- **"stuck PF-xxx":** use the hint ladder, moving up a level only when asked:
  1. Direction.
  2. The specific API or doc section.
  3. A small snippet.
- **"change …":** for any scope change, propose the SPEC edit and a new ADR. Edit nothing until
  Shashank approves.
- **Overruns:** if a task took more than 45 minutes, propose splitting similar upcoming tasks.
- **New or split cards** follow
  [TASKS.md § Writing or splitting cards](docs/TASKS.md#writing-or-splitting-cards).
