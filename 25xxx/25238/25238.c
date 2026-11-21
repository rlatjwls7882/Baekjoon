#include<stdio.h>

int main(void){
	double a,b;
	scanf("%lf%lf",&a,&b);
	
	printf("%d",a-a*b*0.01>=100 ? 0 : 1);
	return 0;
}