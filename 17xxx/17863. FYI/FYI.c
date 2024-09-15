#include<stdio.h>

int main(void){
	char arr[8];
	scanf("%s",arr);
	
	if(arr[0]=='5'&&arr[1]=='5'&&arr[2]=='5') printf("YES");
	else printf("NO");
	
	return 0;
}