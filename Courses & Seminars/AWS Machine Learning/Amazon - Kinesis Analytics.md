![[Pasted image 20241013211153.png]]


**Use cases** 
- Streaming ETL: data select columns, make simple transformations, on streaming 
- Continuous metric generation: 
- Responsive analytics: live leaderboard for a mobile game look for certain criteria and build alerting (filtering)

**Features** 
- Pay only for resources consumed (but it’s not cheap) 
- Serverless; scales automatically 
- Use IAM permissions to access streaming source and destination(s) 
- SQL or **Flink** to write the computation (SQL is going byebye because Flink is way superior in streaming :D )
- Schema discovery 
- Lambda can be used for pre-processing


![[Pasted image 20241013214315.png]]

#### Kinesis Data Analytics + Lambda
 - AWS Lambda can be a destination as well 
 - Allows lots of flexibility for post-processing 
	 - Aggregating rows 
	 - Translating to different formats 
	 - Transforming and enriching data 
	 - Encryption 
 - Opens up access to other services & destinations 
	 - S3, DynamoDB, Aurora, Redshift, SNS, SQS, CloudWatch


![[Pasted image 20241013220645.png]]


Common Use case:
- Streaming ETL
- Continuous Metric Generation
- Responsive analytics