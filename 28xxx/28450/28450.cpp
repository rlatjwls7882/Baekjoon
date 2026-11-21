#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

long long arr[1001][1001], dp[1001][1001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) for(int j=1;j<=m;j++) cin >> arr[i][j];
    long long h; cin >> h;

    for(int i=2;i<=n;i++) dp[i][0]=INF;
    for(int i=2;i<=m;i++) dp[0][i]=INF;
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=m;j++) {
            dp[i][j] = min(dp[i-1][j], dp[i][j-1])+arr[i][j];
        }
    }
    if(dp[n][m]<=h) cout << "YES\n" << dp[n][m];
    else cout << "NO";
}