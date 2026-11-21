#include<stdio.h>

int main(void){
	int N,X,A;
	
	scanf("%d%d",&N,&X);
	int arr[N];
	
	for(int i=0;i<N;i++){
		scanf("%d",&A);
		arr[i]=A;
	}
	
	for(int i=0;i<N;i++)
		if(arr[i]<X) printf("%d ",arr[i]);
	
	return 0;
}