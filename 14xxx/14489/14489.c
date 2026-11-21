#include<stdio.h>

int main(void){
	long A,B,C;
	scanf("%ld%ld%ld",&A,&B,&C);
	
	if(A+B>=C*2) printf("%d",A+B-C*2);
	else printf("%d",A+B);
	
	return 0;
}