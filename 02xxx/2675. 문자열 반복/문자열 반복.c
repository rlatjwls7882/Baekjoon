#include<stdio.h>

int main(void){
	int T,R;
	char S[20];
	scanf("%d",&T);
	
	while(T--){
		scanf("%d %s",&R,S);
		for(int i=0;S[i]!='\0';i++)
			for(int j=0;j<R;j++)
				printf("%c",S[i]);
		puts("");
	}
	
	return 0;
}