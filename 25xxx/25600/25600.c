#include<stdio.h>

int main(void){
	int N,a,d,g,max=0;
	scanf("%d",&N);
	int arr[N+1];
	
	for(int i=0;i<N;i++){
		scanf("%d%d%d",&a,&d,&g);
		if(a==d+g) a*=2;
		arr[i]=a*(d+g);
	}
	
	for(int i=0;i<N;i++)
		if(max<arr[i]) max=arr[i];
		
	printf("%d",max);
	return 0;
}