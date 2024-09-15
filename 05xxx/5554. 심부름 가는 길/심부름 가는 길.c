#include<stdio.h>

int main(void){
	int A,B,C,D,MM=0,SS=0;
	scanf("%d%d%d%d",&A,&B,&C,&D);
	SS+=A;SS+=B;SS+=C;SS+=D;
	
	while(1){
		if(SS>59){
			SS-=60;
			MM++;
		}
		else break;
	}
	
	printf("%d\n%d",MM,SS);
	
	return 0;
}