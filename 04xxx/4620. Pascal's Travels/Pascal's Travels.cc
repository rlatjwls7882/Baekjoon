#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int n; cin >> n;
        if(n==-1) break;
        string s[n];
        for(int i=0;i<n;i++) {
            cin >> s[i];
        }

        long long dp[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                dp[i][j]=0;
            }
        }
        dp[0][0]=1;

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(s[i][j]!='0') {
                    if(i+s[i][j]-'0'<n) dp[i+s[i][j]-'0'][j] += dp[i][j];
                    if(j+s[i][j]-'0'<n) dp[i][j+s[i][j]-'0'] += dp[i][j];
                }
            }
        }
        cout << dp[n-1][n-1] << '\n';
    }
}