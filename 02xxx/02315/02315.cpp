#include<bits/stdc++.h>
using namespace std;

const long long INF = 1'000'000'000'000;

int n, m;
long long dp[1001][1001][2];
// dp[i][j][k(left or right)] : 이미 끈 가로등의 왼쪽 끝이 i이고, 오른쪽 끝이 j이고 현재 k(왼쪽 끝 혹은 오른쪽 끝)에 위치한 경우의 최소 비용

int pos[1001]; // i번째 가로등의 위치
long long preSum[1001]; // i번째 가로등까지의 초당 비용

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=1;i<=n;i++) {
        cin >> pos[i] >> preSum[i];
        preSum[i] += preSum[i-1];
    }

    fill(&dp[0][0][0], &dp[1000][1000][2], INF);
    dp[m][m][0] = dp[m][m][1] = 0;
    for(int range=0;range<n;range++) {
        for(int l=1;l+range<=n;l++) {
            int r = l+range;
            long long curCost = preSum[l-1] + preSum[n] - preSum[r];
            if(l-1>=1) dp[l-1][r][0] = min({dp[l-1][r][0], dp[l][r][0]+curCost*(pos[l]-pos[l-1]), dp[l][r][1]+curCost*(pos[r]-pos[l-1])});
            if(r+1<=n) dp[l][r+1][1] = min({dp[l][r+1][1], dp[l][r][0]+curCost*(pos[r+1]-pos[l]), dp[l][r][1]+curCost*(pos[r+1]-pos[r])});
        }
    }
    cout << min(dp[1][n][0], dp[1][n][1]);
}