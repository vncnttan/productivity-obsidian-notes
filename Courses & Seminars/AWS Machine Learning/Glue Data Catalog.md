Metadata repository for all tables
- Automated schema
- Versioned Schema

- Integrates with Athena or Redshift Spectrum


##### Glue Crawlers 
Helping to build the Glue Data Catalog

- Crawlers go through data to infer schemas and partitions
- Works JSON, Parquet, CSV, relational store
- Crawlers work for: S3, Amazon Redshift, Amazon RDS

- Need an IAM role / credentials to access the data stores


#### Glue and S3 Partitions
`Glue crawlers will extract partitions based on how the data is organized in the S3, so you need to think up front about how the data is stored`
![[Pasted image 20250131133219.png]]


