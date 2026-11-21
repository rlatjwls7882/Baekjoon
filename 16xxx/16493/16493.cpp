#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, M; cin >> N >> M;

    int require[M+1];
    int page[M+1];
    for(int i=1;i<=M;i++) {
        cin >> require[i] >> page[i];
    }

    int dp[M+1][N+1];
    for(int i=0;i<=M;i++) {
        dp[i][0]=0;
    }
    for(int i=0;i<=N;i++) {
        dp[0][i]=0;
    }

    for(int i=1;i<=M;i++) {
        for(int j=1;j<=N;j++) {
            dp[i][j]=dp[i-1][j];
            if(j-require[i]>=0) {
                dp[i][j] = max(dp[i][j], dp[i-1][j-require[i]]+page[i]);
            }
        }
    }
    cout << dp[M][N];
}