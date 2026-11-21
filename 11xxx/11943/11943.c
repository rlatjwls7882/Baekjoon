#include<stdio.h>

int main(void){
	int a,b,c,d,case1,case2;
	scanf("%d%d%d%d",&a,&b,&c,&d);
	case1=a+d; case2=b+c;
	
	printf("%d",case1<case2?case1:case2);
	return 0;
}