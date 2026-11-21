#include<stdio.h>

int main(void){
	int L,A,B,C,D;
	scanf("%d%d%d%d%d",&L,&A,&B,&C,&D);
	A=(float)A/C+0.99; B=(float)B/D+0.99;
	
	if(A>B) printf("%d",L-A);
	else printf("%d",L-B);
	
	return 0;
}