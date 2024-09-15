#include<stdio.h>

int main(void){
	
	int MAX=0, nums, pos;
	
	for(int i=1;i<=9;i++){
		scanf("%d",&nums);
		if(MAX<nums){
			MAX=nums;
			pos=i;
		}
	}
	printf("%d\n%d",MAX,pos);
	
	return 0;
}