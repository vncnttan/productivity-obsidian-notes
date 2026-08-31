## Looping
---
[Looping - Hour 7](http://aelinik.free.fr/c/ch07.htm)
[[For Loop - Program Design Method]]
Looping (Iteration) is a tool to perform the same set of statements over and over until the certain specified conditions are met.

1. For (Count-controlled loop)
   ```c
   for_structure
   for (initialization; condition; expression3) {
   statement1;
   statement2;
   }
	```
	Several statements inside of the curly braces are treated like a single statement.
	- initialization : executed by the start of the loop
	- condition : conditional part to eliminate the loop. If it's false, break the loop. Checked every iteration (including the 1st one)
	- expression 3 : executed every iteration
	  (expression 3 executed first before checking if expression 2 is true executed)
	  
	  To expand the expression, use comma(,).
	  curly brackets can be discarded if there's only 1 statement involved
	  <font color="red"> Saat pertama kali akan masuk, conditional di cek dlu juga. </font>
2. While
   ``` c
   while_structure.c
   
   while (conditional-expression) {
   statement1;
   statement2;
   }
	```
	conditional expression will be checked every iteration (including when it's started). If it's true, execute the statement inside the curly braces.
3. do-while
   ``` c
   do-while_structure.c
   
   do {
   statement1;
   statement2;

	} while (expression);
	```
	same as while but the iteration is not checked for the 1st iteration.