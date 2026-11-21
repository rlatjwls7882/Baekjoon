#include<bits/stdc++.h>
using namespace std;
long MOD = 1000000007;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    long long dp[8] = {1, 0, };
    while(N-->0) {
        long long nextDp[8] = {0, };
        nextDp[0] = (dp[1]+dp[2])%MOD;
        nextDp[1] = (dp[0]+dp[2]+dp[3])%MOD;
        nextDp[2] = (dp[0]+dp[1]+dp[3]+dp[4])%MOD;
        nextDp[3] = (dp[1]+dp[2]+dp[4]+dp[5])%MOD;
        nextDp[4] = (dp[2]+dp[3]+dp[5]+dp[7])%MOD;
        nextDp[5] = (dp[3]+dp[4]+dp[6])%MOD;
        nextDp[6] = (dp[5]+dp[7])%MOD;
        nextDp[7] = (dp[4]+dp[6])%MOD;
        memcpy(&dp, &nextDp, sizeof(dp));
    }
    cout << dp[0];
}