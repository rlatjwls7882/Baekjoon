#include<bits/stdc++.h>
using namespace std;

int a, b, c, p;
int dp[603][101][2][7]; // dp[i][j][k][l] : i초 j마나 스트라이크기 k쿨타임, 박치기가 l쿨타임일 때의 최대 데미지

int solve() {
    memset(dp, 0, sizeof dp);

    for(int i=1;i<=600;i++) {
        int curMax=0;
        for(int j=0;j<=100;j++) {
            for(int k=0;k<=1;k++) {
                for(int l=0;l<=6;l++) {
                    dp[i+1][min(100, j+1)][0][max(0, l-1)] = max(dp[i+1][min(100, j+1)][0][max(0, l-1)], dp[i][j][k][l]+100);
                    dp[i+1][min(100, j+8)][0][max(0, l-1)] = max(dp[i+1][min(100, j+8)][0][max(0, l-1)], dp[i][j][k][l]+a);
                    curMax = max({curMax, dp[i][j][k][l]+100, dp[i][j][k][l]+a});
                    if(j>=10) {
                        if(k==0) {
                            dp[i+2][j-8][1][max(0, l-2)] = max(dp[i+2][j-8][1][max(0, l-2)], dp[i][j][k][l]+b);
                            curMax = max(curMax, dp[i][j][k][l]+b);
                        }
                        if(l==0) {
                            dp[i+2][j-8][0][6] = max(dp[i+2][j-8][0][6], dp[i][j][k][l]+c);
                            curMax = max(curMax, dp[i][j][k][l]+c);
                        }
                    }
                }
            }
        }
        if(curMax>=p) return i;
    }
    return -1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        cin >> a >> b >> c >> p;
        cout << solve() << '\n';
    }
}