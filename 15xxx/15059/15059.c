#include<stdio.h>

int main(void){
	int a,b,c,d,e,f;
	scanf("%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f);
	
	a=d-a>0?d-a:0;
	b=e-b>0?e-b:0;
	c=f-c>0?f-c:0;
	
	printf("%d",a+b+c);
	return 0;
}