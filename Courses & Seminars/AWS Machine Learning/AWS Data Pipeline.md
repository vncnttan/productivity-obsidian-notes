`Service to move data from one place to another`

Destinations:
- S3
- RDS
- DynamoDB
- Redshift
- EMR

Features:
- Manage task dependencies
- Retries and notifies on failures
- Data sources may be on-premises
- Highly available


High overview;
AWS Data Pipeline will manage EC2 instances that manages the data ETL.
![[Pasted image 20250131171645.png]]

##### Data Pipeline vs. Glue
- Glue ETL - Run Apache spark code, scala or python based
  Focus on the ETL → Do not worry about configuring or managing the resources
- Glue Data Catalog → Data available to Athena or Redshift spectrum

- Data Pipeline - Orchestration service 
  More control over the environment, compute resources that run code, & code
  Allows access to EC2 or EMR instances (creates resources in your own account)

