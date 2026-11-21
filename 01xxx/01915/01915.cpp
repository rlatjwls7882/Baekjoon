#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    string s[n];
    for(int i=0;i<n;i++) {
        cin >> s[i];
    }

    int dp[n+1][m+1];
    for(int i=0;i<=n;i++) {
        dp[i][0]=0;
    }
    for(int i=0;i<=m;i++) {
        dp[0][i]=0;
    }

    int maxSize=0;
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=m;j++) {
            if(s[i-1][j-1]=='1') dp[i][j] = min(min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1])+1;
            else dp[i][j]=0;
            maxSize = max(maxSize, dp[i][j]);
        }
    }
    cout << maxSize*maxSize;
}