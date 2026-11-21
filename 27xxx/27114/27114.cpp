#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
int dp[1'000'001][4];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, c, k; cin >> a >> b >> c >> k;

    fill(&dp[0][0], &dp[1'000'000][4], INF);
    dp[k][0]=0;

    for(int i=k;i>0;i--) {
        for(int j=0;j<4;j++) {
            if(i-a>=0) dp[i-a][(j+1)%4] = min(dp[i-a][(j+1)%4], dp[i][j]+1);
            if(i-b>=0) dp[i-b][(j+3)%4] = min(dp[i-b][(j+3)%4], dp[i][j]+1);
            if(i-c>=0) dp[i-c][(j+2)%4] = min(dp[i-c][(j+2)%4], dp[i][j]+1);
        }
    }
    cout << (dp[0][0] == INF ? -1 : dp[0][0]);
}