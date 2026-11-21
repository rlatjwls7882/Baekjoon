#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    
    int totalCnt=0;
    for(int i=2;i<=N;i++) {
        int tmpCnt=1, tmp=i;
        for(int j=2;tmp!=1;j++) {
            if(tmp%j==0) {
                int cnt=0;
                while(tmp%j==0) {
                    tmp/=j;
                    cnt++;
                }
                tmpCnt *= (j-1)*pow(j, cnt-1);
            }
        }
        totalCnt += tmpCnt;
    }
    cout << totalCnt;
}