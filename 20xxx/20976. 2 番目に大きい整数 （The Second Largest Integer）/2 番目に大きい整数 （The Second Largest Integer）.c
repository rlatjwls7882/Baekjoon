#include<stdio.h>

int main(void){
	int A,B,C;
	scanf("%d%d%d",&A,&B,&C);
	
	if(B<=A&&A<=C) printf("%d",A);
	else if(C<=A&&A<=B) printf("%d",A);
	else if(A<=B&&B<=C) printf("%d",B);
	else if(C<=B&&B<=A) printf("%d",B);
	else printf("%d",C);
	
	return 0;
}