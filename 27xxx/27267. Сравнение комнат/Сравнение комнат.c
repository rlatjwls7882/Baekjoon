#include<stdio.h>

int main(void){
	int a,b,c,d;
	scanf("%d%d%d%d",&a,&b,&c,&d);
	
	if(a*b>c*d) printf("M");
	else if(c*d>a*b) printf("P");
	else printf("E");
	
	return 0;
}