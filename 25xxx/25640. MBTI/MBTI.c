#include<stdio.h>
#include<string.h>

int main(void){
	int N, sum=0;
	char MBTI1[5],MBTI2[5];
	scanf("%s",MBTI1);
	scanf("%d",&N);
	
	while(N--){
		scanf("%s",MBTI2);
		if(strcmp(MBTI1,MBTI2)==0) sum++;
	}
	
	printf("%d",sum);
	return 0;
}