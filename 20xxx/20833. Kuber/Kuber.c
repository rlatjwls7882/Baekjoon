#include<stdio.h>

int main(void){
	int sum=0, N;
	scanf("%d",&N);
	
	for(int i=1;i<=N;i++)
		sum+=i*i*i;
	
	printf("%d",sum);
	return 0;
}