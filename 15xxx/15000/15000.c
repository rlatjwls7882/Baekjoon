#include<stdio.h>
#include<ctype.h>

int main(void){
	char n[1000001];
	scanf("%s",n);
	int i=0;
	
	while(n[i])
		printf("%c",toupper(n[i++]));
	
	return 0;
}