### Import data
tinggal di import data terus di klik

kalau mau ganti nama kolom klik dua kali

sambungin output dengan res

### Filter Examples
![[Pasted image 20230623095010.png]]
Klik add filter terus masukkin filternya apa
![[Pasted image 20230623094956.png]]


### Set role
buat tentuin label (kolom apa yang mau diprediksi)
target role biasanya label

![[Pasted image 20230623095136.png]]

Result: 
![[Pasted image 20230623095223.png]]
Customer Id bakal jadi special attribute


### Create Attribute
Biasanya  buat data yang perlu dibersihin
atau bisa juga buat buang dollar gituu
![[Pasted image 20230623095358.png]]

Result:
![[Pasted image 20230623095506.png]]


Pencet kalkulator kita bisa disini extract nama depan
![[Pasted image 20230623095749.png]]
Kalau nama atributnya sama, dia bakal nge replace
Result:
![[Pasted image 20230623095858.png]]

### Sample
Buat ngambil berapa banyak data doang
![[Pasted image 20230623100028.png]]

### Generate Id, generate satu kolom baru untuk ID

### Pivot 
Group By and Aggregate
![[Pasted image 20230623100234.png]]
![[Pasted image 20230623100244.png]]

### Replace
![[Pasted image 20230623100423.png]]
Kalo nemu no dia bakal ganti sama unmarried
![[Pasted image 20230623100452.png]]
Buat pilih atribut / kolom apa yg mau diganti


Replace Missing Values -> Ganti data kosong dengan apa
![[Pasted image 20230623100614.png]]

### Rename
Untuk rename attribute
![[Pasted image 20230623100736.png]]

### Cut
Potong/Ambil berapa char
![[Pasted image 20230623100918.png]]

Result:
![[Pasted image 20230623100931.png]]


![[Pasted image 20230623101112.png]]
Pilih atributnya kalo tipe data nya beda di atribut yang berbeda
Result:
![[Pasted image 20230623101328.png]]

### Discretion by frequency
![[Pasted image 20230623101654.png]]

Result:
![[Pasted image 20230623101619.png]]

### Select Attributes
Munculin attribut apa aja
![[Pasted image 20230623101848.png]]
invert: munculin semua kecuali salary income


### Parse Number
Typecast data jadi number
![[Pasted image 20230623102014.png]]


### Normalize
Normalisasi angka jadi lebih kecil agar model jadi lebih akurat
![[Pasted image 20230623102258.png]]
Result:
![[Pasted image 20230623102311.png]]


Bersihin data dari yang kosong
**![[Pasted image 20230623104155.png]]**


Clustering k countnya ikutin mau berapa cluster 


Dibikin aja averagenya terus di map
cluster_0 = free
cluster_1 = not free



densities = 1 - distance asli