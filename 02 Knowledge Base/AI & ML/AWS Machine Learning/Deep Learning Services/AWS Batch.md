`Run batch jobs as Docker images`
Dynamic provisioning of the instances (EC2 and Spot Instances)
- Optimal quantity and type based on volume and requirements
- No need to manage clusters, fully serverless
- You just pay for the underlying EC2 instances

Use cases:
- Schedule Batch Jobs using CloudWatch Events
- Orchestrate Batch Jobs using AWS Step Functions

##### AWS Batch vs. Glue
- Glue ETL → Really focus on the transforming
- For any computing job, regardless of the job (must provide Docker image)
	- This is a better choice for any non-ETL related work