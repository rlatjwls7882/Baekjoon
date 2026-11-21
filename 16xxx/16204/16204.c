#include<stdio.h>

int main(void){
	int N,M,K,O,X;
	scanf("%d%d%d",&N,&M,&K);
	
	if(M>K) O=K;
	else O=M;
	
	if(N-M>N-K) X=N-K;
	else X=N-M;
	
	printf("%d",O+X);
	
	return 0;
}