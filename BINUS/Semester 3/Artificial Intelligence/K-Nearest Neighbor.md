	Method of classifying objects based on their similary to their closest neighbor in feature space

1. Cari item/neighbor terdekat dengan item tersebut sebanyak k
2. Dari neighbor tersebut mayoritas cluster apa, maka item tersebut akan masuk ke cluster tersebut

If k is too small -> Sensitive to noise points
If k is too large -> Neighborhood may include too many outliers from other class

![[Pasted image 20231130114435.png]]

Steps:
![[Pasted image 20231130114702.png]]

Cari euclidean satu persatu
![[Pasted image 20231130114725.png]]

Sortir dari yang terkecil terus ambil sebanyak k, ambil mayoritasnya deh terakhir

![[Pasted image 20231130114755.png]]


