#include<stdio.h>

int main(void){
	int N,arr[3];
	scanf("%d",&N);
	printf("Gnomes:\n");
	
	while(N--){
		scanf("%d%d%d",&arr[0],&arr[1],&arr[2]);
		
		if(arr[0]>=arr[1]&&arr[1]>=arr[2]) printf("Ordered\n");
		else if(arr[0]<=arr[1]&&arr[1]<=arr[2]) printf("Ordered\n");
		else printf("Unordered\n");
	}
	
	return 0;
}