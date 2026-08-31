> In general, algorithms that rely on Deep Learning will benefit from GPU instances (P3, g4dn) for training

> Inference is usually less demanding and you can often get away with compute instances there (C5)

##### Managed Spot Training
- Can use EC2 Spot instances for training
	- Save up to 90% over on-demand instances
- Spot instances can be interrupted
	- **Use checkpoints to S3 so training can resume**
- **Can increase training time** as you need to wait for spot instances to become available

##### SageMaker and Availability Zones
`Attempts to distribute instances across availability zones`
- Need more than one instances for this to work
- Deploy multiple instances for each production endpoint
- Configure VPC with at least two subnets each in different Availability zone


# Other Instance Choosing Options
##### Automatic Scaling
`Set up a scaling policy to define target metrics, min/max capacity, cooldown period`

- Works with CloudWatch
- Dynamically adjusts number of instances for a production variant
- Load test your configuration before using it


##### Serverless Inference
`Specify container, memory requirement, concurrency requirements`

- Underlying capacity is automatically provisioned and scaled
- Good for infrequent or unpredictable traffic, will scale down to zero
- Charged based on usage
- Monitor via CloudWatch
	- ModelSetupTime, Invocations, MemoryUtilization

##### Amazon SageMaker Inference Recommender
`Recommends best instance types and configurations for your models`

- Automates load testing & model tuning
- Deploys to optimal inference endpoints
- How it works: 
	 - Register your model to the model registry 
	 - Benchmark different endpoint configurations 
	 - Collect & visualize metrics to decide on instance types 
	 - Existing models from zoos may have benchmarks already 

**Two types**:
 - **Instance Recommendations** 
	 - Runs load tests on recommended instance types 
	 - Takes about 45 minutes 
 - **Endpoint Recommendations** (Customize load test!) 
	 - Custom load test 
	 - You specify instances, traffic patterns, latency requirements, throughput requirements 
	 - Takes about 2 hours

