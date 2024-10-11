- Allows people to store objects (files) in "buckets" (directories)
- Buckets must have a globally unique name


#### Amazon S3 for Machine Learning
- Create a “Data Lake”
	- Infinite size, no provisioning
- Centralized Architecture
- Object Storage -> Support any file format

#### Amazon S3 for Data Partitioning
Pattern for speeding up range queries (ex: AWS Athena)

- Data partitioning will be handled by some tools (like glue)

#### S3 Storage Classes
- Amazon S3 Standard - General Purpose 
- Amazon S3 Standard-Infrequent Access (IA) 
- Amazon S3 One Zone-Infrequent Access 
- Amazon S3 Glacier Instant Retrieval 
- Amazon S3 Glacier Flexible Retrieval 
- Amazon S3 Glacier Deep Archive 
- Amazon S3 Intelligent Tiering