#include<stdio.h>

int main(void){
	int a,b,c,d,e,f;
	scanf("%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f);
	
	if(a<=b&&a<=c&&a<=d) a=0;
	else if(b<=a&&b<=c&&b<=d) b=0;
	else if(c<=a&&c<=b&&c<=d) c=0;
	else d=0;
	
	if(e<f) e=0;
	else f=0;
	
	printf("%d",a+b+c+d+e+f);
	
	return 0;
}