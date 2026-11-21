#include<stdio.h>
#include<ctype.h>

int main(void){
	int max=0,num=0,pos,alpha[27]={0};
	char arr[1000001];
	scanf("%s",arr);
	
	for(int i=0;arr[i];i++){
		if(isupper(arr[i])) alpha[arr[i]-'A']++;
		else alpha[arr[i]-'a']++;
	}
	
	for(int i=0;i<26;i++)
		if(alpha[i]>max){
			max=alpha[i];
			pos=i;
		}
		
	for(int i=0;i<26;i++)
		if(alpha[i]==max) num++;
	
	if(num>1) printf("?");
	else printf("%c", pos+'A');
	
	return 0;
}