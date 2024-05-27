## One Dimensional Array
`data_type var_name[array_size]`
`e.g int age[2];`

Some things that need to be perhatikan:
- Array index starts with 0.
- An **array of char** can automatically interpreted as a **string**. with *%s* as a placeholder.

<font color="red">Make sure to add one size more for your string because there is a null terminator \0 that's invisible, useful for computer to know where/when string ends. </font>

If you try to access or assign value to variable outside of your array, sometimes it will spit out an error, and sometimes it have [[Garbage values]].

Be caution also to not access array outside your bounds/capacity so that you can't get [[Stack Overflow]]. This is because C doesn't have a [[Garbage collector]].



## Two Dimensional Array
`data_type var_name[array_size_x][array_size_y]`
``` c
Two_dimensional_array
int nums[2][5] = {
					{1, 2, 3, 4, 5},
					{6, 7, 8, 9, 10}
};
printf("Accessing array index 0, 3: %d\n", nums[0][3]);
```


### Printing All Values inside of an Arr
you can use [[Loop - C]] and [[Nested Loops]] for multidimensional array.

`c[a[10][10], b[10][10]]`