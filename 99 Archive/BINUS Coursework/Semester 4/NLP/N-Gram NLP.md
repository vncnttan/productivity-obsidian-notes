`Searching for occurences of n word in the text`.

ex. 2-gram
I want to eat 
I want -> 10%
Want to -> 5%, etc


P(I want to eat) = `10% x 5% x ... = 0.5%`


How to improve N-Gram:

Generalization:
- Unknown Words
	![[Pasted image 20240224090501.png]]

Laplace Smoothing:
- Biar angkanya ga 0, ditambah 1 dan dibagi vocab jadinya sangat kecil angkanya
	![[Pasted image 20240224090405.png]]


