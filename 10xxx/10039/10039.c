#include<stdio.h>

int main(void){
	int sum=0,A;
	
	for(int i=0;i<5;i++){
		scanf("%d",&A);
		if(A<40) A=40;
		sum+=A;
	}
	printf("%d",sum/5);
	
	return 0;
}