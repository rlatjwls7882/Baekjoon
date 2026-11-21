#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int dp[10001][3];
    dp[1][0]=1; dp[1][1]=dp[1][2]=0;
    dp[2][0]=dp[2][1]=1; dp[2][2]=0;
    dp[3][0]=dp[3][1]=dp[3][2]=1;

    for(int i=4;i<=10000;i++) {
        dp[i][0] = dp[i-1][0];
        dp[i][1] = dp[i-2][0]+dp[i-2][1];
        dp[i][2] = dp[i-3][0]+dp[i-3][1]+dp[i-3][2];
    }

    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        cout << dp[n][0]+dp[n][1]+dp[n][2] << '\n';
    }
}