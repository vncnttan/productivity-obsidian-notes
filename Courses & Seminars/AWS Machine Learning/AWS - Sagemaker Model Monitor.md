`Get alerts on quality deviations on deployed model via CloudWatch`

- Visualize data drift
- Detect anomalies & outliers
- Detect new features
- No code needed

- Integrates with SageMaker Clarify
	- Clarify can be used to detects potential bias
	- Can automatically alert through CloudWatch

Details:
- Data is stored in S3
- Monitoring jobs are scheduled via a Monitoring Scheduule
- Metrics are emitted to CloudWatch
	- Notifications can be used to trigger alarms
	- You’d then take the corrective actions yourself
- Integrates with Tensorboard, QuickSight, Tableau
	- Or just visualize within Sagemaker Studio

Monitoring Types:
- Drift in data quality → Mean, Std, etc.
	- Relative to the baseline defined
- Drift in model quality → Accuracy, RMSE, etc
- Bias drift 
- Feature attribution drift → Based on Normalized Discounted Cumulative Gain (NDCG) score