#include<stdio.h>

int main(void){
	char arr[30];
	int num=0;
	
	while(scanf("%[^\n]",arr)!=EOF){
		getchar();
		num++;
	}
	printf("%d",num);
	
	return 0;
}