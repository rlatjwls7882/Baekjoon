#include<stdio.h>

int main(void){
	char arr[1000000];
	int num=0;
	
	while(scanf("%s",arr)!=EOF)
		num++;
	
	printf("%d",num);
	
	return 0;
}