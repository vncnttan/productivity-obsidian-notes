Inside of a memory, there is an address and value of your variable.
Usually the address is on a hexadecimal

Pointer Operator is `*<var_name>`
and the adress operator is `&<var_name>`
## Pointer
Pointer = variable that's filled with other variable address
You can access the address in the pointer with a *

int a = 10;
int \*p = &a;
``` c
pointer_and_address

a = 10
&a = #1242af // Variable a's address
p = #1242af
*p = 10 // Go to the address on variable p and retrieve the value
```

``` c
print_address

int a = 5;
	printf("%d\n", &a);
	printf("%x\n", &a);
	printf("%p\n", &a);
```

Saving a pointer address inside of another ptr variable
``` c
ptr_inside_of_a_ptr

	int a = 5;
	printf("%d\n", a); 
	int *ptra = &a;
	printf("%d\n", *ptr);
	int **ptrptra = &ptra;
	printf("%d\n", **ptrptr);
```

