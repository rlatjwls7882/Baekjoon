#include<stdio.h>
int main(void){
	int X;
	scanf("%d",&X); //총 금액
	
	int N;
	scanf("%d",&N); //물건의 종류의 수
	
	int sum=0;
	while(N--){
		int a,b;
		scanf("%d %d",&a,&b);
		sum+=a*b;
	} 
	if(X==sum) printf("Yes");
	else printf("No");
	
	return 0;
}