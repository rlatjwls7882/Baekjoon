#include<stdio.h>

int main(void){
	int MIN=1000000,MAX=-1000000;
	int N,a;
	
	scanf("%d",&N);
	
	while(N--){
		scanf("%d",&a);
		if(MAX<a) MAX=a;
		if(MIN>a) MIN=a;
	}
	
	printf("%d %d",MIN,MAX);
	
	return 0;
}