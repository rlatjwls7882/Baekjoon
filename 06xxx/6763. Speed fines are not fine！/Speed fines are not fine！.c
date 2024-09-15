#include<stdio.h>

int main(void){
	int L,R;
	scanf("%d%d",&L,&R);
	
	if(R<=L) printf("Congratulations, you are within the speed limit!");
	else if(R<=L+20) printf("You are speeding and your fine is $100.");
	else if(R<=L+30) printf("You are speeding and your fine is $270.");
	else printf("You are speeding and your fine is $500.");
	
	return 0;
}