#include<stdio.h>
#include<ctype.h>

int main(void){
	int N;
	char arr[1000];
	scanf("%d",&N);
	
	while(N--){
		scanf("%s",arr);
		
		for(int i=0;arr[i];i++)
			if(isupper(arr[i])) arr[i]-='A'-'a';
		
		printf("%s\n",arr);
		
		for(int i=0;arr[i];i++) //배열 초기화 
			arr[i]=0;
	}
	
	return 0;
}