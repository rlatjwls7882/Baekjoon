#include<stdio.h>

int main(void){
	int T,a,b;
	scanf("%d",&T);
	int arr[T];
	
	for(int i=0;i<T;i++){
		scanf("%d %d",&a,&b);
		arr[i]=a+b;
	}
	
	for(int i=0;i<T;i++)
		printf("Case #%d: %d\n",i+1,arr[i]);
		
	return 0;
}