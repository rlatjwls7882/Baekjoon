#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int k, n; cin >> k >> n;

    long long dp[k+n+1] = {0, };
    dp[k]=1;
    for(int i=0;i<n;i++) {
        long long nextDp[k+n+1] = {0, };
        for(int j=1;j<k+n;j++) {
            nextDp[j-1] += dp[j];
            nextDp[j+1] += dp[j];
        }
        memcpy(&dp, &nextDp, sizeof(dp));
    }

    long long cnt=0;
    for(int i=1;i<=k+n;i++) {
        cnt += dp[i];
    }
    cout << cnt;
}