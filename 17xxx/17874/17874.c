#include<stdio.h>

int main(void){
	int n,h,v;
	scanf("%d%d%d",&n,&h,&v);
	
	if(n>2*h) h=n-h;
	if(n>2*v) v=n-v;
	
	printf("%d",h*v*4);
	return 0;
}