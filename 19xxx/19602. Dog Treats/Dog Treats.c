#include<stdio.h>

int main(void){
	int x,sum=0;
	
	for(int i=1;i<4;i++){
		scanf("%d",&x);
		sum+=i*x;
	}
	
	if(sum>=10) printf("happy");
	else  printf("sad");
	
	return 0;
}