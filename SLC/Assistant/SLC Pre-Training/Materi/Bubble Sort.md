Iterasi totalnya (n - 1)<sup>2</sup>

Swap the two first, then go swapping 2 people until the last number sorted to the last. Repeat, so the last number will bublling up sorted.

![[Pasted image 20221027073821.png]]

![[Pasted image 20221028095859.png]]


``` c
void swap(int *a, int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
	return;
}

void bubbleSort(int n, int arr[]){
	for(int i = 0; i<n-1; i++){
		for(int j = 0; j<n-1-i; j++){
			if(arr[j] > arr[j+1]){
				//swap 2 num besides each other that is not sorted
				swap(&arr[j], &arr[j+1]);
			}
		}
	}
	return;
}


int main(){
	// Bubble Sort
	int bubblearr[] = {4,1,7,3,5,8,2,6};
	int n = sizeof(bubblearr)/sizeof(int);
	bubbleSort(n, bubblearr);
	for(int i = 0; i<n; i++){
		printf("%d ", bubblearr[i]);
	}
	printf("\n");
```