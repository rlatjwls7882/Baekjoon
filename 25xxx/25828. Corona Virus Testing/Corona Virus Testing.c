#include<stdio.h>

int main(void){
	int g,p,t,individual,group;
	scanf("%d%d%d",&g,&p,&t);
	
	individual=g*p;
	group=g+t*p;
	
	if(individual>group) printf("2");
	else if(individual<group) printf("1");
	else printf("0");
	
	return 0;
}