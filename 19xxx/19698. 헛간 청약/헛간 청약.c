#include<stdio.h>

int main(void){
	int N,W,H,L;
	scanf("%d%d%d%d",&N,&W,&H,&L);
	
	printf("%d",(W/L)*(H/L) < N ? (W/L)*(H/L) : N);
	
	return 0;
}