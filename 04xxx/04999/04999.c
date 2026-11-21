#include<stdio.h>
#include<stdlib.h>

int main(void){
	char A[1000],B[1000];
	scanf("%s %s",A,B);
	
	if(strlen(A)>=strlen(B)) printf("go");
	else printf("no");
}