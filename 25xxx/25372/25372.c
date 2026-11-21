#include<stdio.h>

int main(void){
	int N;
	char arr[20];
	scanf("%d",&N);
	
	while(N--){
		scanf("%s",arr);
		int len=strlen(arr);
		if(6<=len&&len<=9) printf("yes\n");
		else printf("no\n");
	}
	
	return 0;
}