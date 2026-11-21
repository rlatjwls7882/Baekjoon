#include<stdio.h>

int main(void){
	int A,B,C;
	scanf("%d%d%d",&A,&B,&C);
	
	if(A<=B&&A<=C) printf("%d",B+C);
	else if(B<=A&&B<=C) printf("%d",A+C);
	else printf("%d",A+B);
	
	return 0;
}