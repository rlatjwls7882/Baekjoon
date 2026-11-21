#include<stdio.h>

int main(void){
	int a,b,num=0;
	int arr[100];
	
	for(int i=0;arr;i++,num++){
		scanf("%d %d",&a,&b);
		
		if(a+b==0) break;
		
		arr[i]=a+b;
	}
	
	for(int i=0;i<num;i++)
		printf("%d\n",arr[i]);
		
	return 0;
}