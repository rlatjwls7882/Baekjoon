#include<stdio.h>

int main(void){
	int alpha[27]={0};
	char S[101];
	scanf("%s",S);
	
	for(int i=0;S[i];i++){
		S[i]-='a';
		alpha[S[i]]++;
	}
	
	for(int i=0;i<26;i++)
		printf("%d ",alpha[i]);
	
	return 0;
}