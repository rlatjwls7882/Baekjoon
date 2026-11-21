#include<stdio.h>

int main(void){
	int N,sum=0,plus;
	char arr[81];
	scanf("%d",&N);
	
	while(N--){
		for(int i=0;arr[i];i++)
			arr[i]='\0'; //배열 초기화 
		
		scanf("%s",arr); 
		
		for(int i=0;arr[i];i++, plus=1){
		
			for(;arr[i]=='O'&&arr[i];i++)
				sum+=plus++;
				
		}
		printf("%d\n",sum);
		sum=0;
	}
	
	return 0;
}