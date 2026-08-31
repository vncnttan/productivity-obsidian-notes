`Creates & stores your ML workflow (MLOps)`

- Model History
- Tracking for Audit & Compliance
- Auto / Manually create tracking entities
- Integrates:
	- AWS Resource Access Manager → Cross-account lineage
![[Pasted image 20250501145834.png]]


Lineage Tracking Entities:
- Trial components (processing, training, & transform jobs)
- Trial (model composed of trial components) 
- Experiment (group of Trials)
- Context (logical grouping of entities)
- Action (workflow step, model deployment)
- Artifact (object / data)
- Association (connects entities together)


Querying Lineage Entities:
- Use the LineageQuery API from Python
	- Amazon SageMaker SDK 
- Features: Find all models, endpoints / etc. given an artifact (e.g. figuring out what model dependent on which artifact)
- Produce visualization
	- External Visualizer helper class