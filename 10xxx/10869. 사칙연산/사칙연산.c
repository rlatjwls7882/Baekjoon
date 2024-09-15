#include<stdio.h>
int main()
{
	int A,B;
	scanf("%d%d",&A,&B);
	if(A>=1&&B<=10000)
	printf("%d\n",A+B);
	printf("%d\n",A-B);
	printf("%d\n",A*B);
	printf("%d\n",A/B);
	printf("%d\n",A%B);
	return 0;
}