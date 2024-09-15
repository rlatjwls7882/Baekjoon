#include<stdio.h>
#include<math.h>

int main(void){
	double w,h;
	scanf("%lf%lf",&w,&h);
	
	printf("%lf",w+h-hypot(w,h));
	return 0;
}