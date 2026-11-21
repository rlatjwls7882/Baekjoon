#include<stdio.h>

int main(void){
	long long A,sum=0;
	
	for(int i=0;i<5;i++){
		scanf("%lld",&A);
		sum+=A;
	}
	printf("%lld",sum);
	
	return 0;
}