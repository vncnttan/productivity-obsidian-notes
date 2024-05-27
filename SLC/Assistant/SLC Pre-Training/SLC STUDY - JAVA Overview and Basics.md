#### Source:
[CS50 Java](https://www.youtube.com/watch?v=UaxRRO9175A&t=814s&ab_channel=CS50) ✔️
[Javal Module 1 BINUS SLC](https://www.youtube.com/watch?v=hR0_aBQIJ8Y&list=PLeZILlyfDhh4HetKY72UoUlnSFJZsfxvL&index=3&ab_channel=SLCSoftwareLaboratoryCenter) ✔️
[JavaI Module 2 BINUS SLC](https://www.youtube.com/watch?v=A0z8Zg_TQiI&list=PLeZILlyfDhh4HetKY72UoUlnSFJZsfxvL&index=4) ✔️
[Diktat Pengenalan Java](file:///C:/Users/vince/Documents/BINUS/BLUEJACK%20nar/Module/Diktat%20Pengenalan%20Java%20Konsol.pdf) ✔️

Context:
IDE: Eclipse on Java SE 18

### Overview:
- Object-oriented Programming Language
- Everything revolves with the object that you create and the classes that you define
### Java Structure:
On a project, you can click new on the src and make a new class.

Fields: All of our objects
Methods: What all of our object can do
*method has parantheses that we put after them*
Constructor: Method to create objects
Destructor: To free memory (in JAVA s)

### Printing Hello world on console
*SimpleOutput.java*
``` java
public class SimpleOutput {
	public static void main(string[] args) {
		System.out.println("Hello World");
	}
}
```
To compile and run on console, just need to `ctrl + F11` or click the play(run) button in the eclipse bar

`public class SimpleOutput{ ... }`
Java Header is always this to define the class. *SimpleOutput is the name of the file*. 

Behind the scenes of `ctrl + F11`, if you want to run code on linux terminal:
$ javac SimpleOutput.java
	produces a `SimpleOutput.class`
$ java SimpleOutput
	run the code

JVM will search for exactly `public static void main(String[] args){ ... }` to run the program. It will spit out an error if any one of the keyword is not included. Why this behind the scene:
- void: there is no return to the user
	`the main method is always void, unlike C that expects integer returns. non-void method expects a return that then can be assigned to an object`
- string[] args: accept args from user if provided
	`it will accept all of the argument in the terminal from the user if provided, you don't need to define how big is the array. Unlike C, the args[0] is not our run command, but something after it that was actually used in programs`
		e.g:
		$ java SimpleOutput Hello World "This is vncnt"
		args[0] == Hello
		args[1] == World
		args[2] == This is vncnt
- static: code that runs without needed to create an object beforehand
	`the main method is always get the static keyword because how can you make an object without running anything first? Usually then in the main you can make another object and then call non-static method.`

---
# Variables and Data types
To declare a variable you can do it just like in C
To make a global and unchangeable variable, you can add `final` before the data type in the variable declaration. If that variable changes, an error will occur.
### Data Types
#### Primitives and Objects:
Object:
	Object is a special class in java that usually refer to any particular object, so it `pass the variable by reference` and can have a method inside of them. For simplicity, example of object is:
	1. Arrays
	2. Strings
	3. Classes
	4. Interfaces
	Important for Vector and arrayList
	To declare an object:
	`String name = new String("Vincent Tanjaya");`
Primitives
	An object that is easier to create and manipulate, but is `passed by value`
	![[Pasted image 20220731122958.png]]
	To declare a primitives:
	`int number = 5;`

#### Type Casting
Conversion or type casting is used to convert a data type to another
1. Implicit Type Casting
	To convert variable data type to a bigger type (type that takes more memory than former ones). Java will handle it all for you! 
	`int i = 10;`
	`long l = i;`
	p.s. you need to make sure the data type is available in the former data type, for example you can convert a character to an integer, an error will occured.
	`Error! Reference source not found!`
2. Explicit Type Casting
	To convert a variable into a bigger data type.
	`long l = 100;`
	`int i = (int) l;`
	p.s. because of this, the data in the variable can be inaccurate. There will maybe a truncation.
	p.s2 make sure the data you given is the same too!

Read more on *Name Conventions* on creating name for variables [Name Conventions](file:///C:/Users/vince/Documents/BINUS/BLUEJACK%20nar/Module/Diktat%20Pengenalan%20Java%20Konsol.pdf) page 15

# Basic Input and Output
Import, Output and Input:
### Import
`import package_name;`
![[Pasted image 20220731132227.png]]
*implementation: the 'scan' is the variable name for the object scanner*
## Output
1. `System.out.print("Hello world");`
	Printing without adding a new line
2. `System.out.println("Hello world");`
	Printing with a new line
	Shortcut: `sout` 
3. `System.out.printf("Hello %1$s, Score: %2$.2f", "world", points);`
	Formatted Print
	Format : %<font color="red">[Index$]</font><font color="yellow">[Flag]</font><font color="orange">[Width]</font><font color="pink">[.Presisi]</font>[data_type]
	*colored white: required*
	to append new line add *%n* in the end
	
	example:
	complete version: System.out.printf("%<font color='red'>1$</font><font color="yellow">+</font><font color="orange">10</font><font color="pink">.2</font>f", 0.123);
	minimum version: System.out.printf("%f", 0.123);
	
	<font color="red">[Index$]</font>
	*optional*
	to define position
	
	*System.out.printf("%2$s %1\$s", World, Hello)*
	`Hello World`
	<font color="yellow">[Flag]</font>
	*optional*
	to change output settings
	![[Pasted image 20220801214622.png]]
	
	System.out.printf("%10s", "Hi")
	`         Hi`
	System.out.printf("%-10s", "Hi")
	`Hi         `
	<font color="orange">[Width]</font>
	*optional*
	Define the minimum character width, if the character exceeds it, the width will be ignored and it will be printed just fine
	
	System.out.printf("%10s", "Hi")
	`         Hi`
	System.out.printf("%10s", "Annyeonghaseyo")
	`Annyeonghaseyo`
	
	<font color="pink">[.Presisi]</font>
	*optional* - *float(decimal) only*
	to define how many number will be truncated/appended with 0 for floats
	System.out.printf("%.3f", 0.12345)
	'0.123'
	System.out.printf("%.7f", 123.456)
	'123.4560000'
	
	[data_type]
	placeholder symbol type of data you provided that will be printed

## Input
*Import java.util.Scanner*

Make a scanner object:
`Scanner scanner_object_name = new Scanner(System.in);`

then uses that object to scan!
`int var_name = scanner_object_name.nextInt();` 
![[Pasted image 20220804223038.png]]
*Setelah menggunakan method input yang berhubungan dengan angka (nextByte, nextShort, nextInt, nextLong, nextFloat, nextDouble), jangan lupa untuk menambahkan method nextLine. Hal ini dikarenakan input yang berhubungan dengan angka tidak menghilangkan karakter enter sehingga perlu dihilangkan dengan menggunakan nextLine.**
# Operator
### Mathematics Operation
` + - * / % ++ -- `
### Bitwise Operator
[[SLC STUDY - C Overview and Basics#Operator Bitwise]]

` & | ^ ~ << >>`
### Comparative Operator
` == != > < >= <=`
### Logical Operator
` && || ! `
# Seleksi
### if ... else....
``` java
if (Statement){
	// What happens if it's true
} else if (Statement2){
	// What happens if statement 2 is true
} else {
	// What happens if none are true
}
```
### switch... case...
``` java
switch (var_name){
case 'A': {
	// what happens if var_name == 'A'
	break;
}
case 'B': {
	// Some codes again in this case
	break;
}
default: {
	// Codes if no case matches the var_name
	break;
}
}
```
# Repetition
### for
``` java
for (int i = 0; i < 10; i++) {
	// do something that will be repeated 10 times
}
```
### while
``` java
while (statement){
	// do something until statement is true
	// remember to modify variable that was used in the statement too so the statement is eventually become true and you're not stuck in a loop.
}
```
### do... while
``` java
do {
 // some code
} while (statement);
```

# Static Array
## 1D Array
To store more than one data with one type together
``` java
example_Array_1D

int scores[] = new int[10];
scores[0] = 1;

int grades[] = {23, 78, 92, 24};
grades array size will automatically be [4]
```
![[Pasted image 20220807151124.png]]

### Cloning Array
*you need to declare both array first and initialize the arr_src*

There is shallow copy (copy the reference) and deep copy (copy the value)
1. copy the reference - one change in data will change in another, kind of pointless
	`arr_des = arr_src;`
2. copy the value
	a. using looping
	b. clone method
	`arr_des = arr_src.clone();`
	c. System.arraycopy method
	`System.arraycopy(arr_src, 0, arr_des, arr_src.length);`

## 2D Array (and more than 2)
``` java
example_Array_2D

int scores[][] = new int[10][2];
scores[0][0] = 1;

int grades[][] = {
					{23, 78, 92, 24},
					{22, 12, 13, 23},
				};
grades array size will be [2][4]!
```
![[Pasted image 20220807151423.png]]

# Dynamic Array
## Overview

Same with `trie, nodelist, hash tables, etc.` in C, Dynamic Array is an array that can grow and shrink in size. But, unlike C, Java have make an object that automatically do that for you, so **you don't need to stress about mallocs and pointer**, or memories lost when your linked list bridge snapped. The two example object made in Java is Vector and ArrayList. They'll automatically grow if you have added objects to them more than their capacity.

Vector and ArrayList behave the same with different features. ArrayList is *unsynchronized and not thread-safe*, whereas Vectors are. Only one thread can call methods on a Vector at a time, which is a slight overhead, but helpful when safety is a concern. Therefore, in a single-threaded case, arrayList is the obvious choice, but where multithreading is concerned, **vectors are often preferable**.

## Basic Functionality
1. Declaration
	``` java
	Example_Declare_dynamicArray
	
   Vector<String> students = new Vector<>();
   ArrayList<String> teachers = new Arraylist<>();
	```
2. Adding things
	``` java
	Example_Adding_dynamicArray
	
   students.add("Marcel");
   Teachers.add("Ms. Yanti");
	```
3. Check capacity
   by default it's 10, only vector can check their capacity.
	``` java
	Example_Capacity_dynamicArray
	
	int cap = students.capacity();
	```
4. Accessing things
   the parameter is the index
	``` java
	Example_Get_dynamicArray
	
	student1 = students.get(0);
	teacher1 = teachers.get(0);
	```
5. Update
	``` java
	Example_set_dynamicArray
	
	students.set(0, "Ino");
	teachers.set(0, "Prof. Yanti");
	```
6. Delete
	``` java
	Example_delete_dynamicArray
	
	Remove one content
	students.remove(0);
	teachers.remove(0);
	- or -
	students.remove("Ino");
	teachers.remove("Prof. Yanti");
	
	Remove All
	students.removeAllElements();
	teachers.clear(); 
	```
7. Checking
   By inputting the value, check if you have the specified value in your array, and return the value of it
	``` java
	Example_indexOf_dynamicArray
	
	students.indexOf("Ino");
	// Will return the index of that object in your array or will return -1 if said object is not in your array
	
	teachers.contains(Yanti");
	// Will return true if said object is in your array
	```
8. Trim to size
   Make your dynamic array capacity to be equals to your dynamic array size (the size is how much things you have on your dynamic array)
   `students.trimToSize();`

## Nested Vector
Just like 2D arrays, *nested vector* is a vector inside of a vector
``` java
NestedVector

Vector<Vector> classroom = new Vector<>();
classroom.add(teachers);
classroom.add(students);
// This demonstration will only work if both the teachers and students is declared as a vector
```
if you don't specify the vector's data type inside of the vector, you can get vector of multiple type inside of a vector. Also, this is passed by reference, so to edit the value inside the nested vector you only need to edit the vectoe inside it (to edit the lsit of teachers in the classroom, you just need to change the teacher vector, the classroom will automatically sync).

To access, you'll need to use 2 vector get function
`first_student_in_classroom = classroom.get(0).get(0);`