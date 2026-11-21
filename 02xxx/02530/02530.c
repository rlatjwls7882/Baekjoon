#include<stdio.h>

int main(void){
	int A,B,C,D;
	scanf("%d%d%d%d",&A,&B,&C,&D);
	C+=D;
	
	while(1){
		while(1){
			if(C>59){
				B++;
				C-=60;
			}
			else break;
		}
		
		while(1){
			if(B>59){
				A++;
				B-=60;
			}
			else break;
		}
		
		A%=24;
		printf("%d %d %d",A,B,C);
		
		return 0;
	}
}