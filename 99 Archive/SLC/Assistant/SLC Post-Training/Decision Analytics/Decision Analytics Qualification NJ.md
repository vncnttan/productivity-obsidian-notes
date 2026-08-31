### Bayesian Theorem
Bayesian Theorem is a probability  of an event given that another event has occured

`P(A|B) = P(B|A) * P(A) / P(B)`

P(A): Probability of event A
P(B): Probability of event B
P(A|B) is the probability of event A given event B has occurred.
P(B|A) is the probability of event B given event A has occurred.

Update our prior beliefs/probabilities about an event based on new evidence/data

#### PREDICTOR PRIOR PROBABILITY
![[Pasted image 20230509131821.png]]

Step:
1. Cari probability class `P(c) = frequency/total`  
2. Cari probability class `P(x) = frequency/total`
3. Cari P(x | c) for every data -> P(x | c) total = P(x | c1) * P(x | c2) * P(x | c3) * ....
4. Masukkan ke rumus, lalu cari probabilitas yang lebih besar

### Avoiding 0 probability Theorem
Probabilitynya semuanya ditambah satu
Penyebutnya ditambah dengan jumlah Xnya
![[Pasted image 20230509143142.png]]

### Relational Database
Relational Database stores data in a structured way, with multiple tables that is connected on common attributes or keys
### OLAP vs  OLTP
- OLTP
  1. Database system to process transactions in real-time, such as sales, inventory management, etc. 
  2. Support high-volume, fast-paced transactions
  3. Focused on concistency and accuracy
- OLAP
  1. Designed for analytical processing, used in business intelligence (BI) and data warehousing applications
  2. Analyzing historical data to gain insights to business trends and patterns
  3. Optimized for complex queries and handling large data
  OLAP Techniques: 
	- Slice & Dice
	- Roll-up and Drill-down
	- Pivot

### Advanced Data Analysis: Data mining
Technique that are used to extract useful insight from large and complex datasets by finding hidden pattern, relationships, and trends among them. Several steps of data mining:
1. Daca cleaning & preparation
2. Feature selection
3. Model selection
4. Evaluation

Crisp-DM Structured approach to the entire data mining process
1. Business Understanding -> Understanding the project's requirements, constraints, and objectives.
2. Data Understanding -> Data is collected, explored and prepared
3. Data Preparation -> Data is cleaned, transformed, and preprocessed
4. Modelling -> Use Modelling techniques
5. Evaluation -> Effectiveness & Accuracy
6. Deployment -> Deployed into a production environment

#### CLASSIFICATION: DECISION TREES
Tree-like model that uses a series of binary decision to classify data. Model is trained on a labeled dataset, and each decision node splits the data based on the most informative feature.

Pendekatan yang digunakan adalah: Pendekatan entropy
![[Pasted image 20230509213743.png]]

