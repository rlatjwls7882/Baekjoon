#include<stdio.h>

int main(void){
	int a,b,c,d,sum1,sum2;
	scanf("%d%d%d%d",&a,&b,&c,&d);
	sum1=a+b+c+d;
	scanf("%d%d%d%d",&a,&b,&c,&d);
	sum2=a+b+c+d;
	
	if(sum1>sum2) printf("%d",sum1);
	else printf("%d",sum2);
	
	return 0;
}