#include<stdio.h>

int main(void){
	char T,arr[1000];
	scanf("%d",&T);
	
	while(T--){
		scanf("%s",arr);
		printf("%c%c\n",arr[0],arr[strlen(arr)-1]);
	}
	
	return 0;
}