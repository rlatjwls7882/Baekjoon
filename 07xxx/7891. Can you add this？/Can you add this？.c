#include<stdio.h>

int main(void){
	int t;
	long x,y;
	
	scanf("%d",&t);
	long output[t];
	
	for(int i=0;i<t;i++){
		scanf("%d%d",&x,&y);
		output[i]=x+y;
	}
	for(int i=0;i<t;i++)
		printf("%d\n",output[i]);
	
	return 0;
}