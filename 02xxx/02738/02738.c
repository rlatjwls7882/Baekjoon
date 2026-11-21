#include<stdio.h>

int main(void){
	int N,M;
	scanf("%d%d",&N,&M);
	int arrA[N][M+1];
	int arrB[N][M+1];
	
	for(int i=0;i<N;i++)
		for(int j=0;j<M;j++)
			scanf("%d",&arrA[i][j]);
			
	for(int i=0;i<N;i++)
		for(int j=0;j<M;j++)
			scanf("%d",&arrB[i][j]);
	
	for(int i=0;i<N;i++){
		for(int j=0;j<M;j++)
			printf("%d ",arrA[i][j]+arrB[i][j]);
		puts("");
	}
	
	return 0;
}