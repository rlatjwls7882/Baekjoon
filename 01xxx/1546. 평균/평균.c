#include<stdio.h>

int main(void){
	int N,M=0;
	float sum=0;
	scanf("%d",&N);
	float arr[N];
	
	for(int i=0;i<N;i++){
		int A;
		scanf("%d",&A);
		arr[i]=A;
		if(M<A) M=A;
	}
	
	for(int i=0;i<N;i++){
		arr[i]=arr[i]/M*100;
		sum+=arr[i];
	}
	
	printf("%f",sum/N);
	
	return 0;
}