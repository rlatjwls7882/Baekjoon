#include<stdio.h>

int main(void){
	int x,N;
	scanf("%d%d",&x,&N);
	
	for(int i=0;i<N;i++){
		if(x%2==0) x=(x/2)^6;
		else x=(x*2)^6;
	}
	
	printf("%d",x);
	return 0;
}