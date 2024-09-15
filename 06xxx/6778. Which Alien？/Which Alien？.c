#include<stdio.h>

int main(void){
	int A,E;
	scanf("%d%d",&A,&E);
	
	if(A>=3&&E<=4) printf("TroyMartian\n");
	if(A<=6&&E>=2) printf("VladSaturnian\n");
	if(A<=2&&E<=3) printf("GraemeMercurian\n");
	
	return 0;
}