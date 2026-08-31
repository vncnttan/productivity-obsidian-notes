`Fully-managed service to deliver highly accurate forecasts with ML`

- “AutoML” → Choose the best model for you
	- ARIMA, [[AWS - DeepAR Sagemaker]], ETS, NPTS, Prophet
- Works with any time series
- Based on “dataset groups”, “predictors”, and “forecasts”

Forecast algorithm
- CNN-QR
	- `CNN - Quantile Regression`
	- Best for large dataset with hundreds of time series
	- Accepts related historical time series data & metadata
- DeepAR+
	- [[AWS - DeepAR Sagemaker]]+
	- Best for large dataset with hundreds of time series
	- Accepts related forward-looking time series & metadata
- Prophet
	- Best for medium dataset
	- Additive model with non-linear trends and seasonality
- NPTS
	- Non-Parametric Time Series
	- Best for simple dataset
	- Good for sparse data, has variants for seasonal / climatological forecasts
- ARIMA
	- Autoregressive Integrated Moving Average
	- Best for simple dataset
- ETS
	- Exponential Smoothing
	- Best for simple dataset