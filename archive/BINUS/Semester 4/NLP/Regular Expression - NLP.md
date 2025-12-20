Basic RE Patterns:
- Sequence of simple character
- Case Sensitive
![[Pasted image 20240217080013.png]]


1. Square Braces `[]`
   The string of characters inside the square braces specifies a *disjunciton of character* to match
   ![[Pasted image 20240217080109.png]]
2. Dash (Range) `-`
   Specify every character in range from the *ASCII* value
   ![[Pasted image 20240217080312.png]]
3. Caret `^`
   Must be after `[`, The resulting pattern is negated
   ![[Pasted image 20240217080445.png]]
4. Question Mark `?`
   The preceding character or nothing is fine (zero or one instance of the previous character)
   ![[Pasted image 20240217080626.png]]
5. Kleene *
   Zero or more occurences of the immediately previous character 
   ![[Pasted image 20240217080734.png]]
6. Kleene +
   One or more occurences of the immediately previous character
   ![[Pasted image 20240217080934.png]]
7. Period `.`
   Wildcard expression that matches any single character
   ![[Pasted image 20240217081305.png]]
8. 
9. 
   
10. 

Untuk validasi regex
[regex101: build, test, and debug regex](https://regex101.com/)