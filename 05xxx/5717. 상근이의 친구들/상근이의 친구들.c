#include<stdio.h>

int main(void){
	int M,F;
	
	while(1){
		scanf("%d%d",&M,&F);
		if(M==0&&F==0) break;
		
		printf("%d\n",M+F);
	}
	
	return 0;
}