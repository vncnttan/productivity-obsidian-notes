Regression
Training menggunakan Neural Network

Regression -> Predict Data
-> Data sebelumnya
-> Kalkulasi data keseluruhan


Variable independent -> Data training
Variable dependent -> Output

``` excel
=CORREL(range1; range2) => Seberapa kedua data berhubungan
=AVERAGE(range1) => Rata-rata
=STDEV(range1) => Menghitung seberapa beda penyimpangan data kita dari rata-rata

Regression Coefficient: 
Correlation * stddev(output) / stddev(input) 

Intercept:
Mean(Dependent) - Regression Coefficient * Mean(Independent)

Forecast
Coefficient * data + B

=LINEST(Dependent, Independent) => Menghasilkan Regression Coefficient dan Intercept
```
Block semua data kebawah
ctrl + shift + ⬇️

Untuk debug
Formula > Evaluate Formula 

Linear regression : 
`A * data + B`
A = Regression coefficient
B = Interecept


Option > Add-in option > Go > Centang 2 (Analysis Toolpak dan Solver Add-In)
![[Pasted image 20230829101413.png]]


Data > Data analysis
![[Pasted image 20230829101852.png]]

![[Pasted image 20230829101943.png]]



```excel
Multiple Regression
Langsung pakai linest aja dia bakal ngehasilin coefficient data independent dari kanan ke kiri, baru terakhir ngehasilin data interceptnya

Forecast
Coefficient * data + B
```

F4 untuk absolute cell copying

Trend can be made manually using 
`Coefficient1 *data1 + coefficient2 * data2 +... + intercept`
or can be made using the trend function
![[Pasted image 20230829104513.png]]

![[Holts Model]]
![[Logistic Regression]]
![[Moving Average]]
![[Naive bayes]]
![[Predictive Analytics]]
![[Smoothing]]
![[Weighted Moving Average]]

