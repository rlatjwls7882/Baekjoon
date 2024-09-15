#include<stdio.h>

int main(void){
	int i,sum=0,a[6];
	scanf("%d%d%d%d%d%d",&i,&a[0],&a[1],&a[2],&a[3],&a[4]);
	
	for(int j=0;j<5;j++)
		if(i==a[j]) sum++;
	
	printf("%d",sum);
	return 0;
}