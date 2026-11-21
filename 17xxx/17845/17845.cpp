#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, K; cin >> N >> K;

    int IT[K+1][2];
    for(int i=1;i<=K;i++) {
        cin >> IT[i][0] >> IT[i][1];
    }

    int dp[K+1][N+1];
    for(int i=0;i<=K;i++) {
        dp[i][0]=0;
    }
    for(int i=0;i<=N;i++) {
        dp[0][i]=0;
    }

    for(int i=1;i<=K;i++) {
        for(int j=1;j<=N;j++) {
            dp[i][j] = dp[i-1][j];
            if(j-IT[i][1]>=0) {
                dp[i][j] = max(dp[i-1][j], dp[i-1][j-IT[i][1]]+IT[i][0]);
            }
        }
    }
    cout << dp[K][N];
}