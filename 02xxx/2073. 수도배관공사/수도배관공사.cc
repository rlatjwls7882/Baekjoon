#include <bits/stdc++.h>

using namespace std;

int INF = 1000000;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int D, P; cin >> D >> P;

    int dp[D+1] = {INF+1, };
    for(int i=1;i<=D;i++) {
        dp[i]=INF;
    }

    while(P-->0) {
        int L, C; cin >> L >> C;
        int nextDp[D+1];
        memcpy(&nextDp, &dp, sizeof(dp));

        for(int i=L;i<=D;i++) {
            if(dp[i-L]!=INF) {
                if(nextDp[i]==INF) {
                    nextDp[i]=0;
                }
                nextDp[i] = max(nextDp[i], min(dp[i-L], C));
            }
        }
        memcpy(&dp, &nextDp, sizeof(dp));
    }
    cout << dp[D];
}