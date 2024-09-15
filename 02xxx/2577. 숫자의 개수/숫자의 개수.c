#include<stdio.h>

int main(void){
	int A,B,C;
	int sum,arr[10]={0};
	
	scanf("%d%d%d",&A,&B,&C);
	sum=A*B*C;
	
	while(sum){
		arr[sum%10]++;
		sum/=10;
	}
	
	for(int i=0;i<10;i++)
		printf("%d\n",arr[i]);
		
	return 0;
}