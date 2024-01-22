---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
banner_y: 1
---

Made by: NJ23-1 SLC - Vincent Tanjaya
- Quiz
- Break Operation
- Continue Operation
- Label Operation
- Exception Handling

[Java Arrays (w3schools.com)](https://www.w3schools.com/java/java_arrays.asp)

[Break and Continue statement in Java - GeeksforGeeks](https://www.geeksforgeeks.org/break-and-continue-statement-in-java/)
# Break Operation
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


