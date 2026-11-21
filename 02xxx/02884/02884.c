#include<stdio.h>
int main(){
int hour,min;
scanf("%d %d",&hour,&min);
if(min>=45){
min=min-45;
	}
else if(hour>=1){
	hour--;
	min=15+min;
	}
else{
	hour=23;
	min=15+min;
	}
printf("%d %d",hour,min);
}