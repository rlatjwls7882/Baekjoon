#include<stdio.h>

int main(void){
	int a[3];
	scanf("%d%d%d",&a[0],&a[1],&a[2]);
	
	for(int i=0;i<2;i++)
		for(int j=0;j<2-i;j++)
			if(a[j]>a[j+1]){
				int tmp=a[j];
				a[j]=a[j+1];
				a[j+1]=tmp;
			}
			
	printf("%d %d %d",a[0], a[1], a[2]);
	return 0;
}