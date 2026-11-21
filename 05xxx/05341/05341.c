#include<stdio.h>

int main(void){
	long int arr[100];
	int N, pos=0;
	
	while(1){
		scanf("%d",&N);
		if(N==0) break;
		
		for(int i=N;i>0;i--)
			arr[pos]+=i;
		
		pos++;
	}
	
	for(int i=0;i<pos;i++)
		printf("%d\n",arr[i]);
	
	return 0;
}