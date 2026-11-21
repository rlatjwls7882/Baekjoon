#include<stdio.h>

int main(void){
	int A,B,C;
	scanf("%d%d%d",&A,&B,&C);
	
	if(A+B+C==180&&A==B&&B==C) printf("Equilateral");
	else if(A+B+C==180&&(A==B||A==C||B==C)) printf("Isosceles");
	else if(A+B+C==180) printf("Scalene");
	else printf("Error");
	
	return 0;
}