### scanf()
---
scanf will get input from keyboard until (before) '\\n' (Enter Key). So the '\\n' character needs to be cleared.
``` c
scanf_example
#include <stdio.h>

int main(){
	int a;
	char b[10];
	float c;

	printf("Input your user ID: ");
	scanf("%i", &a); getchar();
	// Get char to get the '/n' character
	
	printf("Input your username: ");
	scanf("%s", b); getchar();
	// No '&' because array is a char* which means b is an address to the first memory allocated (malloc) for 10 char
	
	printf("Input your average score: ");
	scanf("%f\n", &c);
	// or, optionally, you can change getchar with a \n
	// but you can't printf after a scanf with \n

	return 0;
}	

```
Take the 1st argument for how format the data will be inputted (with placeholder inside of them). 
The next argument, will state the memory pointer in which where to put those data.
returns an integer that stated how many fields are successfully assigned.

To scan whole sentence (so, scan until the enter key is found, use `%[^/n]`)

### gets()
---
unsafe because it can cause buffer overflows, now it changes to fgets!

### fgets()
---
Get a string including the escape character '\\n'
	`fgets(variable, MAX_CHAR, stdin);`

### getchar()
---
Get a single character from user input
	`x = getchar();`