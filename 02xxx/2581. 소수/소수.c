#include<stdio.h>

int main(void){
	int M,N; //시작과 끝 
	int S[1]; //첫번째 소수를 저장할 공간 
	int pos=0; //몇번째 소수인지 판단
	int Y=0; //약수의 개수
	int sum=0; //소수의 합  

	scanf("%d%d",&M,&N);
	
	for(M;M<=N;M++){
		for(int i=1;i<M;i++)
			if(M%i==0) Y++;
				
		if(Y==1){
			if(pos==0) S[pos++]=M;
			sum+=M;
		}
		Y=0; //약수의 개수 초기화 		
	}
	if(pos==0) printf("-1");
	else printf("%d\n%d",sum,S[0]);
	
	return 0;
}