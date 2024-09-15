#include<stdio.h>
#include<ctype.h>

int main(void){
	char arr[101];
	int i=0;
	scanf("%s",arr);
	
	while(arr[i]){
		if(isupper(arr[i])) arr[i]=tolower(arr[i]);
		else arr[i]=toupper(arr[i]);
		i++;
	}
	
	printf("%s",arr);
	return 0;
}