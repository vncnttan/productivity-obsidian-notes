Kompleksitas = O(n)


```c
// Linear Search
void linearSearch(int n, int arr[], int target){
	for(int i = 0; i<n; i++){
		if(arr[i] == target){
			printf("%d was found in the array.\n", target);
			return;
		}
	}
	printf("%d was not found in the array.\n", target);
	return;
}
```