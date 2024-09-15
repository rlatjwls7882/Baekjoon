#include<stdio.h>

int main(void){
	long N,A,B;
	scanf("%ld%ld%ld",&N,&A,&B);
	
	if(A>B&&B>=N) printf("Subway");
	else if(A==B) printf("Anything");
	else printf("Bus");
	
	return 0;
}