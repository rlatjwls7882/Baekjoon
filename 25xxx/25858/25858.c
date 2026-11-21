#include<stdio.h>

int main(void){
	int n,d,sum=0;
	scanf("%d%d",&n,&d);
	int arr[n+1];
	
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
		sum+=arr[i];
	}
	
	for(int i=0;i<n;i++)
		printf("%d\n",d*arr[i]/sum);
	
	return 0;
}