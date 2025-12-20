``` c
#include<stdio.h>

#include<stdlib.h>
#include<string.h>
  
int main(){
    int choose;
    do {
        printf("1. Persegi\n");
        printf("2. Segitiga\n");
        printf("3. Exit\n");
        scanf("%d", &choose); getchar();
        switch(choose) {
            case 1:
                int sisi;
                printf("Masukan panjang persegi : ");
                scanf("%d", &sisi); getchar();
                for(int i=0; i<sisi; i++){
                    for(int j=0; j<sisi; j++){
                        if(i==0 || j==0 || i==sisi-1 || j==sisi-1){
                        printf("$ ");
                        } else{
                            printf("  ");
                        }
                    } printf("\n");
                }
                break;
  
            case 2:
                int alas, spasi;
                printf("Masukan panjang alas : ");
                scanf("%d", &alas); getchar();
                spasi = (alas-1)/2; // Karena 1 untuk the top part kan ga spasi
                for(int i=1; i<=alas; i+= 2){ // general size for same-length triangle, again idk what it's called
                    for(int j =0; j<spasi; j++){ // spaces
                        printf("  ");
                    } spasi--;
                    for(int j=0; j<i; j++){ // actual shape
                        printf("* ");
                    } printf("\n");
                }
                break;
        }
    } while(choose !=3);
}

  

/*

Notes

============================================================


today's lesson:

repetition
    for, while, do-while

    // will probably just write dow the nested loops, maybe
- > While
    int main(){
        int x=0;
        while(x<10){
            printf("while loop #%d\n", x);
            x++
        } return 0;
    }
    **will print loop 10 times, starting from 0

- > Do-While
    int main(){
        int x=0;
        do {
            printf("do-while loop #%d\n", x);
            x++
        } while(x<10);
        return 0;
    }
    **will print loop 10 times, but checks the condition after completeing the action.

- > For
    int main(){
        for(int x=0; x<10; x++){
            printf("for loop #%d\n", x);
        } return 0;
    }
    **will print amogus 10 times, differnce : just way more compact

  

    => Nested for loop
        int alas;
        printf("Masukan panjang alas"); // untuk segitiga siku-siku
        scanf("%d", &alas);
        for(int i=1; i<=alas; i++){
            for(int j=0; j<i; j++){
                printf("* ");
            } printf("\n");
        }

----------------------------------------------------------------

String.h

    -> strlen
    length of a string, e.g if a string states abce, the length will be 4

    -> strcmp
    Comparing 2 strings in ASCII, e.g

    char kata[255] = {'h', 'a', 'l', 'o'};
    char kata2[255] = "hello";
    strcmp (kata, kata2) => will return -1 because a < e

    -> strcpy
    inserting a value of a string to another. Copy it by value

    e.g strcpy(kata, kata2) => will probably return what you expect

    -> strrev
    reversing a string
    
  
------------------------------------------------------------------

stdlib.h
-> Apparently you're not supposed to use it on socs1 quiz.

================================================================

*/
```