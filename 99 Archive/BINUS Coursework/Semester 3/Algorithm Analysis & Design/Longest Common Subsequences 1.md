Vincent Tanjaya - 2602128346

Longest Commong Subsequence adalah permasalahan yang dapat digunakan untuk mencari subsequence terpanjang yang ada di suatu set sequence, array, atau string. Contohnya adalah dari string A dan string B.

Cara menemukan implementasi LCS ada beberapa cara:
- Recurrsive
- Reccursive + Memoization
- Dynamic Programming


1. Determine the LCS of (1, 0, 0, 1, 0, 1, 0, 1) and (0, 1, 0, 1, 1, 0, 1, 1, 0
   ![[Pasted image 20231130204906.png]]
   
2. Give the pseudocode to reconstruct and LCS from only c table in O(m+n) time without using the b table
   ```
   LCS(k, i, j):
   a = len(i)
   b = len(j)
   
   LCS = []
   c = a
   d = b
   
   while c > 0 && d > 0:
	   if i[c] == j[d]:
		   LCS.prepend(X[c])
		   c = c-1
		   d = d-1
		else if e[c-1][d] >= e[d][d-1]
			c = c-1
		else:
			d = d-1
	return LCS
	```

3. Give a memoized version of LCS-LENGTH that runs in O(mn) time.
	```
	LCSMemoized(x, y, i, j):
	if c[i, j] > -1:
	  return c[i, j]
	if i == 0 || j == 0:
	   return 0
	else if x[i-1] == y[j-1]:
	   return v[m][n] = 1 + LCSMemoized(x, y, i-1, j-1)
	else if v[i][j] != 1:
	   return dp[i][j]
	return dp[i][j] = max(LCSMemoized(x, y, i-1, j), LCSMemoized(x, y, i, j-1))
	
	```

4. Give an O(n^2) time algorithm to find the longest monotonically increasing subsequence of a sequence of n numbers
	```
	LCS(arr, m):
	lis[m] = 1
	for i from 1 to m:
	    for j from 1 to m:
	        if arr[i] > arr[j] && lis[i] < lis[j] + 1:
	           lis[i] = lis[j] + 1
	return max(lis)
	```