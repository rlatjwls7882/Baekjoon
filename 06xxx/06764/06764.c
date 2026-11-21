#include<stdio.h>

int main(void){
	int A,B,C,D;
	scanf("%d%d%d%d",&A,&B,&C,&D);
	
	if(A<B&&B<C&&C<D) printf("Fish Rising");
	else if(A>B&&B>C&&C>D) printf("Fish Diving");
	else if(A==B&&B==C&&C==D) printf("Fish At Constant Depth");
	else printf("No Fish");
	
	return 0;
}