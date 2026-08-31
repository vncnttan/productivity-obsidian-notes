# Vault Structure Options

Three candidate structures, from lightest-touch to most ambitious. Pick one and note it at the top of [[Reorg Plan]] before execution starts. They share the same underlying decisions (research surfaces, coursework archives, career consolidates) — they differ in how much re-shuffling you're willing to do.

---

## Option A — PARA Method (Projects / Areas / Resources / Archive)

Classic PARA: sort by *actionability*, not by subject.

```
/00 Projects/          # things with a deadline/end-state
  Research Submissions/   # ICTIIA, ICACSIS, ACCV, WACV tracking (from Search for Paper.md)
  Job Hunt/                # 2026 Job Hunt, Portfolio Task
  KIMS Sales Panel/        # if kept — treat as a project, not permanent home

/01 Areas/             # ongoing responsibilities, no end date
  Research/                # Thesis notes, VLM notes — the evergreen research thread
  Career Development/      # Cover letter guide, general job-search notes

/02 Resources/         # reference material, useful regardless of project
  Knowledge Base/
    Mathematics/            # Discrete Math, Linear Algebra, Calculus concept notes
    Statistics/
    Computer Science/        # Algorithms, Data Structures, AI/ML, NLP, CV, DL
    Machine Learning & AWS/  # AWS ML course content
    Software & Security/     # SLC training: Python, React, Laravel, Linux Security, Pentesting
  Templates/                # unchanged

/03 Archive/           # done, rarely touched, kept for the record
  BINUS Coursework/         # semester folders, minus what got promoted to Resources
  SLC Assistant Admin/       # schedules, rosters, org logistics
  Bootcamps/                 # CS50P, NVIDIA, GarudaHacks, SFT
  Personal/                  # Cosplay Activities, old task journals

/Images/                # unchanged
```

**Pros:** scales well as new projects/areas come and go; research and career are clearly "live" and separated from "done." Standard method, lots of existing tooling/guides if you want to formalize it further.
**Cons:** biggest reshuffle of the three; requires deciding, per note, whether it's a Resource (reusable) or Archive (historical) — that judgment call is the most time-consuming part (Phase 5 in the plan).

---

## Option B — Identity-based (research-first, numbered for sort order)

Organize around what you *are now* (a researcher) rather than a generic productivity method.

```
/01 Research/
  Thesis & VLM/            # current archive/BINUS/Thesis content
  Paper Tracking/           # Search for Paper.md and future submissions
  Reading Notes/             # new home for future paper notes

/02 Knowledge Base/         # same idea as PARA's Resources, but framed as "what I know"
  Math & Stats/
  CS Fundamentals/
  AI & ML/                  # ML, DL, NLP, CV, AWS ML course
  Systems & Security/        # OS, Networking, SLC security/pentesting training

/03 Career/
  Job Hunt/
  Portfolio/
  Cover Letter Guide.md

/04 Work Projects/
  KIMS Sales Panel/          # if kept, lives here explicitly as "not academic, not personal"

/05 Personal/
  Cosplay Activities.md
  (any other non-work, non-research notes)

/99 Archive/
  BINUS Coursework/           # course logistics, assignments, semester structure preserved as-is
  SLC/                          # full assistant org history
  Old Bootcamps/

/Templates/, /Images/         # unchanged
```

**Pros:** puts "Research" as the literal first thing you see when you open the vault — matches the stated goal of pivoting identity from student to researcher. Cleaner separation of work project vs. personal vs. academic than Option A.
**Cons:** similar effort to Option A; the numbered-prefix convention needs discipline going forward or it drifts.

---

## Option C — Light-touch (minimal diff, lowest risk)

Don't restructure coursework at all — it's already reasonably organized under `archive/`. Only fix the things that are actually broken: stray root files and the research/career material that's scattered.

```
/Research/                  # NEW — promoted out of archive/BINUS/Thesis + root Search for Paper.md
  Thesis & VLM/
  Paper Tracking.md

/Career/                    # NEW — consolidates root + Task List
  Job Hunt/
  Portfolio Task.md
  Cover Letter Guide.md

/Work Projects/             # NEW — just KIMS Sales Panel moved here, untouched internally
  KIMS Sales Panel/

/archive/                   # UNCHANGED structure, just gains the promoted items removed
  BINUS/                       # Semester 1-5 stay exactly as they are, incl. concept notes nested in-course
  SLC/
  misc/                        # Cosplay stays here, or renamed "Personal"

/Courses & Seminars/        # UNCHANGED except: stray July 2022 journal file moved to Career or archive/misc,
                             # AWS Machine Learning stays here since it's genuinely a "course"

/Templates/, /Images/       # unchanged
```

**Pros:** by far the least work and least link-breakage risk — most files never move. Delivers the main ask (research surfaced, career consolidated, root decluttered) without touching 307 files in Semester 1.
**Cons:** doesn't create a topic-based knowledge base — reusable concept notes (e.g. a stats concept you want to cite in a paper later) stay buried inside course folders, findable only if you remember which class taught it. Coursework and SLC archive stay somewhat inconsistent with each other in internal structure.

---

## Recommendation

If time is limited: **Option C** first (an afternoon), then revisit Option A or B for the Knowledge Base extraction later, incrementally, one subject at a time, once the vault has already been decluttered and it's clear which concept notes actually get reused.

If doing it once, properly: **Option B** — it matches the stated life transition (student → researcher) most directly, and the numbering keeps day-to-day navigation fast.
