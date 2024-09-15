#include<stdio.h>

int main(void){
	int A,B;
	scanf("%d%d",&A,&B);
	
	A/=2;
	
	if(A<B) printf("%d",A);
	else printf("%d",B);
	
	return 0;
}