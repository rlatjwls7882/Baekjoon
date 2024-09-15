#include<stdio.h>

void print(int H1,int M1,int S1,int H2,int M2,int S2){
	H2-=H1; M2-=M1; S2-=S1;
	
	if(S2<0){
		S2+=60;
		M2--;
	}
	
	if(M2<0){
		M2+=60;
		H2--;
	}
	
	printf("%d %d %d\n",H2,M2,S2);
}

int main(void){
	int H1,M1,S1,H2,M2,S2;
	int repeat=3;
	
	while(repeat--){
		scanf("%d%d%d%d%d%d",&H1,&M1,&S1,&H2,&M2,&S2);
		print(H1,M1,S1,H2,M2,S2);	
	}

	return 0;
} 