#include<stdio.h>

int main(void){
	int n,copy;
	scanf("%d",&n);
	int arr[n];
	
	for(int i=0;i<n;i++){
		scanf("%d",&copy);
		printf("%d %d\n",copy,copy);
	}
	
	return 0;
}