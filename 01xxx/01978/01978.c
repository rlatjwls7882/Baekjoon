#include<stdio.h>

int main(void){
	int N; //입력 개수
	int Y=0; //약수의 개수 
	int S=0; //소수의 개수
	 
	scanf("%d",&N);
	
	while(N--){
		int A; //입력하는 수 
		
		scanf("%d",&A);
		for(int i=1;i<=A;i++)
			if(A%i==0) Y++;
		
		if(Y==2) S++;
		Y=0; //약수의 개수 초기화 
	}
	
	printf("%d",S);
	
	return 0;
}