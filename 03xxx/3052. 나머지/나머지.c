#include<stdio.h>

int main(void){
	int A,stack=0;
	int arr[42]={0}; //모든 값 0으로 초기화 
	
	for(int i=0;i<10;i++){ 
		scanf("%d",&A);
		arr[A%42]++;
	}
	
	for(int i=0;i<42;i++)
		if(arr[i]>=1) stack++;
	
	printf("%d",stack);
	
	return 0;
}