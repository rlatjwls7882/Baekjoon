#include<stdio.h>

int main(void){
	char arr[101];
	
	while(scanf("%[^\n]",arr)!=EOF){
		printf("%s\n",arr);
		getchar();
	}
		
	return 0;
}