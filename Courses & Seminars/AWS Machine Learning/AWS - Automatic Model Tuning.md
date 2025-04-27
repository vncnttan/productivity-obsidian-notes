`Define the hyperparameters you care about and the ranges you want to try & the metrics you are optimizing for, then Hyperpamarter Tuning Job will train as many combinations as you allow.`

**It learns as it goes** → so it doesn’t have to try every possible combination

### Best Practices:
- Don’t try too optimize too many hyperparameters at once
- Limit your ranges to as smalll a range as possible
- Use logarithmic scales when appropriate
- Don’t run too many training job concurrently
- Make sure training jobs running on multiple instances report the correct objective metric in the end