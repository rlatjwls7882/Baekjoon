#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;

    long long dp[100001][2];
    dp[0][0]=dp[0][1]=0;
    dp[1][0]=1; dp[1][1]=0;

    for(int i=2;i<=100000;i++) {
        dp[i][0] = dp[i-1][1];
        dp[i][1] = dp[i-1][0];
        if(i-2>=0) {
            dp[i][0] += dp[i-2][1];
            dp[i][1] += dp[i-2][0];
        }
        if(i-3>=0) {
            dp[i][0] += dp[i-3][1];
            dp[i][1] += dp[i-3][0];
        }
        if(i<=3) dp[i][0]++;
        dp[i][0] %= 1000000009;
        dp[i][1] %= 1000000009;
    }

    while(T-->0) {
        int n; cin >> n;
        cout << dp[n][0] << ' ' << dp[n][1] << '\n';
    }
}