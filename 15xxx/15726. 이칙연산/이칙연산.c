#include<stdio.h>

int main(void){
	double a,b,c;
	scanf("%lf%lf%lf",&a,&b,&c);
	
	printf("%d",(int)(a*b/c) > (int)(a/b*c) ? (int)(a*b/c) : (int)(a/b*c));
	return 0;
}