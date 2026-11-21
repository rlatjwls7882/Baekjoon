#include<stdio.h>

int main(void){
	int T;
	scanf("%d",&T);
	int a[T],b[T];
	
	for(int i=0;i<T;i++)
		scanf("%d %d",&a[i],&b[i]);
	
	for(int i=0;i<T;i++)
		printf("Case #%d: %d + %d = %d\n",i+1,a[i],b[i],a[i]+b[i]);
		
	return 0;
}