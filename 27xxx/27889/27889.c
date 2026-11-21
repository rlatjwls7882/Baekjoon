#include<stdio.h>

int main(void){
	char arr[4];
	scanf("%s",arr);
	
	if(arr[0]=='N')
		printf("North London Collegiate School");
	else if(arr[0]=='B')
		printf("Branksome Hall Asia");
	else if(arr[0]=='K')
		printf("Korea International School");
	else
		printf("St. Johnsbury Academy");
		
	return 0;
}