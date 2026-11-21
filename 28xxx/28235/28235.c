#include<stdio.h>

int main(void){
	char arr[10];
	scanf("%s",arr);
	
	if(arr[0]=='S') printf("HIGHSCHOOL");
	else if(arr[0]=='C') printf("MASTER");
	else if(arr[0]=='2') printf("0611");
	else printf("CONTEST");
	
	return 0;
}