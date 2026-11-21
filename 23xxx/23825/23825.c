#include<stdio.h>

int main(void){
	int S,A;
	scanf("%d%d",&S,&A);
	S/=2; A/=2;
	
	if(S>A) printf("%d",A);
	else printf("%d",S);
	
	return 0;
}