#include<stdio.h>

int main(void){
	int A,B,C;
	scanf("%d%d%d",&A,&B,&C);
	
	if(A==B&&B==C) printf("*");
	else if(A==B) printf("C");
	else if(A==C) printf("B");
	else printf("A");
	
	return 0;
}