#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    int L[N+1];
    int J[N+1];
    for(int i=1;i<=N;i++) {
        cin >> L[i];
    }
    for(int i=1;i<=N;i++) {
        cin >> J[i];
    }

    int dp[N+1][100];
    for(int i=0;i<=99;i++) {
        dp[0][i]=0;
    }
    for(int i=0;i<=N;i++) {
        dp[i][0]=0;
    }

    for(int i=1;i<=N;i++) {
        for(int j=1;j<=99;j++) {
            dp[i][j] = dp[i-1][j];
            if(j-L[i]>=0) {
                dp[i][j] = max(dp[i][j], dp[i-1][j-L[i]]+J[i]);
            }
        }
    }
    cout << dp[N][99];
}