#include<stdio.h>

int main(void){
	char arr[256];
	int num=0;
	
	while(scanf("%[^\n]",arr)){
		if(arr[0]=='#') break;
		getchar(); // 개행문자 
		
		for(int i=0;arr[i];i++)
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
				num++;
		
		printf("%d\n",num);
		num=0;
		
		for(int i=0;arr[i];i++) //배열 초기화 
			arr[i]=0;
	}
	
	return 0;
}