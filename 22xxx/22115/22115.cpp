#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, K; cin >> N >> K;

    int C[N+1];
    for(int i=1;i<=N;i++) {
        cin >> C[i];
    }

    int dp[N+1][K+1];
    for(int i=0;i<=N;i++) {
        dp[i][0]=1000;
    }
    for(int i=0;i<=K;i++) {
        dp[0][i]=1000;
    }
    dp[0][0]=0;

    for(int i=1;i<=N;i++) {
        for(int j=0;j<=K;j++) {
            dp[i][j] = dp[i-1][j];
            if(j-C[i]>=0 && dp[i-1][j-C[i]]!=1000) {
                dp[i][j] = min(dp[i][j], dp[i-1][j-C[i]]+1);
            }
        }
    }
    cout << (dp[N][K]!=1000 ? dp[N][K] : -1);
}