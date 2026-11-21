#include<stdio.h>
#include<math.h>

int main(void){
	double A,B,M;
	scanf("%lf%lf%lf",&A,&B);
	M=(B-A)/400;
	
	printf("%lf",1/(1+pow(10,M)));
	return 0;
}