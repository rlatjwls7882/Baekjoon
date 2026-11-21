#include<stdio.h>

int main(void){
	int N; //나누는 사람수(나 제외) 
	long S; //주식 
	
	while(scanf("%d%ld",&N,&S)==2){
		printf("%ld\n",S/(N+1));
	}
	
	return 0;
}