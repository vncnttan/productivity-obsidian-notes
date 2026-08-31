`Application that lets you create dashboard, chart, graph, and reports quickly and easily`

Allows all employees in an organization to:
- Build visualizations 
- Perform ad-hoc analysis
- Quickly get business insights from data 
- Anytime, on any device (browsers, mobile)

Targeted toward customer (businesses) not developer
Charged based by users

#### Quicksight Data Source
- Redshift → Popular data warehouse service in AWS
- Aurora / RDS  → OLTP Relational Data service in AWS
- Athena → Can be hooked up to query from S3
- EC2-hosted databases
- Files (S3 or on-premise)
	- Excel
	- CSV/TSV
	- Common or extended log format
- AWS IoT Analytics
- Data Preparation allows limited ETL

##### Use Case
- Interactive ad-hoc exploration / visualization of the data
- Dashboard and KPI’s
- Analyze visualize data from
	- Logs in S3
	- On-premise databases
	- AWS (RDS, Redshift, Athena, S3)
	- SaaS application (e.g Salesforce)
	- Any JDBC/ODBC data source

##### Anti Pattern
- Highly formatted canned reports
	- But this is solvable using Quicksight Paginated Report (new feature)
- ETL → [[Glue ETL]]

##### Machine Learning Insight (New Feature)
- ML Powered Anomaly Detection → Random Cut Forest
- Forecasting
- Auto-Narratives

##### Quicksight Q
`Answer business question with NLP`
- Offered as ann add-on for given regions
- Personal Training on how to use it as required
- Set up topics associated with datasets
	- Datasets and the fields must be NLP-friendly (from column naming, etc.)
	- How to handle dates must be defined

#### Quicksight Paginated Reports
`Reports designed to be printed`
- May span many pages
- New in Nov 2022
![[Pasted image 20250307100506.png]]
#### Spice
- Data sets are imported into SPICE
	- `Super-fast, Parallel, In-memory Calculation Engine`
	- Uses columnar storage, in -memory, machine code generation
- Each user gets 10GB of SPICE
- Highly Available / Durable
- Scales to hundreds of thousand of users


#### Quicksight Security
- MFA 
- VPC Connectivity
- Row-Level Security
- Private VPC Access

#### Quicksight User Management
- User Defined via IAM or email signup
- SAML-based SSO
- Active Directory Integration
- MFA

##### Quicksight Dashboard
![[Pasted image 20250307101058.png]]


Visual Types:
- AutoGraph → Automatically decide the appropriate chart (sometimes they get it right, sometimes they don’t)
- Bar Chart → For comparison and distributions (Histogram)
- Line Graphs → For changes over time
- Scatter plots, Heat maps → For correlation
- Pie Graphs, Tree maps → For aggregation
- Pivot Tables → For tabular data

Additional Visual Types
- KPIs → Comparing key values to target values
	  ![[Pasted image 20250307103021.png]]
- Geospatial Charts
	  ![[Pasted image 20250307103041.png]]
- Donus Charts
- Gauge Charts
- Word Cloud Charts  


Tree Maps → Hierarchical Aggregation
![[Pasted image 20250307102741.png]]
