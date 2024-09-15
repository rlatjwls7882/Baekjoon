#include<stdio.h>

int main(void){
	int N,sum=0,tmp;
	scanf("%d",&N);
	
	while(N--){
		scanf("%d",&tmp);
		sum+=tmp;
	}
	
	printf("%d",sum);
	return 0;
}