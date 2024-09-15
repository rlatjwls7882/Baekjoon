#include<stdio.h>

int main(void){
	int A,B,C,D;
	scanf("%d%d%d%d",&A,&B,&C,&D);
	
	printf("%d",A+D>B+C ? A+D-B-C : B+C-A-D);
	return 0;
}