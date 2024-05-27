---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
banner_y: 0.485
---
Made by: NJ23-1 SLC - Vincent Tanjaya
- ArrayList
- Vector

[Static Array in Java - Javatpoint](https://www.javatpoint.com/static-array-in-java#:~:text=Difference%20Between%20Static%20Array%20and%20Dynamic%20Array&text=Static%20arrays%20are%20allocated%20memory,of%20dynamic%20array%20is%20fixed.)
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
[Vector vs ArrayList in Java - GeeksforGeeks](https://www.geeksforgeeks.org/vector-vs-arraylist-java/)