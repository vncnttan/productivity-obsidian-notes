`Large discrepancy between "positive" and "negative" cases`
-  Mainly a problem with neural network

Oversampling
- Duplicates samples from the minority class
- Can be done at random

Undersampling
- Instead of creating more positive samples, remove negative ones

SMOTE → Synthetic Minority Oversampling TEchnique
- Artificially generate new samples of the minority class using nearest neighbors
- Both generates new samples and undersamples majority class
- Generally better than just oversampling

Adjusting Threshold
- When making predictions about a classification, you have some sort of 
- Guaranteed to reduce false positives, but could result in more false negatives
