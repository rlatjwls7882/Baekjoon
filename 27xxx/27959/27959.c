#include<stdio.h>

int main(void){
	int N,M;
	scanf("%d%d",&N, &M);
	
	N*100>=M ? printf("Yes") : printf("No");
	return 0;
}