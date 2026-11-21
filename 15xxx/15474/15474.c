#include<stdio.h>

int main(void){
	int N,A,B,C,D,sum1,sum2;
	scanf("%d%d%d%d%d",&N,&A,&B,&C,&D);
	
	sum1=(N+A-1)/A*B;
	sum2=(N+C-1)/C*D;
	
	if(sum1<sum2) printf("%d",sum1);
	else printf("%d",sum2);
	
	return 0;
}