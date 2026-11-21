#include<bits/stdc++.h>
using namespace std;

int dp[2001][2003] = {0, };
int m[2001][2003] = {0, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    for(int i=1;i<N*2;i+=2) {
        for(int j=1;j<M*2;j+=2) {
            cin >> m[i][j];
        }
    }

    int maxVal=0;
    for(int i=0;i<N;i++) {
        dp[i*2+1][1] = m[i*2+1][1];
        maxVal = max(maxVal, m[i*2+1][1]);
    }

    for(int i=2;i<=M*2+2;i++) {
        for(int j=0;j<=N*2;j++) {
            if(j-2>=0) dp[j][i] = max(dp[j][i], dp[j-2][i-2]+m[j][i]+m[j-1][i-1]);
            if(j+2<=N*2) dp[j][i] = max(dp[j][i], dp[j+2][i-2]+m[j][i]+m[j+1][i-1]);
            if(i-4>=0) dp[j][i] = max(dp[j][i], dp[j][i-4]+m[j][i-3]+m[j][i-2]+m[j][i-1]+m[j][i]);
            else if(i-2>=0) dp[j][i] = max(dp[j][i], dp[j][i-2]+m[j][i-1]+m[j][i]);
            maxVal = max(maxVal, dp[j][i]);
        }
    }
    cout << maxVal;
}