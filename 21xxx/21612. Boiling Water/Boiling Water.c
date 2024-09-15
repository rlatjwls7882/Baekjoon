#include<stdio.h>

int main(void){
	int B;
	scanf("%d",&B);
	
	int P=5*B-400;
	printf("%d\n",P);
	
	if(P>100) printf("-1");
	else if(P==100) printf("0");
	else printf("1");
	
	return 0;
}