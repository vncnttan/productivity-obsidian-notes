# Vault Reorganization — Game Plan

Written after a full survey of the vault (2026-08-30). This is the master plan — read this first, then open **[[Reorg Options]]** to pick a target structure before touching any files.

## Context (why this exists)

- Vault was used for BINUS coursework (5 semesters + thesis), a student-org role (SLC), a freelance/work project (KIMS Sales Panel), job hunting, and personal stuff.
- User is graduating and pivoting to a research track. Old coursework is mostly done; the vault should now center on research + career, with coursework demoted to reference/archive.
- 793 markdown files, 448 of them contain `[[wikilinks]]` — link integrity matters, this is not a "just `mv` things" job.

## Survey findings

| Area | Path | Status | Notes |
|---|---|---|---|
| Coursework | `archive/BINUS/Semester 1-5` | Done, already under `archive/` | Semester 1 alone has 307 files. Many are atomic concept notes (Discrete Math, Linear Algebra, Basic Statistics) that are genuinely reusable knowledge, not just class logistics. |
| Thesis | `archive/BINUS/Thesis` | **Thin (3 files)**, includes `VLMs in general.md` | This is the seed of the research direction. Buried under archive — should surface. |
| Research tracking | `Search for Paper.md` (root) | **Active** | Conference deadlines (ICTIIA, ICACSIS, ACCV, WACV, etc.). This is the most forward-looking file in the whole vault and it's a stray root file. |
| Student org work | `archive/SLC/*` | Done, already archived | Heavy technical training content (Python, Laravel, React, security, deep learning). Reference-worthy but org-specific admin (schedules, rosters) is pure archive. |
| Freelance/client work | `KIMS Sales Panel/` (root) | Unclear if closed | Backlogs + test results for what looks like a client project. Not academic, not personal — arguably doesn't belong in an "obsidian notes for college" vault at all, and may contain client-sensitive info in a repo pushed to git. |
| Courses (post-college) | `Courses & Seminars/AWS Machine Learning` | **Active/relevant** | ML/AWS reference material — directly useful for a research/ML track. |
| Courses (bootcamps) | `Courses & Seminars/archive/*` (CS50P, NVIDIA, GarudaHacks, SFT, deploy guide) | Done | Fine to fold into general archive. |
| Misfiled file | `Courses & Seminars/July 2022 task journal` (untitled, just `#July 2022`) | Misfiled | It's a personal Eisenhower-matrix task log, not a course. |
| Career | `Task List/`, `How to create Cover Letter.md` (root) | Active | Job hunt, portfolio, cover letter guide — all career-track, currently scattered across root and a folder. |
| Personal/hobby | `archive/misc/Cosplay Activities.md` | Personal | Fine as-is, just needs a real home. |
| Templates, Images | `Templates/`, `Images/` | Infrastructure | Leave alone regardless of chosen structure. |

## Non-negotiable safety rules for execution

1. **Do moves inside Obsidian, not raw shell `mv`.** Obsidian auto-rewrites `[[wikilinks]]` on file move; a shell script won't, and 448 files have links. If a script is truly needed, it must parse and rewrite links, then be verified with Obsidian's "broken links" / orphan check.
2. **Commit after every phase**, not one giant commit at the end. Each phase below should end in its own git commit so any mistake is a one-step revert.
3. **Before starting, run Obsidian's link/orphan check once to get a baseline** (Settings → Files & Links, or a community plugin) so you can tell new breakage from pre-existing breakage.
4. Treat `KIMS Sales Panel/` as a decision point, not an auto-move — see open questions below. Don't assume it should be deleted or kept without asking.

## Open questions to resolve before executing (ask the user)

1. **Structure choice** — pick Option A, B, or C from [[Reorg Options]].
2. **KIMS Sales Panel** — keep in this vault archived, or move out entirely (separate repo/folder, since it looks like client work mixed into a personal notes repo)?
3. **Concept notes (Discrete Math, Linear Algebra, Stats, ML)** — extract into a topic-based knowledge base separate from the course folders they came from, or leave them nested under their semester/course?
4. **SLC technical training content** (Python, security, React, deep learning under `archive/SLC/Assistant/SLC Post-Training`) — keep as reference material or treat as pure archive?
5. Any of the 968 images in `Images/` known to be safe to prune (e.g. duplicates, screenshots of no lasting value)? Not required for the reorg, but worth a note if the user wants a lighter pass later.

## Open questions to resolve before executing answers
1. Pick Option B from the structure choice
2. This should be archived under personal project folder, since the project is now completed
3. Yes please extract into topic-based knowledge base, then backlink them to the archived coursework semester is preferable
4. Keep as reference material please, you are welcome to extract them into existing / new topic-based knowledge notes
5. Yes, Images should be referenced somewhere in the notes. You can move them into a deleted folder for me to review. I think it has reference somewhere on my notes because before I searched for the whole. 

## Execution phases (once structure is chosen)

**Phase 0 — Baseline**
- Confirm git status is clean, note current commit hash.
- Run a broken-link/orphan check in Obsidian, save the list as a baseline (even if it's "0 broken").

**Phase 1 — Low-risk root cleanup**
- Move root loose files (`How to create Cover Letter.md`, `Search for Paper.md`) into their new home per the chosen structure.
- Move the misfiled `Courses & Seminars` root journal file to wherever personal/career logs live.
- Commit: "reorg: clean up root-level loose files".

**Phase 2 — Surface the research track**
- Pull `archive/BINUS/Thesis/*` and `Search for Paper.md` together into the new top-level research area.
- Fold in `Courses & Seminars/AWS Machine Learning` as research-adjacent reference material.
- Commit: "reorg: consolidate research materials".

**Phase 3 — Career/personal consolidation**
- Merge `Task List/`, `How to create Cover Letter.md`, and job-hunt material into one career area.
- Relocate `archive/misc/Cosplay Activities.md` and any other personal odds-and-ends into a personal area.
- Commit: "reorg: consolidate career and personal notes".

**Phase 4 — Decide and execute on KIMS Sales Panel**
- Based on answer to open question #2, either archive in place, move under a "Work Projects" area, or extract from the vault.
- Commit accordingly.

**Phase 5 — Coursework archive normalization**
- Standardize `archive/BINUS/*` and `archive/SLC/*` and `Courses & Seminars/archive/*` under one consistent archive root (per chosen option).
- If the user opted to extract concept notes (open question #3), do that extraction here, last, since it's the highest-effort/highest-link-risk step — do it once everything else is stable.
- Commit: "reorg: normalize coursework archive" (and a separate commit for concept-note extraction if done).

**Phase 6 — Verify**
- Re-run the broken-link/orphan check, diff against baseline.
- Spot-check ~10 random notes across old semesters to confirm links still resolve.
- Update `README.md` to describe the new structure.

## Effort estimate

- Phases 0-4: low risk, mostly moving whole folders — a few hours.
- Phase 5 (especially concept-note extraction, if chosen): the real work — could be a multi-session effort given 307 files in Semester 1 alone. Fine to defer or do incrementally per-course rather than all at once.
