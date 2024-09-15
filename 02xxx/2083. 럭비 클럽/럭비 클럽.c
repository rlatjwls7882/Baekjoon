#include<stdio.h>

int main(void){
	char name[11];
	int age,weight;
	
	while(1){
		for(int i=0;name[i];i++) name[i]=0;
		
		scanf("%s%d%d",name,&age,&weight);
		if(name[0]=='#') break;
		
		printf("%s ", name);
		if(age>17||weight>=80) printf("Senior\n");
		else printf("Junior\n");
	}
	
	return 0;
}