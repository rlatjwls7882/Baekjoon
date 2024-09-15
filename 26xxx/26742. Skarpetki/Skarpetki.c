#include<stdio.h>

int main(void){
	char BC[1000001];
	int B=0,C=0;
	scanf("%s",BC);
	
	for(int i=0;BC[i];i++){
		if(BC[i]=='B') B++;
		else C++;
	}
	
	printf("%d",B/2+C/2);
	return 0;
}