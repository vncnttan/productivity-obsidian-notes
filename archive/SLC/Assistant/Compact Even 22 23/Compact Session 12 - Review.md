 Made by: NJ23-1 SLC - Vincent Tanjaya
- Review

	Notes: Autocomplete di JAVA penting karena dengan autocomplete, Java akan otomatis handle importing package yang diperlukan. Untuk menggunakan Autocomplete, gunakan shortcut `ctrl + space`

# VBL:
[COMP6178 - Introduction to Programming](https://binusianorg-my.sharepoint.com/personal/vincent_tanjaya_binus_edu/_layouts/15/guestaccess.aspx?guestaccesstoken=PIbDtimyone4uM1IoB9TYohjBM6tqM7lL8yCT3hQaAw%3D&folderid=2_0878d4078777241399831167de3c83ce5&rev=1&e=0aI3Xt)


# Session 1

## Comment
Untuk membuat comment pada code, bisa digunakan 
`//`
atau bisa menggunakan `ctrl + /`

## Output
Untuk printing, dapat digunakan `sysout` lalu ctrl click
1. `System.out.print("Hello world");`
	Printing without adding a new line
2. `System.out.println("Hello world");`
	Printing with a new line
	Shortcut: `sout` 

## Input
Make a scanner object:
`Scanner scanner_object_name = new Scanner(System.in);`

then uses that object to scan!
`int var_name = scanner_object_name.nextInt();` 


## Variables and Data types
To make a global and unchangeable variable, you can add `final` before the data type in the variable declaration. If that variable changes, an error will occur.
### Data Types
#### Primitives and Objects:
Primitives
	Data type mendasar dari JAVA
	![[Pasted image 20220731122958.png]]
	To declare a primitives:
	`int number = 5;`


### Escape Character
[Escape Sequence in C - javatpoint](https://www.javatpoint.com/escape-sequence-in-c)
Escape character adalah lambang-lambang yang bisa diambil dengan menggunakan `\ + character` dimana character ini sesuai dengan apa yang kita mau
![[Pasted image 20230714150045.png]]

## Name Convention
Name Convention di Java adalah menggunakan `camelCase`, artinya untuk kata selanjutnya akan dijadikan satu kata dengan huruf kapital sedangkan huruf pertama akan dijadikan huruf non-kapital

---
# Session 2

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

---
# Session 3

## Operator and Operand
Operator adalah sesuatu yang akan dioperasikan (biasanya angka)
Operand adalah operasi yang akan dilkasanakan

## Mathematics Operation
` + - * / % `

``` 
+ digunakan untuk pertambahan
- digunakan untuk pengurangan
* digunakan untuk perkalian
/ digunakan untuk pembagian
% digunakan untuk modulo (mendapatkan sisa dari pembagian)
```

# Bitwise Operator
` & | ^ ~ << >>`
Operator Bitwise digunakan untuk melakukan operasi dalam tingkat bit

```
& BITWISE AND - akan menghasilkan bit 1 jika kedua bitnya 1
| BITWISE OR  - akan menghasilkan bit 1 jika salah satu bitnya 0
^ BITWISE XOR - akan menghasilkan bit 1 jika kedua bitnya berbeda
~ BITWISE Complement - akan menghasilkan bit 0 jika bit awalnya 1, menghasilkan bit 1 jika bit awalnya 0 (mencari komplemen dari suatu byte)
<< BITWISE LEFT SHIFT - akan menghasilkan bit baru yang berisi bit lama yang di shift (digeser ke kiri sebanyak berapa kali sesuai dengan operatornya)
>> BITWISE RIGHT SHIFT - akan menghasilkan bit baru yang berisi bit lama yang di shift (digeser ke kanan sebanyak berapa kali sesuai dengan operatornya)
```


# Comparative Operator
` == != > < >= <=`
Comparative Operator digunakan untuk melakukan perbandingan antara 2 operand

```
== - digunakan untuk mengecek apabila kedua operand sama 
!= - digunakan untuk mengecek apabila kedua operand berbeda
>  - digunakan untuk mengecek apabila operand kiri lebih dari operand kanan
<  - digunakan untuk mengecek apabila operand kiri kurang dari operand kanan
>= - digunakan untuk mengecek apabila operand kiri lebih dari sama dengan operand kanan
<= - digunakan untu mengecek apabila operand kiri kurang dari sama dengan operand kanan
```

# Logical Operator
` && || ! `
Logical Operator digunakan untuk mengkombinasikan beberapa conditional statement

```
&& - digunakan untuk mengecek apabila kedua statement benar
|| - digunakan untuk mengecek apabila salah satu statement benar
!  - akan menghasilkan true jika statement salah, akan menghasilkan false jika statement benar
```

# Precedence and Associative Operators
Operator dalam JAVA sudah otomatis dilakukan sesuai dengan precedence (urutan matematis), seperti yang kita pelajari sesuai dengan bahasa manusia. Contohnya, walaupun operasi yang dilaksanakan adalah
`2 + 5 x 6`, kita akan melaksanakan perkalian `5 x 6` dahulu baru ditambahkan dua.
![[Pasted image 20230714181612.png]]

Associativity Operator adalah bagaimana operator dilakukan, operator dilaksanakan, apakah dari kiri ke kanan, atau dari kanan ke kiri. Contohnya operasi pembagian akan dilaksanakan dari kiri ke kanan. Artinya operand kanan akan dibagi operand kiri.
![[Pasted image 20230714182802.png]]

---
# Session 4

## If
[Java If ... Else (w3schools.com)](https://www.w3schools.com/java/java_conditions.asp)
If akan melakukan suatu block of code ketika suatu statement true. Statement bisa diisi dengan operasi comparative dan logical.
```java
if (Statement){
	// What happens if it's true
}
```

## If ... else....
Else akan dijalankan jika statement 1 gagal.
Else if akan mengecek statement 2, jika statement 2 berhasil maka block of codenya akan dijalankan. 
Else akan dijalankan jika semua statement gagal.

``` java
if (Statement){
	// What happens if it's true
} else if (Statement2){
	// What happens if statement 2 is true
} else {
	// What happens if none are true
}
```

## Nested If
Nested if artinya ada if di dalam if. If dapat dimasukkan ke dalam if, artinya pengecekan ini akan dijalankan jika statement if luarnya sudah benar (lolos).

``` java
if (Statement1){
	// What happens if it's true
} else if (Statement2){
	// What happens if statement 2 is true
	
	if(Statement3){
		// Statement 3 will be checked again inside of the statement 2 block. Jika statement 1 benar, maka statement 3 tidak akan dicek lagi karena statement 3 sudah unreachable (karena ifnya berada dalam block statement 2) 
	}
	
} else {
	// What happens if none are true
	
}
```

## Switch…Case
Switch case akan mengecek expression yang ada di argumen, apakah sama dengan salah satu case yang diberikan, jumlah case yang diberikan bisa bervariasi bergantung dengan kebutuhan. 
``` java
switch(expression) {  
  case x:  
    // code block1
        break;  
  case y:  
    // code block2
        break;  
  default:  
    // code block3
}
```

## Ternary Operator
Ternary Operator adalah operator shortcut dari conditional statement, jadi if-else statement disingkatkan menjadi one line of code dengan symbol `?` dan `:`
Contoh pemakaian:
```java
int number = 1;
if(number < 2){
	System.out.println("Number is less than 2");
} else if (number == 2){
	System.out.println("Number equals 2");
} else {
	System.out.println("Number is greater than 2");
}

// Dapat disingkat menjadi
int number = 1;
String message = number < 2 ? "Number is less than 2": number == 2 ? "Number equals to 2" : "Number is greater than 2";

System.out.println(message);
```

---
# Session 5

Loop adalah function yang dapat digunakan untuk melakukan suatu code of block secara berulang-ulang sesuai dengan syarat yang diberikan. Jika syarat yang diberikan selalu benar, maka akan terjadi infinite looping, yang artinya looping tidak terhentikan. Pastikan syarat berhenti dapat terpenuhi di dalam code of blocksnya tersebut.

## for
For loop merupakan loop yang count based, artinya kita memberikan jumlah secara numerik yang akan dimodifikasi untuk setiap iterasinya. Biasanya digunakan untuk melakukan iterasi yang berulang sebanyak beberapa kali
``` java
for (int i = 0; i < 10; i++) {
	// do something that will be repeated 10 times
}
```

Argument1 - Argumen yang akan dijalankan saat loop pertama kali dijalankan
`int i = 0`
Argument2 - Argumen yang akan dicek sebelum memulai iterasi/perulangan selanjutnya
`i < 10`
Argument3 - Argumen yang di lakukan untuk setiap iterasinya
`i++`
Notes: Argument3 akan dijalankan dulu, baru selanjutnya argument 2 akan dicek

# while
While loop akan dijalankan selama statement yang dijadikan sebagai parameter **true**. Jika salah, maka akan dimulai kode perulangan berikutnya. Di setiap iterasinya statement akan dicek.
``` java
while (statement){
	// do something until statement is true
	// remember to modify variable that was used in the statement too so the statement is eventually become true and you're not stuck in a loop.
}
```

## do... while
Sama dengan while, perbedaannya saar pertama kali kodenya masuk ke dalam loop, statement nya akan tidak di cek terlebih dahulu, Sehingga block of code yang ada di dalam do while loop akan dijalankan minimal sekali. Sedangkan dalam while loop, jika kondisi di dalam statement sudah salah, maka kode di dalam blocknya tidak akan dijalankan sama sekali. 
``` java
do {
 // some code
} while (statement);
```

---
# Session 6

## Break Operation
Break Operation adalah operasi menghentikan satu tingkat loop secara paksa. Program akan dilanjutkan seperti saat program keluar dari Loop.

untuk menjalankan break, biasanya statement break akan dimasukkan ke dalam if statement, jika kondisi itu terpenuhi maka program akan dikeluarkan dari loop secara paksa.

Statement break:
`break;`

# Continue Operation
Continue Operation adalah operasi melanjutkan loop secara paksa. Sehingga kode yang berada di bawah continue tidak akan dijalankan, melainkan program akan diskip ke iterasi / perulangan selanjutnya. 

Statement Continue
`continue;`

# Label Operation
[Adding Labels to Method and Functions in Java - GeeksforGeeks](https://www.geeksforgeeks.org/adding-labels-to-method-and-functions-in-java/)
Sebenarnya Label Breaking merupakan salah satu metode yang depreceated dalam Java, sehingga direkomendasikan untuk menggunakan Break dan Continue.

Label Operation memungkinkan kita memberikan label pada suatu loop, sehingga, kita dapat langsung break operation loop di tingkat tertentu

Contoh penggunaan Label:
``` java
labelA:
while(condition1){
	while(condition2){
		if(condition3){
			break; // Ini akan break satu layer saja sehingga selanjutnya akan dilanjutkan iterasi while1 selama condition1 tidak terpenuhi
		} 
		if(condition4){
			break labelA; // Artinya while yang diberi label A (while paling luar) akan di break, maka tidak dilanjutkan dengan repetisi lagi
		}
	}
}
```

# Exception Handling
[Exception Handling in Java | Java Exceptions - javatpoint](https://www.javatpoint.com/exception-handling-in-java)
Exception Handling adalah mekanisme di JAVA yang menangkap Error yang mungkin terjadi saat menjalankan aplikasi dengan program tertentu.

Biasanya ketika terjadi Runtime Error maka program akan berhenti, namun dengan exception handling, kita dapat melanjutkan program dengan *seamless*, tanpa menghentikan program, lalu kita akan instruksikan apa yang dapat dilakukan program untuk menggantikan error tersebut. Misalnya:

``` java
try{  
    //code yang mungkin menghasilkan error  
    int data=100/0;  
}catch(ArithmeticException e){ 
	System.out.println("Terdapat Error dalam membagi 100 dengan 0");
}  
// Sebagai parameternya kita dapat memasukkan semua error exception yang mungkin terjadi, disini Exception yang ditangkap adalah Arithmetic Exception, yaitu Exception dalam melakukan operasi Matematika.
```

---
# Session 7

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

---
# Session 8

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

### ArrayList
Untuk membuat ArrayList sama persis caranya dengan Vector hanyasaja kata Vector diganti dengan ArrayList
```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
```

`notes: Jangan lupa untuk nama variabel tidak boleh duplikat/sama`

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

---
# Session 9

``` java
// Contoh pembuatan method
type name (parameter) {
	// statement
}
```

### Method
Method adalah sekumpulan statement program yang diberi sebuah nama agar bisa dipanggil dan dieksekusi secara bersamaan. 

Untuk membuat method menggunakan struktur berikut:
Notes:
`Sebuah deklarasi method berada di luar method / constructor lainnya, tetapi masih di dalam suatu class`

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

## Global Scope
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

---
# Session 10

Sorting adalah suatu algoritma yang digunakan untuk mengurutkan suatu data yang berada di dalam suatu array (statis maupun dinamis).
[Sorting (Bubble, Selection, Insertion, Merge, Quick, Counting, Radix) - VisuAlgo](https://visualgo.net/en/sorting?slide=1)

Sorting dapat dilakukan untuk mencapai urutan ***Ascending*** atau ***Descending***

Sebelum di sort, siapkan dulu bahan-bahan yang dibutuhkan dalam mensorting.
##### Array acak yang akan di urutkan
``` java
int[] arr = {20, 19, 28, 22, 132, 100};

void printArray(){
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println(); // Untuk mengeprint enter / new line 
}
```

##### Function swap
Untuk banyak algoritma, kita akan menggunakan swap untuk menukar urutan yang ada di suatu array
```java
void swap(int a, int b){
	int c = arr[a];
	arr[a] = arr[b];
	arr[b] = c;
}
```

### Bubble Sort
[Bubble Sort - Data Structure and Algorithm Tutorials - GeeksforGeeks](https://www.geeksforgeeks.org/bubble-sort/)
Bubble Sort adalah algoritma sort yang akan membandingkan tiap elemen pada array dengan satu elemen di sebelahnya secara berulang-ulang.
Jika posisi mereka tertukar (yang lebih besar seharusnya dikanan misalnya) maka tukar posisi mereka.

Contoh visualisasi untuk sekali iterasi (Ascending):
![[Pasted image 20230728093919.png]]
![[Pasted image 20230728093908.png]]

Visualisasi untuk bubble sort secara lengkap (Descending):
![[Pasted image 20230728094049.png]]

Code untuk bubble sort
```java
void bubbleSort(){
	for(int i = 0; i < arr.length; i++){
		for (int j = 0; j < arr.length - i - 1; j++){
			// Untuk ascending kita akan menukar apabila angka yang di kiri lebih besar dari angka di sebelah kanannya
			if(arr[j] > arr[j + 1]){
				swap(j, j + 1);
			}
		}
	}
}
```

### Selection Sort
Selection Sort adalah algoritma yang akan mencari nilai paling ujung, lalu terjadi penukaran. Berikutnya dilanjutkan agar akhirnya dari ujung secara satu persatu akan terurut.

### Insertion Sort
Insertion sort adalah algoritma sorting yang akan mengecek dan memindahkan sebuah elemen ke sebelah kiri selama nilai elemen tersebut sesuai lebih kecil (untuk ascending) dibandingkan dengan nilai elemen di kirinya

### Merge Sort
Merge sort adalah suatu algoritma sorting yang menerapkan *divide and conquer*. Algoritma merge sort lebih efisien dibandingkan dengan algoritma lainnya, namun memiliki pengertian dan implementasi yang lebih advanced dari algoritma sorting lainnya.

Merge sort akan memecah array-array menjadi array yang lebih kecil hingga arraynya terdivide jadi hanya 2 elemen. Lalu ketika sudah array akan dibandingkan dan diurutkan dari elemen terkecil hingga terbesar, kemudian dimasukkan kembali ke array utama.

---
# Session 11

Object Oriented Programming (OOP) adalah metode pendekatan dalam pemrograman dimana masalah dapat dipecahkan menggunakan objek dan class, sama seperti di dunia nyata dimana ada banyak objek yang melakukan sesuatu.

### Class and Object
Class adalah sebuah blueprint untuk menciptakan objek untuk membantu pembuatan kode yang lebih terstruktur.

Class adalah tipe data yang kita define sendiri, terdiri dari attribute dan method.

Attribute adalah data-data yang ada di objek tersebut, contohnya: di meja, atributnya ada bentuk, bahan, warna, dan lain sebagainya.

Method adalah action yang dapat dilakukan oleh objek tersebut, sama seperti method yang dibahas di materi sebelumnya, method dapat return hasil dari methodnya.

Untuk membuat sebuah class kita bisa menggunakan shortcut **alt+shift+N+C**. Hal ini akan memunculkan popup window dibawah ini. 
Kemudian isilah package dan nama Class sesuai kebutuhan.

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

### Inheritance
Inheritance adalah metode penurunan sifat dari suatu class ke class lainnya. Inheritance digunakan untuk mempermudah ketika beberapa class memiliki atribut yang sama.

Contohnya class Fish dan class Bird, karena keduanya adalah hewan, memiliki beberapa atribut sama seperti nama, umur dan lainnya. Maka, sebaiknya kita buat class `Animal` untuk mengakomodasi kedua class tersebut lalu baru menurunkan sifat-sifatnya ke kedua class tersebut.

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

### Abstraction
Abstraction pada OOP kita gunakan untuk mendefinisikan attribute dan method apa saja yang harus dimiliki sebuah class, untuk memastikan children class dari class tersebut memiliki attribute dan method yang sesuai.

Jenis Abstraction ada 2:
1. Abstract Class, berfungsi sebagai Parent Class saja, tidak bisa dibuat instance objek baru. Abstract Class akan mengeluarkan Error apabila dibuat `new AbstractClass()`
2. Interface, memungkinan sebuah Class untuk memiliki banyak parent (inherit dari banyak class).


