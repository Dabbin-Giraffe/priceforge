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
