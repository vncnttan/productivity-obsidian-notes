## Operator Increment and Decrement
` a++ ++a a-- --a `

Increment and decrement operators (`++ --`)
  `i++` is equvalent to `i += 1`
  Use to add and substract 1 from a variable
  ![[Pasted image 20220919194522.png]]
  For example, in the y = x++; statement, y is assigned the original value of x, not the one after x is increased by 1. In other words, the post-increment operator makes a copy of the original value of x and stores the copy in a temporary location. Then, x is increased by 1. However, instead of the modified value of x, the copy of the unmodified value of x is returned and assigned to y.