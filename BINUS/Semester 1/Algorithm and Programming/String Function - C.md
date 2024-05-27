`#include <string.h>`

strcmp(`varstr1`, `varsrtr2`); 
Compare two strings:
- If string 1 is earlier in the dictionary, return -1
- If string 1 is later in the dictionary, return 1
- If same, return 0
To ignore case, use `strcmpi`, uppercase will be valued less (earlier in the dictionary) than the lowercase

strlen(`varstr`);
Return the int of the length of a given string. Length of a string is measured from the start address until they met a '\\0'.

strcpy(`vardest`, `varfrom`);
Copy string by value from `varfrom` to `vardest`. Now, those two string will have the same value, but if you modify one of them, the other won't be changed. Return 1 if succeed.

strrev(`varstr`);
Return the reversed version of varstr.

![[Pasted image 20221024090552.png]]
