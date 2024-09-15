#include<stdio.h>
#include<math.h>

int main(void){
	int N,M;
	scanf("%d%d",&N,&M);
	
	long long sum=(long long)N-M;
	printf("%lld",llabs(sum));
	
	return 0;
}