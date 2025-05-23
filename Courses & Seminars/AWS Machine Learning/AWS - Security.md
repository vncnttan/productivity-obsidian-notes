- Use Identity and Access Management (IAM)
	- Set up user accounts with appropriate permissions
- Use MFA
- Use SSL / TLS when connecting to anything
- Use CloudTrail to log API and user activity
	- CloudTrail → Auditing 
		`(Logging and showing the what everyone is doing on the API)`
	- CloudWatch → Monitoring 
		`(Monitoring and alerting if triggered -> something goes wrong)`
- Be careful with PII (Personal Identifiable Information)


Protecting Data at Rest in [[Amazon Sagemaker]]
- AWS Key Management Service (KMS)
	- Training, tuning, batch transform, endpoints
	- Noteboooks 
	- Everything under opt/ml/ and /tmp
- S3
	- Encrypt training data & hosting model
	- Can also use KMS

Protecting Data In Transit in [[Amazon Sagemaker]]
- All traffic support TLS/SSL
- IAM roles are assigned to Sagemaker to give it permissions to access resources
- `Inter-container traffic encryption` → Inter-node training communication may be optionally encrypted
	- Increate training time & cost with DL
	- Enabled via console / API when setting up a training/tuning job

#### SageMaker + PVC
`Training jobs run in a VPC`
- **You can use private VPC for even more security**
	1. Set S3 VPC endpoints
	2. Custom endpoint policies and S3 bucket policies to keep this secure
- Notebook are Internet-enabled by default → can be a security hole
	- If disabled, VPC needs and PrivateLink (interface endpoint) / NAT Gateway and allow outbound connections, for training and hosting to work
- Training and inference Container are also Internet-enabled by default
	- Network isolation is an option, but also prevent S3 access


#### SageMaker + IAM
User permission for: 
- CreateTrainingJob 
- CreateModel 
- CreateEndpointConfig 
- CreateTransformJob 
- CreateHyperParameterTuningJob 
- CreateNotebookInstance 
- UpdateNotebookInstance 

Predefined policies: 
- AmazonSageMakerReadOnly 
- AmazonSageMakerFullAccess 
- AdministratorAccess 
- DataScientist


### SageMaker Logging & Monitoring
- [[AWS - CloudWatch]] can alarm on:
	- Invocations and latency of endpoints
	- Health of instance nodes (CPU, memory, etc.)
	- Ground Truth (active workers, how much they are doing)
- [[AWS - CloudTrail]] records actions from users, roles, and services within SageMaker:
	- Log files delivered to S3 for auditing