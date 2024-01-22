[[Arithmetic Operators - C]]
``` c
#include<stdio.h>

int main(void){
	// Session 2
	
	// Arithmetic Operations
	int angka1 = (3 + 4) * 2 % 3;
	double angka2 = 10 / 4.0;
	char huruf1 = '1';
	
	printf("INT: %d\nDOUBLE: %lf\nCHAR: %c\n", angka1, angka2, huruf1);
	
	// String (Array of characters)
	char string[] = "Hello LF01 Class, Pulang jam 7 nih :)))";
	char inputstring[100];
	
	// scanf printf
	printf("Enter some misuh-misuh here: ");
	scanf("%[^\n]", &inputstring); getchar();
	
	printf("%s\n%s\n", string, inputstring);
	
	// Shorthand Operator
	angka1 += 3;
	printf("angka1 += 3\t: %d\n", angka1);
	angka1 -= 3;
	printf("angka1 -= 3\t: %d\n", angka1);
	angka1 *= 3;
	printf("angka1 *= 3\t: %d\n", angka1);
	angka1 /= 3;
	printf("angka1 /= 3\t: %d\n", angka1);
	angka1 %= 3;
	printf("angka1 %%= 3\t: %d\n", angka1);
	
	// Syntactic Sugar - Increment decrement
	// Post increment / decrement only work after that statement. Can't combine inside of a print function.
	angka1++;
	printf("angka1++; \t: %d\n", angka1);
	angka1--;
	printf("angka1--; \t: %d\n", angka1);
	
	printf("++angka1 \t: %d\n", ++angka1);
	printf("--angka1 \t: %d\n", angka1);
	
	// Relational Operator - membandingkan 2 variabel menghasilkan boolean (bisa disimpan di dalam int)
	// < > <= >= !=
	bool bool1 = angka1 < angka2;
	printf("angka1 < angka2 \t: %d\n", bool1);
	
	bool1 = angka1 > angka2;
	printf("angka1 < angka2 \t: %d\n", bool1);
	
	bool1 = angka1 <= angka2;
	printf("angka1 <= angka2 \t: %d\n", bool1);
	
	bool1 = angka1 >= angka2;
	printf("angka1 >= angka2 \t: %d\n", bool1);
	
	// Conditional Expresion
	
	// Ternary Operator - ifselse shorthand
	char pernyataan = (angka1 < angka2) ? 'T' : 'F';
	printf("%c\n", pernyataan);
	
	printf("%s\n", (angka1 < angka2) ? "True" : "False");
	
	// Pointer Operator
	int *ptr = &(angka1);
	printf("%d\n", ptr);
	
	// Bitwise Operator
	int bit01 = 5; // 0000 0101
	//		bit 1	  0000 0001
	printf("0000 0101 << 1\t: %d\n", bit01 << 1);
	printf("0000 0101 >> 1\t: %d\n", bit01 >> 1);
	printf("0000 0101 & 1\t: %d\n", bit01 & 1);
	printf("0000 0101 | 1\t: %d\n", bit01 | 1);
	printf("0000 0101 ^ 1\t: %d\n", bit01 ^ 1);
	return 0;
}
```