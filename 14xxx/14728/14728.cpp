#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, T; cin >> N >> T;

    int KS[N+1][2];
    for(int i=1;i<=N;i++) {
        cin >> KS[i][0] >> KS[i][1];
    }

    int dp[N+1][T+1];
    for(int i=0;i<=T;i++) {
        dp[0][i]=0;
    }
    for(int i=0;i<=N;i++) {
        dp[i][0]=0;
    }

    for(int i=1;i<=N;i++) {
        for(int j=1;j<=T;j++) {
            dp[i][j] = dp[i-1][j];
            if(j-KS[i][0]>=0) {
                dp[i][j] = max(dp[i][j], dp[i-1][j-KS[i][0]]+KS[i][1]);
            }
        }
    }
    cout << dp[N][T];
}