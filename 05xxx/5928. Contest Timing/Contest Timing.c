#include<stdio.h>

int main(void){
	int D,H,M;
	scanf("%d%d%d",&D,&H,&M);
	
	if(D<11||(D==11&&H<11)||(D==11&&H==11&&M<11)) printf("-1");
	else printf("%d",((D-11)*24+H-11)*60+(M-11));
	
	return 0;
}