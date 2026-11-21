#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    
    long long dp[21] = {0, 0, };
    int first; cin >> first; dp[first]++;
    while(N-->2) {
        long long nextDp[21] = {0, };
        int tmp; cin >> tmp;
        for(int i=0;i<=20;i++) {
            if(i+tmp<=20) nextDp[i+tmp] += dp[i];
            if(i-tmp>=0) nextDp[i-tmp] += dp[i];
        }
        memcpy(&dp, &nextDp, sizeof(dp));
    }

    int res; cin >> res;
    cout << dp[res];
}