#include<stdio.h>

int main(void){
	int arr[26];
	char S[101];
	scanf("%s",S);
	
	for(int i=0;i<26;i++)
		arr[i]=-1;
		
	for(int i=0;S[i];i++)
		if(arr[S[i]-'a']==-1)
			arr[S[i]-'a']=i;
	
	for(int i=0;i<26;i++)
		printf("%d ",arr[i]);
		
	return 0;
}