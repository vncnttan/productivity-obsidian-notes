![[Pasted image 20241013202906.png]]

- Fully Managed Service, no administration 
- Near Real Time (Buffer based on time and size, optionally can be disabled) 
- Data Ingestion into Redshift / Amazon S3 / ElasticSearch / Splunk 
- Automatic scaling 
- Supports many data formats 
- Data Conversions from CSV / JSON to Parquet / ORC (only for S3) 
- Data Transformation through AWS Lambda (ex: CSV => JSON) 
- Supports compression when target is Amazon S3 (GZIP, ZIP, and SNAPPY) sundog-education.com datacumulus.com © 2022 All Rights Reserved Worldwide 
- Pay for the amount of data going through Firehose

![[Pasted image 20241013203317.png]]



#### Streams vs Firehose
---
**Streams**
- Going to write custom code (producer / consumer)
- Real time (~200 ms latency for classic, ~70 ms latency for enhanced fan-out)
- Automatic scaling with On-demand Mode
- Data Storage for 1 to 365 days, replay capability, multi consumers
**Firehose**
- Fully managed, send to S3, Splunk, Redshift, ElasticSearch
- Serverless data transformations with Lambda
- Near real time
- Automated Scaling
- No data storage


