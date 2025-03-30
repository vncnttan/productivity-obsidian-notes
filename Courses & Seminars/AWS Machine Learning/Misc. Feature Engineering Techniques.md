#### Binning
`Bucket observation together based on ranges of values` → Take numerical data then transform it to categorical data
- Used to covering up imprecision in the dataset
- Quantile Binning → Categorizes data based of their place in the data distribution → Have even sizes in each bins

#### Transforming
`Applying function to a feature to make it better suited for training`
- Good if the model specifically should handle non-linear data, etc.
#### Encoding
`Transforming data into some new representation required by the model`
Example → One-hot encoding
- Create buckets for each category
- Very common for deep learning where categories are represented by individual output “neurons”

#### Scaling / Normalization
