---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
---
---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
banner_y: 0.35
---

Made by: NJ23-1 SLC - Vincent Tanjaya
- If and If…Else
- Nested If
- Switch…Case
- Ternary Operator


# If
[Java If ... Else (w3schools.com)](https://www.w3schools.com/java/java_conditions.asp)
If akan melakukan suatu block of code ketika suatu statement true. Statement bisa diisi dengan operasi comparative dan logical.
```java
if (Statement){
	// What happens if it's true
}
```

# If ... else....
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

# Nested If
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

# Switch…Case
[JavaScript Switch Statement (w3schools.com)](https://www.w3schools.com/js/js_switch.asp)

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

Di kasus ini apabila expression sama dengan x, maka code block 1 akan dijalankan.
Apabila expression sama dengan y, maka code block2 akan dijalankan. 
Jika semua case nya salah, maka case default akan dijalankan.

# Ternary Operator
Ternary Operator adalah operator shortcut dari conditional statement, jadi if-else statement disingkatkan menjadi one line of code dengan symbol `?` dan `:`

[Java Short Hand If...Else (Ternary Operator) (w3schools.com)](https://www.w3schools.com/java/java_conditions_shorthand.asp)


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






