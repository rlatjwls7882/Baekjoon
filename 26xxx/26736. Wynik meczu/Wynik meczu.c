#include<stdio.h>

int main(void){
	int A=0,B=0;
	char arr[100000]={0};
	scanf("%s",arr);
	
	for(int i=0;arr[i];i++){
		if(arr[i]=='A') A++;
		else B++;
	}
	printf("%d : %d",A,B);
	
	return 0;
}