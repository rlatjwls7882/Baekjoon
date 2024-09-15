#include<stdio.h>

int main(void){
	int N,M;
	scanf("%d%d",&N,&M);
	
	if(M==1||M==2) printf("NEWBIE!");
	else if(M<=N) printf("OLDBIE!");
	else printf("TLE!");
	
	return 0;
}