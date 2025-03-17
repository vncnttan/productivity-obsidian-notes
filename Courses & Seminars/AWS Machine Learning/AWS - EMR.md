`Elastic MapReduce`

Managed Hadoop framework on EC2 instances
- Includes spark, HBase, Presto, Flink, Hive, & more
- EMR Notebooks
- Several integrations points with AWS

## EMR Cluster
`Collection of EC2 instances where every EC2 instance is called a node`
- **Master Node**: Manages the cluster
- **Core Node**: Hosts HDFS data and run tasks
- **Task Node**: Run tasks, does not host data
	- Optional
	- Good use of spot instances
	- No risk of data loss when removing

## EMR Usage
- Transient vs. Long-Running Clusters
	- Spin up task nodes using Spot instances for temporary capacity 
	- Use reserved instances on long-running clusters to save money

Ways to use EMR:
- Connect directly to master to run jobs
- Submit ordered steps via the console

## EMR / AWS Integrations
- Amazon EC2 for the instances that comprise the nodes in the cluster 
- Amazon VPC to configure the virtual network in which you launch your instances 
- Amazon S3 to store input and output data 
- Amazon CloudWatch to monitor cluster performance and configure alarms 
- AWS IAM to configure permissions 
- AWS CloudTrail to audit requests made to the service 
- AWS Data Pipeline to schedule and start your clusters


## EMR Storage
There is many choices:
- HDFS
	- Saved accross EC2 instances with multiple backups, good performance 
	- Ephemeral Storage: `once the cluster is terminated, the data is gone with it` → not ideal for storage choice
- EMRFS: Access S3 as if it were HDFS
	- EMRFS Consistent View – Optional for S3 consistency
	- Uses DynamoDB to track consistency
- Local File System
- EBS for HDFS

## EMR Promises
- EMR Charges by the hour + EC2 charges
- Provisions new nodes if a core nodes fails
- Can add and remove tasks nodes on the fly
- Can resize a running cluster’s core nodes


## Hadoop
[[hadoop - BDP]]
![[Pasted image 20240111101025.png]]
Modules:
- MapReduce →  Software framework for easily writing applications that process for easily writing applications that process vast amounts of data in parallel on large clusters
- YARN → `Yet Another Resource Negotiator` → Manage cluster resources from multiple data processing frameworks
- HDFS → Distributed scalable file system and store data accross instances, useful for caching intermediate results / for workloads that have significant random I/O


## Apache Spark
Apache Spark → A faster alternative to MapReduce
Features:
- Caching
- APIs for Java, Scala, etc.
- Support code reuse for multiple workloads
- Generally not used for OLTP / Batch Processing data

![[Pasted image 20250316184824.png]]

#### Spark Components:
- Spark Core → Foundation for the platform
	- RDD: `Resilient Distributed Data` partitioned across multiple nodes
- Spark SQL → Low latency interactive queries
	- DataFrame in Pyton / Datasets in Scala
	- Tends to interact the data the same ways with a DataFrame in Pandas
- Spark Streaming → Streaming analytics
	- Use the same code you use for batch processing
	- Integrate with many things including AWS Kinesis
- MLLib → Machine Learning library
- GraphX → Create graphs


#### Spark MLLib
`Implemented in a way that is distributed and scalable` → Allow you to process massive datasets and train machine learning on them across entire clusters
- Classification
	- Logistic Regression
	- Naive Bayes
- Regression
- Decision Trees
- Recommendation Engine (ALS)
- Clustering (K-Means)
- LDA (Topic Modelling)
- ML Workflow utilities (pipelines, feature transformations, persistenced)
- SVD, PCA, and many other statistics!


#### Spark Structured Streaming
![[Pasted image 20250316185627.png]]

![[Pasted image 20250316185704.png]]

## Zeppellin + Spark
`Notebook that can run spark code interactively (like you can in the spark shell)`
- Speeds up development cycle
- Allows easy experimentation and exploration of your big data

- Can execute SQL queries directly against SparkSQL
- Query results can be visualized in charts and graphs
- Makes spark feel more like a data science tool
![[Pasted image 20250316185939.png]]
## EMR Notebook
`Similar concept to Zepellin, with more AWS integrations`

- Notebooks backed up to S3
- Provisionn clusters from the nnotebook
- Hosted inside a VPC
- Accessed only via AWS console
- Also can be used collaboratively like google colab

## EMR Security
- IAM Policies
- Kerberos → Secret key cryptography
- SSH
- IAM Roles
- Security Configurations may be specified for Lake Formation
- Native integration with Apache Ranger → For data security on Hadoop / Hive


## EMR: Choosing Instance Type

- Master Node
	- m4.large if < 50 nodes, else 4.xlarge
- Core & Task Node
	- m4.large is usually good
	- t2.medium → if cluster waits a lot on external dependencies e.g web crawler (lite)
	- m4.xlarge → improved performance
	  
	- high CPU instances → Computation-intensive applications
	- high memory instances → Database, memory-caching applications
	- cluster computer instances → Network / CPU intensive (NLP, ML)
	-  Accelerated Computing / AI - GPU instances (g3, g4, p2, p3) → AI with neural network

- Spot instances 
	- Good choice for task nodes
	- Only use on core & master if you’re testing / very cost-sensitive → Risking partial data loss


