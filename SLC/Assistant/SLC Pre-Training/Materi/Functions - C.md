Sekumpulan statement/instruction that have the same purpose, and works together.
1. Pre-defined Funtions:
   Function yang sudah ada di dalam library stdio.h contoh: `printf(), scanf(), gets()`
2. Built-in Functions:
   Function yang sudah ada di dalam library selain stdio.h
   contoh: `strlen() dari string.h, strcmp() dari string.h, pow() dari string.h`
3. User-defined function
   Function yang dibuat oleh user
   - Without passing parameter
   - Passing value
     If the function requires a parameter, when called, it requres to be inputted a parameter.
   - Passing reference
4. Recursive Function
   Function yang memanggil diri dia sendiri
   Factorial, fibonnaci
   
![[Pasted image 20221026181059.png]]


``` c
void foo(char message[20]){
	printf("%s", message)
	return;
}

int main(){
	foo("Parameter");
	return 0;
}
```


