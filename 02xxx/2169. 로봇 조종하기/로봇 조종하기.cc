#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

int arr[1001][1002];
int dp[1001][1002][2]; // dp[i][j][k] : (i, j)에 (k=0 : 왼쪽에서 옴, k=1 : 오른쪽에서 옴) 인 경우의 최대 가치

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=m;j++) {
            cin >> arr[i][j];
        }
    }
    fill(&dp[0][0][0], &dp[1000][1001][2], -INF);

    // 첫번째 줄
    dp[1][0][0]=0;
    for(int j=1;j<=m;j++) {
        dp[1][j][0] = dp[1][j-1][0] + arr[1][j];
    }

    for(int i=2;i<=n;i++) {
        for(int j=1;j<=m;j++) {
            dp[i][j][0] = arr[i][j] + max({dp[i][j-1][0], dp[i-1][j][0], dp[i-1][j][1]});
        }
        for(int j=m;j>=1;j--) {
            dp[i][j][1] = arr[i][j] + max({dp[i][j+1][1], dp[i-1][j][0], dp[i-1][j][1]});
        }
    }
    cout << dp[n][m][0]; // (n, m)에는 왼쪽 또는 위쪽에서만 올 수 있음.
}