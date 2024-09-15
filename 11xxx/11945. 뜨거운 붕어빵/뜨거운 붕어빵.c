#include<stdio.h>

int main(void){
	int N,M;
	scanf("%d%d",&N,&M);
	char arr[N][M+1];
	
	for(int i=0;i<N;i++)
		for(int j=0;j<M+1;j++) //'\n'까지 입력됨 
			scanf("%c",&arr[i][j]); 
	
	for(int i=0;i<N;i++)
		for(int j=M;j>=0;j--)
			printf("%c",arr[i][j]); //그래서 추가로 개행할 필요가 없음
	
	return 0;
}