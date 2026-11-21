#include<stdio.h>
#include<string.h>

int main(void){
	char a[33];
	int underbar=0;
	scanf("%s",a);
	
	for(int i=0;i<strlen(a);i++) if(a[i]=='_') underbar++;
	
	printf("%d",strlen(a)+2+underbar*5);
	
	return 0;
}