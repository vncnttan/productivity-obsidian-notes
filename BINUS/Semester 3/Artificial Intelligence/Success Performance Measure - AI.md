Concept of Rationality
- Accuracy
	- Cares about wrong and right answers (True Positive & True Negatives) from the whole test set
- Recall
	- Cares about false negatives (TP / TP + FN)
	- Example: Fraud Detection (do not want fraud not detected, it is better to detect “non-fraud“ as precaution)
- Precision
	- Cares about false positives more (TP / TP + FP)
	- Example: Drug Testing (do not want to accuse someone of doing drugs when they are not)

F-1:
- F-mesasure
- F-score

- ROC/AUC
	- Receiver Operating Characteristic Curve
	- Plot of TP vs. FP at various threshold settings
	- The more bent toward upper left, the better
	- AUC (Area Under Curve), calculates the area under the curve, the bigger the better


- P-R Curve → Precision Recall Curve
	- Good: Higher area under the curve
	- Good for information retrieval

