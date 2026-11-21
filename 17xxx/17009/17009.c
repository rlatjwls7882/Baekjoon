#include<stdio.h>

int main(void){
	int a,b,c,d,e,f;
	scanf("%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f);
	
	printf("%c",3*a+2*b+c>3*d+2*e+f ? 'A' : 3*a+2*b+c<3*d+2*e+f ? 'B' : 'T');
	return 0;
}