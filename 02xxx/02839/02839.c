#include<stdio.h>

int main(void){
	int num=0,N;
	
	scanf("%d",&N);
	while(N>0){
		if(N%5!=0){ //5의 배수가 아니면 5의 배수가 될때까지 3을 뺀다 
			N-=3;
			num++;
		}
		else{
			N-=5;
			num++;
		}
	}
	
	
	if(N==0) printf("%d",num);
	else printf("-1");
	
	return 0;
}