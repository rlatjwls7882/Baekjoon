#include<stdio.h>

int main(void){
	int x;
	scanf("%d",&x);
	
	while(x>0){
		if(x>=5){
			printf("V");
			x-=5;
		}
		else{
			printf("I");
			x--;
		}
	}
	
	return 0;
}