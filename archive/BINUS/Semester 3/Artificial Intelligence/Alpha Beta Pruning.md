![[Pasted image 20231005095414.png]]

If there is no defined value, throw the **worst-case** for the **v (value)**, then go down the level

Every time you down a level, decide the alpha and the beta

![[Pasted image 20231005100129.png]]


If you met a value, compare to above them:
MAX -> Replace with the higher value
MIN -> Replace with the lower value

 
Alpha beta dapet darimana? Di cek aja dari current state ke root 

**MAX = ALPHA**
**MIN = BETA**
Kalo menuju max yang di cek alpha
Kalo menuju min yang di cek beta

![[Pasted image 20231005101743.png]]

Nah jadi ini kenapa kepotong, karena biru kan level max yahh, kita bisa mikir nih kan sementara nilainya tuh 7, mau diganti apapun angkanya tuh dia pasti bakal lebih gede dari 7 kan yahh,, nah jadinya pasti yang di biru ini gamungkin lebih kecil dari betanya.... 