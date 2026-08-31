[[File Input and Output]]

``` c
file
#include<stdio.h>
#include<stdlib.h>

int main(){
	FILE *fptr = fopen("data.txt", "w");
	char name[100];
	scanf("%[^\n]", name); getchar();
	fprintf(fptr, "Hello World!!, %s\n", name);
	fclose(fptr);
	return 0;
}
```

Mode:
- r - read
- w - write
- a - append
-- C++ exclusive --
- r+ - read and append, but the file must exist
- w+ - make a new file and open it for appending
- a+ - append all in the end of the file (?)


```c
filecsv
#include<stdio.h>
#include<stdlib.h>

struct mhs{
	char NIM[15];
	char name[100];
	int score;
};

int main(){
	mhs lf01[10];;
	int n;
	scanf("%d", &n); getchar();
	FILE *f = fopen("data.csv", "w");
	for(int i = 0; i<n; i++){
		scanf("%s %[^\n] %d", lf01.NIM[i], lfo1[i].name, &lf01[i].score); getchar();
		fprintf(f, "%s,%s,%d\n", lf01.NIM[i], lfo1[i].name, lf01[i].score);
	}

	fclose(f);
	return 0;
}
```

![[Pasted image 20221215151235.png]]