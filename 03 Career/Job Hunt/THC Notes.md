##### Extraction
- [x] Define sensible schema & extract
- [x] Typed & validated 
- [x] Must not hallucinate values that are not there
- [x] Report per-field confidence
- [x] Abstain rather than guess
- [x] Define architecture
- [ ] Justify architecture decision

##### Evaluation
- [x] Build ground truth
- [ ] Pick metrics that are suitable
	- [ ] Accuracy
	- [ ] Average Normalized Levenshtein Similarity (ANLS)
	- [ ] Hallucination Rate
	- [ ] Abstention Rate
- [ ] Make it runnable as scorecard
- [ ] Compare two versions and catch a regression before it ships

#### Production
- [x] Handling more than one document at a time
- [x] Cost and latency visible 
- [x] Apply at least one optimization
- [ ] Report optimization impact
- [ ] Dockerize

##### Agentic Development
- [ ] Describe how AI coding agent is used to build
- [x] Ship one custom extension