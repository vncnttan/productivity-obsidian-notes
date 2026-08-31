`Fast secure access to feature data for training, organized, and sharable accross diferent models`

Integrations (where the features come from):
- Pipelines
	- SageMaker Studio
	- Apache Airflow
	- Glue
	- Kinesis / Kafka
	- Step Functions
	- EMR

Sagemaker Feature store organizes data based on feature group with Record Identifier, Feature Name, and Event Time.

SageMaker Feature Store, can be:
- Online Store (STREAMING ACCESS)
- Offline Store (S3) → (BATCH ACCESS / DUMP)

Data Ingestion:
- Step 1: Setup the Streaming Service (Kinesis, MSK, Spark, Data Wrangler, etc.)
- Step 2: STREAMING access via PutRecord / GetRecord API
  or  
- Step 2: Anything that hits S3 (Athena / Data Wrangler) → Automatically creates a Glue Data Catalog → Batching to store to S3


Security 
- Enrypted at rest & in transit
- KMS Customer Master Key
- Fine Grained with IAM
- May also be secured with AWS Private Link

