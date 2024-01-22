---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
banner_y: 0.675
---
Made by: NJ23-1 SLC - Vincent Tanjaya
- Operator and Operand
- Arithmetic Operators
- Assignment Operators
- Relational Operators
- Logical Operators
- Bitwise Operators
- Precedence and Associative Operators

## Operator and Operand
Operator adalah sesuatu yang akan dioperasikan (biasanya angka)
Operand adalah operasi yang akan dilkasanakan

contoh: 
`2 + 3 = 5`
Operatornya adalah `2 dan 3`
Operandnya adalah `+`

## Mathematics Operation
` + - * / % `

``` 
+ digunakan untuk pertambahan
- digunakan untuk pengurangan
* digunakan untuk perkalian
/ digunakan untuk pembagian
% digunakan untuk modulo (mendapatkan sisa dari pembagian)
```

Contoh: 
``` java
int a = 10;
int b = 20;

int c = a + b;
System.out.println(c)

Hasil
>> 30
```

# Bitwise Operator
` & | ^ ~ << >>`
Operator Bitwise digunakan untuk melakukan operasi dalam tingkat bit

[Java Bitwise and Shift Operators (With Examples) (programiz.com)](https://www.programiz.com/java-programming/bitwise-operators)
```
& BITWISE AND - akan menghasilkan bit 1 jika kedua bitnya 1
| BITWISE OR  - akan menghasilkan bit 1 jika salah satu bitnya 0
^ BITWISE XOR - akan menghasilkan bit 1 jika kedua bitnya berbeda
~ BITWISE Complement - akan menghasilkan bit 0 jika bit awalnya 1, menghasilkan bit 1 jika bit awalnya 0 (mencari komplemen dari suatu byte)
<< BITWISE LEFT SHIFT - akan menghasilkan bit baru yang berisi bit lama yang di shift (digeser ke kiri sebanyak berapa kali sesuai dengan operatornya)
>> BITWISE RIGHT SHIFT - akan menghasilkan bit baru yang berisi bit lama yang di shift (digeser ke kanan sebanyak berapa kali sesuai dengan operatornya)
```

Contoh:
```
contoh 12 & 25
00001100 (12)
00011001 (25)
---------------&
00001000 (8)
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

Contoh:
```
contoh 17 >= 10 

System.out.println(17 >= 10) 
>> Hasil : TRUE
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
[Operator precedence and associativity - IBM Documentation](https://www.ibm.com/docs/en/zos/2.4.0?topic=operators-operator-precedence-associativity)
[Java Operator Precedence (programiz.com)](https://www.programiz.com/java-programming/operator-precedence)
[Associativity of Operators in Java - Javatpoint](https://www.javatpoint.com/associativity-of-operators-in-java)

Operator dalam JAVA sudah otomatis dilakukan sesuai dengan precedence (urutan matematis), seperti yang kita pelajari sesuai dengan bahasa manusia. Contohnya, walaupun operasi yang dilaksanakan adalah
`2 + 5 x 6`, kita akan melaksanakan perkalian `5 x 6` dahulu baru ditambahkan dua.

Jadi perkalian memiliki precedence yang lebih tinggi daripada pertambahan, untuk precedence yang lebih lengkap dapat dilihat dari tabel ini

![[Pasted image 20230714181612.png]]


Associativity Operator adalah bagaimana operator dilakukan, operator dilaksanakan, apakah dari kiri ke kanan, atau dari kanan ke kiri. Contohnya operasi pembagian akan dilaksanakan dari kiri ke kanan. Artinya operand kanan akan dibagi operand kiri.

![[Pasted image 20230714182802.png]]

