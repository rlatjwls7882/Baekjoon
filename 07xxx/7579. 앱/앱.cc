#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int m[N], c[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }
    for(int i=0;i<N;i++) {
        cin >> c[i];
    }

    int dp[10001] = {0, 0, };
    for(int i=0;i<N;i++) {
        int nextDp[10001]; memcpy(&nextDp, &dp, sizeof(dp));
        for(int j=c[i];j<=10000;j++) {
            nextDp[j] = max(dp[j-c[i]]+m[i], nextDp[j]);
        }
        memcpy(&dp, &nextDp, sizeof(dp));
    }

    for(int i=0;i<=10000;i++) {
        if(dp[i]>=M) {
            cout << i;
            return 0;
        }
    }
}