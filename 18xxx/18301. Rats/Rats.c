#include<stdio.h>

int main(void){
	float n1,n2,n12;
	scanf("%f%f%f", &n1, &n2, &n12);
	
	printf("%d",(int)((n1+1)*(n2+1)/(n12+1)-1));
	return 0;
}