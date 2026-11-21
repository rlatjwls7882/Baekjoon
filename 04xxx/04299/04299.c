#include<stdio.h>

int main(void){
	int plus,minus,a,b;
	scanf("%d%d",&plus,&minus);
	
	a=(plus+minus)/2;
	b=(plus-minus)/2;
	
	if(a+b!=plus||plus<minus) printf("-1");
	else if(a>b) printf("%d %d",a,b);
	else printf("%d %d",b,a);
	
	return 0;
}