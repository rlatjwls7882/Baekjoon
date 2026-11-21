#include<stdio.h>
#include<string.h>

int main(void){
	int N;
	scanf("%d",&N);
	char S[N+1];
	scanf("%s",S);
	
	if(S[strlen(S)-1]=='G')
		for(int i=0;i<strlen(S)-1;i++) printf("%c",S[i]);
	else{
		printf("%s",S);
		printf("G");
	}
	
	return 0;
}