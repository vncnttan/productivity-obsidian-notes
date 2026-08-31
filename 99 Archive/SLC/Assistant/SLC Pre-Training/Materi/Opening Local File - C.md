Simple Printing
``` c
FILE *fp = fopen("test.txt", "r");
char string[100];
while(fscanf(fp, "%[^\n]\n", string) != EOF){
	printf("%s\n", string);
}

while(!feof(fp)){
	fscanf(fp, "%[^\n]\n", string);
	printf("%s\n", string);
}

fclose(fp);
```

Functions:
- fopen = open a file with said name, and return a file pointer, there is 3 mode available:
  1. 'w' = overwrite
  2. 'r' = read
  3. 'a' = append in the end of said file
- fscanf = scanf, read per line on the buffer. It returns EOF or -1 if there's none left. For the format, and the variable where to put it, is required in the parameter
- feof = check if something is EOF
- fprintf = TBD
- fclose = a must after fopen to avoid memory leaks