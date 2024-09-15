#include<stdio.h>
int main(){
	int N,num3,v=0;
	int num2[100];
	
	scanf("%d",&N);
	int i=N;
	
	for(N;N>0;N--) scanf("%d",&num2[N]);
	scanf("%d",&num3);
	
	for(i;i>0;i--) if(num2[i]==num3) v++;
	
	printf("%d",v);
}