Time Complexity : O(log n)

``` c
//Binary Search
void binarySearch(int n, int arr[], int target){
	int l = 0;
	int h = n-1;
	while(h >= l){
		int m = (h+l)/2;
		if(arr[h+m] < target){
			l = m+1;
		} else if (arr[h+m] > target){
			h = m-1;
		} else {
			printf("%d was found in the array.\n", target);		
			return;
		}
	}
	return;
}
```