---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
banner_y: 0.485
---

Made by: NJ23-1 SLC - Vincent Tanjaya
- Method and Parameter
- Variable Scope

### Method
Method adalah sekumpulan statement program yang diberi sebuah nama agar bisa dipanggil dan dieksekusi secara bersamaan. 

Untuk membuat method menggunakan struktur berikut:
``` java
type name (parameter) {
	// statement
}
```

Notes:
`Sebuah deklarasi method berada di luar method / constructor lainnya, tetapi masih di dalam suatu class`

```java
public class Main{
	// Method yang dibuat
	void cetakHelloWorld(){
		System.out.println("Hello world!");
	}
	
	public Main(){
		// Kode akan dijalankan dari sini
		cetakHelloWorld(); // Di line ini kita memanggil method di atas.
	}

	public static void main(String args[]) {
		new Main();
	}
}

Result:
>> Hello world!
```

### Parameter
Parameter adalah variabel yang menyimpan sebuah nilai, nilai ini diberikan ketika kita memanggil sebuah method. Sehingga ketika method dijalankan, method tersebut memiliki variabel yang diberikan oleh parameternya

`Jumlah parameter di suatu method bebas sesuai dengan kebutuhan`
```java
public class Main{
	// Method yang dibuat
	void penjumlahan(int angka1, int angka2){
		System.out.println(angka1, angka2);
	}
	
	public Main(){
		// Kode akan dijalankan dari sini
		int number = 10
		int number2 = 20
		cetakHelloWorld(number, number2); // Di line ini kita memanggil method di atas, sehingga method akan terpanggil dan memberikan juga variabel number sebagai 
	}

	public static void main(String args[]) {
		new Main();
	}
}

Result:
>> 30
```

## Scope
[Java Scope (w3schools.com)](https://www.w3schools.com/java/java_scope.asp)
Scope adalah tempat/area dimana suatu variabel dapat diakses,, dan di Java, untuk penggunaan method, variabel hanya dapat digunakan di method yang sama.
``` java
public class Main{
	// Method yang dibuat
	void penjumlahan(){
		System.out.println(angka1 + angka2); // Line ini akan memunculkan error karena angka1 dan angka2 dideklarasi di 2 method yang berbeda
	}
	
	public Main(){
		// Kode akan dijalankan dari sini
		int angka1 = 10
		int angka2 = 20
		penjumlahan(); // Di line ini kita memanggil method di atas, sehingga method akan terpanggil dan memberikan juga variabel number sebagai 
	}

	public static void main(String args[]) {
		new Main();
	}
}

Result:
>> 30
```
Contoh visualisasi dari scope:
![[Pasted image 20230728091339.png]]

Untuk menggunakan variabel dari suatu method ke method lainnya, variabel dapat di passing melalui **parameter**.

### Global Scope
Variabel yang di deklarasi di luar suatu method (masih di dalam class) dapat diakses oleh semua method yang ada di class tersebut.
Contoh visualisasi class:
![[Pasted image 20230728091719.png]]

### Return
Method dapat mengembalikan suatu variabel sebagai hasil dari suatu method.

type yang diberikan ketika membuat suatu method adalah tipe data yang akan di return oleh method tersebut.

Contoh:
``` java 
public class Main{
	// Jangan lupa disini type data methodnya diganti dengan type data yang akan di return
	int penjumlahan(int angka1, int angka2){
		return angka1 + angka2);
	}
	
	public Main(){
		// Kode akan dijalankan dari sini
		int number1 = 10
		int number2 = 20
		int hasil = penjumlahan(number1, number2);
		System.out.println(hasil);
	}

	public static void main(String args[]) {
		new Main();
	}
}

Result:
>> 30
```



