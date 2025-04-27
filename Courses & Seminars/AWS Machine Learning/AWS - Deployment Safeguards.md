Deployment Guardrails 
- Async / real-time inference endpoints
- Controls shifting traffic to new models
	- Blue/Green Deployments
	  Three modes:
		- All at once → Shift everything
		- Canary → Shift a small portion of traffic and monitor
		- Linear → Shift traffic in linearly spaced steps
- Auto-rollbacks

Shadow Test
- Compare performance of shadow variant to production
- Monitor SageMaker console and create hte decision!