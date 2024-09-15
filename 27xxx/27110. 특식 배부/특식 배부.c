#include<stdio.h>

int main(void){
	int N,a,b,c;
	scanf("%d%d%d%d",&N,&a,&b,&c);
	
	a=a-N>0?N:a;
	b=b-N>0?N:b;
	c=c-N>0?N:c;
	
	printf("%d",a+b+c);
	return 0;
}