#include<stdio.h>
int main(void){
	int N,M,pos=0;
	char *arr[100];
	
	while(1){
		scanf("%d %d",&N,&M);
		
		if(N==0&&M==0) break;
		
		if(N>M) arr[pos++]="Yes";
		else arr[pos++]="No";	
	}
	
	for(int i=0;i<pos;i++)
		printf("%s\n",arr[i]);
	
	return 0;
}