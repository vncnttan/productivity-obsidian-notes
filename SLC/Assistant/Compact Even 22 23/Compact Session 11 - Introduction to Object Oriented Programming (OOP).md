---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
banner_y: 0.485
---

Made by: NJ23-1 SLC - Vincent Tanjaya
- Class and Object
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

[Introduction of Object Oriented Programming - GeeksforGeeks](https://www.geeksforgeeks.org/introduction-of-object-oriented-programming/)
Object Oriented Programming (OOP) adalah metode pendekatan dalam pemrograman dimana masalah dapat dipecahkan menggunakan objek dan class, sama seperti di dunia nyata dimana ada banyak objek yang melakukan sesuatu.

### Class and Object
Class adalah sebuah blueprint untuk menciptakan objek untuk membantu pembuatan kode yang lebih terstruktur.

Class adalah tipe data yang kita define sendiri, terdiri dari attribute dan method.

Attribute adalah data-data yang ada di objek tersebut, contohnya: di meja, atributnya ada bentuk, bahan, warna, dan lain sebagainya.

Method adalah action yang dapat dilakukan oleh objek tersebut, sama seperti method yang dibahas di materi sebelumnya, method dapat return hasil dari methodnya.

Untuk membuat sebuah class kita bisa menggunakan shortcut **alt+shift+N+C**. Hal ini akan memunculkan popup window dibawah ini. 
Kemudian isilah package dan nama Class sesuai kebutuhan.

Contohnya kita membuat object animal.
![[Pasted image 20230728115210.png]]

### Attributes
Attributes adalah variabel yang berisi ciri-ciri yang dimiliki oleh suatu objek. Contoh: 
```java
public class Animal{
	String name;
	int age;
}
```

### Constructor
Constructor adalah method yang pertama kali dipanggil ketika suatu objek dibuat, biasanya digunakan untuk mengisi objek dengan atribut-atributnya
```java
public class Animal{
	String name;
	int age;

	// Ini constructor yang dibuat
	public Animal(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}
}
```

Cara  membuat objek, akan memanggil constructornya secara sekaligus
```java
// Membuat object baru
Animal myNewCat = new Animal("Cat", 3);

// Cara mengakses atribut dari suatu objek yaitu menggunakan titik
System.out.println(a.name);
System.out.println(a.age);
```

### Method
Method adalah block of code yang akan dieksekusi oleh suatu objek. Contoh:
```java
public class Animal{
	String name;
	int age;

	public Animal(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}

	// Ini Method yang dibuat dari objek animal
	// Contohnya adalah membuat sebuah kucing makan, kita menganaloginya dengan dia mencetak namakucingnya sedang makan
	void eat(){
		System.out.println(name + " is eating...");
	}
}
```

Cara memanggil methodnya:
``` java
Animal myNewCat = new Animal("Cat", 3);

System.out.println(myNewCat.name);
System.out.println(myNewCat.age);

// Memanggil method disini
myNewCat.eat();
```

### Encapsulation
[Access modifiers in java - Javatpoint](https://www.javatpoint.com/access-modifiers)
Encapsulation pada OOP adalah cara yang digunakan untuk membatasi akses dari sebuah atribut atau objek yang dimiliki dari sebuah Class. 

Encapsulation memastikan atribut dan objek diakses di class yang benar, dan menghilangkan ambiguitas dalam kode, sehingga atribut yang privat dan tidak boleh diketahui oleh class lain dapat dipastikan tidak dipanggil di class lain.

Terdapat ***Access Modifier*** yang membatasi bagaimana suatu atribut dapat diakses, untuk perbedaannya dapat dilihat di tabel berikut,

![[Pasted image 20230728120552.png]]

Untuk mengimplementasikan encapsulation kita dapat memodifikasi atribut atribut dari `myNewAnimal` menjadi private

```java
public class Animal{
	private String name;
	private int age;

	public Animal(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}

	// Ini Method yang dibuat dari objek animal
	// Contohnya adalah membuat sebuah kucing makan, kita menganaloginya dengan dia mencetak namakucingnya sedang makan
	void eat(){
		System.out.println(name + " is eating...");
	}
}
```

Ini akan mengeluarkan error jika kita mencoba mengaksesnya dari class Main kita, maka kita akan membuat getters dan setter


Untuk shortcut yang dapat digunakan adalah **alt + shift + s + r** pada class Animal.

![[Pasted image 20230728120940.png]]
Setelah muncul pop up seperti ini, maka centang kedua atribut yang akan kita berikan getter dan setter, kemudian click tombol *Generate*

Nanti akan terbuat Getter dan Setter di Class Animal kita
![[Pasted image 20230728121051.png]]

Sekarang jika kita ingin mengakses atribut pada class Animal kita dapat menggunakan get method yang kita buat, (begitu juga ketika kita ingin mengupdate atribut dari Animal kita).

```java
Animal myNewCat = new Animal("Cat", 3);

System.out.println(myNewCat.getName());
System.out.println(myNewCat.getAge());

myNewCat.eat();
```

### Inheritance
Inheritance adalah metode penurunan sifat dari suatu class ke class lainnya. Inheritance digunakan untuk mempermudah ketika beberapa class memiliki atribut yang sama.

Contohnya class Fish dan class Bird, karena keduanya adalah hewan, memiliki beberapa atribut sama seperti nama, umur dan lainnya. Maka, sebaiknya kita buat class `Animal` untuk mengakomodasi kedua class tersebut lalu baru menurunkan sifat-sifatnya ke kedua class tersebut.

Untuk membuat class baru bisa digunakan shortcut yang sama seperti sebelumnya, yaitu **alt+shift+N+C**. Kita buat 3 class:
- Animal
- Fish 
- Bird

Selanjutnya kita buat `Fish` untuk inherit dari `Animal`nya
![[Pasted image 20230728122721.png]]
Sekarang tinggal di klik saja bagian `Add constructor 'Fish(String, int)'`

Nanti akan terbuat constructor seperti ini
![[Pasted image 20230728122851.png]]

Lakukan hal yang sama untuk Bird. Sekarang bird dan fish memiliki atribut age dan name sendiri.

``` java
Fish f = new Fish("fish", 3);
Bird b = new Bird("bird", 2);
```

### Polymorphism
Polymorphism adalah konsep dimana sebuah object atau method dapat memiliki bentuk dan berubah bentuk. Ada 4 macam polymorphism:
1. Upcasting
   Type casting dari child class menjadi parent classnya. Pengertian mengenai casting dapat dilihat di materi sesi 3.
2. Downcasting
   Type casting dari parent class menjadi child classnya. (hanya berhasil untuk parent class yang merupakan hasil dari upcasting child classnya)
3. Overloading
   Pembuatan method dengan nama yang sama, tetapi jumlah/tipe data parameter yang berbeda.
4. Overriding
   Pembuatan method dengan nama yang sama antara child class dan parent class, untuk overriding, class yang akan dipakai adalah class dari childnya. 

``` java
Bird myNewBird = new Bird("Tweety", 4);

// Upcasting 
Animal a = (Animal) b;

Bird b = null;

// Downcasting
if(a instanceof Bird){
	b = (Bird) a;
}
```

```java
// Overloading
void namaMethod(){
	System.out.println("Haloo");
}

void namaMethod(String name){
	System.out.println("Haloo " + name);
}
```

```java
public class Animal{
	private String name;
	private int age;

	public Animal(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}

	void eat(){
		System.out.println(name + " is eating...");
	}
}

// Overriding
public class Fish extends Animal {
	public Fish (String name, int age){
		super(name, age);
	}

	@Override
	public eat(){
		System.out.println(name " is a bird and it is eating");
	}
}
```

### Abstraction
Abstraction pada OOP kita gunakan untuk mendefinisikan attribute dan method apa saja yang harus dimiliki sebuah class, untuk memastikan children class dari class tersebut memiliki attribute dan method yang sesuai.

Jenis Abstraction ada 2:
1. Abstract Class, berfungsi sebagai Parent Class saja, tidak bisa dibuat instance objek baru. Abstract Class akan mengeluarkan Error apabila dibuat `new AbstractClass()`
   
   Cara membuat abstract class:
   `public abstract class Animal{ ...`

2. Interface, memungkinan sebuah Class untuk memiliki banyak parent (inherit dari banyak class). Untuk membuat interface dapat digunakan **Alt + Shift + N + I.**
![[Pasted image 20230728125411.png]]

Namakan interface yang dibuat sesuai dengan kebutuhan, pada contoh ini kita buat Interface Move

1. Buat method yang ingin kita aplikasikan ke class lain
   ![[Pasted image 20230728125556.png]]
2. Di class dimana kita akan menginherit, berikan kata kunci implements 
   `public class Fish extends Animal implements Move`
3. Ketika mengimplement sebuah interface awalnya muncul error apabila di dalamnya belum terdapat method pada class dengan nama yang sama, maka hover saja errornya lalu pilih `Add unimplemented methods`
   ![[Pasted image 20230728125600.png]]
4. Kemudian akan muncul method baru di child class mengenai method-method yang diberikan interface
   ![[Pasted image 20230728125848.png]]