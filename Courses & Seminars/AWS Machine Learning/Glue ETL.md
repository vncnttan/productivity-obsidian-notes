`Transform data, Clean Data, Enrich Data (before doing analysis)`
- Generate ETL Code in Python / Scala (can be modified)
- Can provice Spark / PySpark scripts
- Target can be S3, JDBC (RDS, Redshift), or in Glue Data Catalog

Advantages:
- Fully Managed
- Cost Effective
- Pay only for the resource consumed

Run on the serverless spark platform
- Glue Schedulers: Schedule the job
- Glue Triggers: Automate job runs based on "events"


#### Bundled Transformation
- DropFields, DropNullFields
- Filter
- Join
- Map

#### Machine Learning Transformations
- FindMatches ML: Identify duplicates / matching records when the records do not have a common unique identifier and no fields match exactly.


#### Format Conversion
- CSV, JSON, Avro, Parquet, ORC, XML
- Apache Spark Transformations (example: K-Means)
