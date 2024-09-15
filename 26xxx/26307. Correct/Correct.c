#include<stdio.h>

int main(void){
	int HH,MM;
	scanf("%d%d",&HH,&MM);
	
	MM+=(HH-9)*60;
	printf("%d",MM);
	
	return 0;
}