#include<stdio.h>
int main(){
    int A,B,C;
    scanf("%d%d%d",&A,&B,&C);
    B=B+C;
    A:
    if(B>=60){
        B=B-60;
        A++;
    }
    if(A>=24) A=A-24;
    if(B>=60) goto A;
    printf("%d %d",A,B);
}