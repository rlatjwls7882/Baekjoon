#include<stdio.h>

int main(void){
	double a;
	scanf("%lf",&a);
	printf("%.10lf\n",(100-a)/a+1);
	printf("%.10lf",a/(100-a)+1);

	return 0;
}