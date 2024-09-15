#include<stdio.h>

int main(void){
	int n; //입력 정수 
	
	scanf("%d",&n);
	
	int P[n+1];
	P[0]=0;
	P[1]=1;
	
	for(int i=2;i<=n;i++){
		P[i]=P[i-1]+P[i-2];
	}
	printf("%d",P[n]);
	
	return 0;
}