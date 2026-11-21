#include<bits/stdc++.h>
using namespace std;

long long dp[1516][15];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    dp[0][0]=1;
    for(int i=1;i<=n;i++) {
        for(int j=0;j<15;j++) {
            dp[i][(j*10+1)%15] += dp[i-1][j];
            dp[i][(j*10+5)%15] += dp[i-1][j];
        }
        for(int j=0;j<15;j++) dp[i][j] %= 1000000007;
    }
    cout << dp[n][0];
}