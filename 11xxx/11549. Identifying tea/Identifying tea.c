#include<stdio.h>

int main(void){
	int T,arr[5],sum=0;
	scanf("%d",&T);
	
	for(int i=0;i<5;i++)
		scanf("%d",&arr[i]);
	
	for(int i=0;i<5;i++)
		if(arr[i]==T) sum++;
	
	printf("%d",sum);
	return 0;
}