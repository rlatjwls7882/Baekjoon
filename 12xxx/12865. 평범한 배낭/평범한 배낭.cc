#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, K; cin >> N >> K;

    int WV[N+1][2];
    for(int i=1;i<=N;i++) {
        for(int j=0;j<2;j++) {
            cin >> WV[i][j];
        }
    }

    int dp[N+1][K+1];
    for(int i=0;i<=N;i++) {
        dp[i][0]=0;
    }
    for(int i=0;i<=K;i++) {
        dp[0][i]=0;
    }

    // dp[i][j]: i번째 물건을 (선택/선택x) 일때 무게가 j보다 작거나 같은 최대 가치
    for(int i=1;i<=N;i++) {
        for(int j=1;j<=K;j++) {
            dp[i][j] = dp[i-1][j];
            if(j-WV[i][0]>=0) {
                dp[i][j] = max(dp[i][j], dp[i-1][j-WV[i][0]]+WV[i][1]);
            }
        }
    }
    cout << dp[N][K];
}