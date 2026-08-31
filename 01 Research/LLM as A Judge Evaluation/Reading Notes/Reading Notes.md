
One note per paper. Suggested naming: `Author Year - Short Title`.


## Papers Read
_(nothing yet)_


## Pending Paper Read

### Papers directly comparing the two between LLM-as-a-Judge ensemble vs trained RM

If you want head-to-head comparison papers specifically:

- _Skywork-Reward-V2_ (2507.01352) — has an explicit "LLM-as-a-Judge ensemble vs. trained RM" ablation (Appendix H.6).
- _How to Evaluate Reward Models for RLHF_ (2410.14872) — compares scalar RMs against GPT-4o/Claude/ensemble judges across correlation metrics.
- _LLM Judges as Reward Models_ (Atla, 2024) — conceptual framing of using judges as the reward signal in RLAIF.
- _Igniting Creative Writing in Small Language Models_ (2508.21476) — a task-specific comparison where, interestingly, a principle-guided LLM-as-a-judge beat a trained RM on creative writing while needing less human-annotated data.

A newer direction worth flagging: **generative reward models** and **rubric-based judges** (e.g., Rubrics as Rewards) blur the line — training an LLM to produce verifiable, structured rewards, combining the trainability of RMs with the reasoning of judges.

Want me to go deeper on any one thread — the benchmark methodology, the RLHF training implications, or the generative/rubric-based hybrid approaches?
