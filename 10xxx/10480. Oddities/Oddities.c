#include<stdio.h>

int main(void){
	int n,x;
	scanf("%d",&n);
	
	while(n--){
		scanf("%d",&x);
		printf("%d ",x);
		
		if(x<0) x*=-1;
		
		if(x%2==0) printf("is even\n");
		else printf("is odd\n");
	}
	
	return 0;
}