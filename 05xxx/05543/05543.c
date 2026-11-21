#include<stdio.h>

int main(void){
	int tmp,min1=2000,min2=2000;
	
	for(int i=0;i<3;i++){
		scanf("%d",&tmp);
		if(min1>tmp) min1=tmp;
	}
	
	for(int i=0;i<2;i++){
		scanf("%d",&tmp);
		if(min2>tmp) min2=tmp;
	}
	
	printf("%d",min1+min2-50);
	return 0;
}