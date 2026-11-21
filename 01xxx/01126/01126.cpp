#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;
const int MAX = 500'000;

int dp[51][MAX*2+1]; // dp[i][j] : 왼쪽 - 오른쪽 = j일때 왼쪽 높이

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    memset(dp, -1, sizeof dp);
    dp[0][MAX]=0;

    for(int i=1;i<=n;i++) {
        int h; cin >> h;
        for(int j=0;j<=MAX*2;j++) {
            if(dp[i-1][j]==-1) continue;
            dp[i][j]=max(dp[i][j], dp[i-1][j]);
            dp[i][j+h]=max(dp[i][j+h], dp[i-1][j]+h);
            dp[i][j-h] = max(dp[i][j-h], dp[i-1][j]);
        }
    }
    cout << (dp[n][MAX] ? dp[n][MAX] : -1);
}