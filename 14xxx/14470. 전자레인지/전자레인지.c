#include<stdio.h>

int main(void){
	int a,b,c,d,e,t=0;
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	
	while(1){
		if(a==b) break;
		
		if(a<0){
			a++;
			t+=c;
		}
		
		if(a==0)
			t+=d;
		
		if(a>=0){
			a++;
			t+=e;
		}
	}
	
	printf("%d",t);
	return 0;
}