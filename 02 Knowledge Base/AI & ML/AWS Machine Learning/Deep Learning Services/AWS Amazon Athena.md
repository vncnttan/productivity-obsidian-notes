Start querying data instantly interactive queries of S3 data lake

Just go into athena, then choose the desired database and create the database.

- No need to load data, it stays in S3
- Presto under the hood
- Serverless
- Supports many data formats:
	- CSV
	- JSON
	- ORC
	- Parquet
	- Avro
- Unstructured, Semi-structured, or Structured

##### Athena + Glue
Glue → crawl S3 and extract metadata schema from S3 
Athena → use the defined schema to issue sequel queries and come up with name for columns

##### Athena Cost Model
- Pay-as-you go
- No charge for DDL

Save lost of money by using columnar formats

- Glue and S3 have their own charges

##### Athena Security
Access control 
- IAM, ACLs, S3 bucket policies 
- AmazonAthenaFullAccess / AWSQuicksightAthenaAccess

- Encrypt results at rest in S3 staging directory 
	- Server-side encryption with S3-managed key (SSE-S3) 
	- Server-side encryption with KMS key (SSE-KMS) 
	- Client-side encryption with KMS key (CSE-KMS)
 
- Cross-account access in S3 bucket policy possible
- Transport Layer Security (TLS) encrypts in transit (between Athena and S3)

##### Athena Anti Patterns
- Highly formatted reports / visualization → [[AWS - Amazon Quicksight]]
- ETL → [[Glue ETL]]
