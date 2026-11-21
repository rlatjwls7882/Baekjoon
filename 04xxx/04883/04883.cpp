#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    for(int k=1;;k++) {
        int n; cin >> n;
        if(n==0) break;
        int dp[3]; cin >> dp[0] >> dp[1] >> dp[2];
        dp[0]=1000000000;
        if(dp[2]<=0) dp[2] += dp[1];
        else dp[2]=1000000000;
        while(n-->1) {
            int m[3]; cin >> m[0] >> m[1] >> m[2];
            int nextDp[3] = {0, };
            for(int i=0;i<3;i++) {
                nextDp[i] = dp[i]+m[i];
                if(i-1>=0) {
                    nextDp[i] = min(nextDp[i], dp[i-1]+m[i]);
                    nextDp[i] = min(nextDp[i], nextDp[i-1]+m[i]);
                }
                if(i+1<3) nextDp[i] = min(nextDp[i], dp[i+1]+m[i]);
            }
            memcpy(&dp, &nextDp, sizeof(dp));
        }
        cout << k << ". " << dp[1] << '\n';
    }
}