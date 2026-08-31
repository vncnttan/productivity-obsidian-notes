### printf or fprintf
---
printf: print the variable to the terminal
`printf("%s", variable);`
[[Print format (Keyword or Format Specifier) - C]]


fprintf: print the variable to a file
`fprintf(fptr, "%s", variable)`
*to print to the terminal you can change the fptr to stdout*

### putchar()
---
print a character
`putchar();`

### puts
---
print a string with a newline (\\n) in the end
`puts("Some String that you want to put")` or `puts(variable)`
*can't throw a variable in the middle*