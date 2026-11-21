#include<stdio.h>
int main(void){
	int A,B;
	scanf("%d%d",&A,&B);
	
	if(A<B) printf("-1");
	else if(A==B) printf("0");
	else printf("1");
	
	return 0;
}