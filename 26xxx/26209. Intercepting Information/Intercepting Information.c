#include<stdio.h>

int main(void){
	int N[8];
	int F=0;
	
	for(int i=0;i<8;i++){
		scanf("%d",&N[i]);
		if(N[i]==9) F=1;
	}
	
	if(F==1) printf("F");
	else printf("S");
	
	return 0;
}