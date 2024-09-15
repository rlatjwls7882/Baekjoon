#include<stdio.h>
#include<time.h>
 
int main(void){
	time_t t1;
	struct tm* t;
	
	time(&t1);
	t = localtime(&t1);
	
	int year=t->tm_year+1900;
	int month=t->tm_mon+1;
	int day=t->tm_mday;
	printf("%4d-%02d-%02d",year,month,day);
	
	return 0;
}