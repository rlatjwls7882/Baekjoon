#include<bits/stdc++.h>
using namespace std;
const int MOD = 1000007;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int w, h, x, y; cin >> w >> h >> x >> y;

    int dp[h][w];
    for(int i=0;i<y;i++) {
        for(int j=0;j<x;j++) {
            if(i==0 || j==0) dp[i][j]=1;
            else dp[i][j] = dp[i-1][j]+dp[i][j-1];
            dp[i][j] %= MOD;
        }
    }
    for(int i=y-1;i<h;i++) {
        for(int j=x-1;j<w;j++) {
            if(!(i==y-1 && j==x-1)) {
                if(i==y-1) dp[i][j] = dp[i][j-1];
                else if(j==x-1) dp[i][j] = dp[i-1][j];
                else dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
            dp[i][j] %= MOD;
        }
    }
    cout << dp[h-1][w-1];
}