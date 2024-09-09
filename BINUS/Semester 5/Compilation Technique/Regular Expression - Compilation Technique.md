Formal way to describe patterns in strings.

Basic RE Patterns:
- Sequence of simple character
- Case Sensitive


CompTech REGEX:
*(Jump to exercise for easier understanding)*
- Language Concatenation
![[Pasted image 20240909102409.png]]
- Union Language
  ![[Pasted image 20240909102447.png]]
- Closure
	- Kleene Closure (zero or more)
	- Plus Closure (one or more from the right and left side)
	  ![[Pasted image 20240909102531.png]]
	  
[[Regular Expression - NLP]]

#### Exercise
Language -> RE
![[Pasted image 20240909103346.png]]
1. `((a|b|c)*a(a|b|c)*b(a|b|c)*)|((a|b|c)*b(a|b|c)*a(a|b|c)*)`
2. `(0|1)*1(0|1)(0|1)`
3. `abb(a|b)*`
4. `(0|1)*011(0|1)*`
5. `(01(0+1)*)|((0+1)*01)|(01(0+1)*01)`

