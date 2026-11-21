#include<stdio.h>
#include<string.h>

int main(void){
	char arr[501];
	
	while(scanf("%[^\n]",arr)){
		getchar(); //개행문자 
		
		if(strcmp(arr,"END")==0) break;
		
		for(int i=strlen(arr)-1;i>=0;i--)
			printf("%c",arr[i]);
		puts("");
		
		for(int i=0;arr[i];i++) // 배열 초기화 
			arr[i]=0;
	}
	
	return 0;
}