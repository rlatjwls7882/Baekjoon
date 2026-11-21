#include<stdio.h>

int main(void){
	int n;
	
	while(1){
		scanf("%d",&n);
		
		if(n==0) break;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++)
				printf("*");
			puts("");
		}
	}
	
	return 0;
}