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

Dynamic Array adalah tipe array yang sudah diotomatisasi di Java sehingga ukurannya dinamis (mengikuti dengan isinya). Oleh karena itu kita tidak perlu menaruh ukurannya ketika kita membuat sebuah Dynamic Array. Controh dari Dynamic Array adalah Vector dan ArrayList

### Vector
Vector adalah salah satu contoh Dynamic Array yang dimiliki Java, untuk membuat sebuah vektor dapat menggunakan cara:
```java
Vector<E> v = new Vector<E>();
```

dimana v sekarang adalah variabel vektor kosong yang dapat kita isi dengan sesuatu. E dapat diganti dengan tipe data yang kita mau jadikan sebagai array, bisa Integer, Character, ataupun String

contoh: 
```java
Vector<Integer> numbers = new Vector<Integer>();
```

`Jangan lupa untuk menggunakan autocomplete ctrl + spasi untuk mempermudah pengetikan dan otomatis import package yang diperlukan.`
Nanti code berikut akan muncul setelah kita menggunakan autocompletenya
```java
import java.util.Vector;
```
Tanpa package, maka akan error dan code tidak dapat dijalankan.


### ArrayList
Untuk membuat ArrayList sama persis caranya dengan Vector hanyasaja kata Vector diganti dengan ArrayList
```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
```

`notes: Jangan lupa untuk nama variabel tidak boleh duplikat/sama`

---
### Add
Untuk mengisi vector dapat digunakan method add yang tersedia di objek vektor/arrayList
```java
Vector<Integer> numbers = new Vector<Integer>()
numbers.add(5)
numbers.add(10)
numbers.add(11)
```

### Get
Untuk mengakses elemen tertentu di suatu dynamic ArrayList dapat digunakan method get. Method get akan mengembalikan elemen pada index tertentu. 
`Ingat, index dimulai dari 0`

```java
System.out.println(numbers.get(0)); // Mengakses elemen pertama di suatu vektor 
System.out.println(numbers.get(2)); // Mengakses elemen ketiga di suatu vektor
System.out.println(numbers.get(3)); // Mengakses elemen keempat di suatu vektor
```

### Set
Untuk mengubah/mengupdate elemen yang ada pada index tertentu dapat digunakan method set.
```java
numbers.set(0, 13); // Elemen atribut pertama akan diganti dengan angka 13
sentences.set(2, 7);
```

### Remove
Untuk menghapus elemen yang ada pada index tertentu, dapat digunakan method remove.
```java
numbers.remove(1);
```

### Method lainnya yang bisa dipakai
- Size: mendapatkan ukuran dynamic Array
- Clear: menghapus semua element pada dynamic Array

### Perbedaan antara Array List and Vector:
![[Pasted image 20230728082805.png]]

1. **Sinkronisasi**:
    - **Vector**: Disinkronisasi, yang berarti aman untuk multi-thread. Namun, ini juga berarti operasinya sedikit lebih lambat karena overhead sinkronisasi.
    - **ArrayList**: Tidak disinkronisasi, yang berarti tidak secara inheren aman untuk multi-thread.
2. **Performa**:
    - **Vector**: Karena metodenya yang disinkronisasi, umumnya lebih lambat dibandingkan `ArrayList` ketika Anda tidak membutuhkan keamanan thread.
    - **ArrayList**: Lebih cepat karena tidak disinkronisasi.
3. **Peningkatan Kapasitas**:
    - **Vector**: Jika elemen melebihi kapasitas saat ini, kapasitasnya akan meningkat sebesar peningkatan tertentu. Jika peningkatan tidak ditentukan, ukuran arraynya akan digandakan.
    - **ArrayList**: Meningkatkan ukuran arraynya sebesar 50% dari ukuran array saat ini jika elemen melebihi kapasitasnya.

