NJ 23-1 – Vincent Tanjaya

---
### Simple Linear Regression
Linear Regression is a statistical modelling technique that assumes a linear relationship between the variables (independent variable and dependent variable). Independent variable is a variable that value can be changed to be the predictor/explanatory variable, while dependent variable is variable that is measured as an outcome by the influence of the dependent variable.

Example:  
Independent variable: Time to study  
Dependent variable: Student’s grade

The goal is to find the best-fit line that minimizes the overall distance between the observed data points and the predicted values on the line. The line is represented by a linear equation of the form:

` Y = b0 + b1x `

Y = Dependent variable  
x = Independent variable  
b0 = Intercept (The value if x = 0)  
b1 = Coefficient (Estimated slope)

``` Excel
B2: HitsStart(x independent variable)
B101: HitsEnd(x independent variable)
C2: RevenueStart(y independent variable)
C101: RevenueEnd(y independent variable)

- Correlation: The stength and direction of the linear relationship between the independent variable and the dependent variable. 
=CORREL(B2:B101, C2:C101)

- Standard Deviation: The spread of a dataset.
=STDEV(C2:C101)

- Mean: The average value in the sheet
=AVERAGE(C2:C101)

- Regression Coefficient: Show the change in dependent variable in response to the independent variable.
= Correlation * StdevRevenue / StdevHits

- Intercept: The value of dependent variable(y) if the independent variable  (x) is 0
= AVGRevenue - RegressionCoef * AVGHits

- Forecast: When did the point reach the point in the predict value  
= Intercept + RegressionCoef * predictValue 
= b0 + b1 x
```

---
### Multiple Regression
Multiple regression is used to model the relationship between a dependent variable and multiple independent variables 

` Y = b0 + b1x1 + b2x2 `

Y = Dependent variable  
x1 = Independent variable 1
x2 = Independent variable 2
b0 = Intercept (The value if x = 0)  
b1 = Coefficient 1 (Estimated slope) 
b2 = Coefficient 2 (Estimated slope)

Composite Variable is the combination of the multiple independent variable so that it can be operated for a regression value.

``` Excel
B2: HitsStart(x independent variable)
B101: HitsEnd(x independent variable)

=CORREL(B2:B101, CompositeVariableStart:CompositeVariableEnd)

- Forecast: When did the point reach the point in the predict value  
= Intercept + RegressionCoef1 * predictValue1 + RegressionCoef2 * predictValue2
= b0 + b1 * x1 + b2 * x2
```

---
### Moving Average
Moving average is a statistical method used to analyze time-series data by smoothing out fluctuation, finding pattern in the data, and identifying trends over time.
- Smoothing: Smoothing refers to the process of removing noise or random fluctuations from a time-series data set in order to identify underlying trends and patterns.
- Tracking: Tracking refers to the process of following changes in a time-series data set over time, in order to identify and understand the dynamics of the system being observed.
``` Excel
Average by 2 time value
Result1 = (y1 + y2)/2
Result2 = (y2 + y3)/2
Result3 = (y3 + y4)/2

Average by 3 time value
Result1 = (y1 + y2 + y3)/3
Result2 = (y2 + y3 + y4)/3
Result3 = (y3 + y4 + y5)/3
```

#### WEIGHTED MOVING GRAPHS
Weighted moving average (WMA) is a statistical method used to smooth out time-series data by assigning different weights to the data points in the moving average calculation.
``` Excel
Average by 2 time value
Result1 = (y1 * w1 + y2 * w2)
Result2 = (y2 * w2 + y3 * w3)
Result3 = (y3 * w3 + y4 * w4)
...

Average by 3 time value
Result1 = (y1 * w1 + y2 * w2 + y3 * w3)
Result2 = (y2 * w2 + y3 * w3 + y4 * w4)
...
```

` w1 + w2 + ... + wn = 1 `

#### EXPONENTIAL MOVING AVERAGE
Exponential Moving Average gives more weight to more recent observations in the data, and gradually decreasing the weight of older observations as time passes.

` S(t) = α * Y(t) + (1-α) * S(t-1) `

S(t) = Smoothed value at time t
Y(t) = Actual value at time t
S(t-1) = Smoothed value at time t-1
α = Smoothing parameter

```Excel
Rumus S
= alpha * y + (1-alpha) * S yang diatas 
```

---
### Forecasting With Regression
Forecasting with regression refers to using regression to make predictions or forecasts about future dependent variable based on past observations.

``` Excel
Trend() and LINEST()
Trend: statistical function used to calculate the linear trendline that best fits a set of data points
=TREND(Ystart:Yend, Xstart:Xend)

Linest: used to calculate the slope and intercept of the regression line, which can be used to make predictions about future values based on the historical data.
=LINEST(Ystart:Yend, Xstart:Xend)
```

---
### Logistic Regression
Logistic regression is a statistical method used to analyze data with a binary outcome (0 or 1). The basic idea behind logistic regression is to use a logistic function, also known as a sigmoid function, to model the relationship between the independent variables and the probability of the binary outcome.

Sigmoid Function
` p = 1 / (1 + e^(-z)) `
p: probability of the binary outcome
z: linear combination of linear variable

` z = β0 + β1x1 + β2x2 + ... + βnxn `
β0, β1, β2, ..., βn : The coefficients of the logistic regression model
x1, x2, ..., xn: The values of the independent variables.


Cara untuk mencari Logistic Regression di Excel: 
Data diisi terlebih dahulu di excel, mulai dari logit hingga Log likelihoodnya
![[Pasted image 20230506223533.png]]
![[Pasted image 20230506223623.png]]

Lalu log likelihoodnya di `=SUM()`


Atau bisa juga menggunakan Solver Parameter dengan Changing Variable Cells Intercept, Income, Age, Zipcode
![[Pasted image 20230506223902.png]]