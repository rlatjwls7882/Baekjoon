#include<stdio.h>

int main(void){
	int L,P,A,B,C,D,E;
	scanf("%d%d%d%d%d%d%d",&L,&P,&A,&B,&C,&D,&E);
	int sum=L*P;
	
	printf("%d %d %d %d %d",A-sum,B-sum,C-sum,D-sum,E-sum);
	return 0;
}