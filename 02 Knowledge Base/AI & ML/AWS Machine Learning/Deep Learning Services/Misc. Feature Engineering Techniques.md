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
`Some models prefer feature data to be normally distributed around 0 and most models require feature to be scaled to comparable values`

- To combat features with larger magnitudes getting more weight than they should
- Example: Modeling age and income as features → Incomes will be much higher values than ages

Scikit_learn has a preprocessor module that helps (MinMaxScaler, StandardScaler, etc.)

#### Shuffling
- Otherwise they may learn from residual signals in the training data resulting from the order in which they were collected


