Linked list is used to store array dynamically
[[Array vs Linked List]]

``` c
struct Mahasiswa{
	char NIM[10];
	char name[100];
	Mahasiswa *next, *prev;
}

int main(void){
	mhs1 = (Mahasiswa *) malloc(sizeof(Mahasiswa *));
	mhs2 = (Mahasiswa *) malloc(sizeof(Mahasiswa *));

	strcpy(mhs1->name, "Efran");
	strcpy(mhs1->NIM,)
	mhs1->next = mhs2;
} 
```

```c
#include<stdio.h>
#include<stdlib.h>

struct data{
	int n;
	struct data *next;
};

struct data *head=NULL, *temp=NULL;

data *createData(int n){
	temp = (struct data*) malloc(sizeof(data));
	temp->next = NULL;
	temp->n = n;
	return temp;
}

void pushHead(data *newData){
	if(head == NULL){
		head = newData;
	} else {
		newData->next = head;
		head = newData;
	}
}

void pushTail(data *newData){
	if(head == NULL){
		head = newData;
	} else {
		temp = head;
		while(temp->next != NULL){
			temp = temp->next;
		}
		
		temp->next = newData;
	}
}

void pushMid(data *newData){
	temp = head;
	if(head == NULL){
		head = newData;
	} else if(newData->n < temp->n){
		pushHead(newData);
	} else {
		while(temp->next != NULL && newData->n > temp->next->n){
			temp = temp->next;
		}
		
		newData->next = temp->next;
		temp->next = newData;
	}
}

int main(){
	pushMid(createData(90));
	pushMid(createData(70));
	pushMid(createData(30));
	pushMid(createData(60));
	pushMid(createData(50));
	temp = head;
	while(temp != NULL){
		printf("%d ", temp->n);
		temp = temp->next;
	}
}
```
