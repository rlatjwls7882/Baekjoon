#include<stdio.h>

int main(void){
	int N,num;
	int i=1;
	
	while(scanf("%d",&N)){
		if(N==0) break;
		while(N--) scanf("%d",&num);
		
		printf("Case %d: Sorting... done!\n",i++);
	}
		
	return 0;
}