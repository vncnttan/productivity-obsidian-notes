`Quickly and securely migrate databases to AWS, resilient, self healing`

- The source remains available during the migration
- Support homogeneus (ex Oracle to Oracle) and heterogenous migrations (ex Microsoft SQL Server to Aurora)
- Continuous Data Replication using CDC
- Must create an EC2 instance to perform the replication tasks

#### Glue vs AWS DMS

- Glue ETL – Focus on the ETL, without worry configuring or managing the resources
- AWS DMS – Continuous Data Replication. Once the data is in AWS, you can use the Glue to transform it (using tools like Glue).

