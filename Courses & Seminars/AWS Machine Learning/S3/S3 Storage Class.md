## S3 Durability and Availability
- S3 has High Durability
  The chance of data disappearing is very low
  The same for all storage classes
- Availability
  Measures how readily available a service is
  Varies depending on storage class

## S3 Standard: High Storage Cost, Rapid Storing and Retrieving ⚡
- 99.99% Availability
- Used for frequently accessed data
- Low latency and high throughput 
- Sustain 2 conccurent facility failures

Use Case: Big Data Analyticcs, Mobile & Gaming Applications, Content Distribution

## S3 Storage Classes – Infrequent Access: Low Storage Cost, Requires rapid access when needed ⛈
• For data that is less frequently accessed, but requires rapid access when needed 
• Lower cost than S3 Standard

Amazon S3 Standard-Infrequent Access (S3 Standard-IA) 
- 99.9% Availability  
- Use cases: Disaster Recovery, backups 
Amazon S3 One Zone-Infrequent Access (S3 One Zone-IA) 
- High durability (99.999999999%) in a single AZ; data lost when AZ is destroyed 
- 99.5% Availability 
- Use Cases: Storing secondary backup copies of on-premise data, or data you can recreate

## Amazon S3 Glacier Storage Classes: Lowest Storage Cost, High Minimum Storage Duration❄
- Low-cost object storage meant for archiving / backup
- Pricing: price for storage + object retrieval cost

Amazon S3 Glacier Instant Retrieval
- Millisecond retrieval, great for data accessed once a quarter
- Minimum storage duration of 90 days

Amazon S3 Glacier Flexible Retrieval (formerly Amazon S3 Glacier):
- Expedited (1 to 5 minutes), Standard (3 to 5 hours), Bulk (5 to 12 hours) – free
- Minimum storage duration of 90 days

Amazon S3 Glacier Deep Archive – for long term storage: 
- Standard (12 hours), Bulk (48 hours)
- Minimum storage duration of 180 days


## S3 Intelligent-Tiering: Auto Tiering
- Small monthly monitoring and auto-tiering fee 
- Moves objects automatically between Access Tiers based on usage 
- There are no retrieval charges in S3 Intelligent-Tiering 

Tiers:
- Frequent Access tier (automatic): default tier 
- Infrequent Access tier (automatic): objects not accessed for 30 days 
- Archive Instant Access tier (automatic): objects not accessed for 90 days
- Archive Access tier (optional): configurable from 90 days to 700+ days 
- Deep Archive Access tier (optional): config. from 180 days to 700+ days


# Moving Between Storage Classes
- Transition objects between storage classes 
![[Pasted image 20241012142857.png]]

## Lifecycle Rules
- Transition Actions
  Configure objects to transitino to another storage class
  - Example: Move objects to Standard IA class 60 days after creation
  - Example: Move to Glacier for archiving after 6 months
- Expiration Actions
  Configure objects to expire(delete after some time)
  - Can be used to delete old versions of files (if versioning is enabled)
  - Can be used to delete incomplete Multi-Part uploads

## Amazon S3 Analytics – Storage Class Analysis
- Help you decide when to transition objects to the right storage class 
- Recommendations for Standard and Standard IA 
- Does NOT work for One-Zone IA or Glacier 
- Report is updated daily 
- 24 to 48 hours to start seeing data analysis 
Good first step to put together Lifecycle Rules (or improve them)!
