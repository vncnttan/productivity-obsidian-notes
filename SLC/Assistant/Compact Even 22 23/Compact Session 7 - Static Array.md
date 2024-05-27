---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
banner_y: 0.485
---
Made by: NJ23-1 SLC - Vincent Tanjaya
- Array 1D and 2D

[Belajar Java: Menggunakan Array untuk Menyimpan Banyak Hal (petanikode.com)](https://www.petanikode.com/java-array/)

Array digunakan untuk menyimpan beberapa data ke dalam variabel secara berurutan, sehingga kita dapat menyimpan beberapa variabel ke tipe data yang sama ke dalam satu variabel.

Jadi kita tidak perlu mendeklarasikan variabel satu persatu, seperti:

```java
String nama1 = "budi"
String nama2 = "andi"
String nama3 = "sudi"
String nama4 = "dira"
```

Kita dapat menyimpan banyak variabel ke dalam satu variabel
Ada beberapa cara untuk membuat Array di Java
```java
// Mendeklarasikan tanpa objeknya, sehingga tidak perlu digunakan 
String[] nama;

// Mendeklarasikan tanpa objeknya, sehingga tidak perlu digunakan 
String nama[];

// Mendeklarasikan langsung beserta tipe datanya, sehingga dapat dimasukkan dengan beberapa variabel tipe data yang sama. 
String[] nama = new String[5];
// Disini sizenya adalah 5, artinya kita dapat menyimpan 5 variabel di tipe data tersebut, sehingga indeks array yang diakses dapat dimulai dari 0 hingga 4 (size - 1)

// Memasukkan secara satu persatu
nama[0] = "Linda";
nama[1] = "Santi";
nama[2] = "Susan";
nama[3] = "Mila";

// Mendeklarasikan langsung memberikan isinya
String[] nama = {"budi", "andi", "sudi", "dira"}

```

# Mengakses Array
Untuk mengakses Array, kita dapat mengambil datanya dengan cara memasukkan index dari variabel yang kita mau akses. 

Index adalah urutan data variabel dimasukkan ke dalam array. Index array dimulai dari 0 sampai size - 1.
```java
System.out.println(nama[0]);

Result:
>> budi
```

Kita juga dapat menggunakan for loop untuk mengakses semua data di dalam array.

```java
// Mengakses Array menggunakan for loop
for(int i - 0; i<nama.length(); i++){
	System.out.println("Indeks ke - " + i + " namanya : " + nama);
}
```



# Array 2 Dimensi
Array Multi Dimensi adalah Array yang lebih dari 1 dimensi, artinya ada Array di dalam suatu Array yang besar. Array Multi Dimensi dapat digunakan untuk membuat table yang berisi beberapa data secara berurutan.

Contohnya misalnya kita mau menyimpan tabel mahasiswa yang berisi dari NIM dan namanya:
``` java
String [][] mahasiswa = {
	{"25901263", "budi"},
	{"25192873", "andi"},
	... // dan seterusnya
}
```

### Mengakses Array 2 Dimensi
Untuk mengakses array 2 dimensi, kita harus memberikan indeks yang diperlukan dalam mengakses array pertama dan kedua.
```java
System.out.println(mahasiswa[0][1]);

// Yang artinya data yang di akses adalah data di baris index 0 dengan kolom index 1, yaitu budi

Result:
>> budi
```

# PRACTICE
Lakukan system print menggunakan array 2 dimensi berikut sehingga program dapat memberikan output semua informasi mahasiswa beserta NIMnya

Berikut data yang akan digunakan:
![[Pasted image 20230715095204.png]]

Output yang diinginkan adalah

```java
- LIST MAHASISWA -

NIM: 2508928221
NAMA: ABEL
MAJOR CODE: CS
JURUSAN: Computer Science

NIM: 2508922833
NAMA: ANDI
MAJOR CODE: SI
JURUSAN: System of Information
// ... dan seterusnya
```

