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

