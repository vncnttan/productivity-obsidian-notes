---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
banner_y: 0.895
---
Made by: NJ23-1 SLC - Vincent Tanjaya
- Wrapper Class
- Type Casting
- Math
- String
- Random

# VBL:
[COMP6178 - Introduction to Programming](https://binusianorg-my.sharepoint.com/personal/vincent_tanjaya_binus_edu/_layouts/15/guestaccess.aspx?guestaccesstoken=PIbDtimyone4uM1IoB9TYohjBM6tqM7lL8yCT3hQaAw%3D&folderid=2_0878d4078777241399831167de3c83ce5&rev=1&e=0aI3Xt)

## Wrapper Class
Wrapper Class adalah tipe data yang memiliki beberapa method di dalamnya, sehingga kita dapat modifikasi.
[Java Wrapper Classes (w3schools.com)](https://www.w3schools.com/java/java_wrapper_classes.asp)

![[Pasted image 20230714151706.png]]
Wrapper Class memiliki ukuran yang lebih besar, tetapi memiliki fungsionalitas yang lebih banyak, contohnya kita dapat mencari panjang dari suatu string.

### Type Casting
Type Casting digunakan untuk mengconvert atau mengcasting variabel dari suatu tipe data ke tipe data lain.
1. Implicit Type Casting
	Sebenarnya untuk beberapa tipe data (seperti dari int ke long, kita dapat langsung assign ke variabel baru) 
	`int i = 10;`
	`long l = i;`
2. Explicit Type Casting
	Untuk mengcasting variabel lainnya dapat digunakan explicit casting, yaitu menggunakan dalam kurung data type tujuannya.
	`long l = 100;`
	`int i = (int) l;`

Note: Jika type data tidak dapat di convert, maka akan muncul error.


# Math
[Java Math (w3schools.com)](https://www.w3schools.com/java/java_math.asp)
Math adalah Class di Java yang memiliki beberapa fungsionalitas matematika dalam angka

Contoh yang sering dipakai: 
- Math.max(x, y) - Menemukan angka maksimal antara x dan y
- Math.min(x, y) - Menemukan angka minimal antara x dan y
- Math.sqrt(x) - Menemukan angka akar dari x
- Math.abs(x) - Menemukan nilai absolut dari x
- Math.random() - Menemukan angka random/acak antara 0.0 dengan 1.0

# String
[Java String - javatpoint](https://www.javatpoint.com/java-string)

Contoh penggunaan method adalah:
``` java
String namaVariabel = "abcdef";
System.out.println(namaVariabel.charAt(0));
```

String adalah salah satu contoh wrapper class data type yang memiliki banyak method, di antaranya:
- charAt(int index) - Menemukan character di urutan index tertentu
- contains(String subsequence) - Menemukan apakah subsequence dengan urutan tertentu ada di suatu string 
- startsWith(String subsequence) - Menemukan apakah subsequence terdapat di awal string tersebut
- endsWith(String subsequence) - Menemukan apakah subsequence terdapat di akhir string tersebut
- equals(String subsequence) - Menemukan apakah string method tersebut sama dengan parameternya
- isEmpty() - Menemukan apakah string ada isinya atau kosong
- length() - Menemukan panjang dari string
- replace(String subsequence1, String subsequence2) - Mengganti semua subsequence 1 yang ada di string dengan subsequence 2. 


Contohnya:

``` java
String variabel = "ABC";
variabel.replace("B", "XYZ");
System.out.println(variabel);

Hasil:
>> AXYZC
```

- split(String subsequence) - Memisahkan string menjadi beberapa string yang dipisahkan dalam subsequence tersebut

- toUpperCase() - Mengkapitalisasi semua character di dalam suatu string
- toLowerCase() - Menjadikan semua character di dalam suatu string menjadi huruf kecil

## Random
Untuk membuat random number di Java kita dapat menggunakan Class Random di Java

```java
import java.util.Random; // Import akan di generate secara otomatis jika menggunakan autocomplete Random. Jadi tidak perlu ditambahkan secara manual 

Random rand = new Random();

// Generate Random Number antara 1 - 9 (10 di eksklusifkan)
...
	int n = rand.nextInt(10);
...
```

