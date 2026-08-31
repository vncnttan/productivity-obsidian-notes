R Studio 
Ganti nama
Create Project

Help di pojok kanan bawah

! Enter Sensitive

### Variable
`a = 10`
`b <- 'Clarissa'`
`'clarissa' -> c`
Jalanin Ctrl+Enter

### Print
``` r
print(a)
# Gabungin print angka dengan huruf
paste(a, 'ini angka genap')
```

### Hapus dari variabel
`rm(a)`

### List variable yang ada di env
`ls()`

### Hidden Variables
```r
.id <- 23
ls(all.names = TRUE)
```

### Delete All
``` r
rm(list = ls())
rm(list = ls(all.names = TRUE)) # Hapus semua termasuk yang hidden
```

1. Nama variable: angka, huruf, __
2. Gaboleh diawalin dengan angka
3. Variable yang diawalin dengan titik ga keliatan di environment

Data type 
1. double (semua angka bakal jadi datatype nya otomatis double)
2. int (`10L`)
3. char (gaada string)
4. logical (boolean)

### Check data type
```r
a <- 20
typeof(a) # Double

b <- 30L
typeof(b) # int

typeof(TRUE)
typeof(FALSE)
```


### Arithmatic
```r
d <- 10 + 10
```

## Logical Operator
``` r
FALSE & FALSE
TRUE & FALSE
```

### Vector (Array /  List)
c itu combine
dia otomatis jadi string kalo misalnya digabung sama string
index dimulai dari 1

buat bikin kayak range di python bisa pake : di combine
```r
vect <- c('vncnt', 'tan', 'nj', 20)
print(vect)
print(vect[2])
c(1:10)
```


### Matrix (Array 2d)
Argumen 1, isinya apa
nrow = berapa baris
ncol = berapa kolom
byrow = isi perbaris apa kolom
Ngambil bagian dari indexnya
```r
mtx <- matrix(1:8, nrow = 4, ncol = 2, byrow = TRUE)
mtx[2, 2]
```
![[Pasted image 20230622143359.png]]

```r
# Ngambil satu collumn ()
mtx[,1]

# Ngambil satu row ()
mtx[1,]

# [row, kolom]
```

### Conditional Branch
```r
if(5 %% 2){
  print('5 adalah genap') 
} else {
  print('5 adalah ganjil')
}
```

### Looping

``` r
# Foreach
for(i in vec){
  print(i)
}

# While
a <- 10
while(a <= 15){
  print(a)
  a <- a + 1
}
```


### Function
```r
two_squared <- function(a){
	return (a^2)
}

# Panggil functionnya
two_squared(10)
```

### Baca file
Ga semua file perlu di encoding,, kalo ada ... di nama kolomnya kasi aja encoding
``` r
detail <- read.csv('detail.csv')
games <- read.csv('Games.csv')
header <- read.csv('header.csv', fileEncoding = 'UTF-8-BOM')
participant <- read.csv('participant.csv', fileEncoding = 'UTF-8-BOM')
question <- read.csv('Question.csv', fileEncoding = 'UTF-8-BOM')
result <- read.csv('result.csv', fileEncoding = 'UTF-8-BOM')
```

### Preprocessing data
Data perlu di proses dlu sebelum di visualisasi
``` r
# Check if data null
is.na(detail) # TRUE ad null


# Bersihin data
detail_clean <- detail[ is.na(detail$GameId) == FALSE ,]
# Ambil data dari detail kalo is.na nya keluar false

# Kalau ketemu suatu string jadiin dia na
games <- read.csv('Games.csv', 
                  na.strings = c('N/A', ''))

# Cara nguli
detail_clean <- detail[ is.na(detail$GameId) == FALSE 
                    & is.na(detail$TransactionId) == FALSE 
                    & is.na(detail$Quantity) == FALSE, ]
 
# Cara ez
detail_clean <- detail[complete.cases(detail),]

# Ngambil table khusus
detail_clean <- detail[complete.cases(detail), "Quantity"]

detail <- detail[complete.cases(detail),]
games <- games[complete.cases(games),]
header <- header[complete.cases(header),]
participant <- participant[complete.cases(participant),]
question <- question[complete.cases(question),]
result <- result[complete.cases(result),]
```


### Filter
``` r
# Tanpa filter
games[, 'Name']

# Dengan filter
games[games$Year >= 2000 & games$Year <= 2005
      , 'Name']

# Ambil 200 data pertama
games[1:200, 'Name']

```


## Order / Sorting
```r
# Sorting
price_sort <- games[order(games$Price, decreasing = FALSE), ] # Automatically ascending, di buat decreasing false biar descending

# Show the result (5 data teratas)
price_sort[1:5]
```


### Count by value (GROUP BY COUNT di SQL)
```r
# count by value
year_games <- games[, 'Year']
table(year_games)
```

### Data Visualization
```r
# Bar chart
label_q1 <- c("Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree")

barplot(data_q1_table,
        col = rainbow(length(data_q1_table)),
        xlab = 'Answer',
        ylab = 'Frequency',
        ylim = c(0, 30),
	        main = "Frequency of Question 1 Result",
	        names.arg = label_q1)



# Plot Bar
year_plot <- games[, 'Year']

year_plot_table = table(year_plot)
plot(year_plot_table, type = 'p', col = "red")

# p = point
# l = line
# o = gabungan


legend (
  "topleft",
  legend = rownames(year_plot_table),
  cex = 0.5,
  col = rainbow(length(year_plot_table))
)

# boxplot 
quantity_boxplot <- detail[, 'Quantity']
boxplot(quantity_boxplot)


# pie chart
gender_participant <- participant[, 'Gender']
gender_table = table(gender_participant)
count_gender <- gender_table / sum(gender_table) * 100
pie(gender_table, radius = 1.5, labels = paste(count_gender, '%'))

```


### Summary from data
```r

# Get the summary
summary(quantity_boxplot)
summary(detail)

```

### Aggregate Functions

```r
sum(participant$Age)
min(participant$Age)
# jadi kayak group by
min_publisher <- aggregate(Price ~ Publisher, data = games, min)
```


### Join
``` r
header_detail = merge(detail, header, by = 'TransactionId')
```

### Splitting data
```r
split_data <- split(transaction_games$Name, transaction_games$TransactionId)

split_data
```

### Apriori
```r
# Apriori
header_detail = merge(detail, header, by = 'TransactionId')
transaction_games = merge(header_detail, games, by = 'GameId')

split_data <- split(transaction_games$Name, transaction_games$TransactionId)

split_data

install.packages('arules')

library('arules')
freq_itemset <- apriori(split_data,
                        parameter = list(
                          supp = 0.0000001,
                          conf = 0.0000002,
                          target = 'frequent itemset'))
inspect(freq_itemset)


assoc_rule <- ruleInduction(freq_itemset, 
                            confidence = 1)
inspect(assoc_rule)
```