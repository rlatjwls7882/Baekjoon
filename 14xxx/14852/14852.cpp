#include<bits/stdc++.h>
using namespace std;

const long long MOD = 1e9+7;
long long dp[1'000'001][2];
/** 
 * dp[i][0] : i까지의 경우의 수
 * dp[i][1] : 0~i까지의 경우의 수의 합
 */

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    dp[0][0]=dp[0][1]=1;
    for(int i=1;i<=n;i++) {
        dp[i][0] += dp[i-1][0]*2;
        if(i>=2) dp[i][0] += dp[i-2][0]*3;
        if(i>=3) dp[i][0] += dp[i-3][1]*2;
        dp[i][0] %= MOD;
        dp[i][1] = (dp[i-1][1]+dp[i][0])%MOD;
    }
    cout << dp[n][0];
}