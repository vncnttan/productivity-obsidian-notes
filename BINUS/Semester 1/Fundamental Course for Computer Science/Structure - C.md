``` c
C_structure

int main(void){
	statements;
	return 0;
}
```
## C program structure
---
[Hour 2 - Writing Your First C Program](http://aelinik.free.fr/c/ch02.htm)
1. The `#include` directive
	   Used to link our program to another function in library or file.
		   example: `#include <stdio.h>`
	  Header files are what follows the include directive.
	  
	  Angle brackets `<>` is used to link our code to another function in a library, meanwhile Double quotes `""` is used to link our code to another function inside our current directory (maybe in another file) before they look somewhere else for the header file.
2. The `main` function
   `int main(void){}`
	   Every program must have exactly one main function. The main function will be the first function executed when the program is executed.
		   The return statement must come with every function (if the function does not return void).
3. The `exit()` function
   `exit(0); or exit(1);`
	   To immediately exit a program. The attribute is the error code that will be produced after the function exits. 0 by convention, means the program is running fine.