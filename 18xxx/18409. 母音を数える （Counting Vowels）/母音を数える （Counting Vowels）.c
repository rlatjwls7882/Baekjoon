#include<stdio.h>

int main(void){
	int N,num=0;
	scanf("%d",&N);
	char S[N];
	scanf("%s",S);
	
	for(int i=0;i<N;i++)
		if(S[i]=='a'||S[i]=='i'||S[i]=='u'||S[i]=='e'||S[i]=='o')
			num++;
	
	printf("%d",num);
	return 0;
}