#include<stdio.h>

int main(void){
	int K,N,M;
	scanf("%d%d%d",&K,&N,&M);
	
	printf("%d",K*N-M>0 ? K*N-M : 0);
	return 0;
}