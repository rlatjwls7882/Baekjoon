#include<stdio.h>

int main(void){
	int A,B,C;
	scanf("%d%d%d",&A,&B,&C);
	
	if(A>B&&A>C) printf("%d",A*2-B-C);
	else if(B>C&&B>C) printf("%d",B*2-A-C);
	else printf("%d",C*2-A-B);
	
	return 0;
}