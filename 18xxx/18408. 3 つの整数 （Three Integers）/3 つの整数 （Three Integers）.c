#include<stdio.h>

int main(void){
	int a,b,c;
	scanf("%d%d%d",&a,&b,&c);
	
	if(a==b) printf("%d",a);
	else if(a==c) printf("%d",a);
	else printf("%d",b);
	
	return 0;
}