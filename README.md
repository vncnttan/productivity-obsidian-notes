Welcome to my notes 🌱

Reorganized 2026-08-31 around a research-first structure ([[Reorg Plan]], Option B
from [[Reorg Options]]). Numbered folders sort in priority order — what I'm doing now
sits at the top, what I've finished sits at the bottom.

## Structure

| Folder | What lives here |
|---|---|
| `01 Research/` | The live thread. Thesis & VLM notes, conference/paper deadline tracking, research methodology, and a `Reading Notes/` folder for per-paper notes. |
| `02 Knowledge Base/` | Reusable concepts, filed by **topic** rather than by the class that taught them. Five areas: `Math & Stats`, `CS Fundamentals`, `AI & ML`, `Systems & Security`, `Academic Writing`. |
| `03 Career/` | Job hunt, portfolio, cover-letter guide. |
| `04 Personal/` | Non-work notes, task journals, side projects with open items. |
| `99 Archive/` | Done and rarely touched: BINUS coursework, SLC assistant history, old bootcamps, completed personal projects. |
| `Templates/`, `Images/` | Infrastructure. Left alone. |

## How the Knowledge Base relates to the Archive

Concept notes were **extracted** from their course folders into `02 Knowledge Base/`,
but the connection runs both ways:

- Each archived course MOC (e.g. `[[✖️ Discrete Mathematics]]`) still links **down**
  to its notes — Obsidian links resolve by note name, not by path, so nothing broke.
- Each extracted note carries a footer linking **back** to the course it came from:
  `*Extracted from [[✖️ Discrete Mathematics]] — BINUS Semester 1 (archived coursework).*`

So you can still walk a semester as it was taught, or jump straight to a topic without
remembering which class covered it. To find every extracted note, search for
`<!-- source: archived coursework -->`.

What stayed in `99 Archive/` is the stuff that only makes sense in its original
context: exams (UTS/UAS/AOL/GSLC), grading schemes, schedules, lab logistics, lecturer
contacts, SLC org admin, and course-bound subjects.

## Conventions

- **Links are by note name**, never by path (`[[Karnaugh Maps]]`, not `[[Math/Karnaugh Maps]]`).
  Moving a file is therefore safe; **renaming** one is what breaks links.
- **Note names are unique across the vault.** Keep it that way — a duplicate basename
  makes every link to it ambiguous.
- Numbered prefixes (`01`–`04`, `99`) only exist to control sort order. New top-level
  areas should take a number too, or the scheme drifts.
