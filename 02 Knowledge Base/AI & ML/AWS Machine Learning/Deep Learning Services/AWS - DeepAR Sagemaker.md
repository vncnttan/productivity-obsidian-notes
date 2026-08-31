`Forcasting one-dimensional time series data`

- uses RNN
- Find Frequencies and Seasonalities as well

Inputs:
- JSON lines format
	- Gzip or Parquet
- Each record must contain: **Start** and **Target**
- Each record can contain: **Dynamic_feat** and **cat (categorical features)**

How it is used:
- Include the entire time series
- Use entire dataset as training set, remove last time points for testing. Evaluate on withheld values
- Don’t use very large values for prediction length (> 400)
- Train on many time series and not just one when possible


Instance Types:
- CPU / GPU
- Single or Multi Machine
- Start with CPU (ml.c4.2xlarge, ml.c4.4xlarge), then only move up to GPU if necessary
- CPU-only for inference
- May need larger instances for tuning