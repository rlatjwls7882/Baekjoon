#include<stdio.h>
int main(){
	int a,b,c,result;
	scanf("%d%d%d",&a,&b,&c);
	if(a==b&&b==c) result=10000+a*1000;
	else if(a==b) result=1000+a*100; 
	else if(a==c) result=1000+a*100;
	else if(b==c) result=1000+b*100;
	else if(a>b&&a>c) result=a*100;
	else if(b>a&&b>c) result=b*100;
	else result=c*100;
	printf("%d",result);
}