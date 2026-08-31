example: 
![[Pasted image 20230101103945.png]]

To make this map, one station struct need to have 4 pointer, `east, west, south, and north`

``` c
struct Station{
	int havePrinted; // should be always false, temporarily true if printed, then neutralized again to false
	char name[100];
	struct Station *west, *east , *south, *north;
} *root, *curr;
```

Functions needed:
- pushNorth
- pushEast
- pushWest
- pushSouth
- joinWestEast
- joinSouthNorth
- view (+neutralize)