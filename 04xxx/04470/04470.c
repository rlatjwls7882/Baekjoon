#include<stdio.h>

int main(void){
	int N, pos=1;
	char arr[51];
	scanf("%d",&N);
	
	while(N--){
		getchar();
		scanf("%[^\n]",arr);
		printf("%d. %s\n",pos++,arr);
	}
	
	return 0;
}