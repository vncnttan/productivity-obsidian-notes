---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
banner_y: 0
---
Made by: NJ23-1 SLC - Vincent Tanjaya
- Input and Output
- Variable and Primitive Data Type
- Import
- Naming Convention
- Compile Program

# Set Up Eclipse
Untuk yang masih belum memiliki software eclipse, dapat mengikuti tutorial berikut
https://academic600.notion.site/Eclipse-03228c4f9956436dabdfcd92c5811991

# Membuat projek baru
Sebelum mempelajari JAVA, kita perlu membuat projek baru. Jika kalian masih belum mengerti cara membuat projek baru, dapat mengikuti tutorial di bawah

# Membuat Class baru
Klik kanan pada bagian src project, pilih New > pilih Class
![[Pasted image 20230717092622.png]]
isi pagian project name dan package, secara convention diberikan nama
![[Pasted image 20230717092843.png]]
Class main akan otomatis terbuat, buat new Main() untuk memulai memanggil objek Main.
![[Pasted image 20230717100538.png]]
Coba untuk membuat `System.out.println("Hello World");` di bagian public Main() lalu click `>` di bagian (Run). seharusnya akan muncul hasilnya di bagian console.

## Comment
Untuk membuat comment pada code, bisa digunakan 
`//`
atau bisa menggunakan `ctrl + /`

## Output

NOTES: Untuk menggunakan autocomplete, dapat menggunakan `ctrl + space`, 

Untuk printing, dapat digunakan `sysout` lalu ctrl spasi

1. `System.out.print("Hello world");`
	Printing without adding a new line
2. `System.out.println("Hello world");`
	Printing with a new line
	Shortcut: `sout` 
3. `System.out.printf("Hello %1$s, Score: %2$.2f", "world", points);`
	Formatted Print
	Format : %<font color="red">[Index$]</font><font color="green">[Flag]</font><font color="orange">[Width]</font><font color="pink">[.Presisi]</font>[data_type]
	*colored white: required*
	to append new line add *%n* in the end
	Untuk penjelasan mengenai data type bisa di cek di bawah
	
	example:
	complete version: System.out.printf("%<font color='red'>1$</font><font color="green">+</font><font color="orange">10</font><font color="pink">.2</font>f", 0.123);
	minimum version: System.out.printf("%f", 0.123);

## Input
*Import java.util.Scanner* akan otomatis muncul setelah menggunakan autocomplete (ctrl + space)

Make a scanner object:
`Scanner scanner_object_name = new Scanner(System.in);`

then uses that object to scan!
`int var_name = scanner_object_name.nextInt();` 
![[Pasted image 20220804223038.png]]

*Setelah menggunakan method input yang berhubungan dengan angka (nextByte, nextShort, nextInt, nextLong, nextFloat, nextDouble), jangan lupa untuk menambahkan method nextLine. Hal ini dikarenakan input yang berhubungan dengan angka tidak menghilangkan karakter enter sehingga perlu dihilangkan dengan menggunakan nextLine.*


# Variables and Data types
To make a global and unchangeable variable, you can add `final` before the data type in the variable declaration. If that variable changes, an error will occur.
### Data Types
#### Primitives and Objects:
Primitives
	Data type mendasar dari JAVA
	![[Pasted image 20220731122958.png]]
	To declare a primitives:
	`int number = 5;`

### Import
`import package_name;`
Akan otomatis ditambahkan jika menggunakan autocomplete (ctrl + click) 

### Compile Program
Untuk menjalankan program, bisa menggunakan lambang Run di bagian atas Eclipse, lalu program akan di jalankan di bagian console
![[Pasted image 20230714145455.png]]

### Escape Character
[Escape Sequence in C - javatpoint](https://www.javatpoint.com/escape-sequence-in-c)
Escape character adalah lambang-lambang yang bisa diambil dengan menggunakan `\ + character` dimana character ini sesuai dengan apa yang kita mau
![[Pasted image 20230714150045.png]]

Contohnya adalah jika kita ingin print ENTER atau print karakter di baris baru
kita dapat menggunakan NewLine 
`\n`

### Name Convention
Name Convention di Java adalah menggunakan `camelCase`, artinya untuk kata selanjutnya akan dijadikan satu kata dengan huruf kapital sedangkan huruf pertama akan dijadikan huruf non-kapital
