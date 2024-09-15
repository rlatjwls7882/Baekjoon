#include<stdio.h>

int main(void){
	int T,a,b,c;
	scanf("%d",&T);
	
	while(T--){
		scanf("%d%d%d",&a,&b,&c);
		int num=0;
		
		for(int x=1;x<=a;x++)
			for(int y=1;y<=b;y++)
				for(int z=1;z<=c;z++)
					if(x%y==y%z&&y%z==z%x) num++;
		
		printf("%d\n",num);
	}
	
	return 0;
}