#include<bits/stdc++.h>
using namespace std;

int breakCnt[500002];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, H; cin >> N >> H;
    for(int i=0;i<N;i++) {
        int len; cin >> len;
        if(i%2==0) {
            breakCnt[H-len+1]++;
            breakCnt[H+1]--;
        } else {
            breakCnt[1]++;
            breakCnt[len+1]--;
        }
    }

    int minBreakingCnt=INT_MAX, cnt=0;
    for(int i=1;i<=H;i++) {
        breakCnt[i+1] += breakCnt[i];
        if(breakCnt[i]<minBreakingCnt) {
            minBreakingCnt=breakCnt[i];
            cnt=1;
        } else if(breakCnt[i]==minBreakingCnt) {
            cnt++;
        }
    }
    cout << minBreakingCnt << ' ' << cnt;
}