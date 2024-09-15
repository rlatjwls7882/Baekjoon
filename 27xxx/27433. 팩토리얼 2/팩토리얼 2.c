#include<stdio.h>

int main(void){
	int N;
	long print=1;
	scanf("%d",&N);
	
	for(int i=1;i<=N;i++)
		print*=i;
	
	printf("%ld",print);
	
	return 0;
}