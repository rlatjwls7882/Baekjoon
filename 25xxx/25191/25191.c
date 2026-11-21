#include<stdio.h>

int main(void){
	int N,A,B;
	scanf("%d%d%d",&N,&A,&B);
	
	printf("%d",N > A/2+B ? A/2+B : N);
	
	return 0;
}