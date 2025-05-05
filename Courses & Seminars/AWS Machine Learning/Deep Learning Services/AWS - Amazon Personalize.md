`Fully-managed recommender engine`
→ Same one Amazon uses

API Access
→ Feed in data via S3 / API integration
- You provide an explicit schema in Avro format
- Javascript / SDK
- GetRecommendations
	- Recommended products, content, etc.
	- Similar items
- GetPersonalizedRanking
	- Rank a list of items provided
	- Allow editorial control / curation


- Real-time / batch recommendations
- Recommendations for the new users and new items (the cold start problem)
- Contextual recommendations
	- Device type, time, etc.
- Similar items
- Unstructured text input
- Intelligent user segmentation


- Business rules & filters
	- Filter out recently purchased items
	- Highlight premium content
	- Ensure a certain percentage of results are some category
- Promotions
	- Inject promoted content into recommendations
	- Can find most relevant promoted content
- Trending Now
- Personalized Ranking
	- Search results
	- Promotions
	- Curated lists’

Terminology:
- Datasets
- Recipes
	- USER_PERSONALIZATION
	- PERSONALIZED_RANKING
	- RELATED_ITEMS
- Solutions
	- Trains the model
	- Can optimize relevance / additional objectives
		- Video length, price, etc. – must be numeric
	- Hyperparameter Optimization (HPO)
- Campaigns
	- Deploys your ‘solution version’
	- Deploys capacity for generating real-time recommendations

![[Pasted image 20250503175444.png]]

Maintaining Relevance
- Keep your datasets current
	- Incremental data import
- Use PutEvents operation to feed in real-time user behaviour
- Retrain the model
	- They call this a new solution version
	- Updates every 2 hours by default
	- Should do a full retraining weekly (trainingMode=FULL)


Amazon Personalize Security
- Data not shared accross accounts
- Data maybe encrypted with KMS, at rest (SSE-S3)
- Data in transit between account and Amazon internal system encrypted with TLS 1.2
- Access control via IAM
- Data in S3 must have appropriate bucket policy for Amazon Personalize to process it
- Monitoring & Logging via CloudWatch & CloudTrail 

Pricing
- Data ingestion: per-GB
- Training: per training-hour
- Inference: per TPS-hour
- Batch recommendations: per user / per item

