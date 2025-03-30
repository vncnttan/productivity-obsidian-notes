[[Variance]] → Measures how spread-out the data is
[[Standard Deviation]] → The square root of variance


- Somtimes it’s appropriate to remove outliers from the training data, sometimes it is not

Examples:
- In collaborative filtering, a single user who rates thousand of movies could have a big effect oin everyone else’s ratings → may need to put a limit by how many ratings they’ve actually put into the system
- Web log data, outliers may represent bots or other agent that should be filtered if we are talking about the data of actual people that is logging in the web

Dealing with outliers:
- Standard Deviation
- Find data points more than some multiple of a standard deviation
- AWS: Random Cut Forest → made for outlier detection
	- Found in Quicksight, Kinesis Analytics, SageMaker, and more

