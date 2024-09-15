#include<stdio.h> 
int main(){
	char A[1000];
	int num;
	
	scanf("%s",A);
	scanf("%d",&num);
	printf("%c",A[num-1]);
} 