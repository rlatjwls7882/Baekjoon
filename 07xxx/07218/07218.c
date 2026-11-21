#include<stdio.h>

int main(void) {
   int N; scanf("%d", &N);
   char S[N+1]; scanf("%s", S);

   for(int i=0;i<N;i++) {
      if(S[i]=='I') {
         printf("1 ");
         break;
      }
   }

   for(int i=0;i<N-1;i++) {
      if(S[i]=='I' && S[i+1]=='I') {
         printf("2 ");
         break;
      }
   }

   for(int i=0;i<N-2;i++) {
      if(S[i]=='I' && S[i+1]=='I' && S[i+2]=='I') {
         printf("3 ");
         break;
      }
   }

   for(int i=0;i<N-1;i++) {
      if(S[i]=='I' && S[i+1]=='V') {
         printf("4 ");
         break;
      }
   }

   for(int i=0;i<N;i++) {
      if(S[i]=='V') {
         printf("5 ");
         break;
      }
   }

   for(int i=0;i<N-1;i++) {
      if(S[i]=='V' && S[i+1]=='I') {
         printf("6 ");
         break;
      }
   }

   for(int i=0;i<N-2;i++) {
      if(S[i]=='V' && S[i+1]=='I' && S[i+2]=='I') {
         printf("7 ");
         break;
      }
   }

   for(int i=0;i<N-3;i++) {
      if(S[i]=='V' && S[i+1]=='I' && S[i+2]=='I' && S[i+3]=='I') {
         printf("8 ");
         break;
      }
   }

   for(int i=0;i<N-1;i++) {
      if(S[i]=='I' && S[i+1]=='X') {
         printf("9 ");
         break;
      }
   }

   for(int i=0;i<N;i++) {
      if(S[i]=='X') {
         printf("10 ");
         break;
      }
   }

   for(int i=0;i<N-1;i++) {
      if(S[i]=='X' && S[i+1]=='I') {
         printf("11 ");
         break;
      }
   }

   for(int i=0;i<N-2;i++) {
      if(S[i]=='X' && S[i+1]=='I' && S[i+2]=='I') {
         printf("12 ");
         break;
      }
   }
}