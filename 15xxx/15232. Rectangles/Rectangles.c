#include<stdio.h>

int main(void){
	int a,b;
	scanf("%d%d",&a,&b);
	
	for(int i=0;i<a;i++){
		for(int j=0;j<b;j++)
			printf("*");
		puts("");
	}
	
	return 0;
}