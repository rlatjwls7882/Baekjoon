#include<stdio.h>

int main(void){
	int m,d;
	scanf("%d%d",&m,&d);
	
	if(m<2) printf("Before");
	else if(m>2) printf("After");
	else if(d<18) printf("Before");
	else if(d>18) printf("After");
	else printf("Special");
	
	return 0;
}