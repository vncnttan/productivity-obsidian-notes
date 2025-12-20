Matrix A kita jadikan menjadi beberaoa matrix (dekomposisi)

**A = L U**

```
AX = C		A = LU
LUX = C

l11  0   0       z1   c1
l21 l22  0   x   z2 = c2
l31 l32 l33      z3   c3

z1 =  c1/l11
z2 = (c2 - l21(c1 / l11))/l22
z3 = (  c3 - l21(c1 / l11) - l32((c2 - l21(c1 / l11))/l22)  ) / l33

LU = A

UX = 
```
