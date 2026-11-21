#include<stdio.h>

int main(void){
	float N,money;
	scanf("%f",&N);
	
	printf("%.0f ",N*0.78);
	
	money=N*0.8;
	N*=0.2;
	printf("%.0f",money+N*0.78);
	
	return 0;
}