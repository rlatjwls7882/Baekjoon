#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, S, M; cin >> N >> S >> M;
    bool dp[M+1] = {false, };
    dp[S]=true;
    while(N-->0) {
        int V; cin >> V;
        bool nextDp[M+1] = {false, };
        for(int i=0;i<=M;i++) {
            if(dp[i]) {
                if(i-V>=0) nextDp[i-V]=true;
                if(i+V<=M) nextDp[i+V]=true;
            }
        }
        memcpy(&dp, &nextDp, sizeof(dp));
    }

    for(int i=M;i>=0;i--) {
        if(dp[i]) {
            cout << i;
            return 0;
        }
    }
    cout << -1;
}