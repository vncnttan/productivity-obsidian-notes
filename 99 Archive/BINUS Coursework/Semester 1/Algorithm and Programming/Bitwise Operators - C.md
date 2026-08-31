## Operator Bitwise
*Historically, 0 is used to represent false and any other number is used to represent true*

Compare two bits from 2 variable
a = 00101010, b =00000110. c = a & b.
c = compare 0 with 0. compare the 2nd character, the3rd, and go on until the end

What are being compared:
- & `Bitwise AND` If both of them is 1, the result is 1.
- | `Bitwise OR` If one of them is 1, the result is 1.
- ^  `Bitwise XOR` - If both are same, 1. If both are different, 0.
	Two exact integer = 0
	One integer with 0 on the other = the integer
- ~ `Bitwise NOT/Complement` - Reverse the 0 and 1.
- << `Binary Left Shift` - Individual bit moved left by the number of bits specified. The result will be 2^y where y is the number of bit moved. 
	`10 << 3 = 80`  == 10 * 2<sup>3</sup> = 80
- >> `Binary Right Shift` - Individual bit moved right by the number of bits specified. The result will be 2<sup>-y</sup> or 1/(2<sup>y</sup>)
![[Pasted image 20221013135858.png]]

## Logic and Bit Operations
Computer represent information using bits.
![[Pasted image 20221002134001.png]]