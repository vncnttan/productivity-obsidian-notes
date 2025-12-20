## Conditional Branching
---
[Hour 10 - Getting Controls](http://aelinik.free.fr/c/ch10.htm)
[Session 7 code](https://github.com/mharvianto/lf01)

- IF & IF-ELSE
  ``` c
  if_structure
  if (relational-expression) {
   // something to do if the statement is true
   statement1;
   statement2;
	}
  else if (statement 2) {
	// do something if statement 2 is true
	statement3;
	statement4;
  }
  else {
   statement_A;
   statement_B;
   .
   .
   .
	}
   ```
   If the expression is true, all of the statement inside of the curly braces will be executed., if not, statement inside of the else curly will be executed.
   
   Often used for ranged option.
   - [x] Can be nested
   - [x] else-if
   - [x] Use if and break in an infinite loop to stop it from being infinite
   - [x] Use if and continue to skip statement below it, but continue the iteration (break but for that iteration only)
   - [x] Executed one by one from the top, so be careful of wrong implementation.
   
- SWITCH
  ``` c
  switch_structure
  switch (expression) {
   case expression1:
        // something to do if expression == expression1
        statement1; 
   case expression2:
        // something to do if expression == expression2
        statement2; (optional) break;
   .
   .
   .
   default:
        statement-default;
  }
   ```
   Used to compare two things, `expression` as the key, and at first it's being compared with `expression1`. If true, execute `statement1, 2 and so on`. If `expression1` and `expression` doesn't match, try to compare `statement` with `statement2`. If true, execute `statement 2, 3 and so on`. 
   
   More often used for menus, other than that it's recommended to use if-else. Switch case is used if the option is specific and if the option is few.
   
   The expression being compared should be an `int` or a `char`. You can't try to evaluate arrays / strings.
   
   - [x] Use break to immediately stop the chain
   - [x] Don't use break to make a chain of statement executed

- GOTO
  **Discouraged to be used**, because it makes program/codes hard to debug.
  ```c
  goto_structure
  labelname:
   statement1;
   statement2;
   .
   .
   .
   goto  labelname;
  ```
  labelname is a name to tell program where to jump, paired with an if statement. If something, then jump to here.

### Example
![[Pasted image 20221020133243.png]]

Code that is easier to use switch case than if else:
![[Pasted image 20221020135028.png]]

# Ternary Operators
Used to simplify one liner conditional.
syntax:
	`condition ? then-expresion : else-expresion`

`char pernyataan = (angka1 < angka2) ? 'T' : 'F'; `
means assign `pernyataan` variable with *'T'* if `angka1 < angka2`... else assign it with *'F'*.
what being assigned only can be `int` or `char`.


# Conditionals in Program Design Method
Conditional is used as as a decision making process in a program design, using a relational operators to produce if one condition is T/F? 
[[Relational Operators - C]]
[[Propositions]]
