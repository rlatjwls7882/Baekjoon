#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int n; cin >> n;

    while(n-->0) {
        int i, w; cin >> i >> w;

        int dp[w+1] = {0, };
        while(i-->0) {
            int value, weight; cin >> value >> weight;
            int nextDp[w+1]; memcpy(&nextDp, &dp, sizeof(dp));
            for(int j=weight;j<=w;j++) {
                nextDp[j] = max(nextDp[j], dp[j-weight]+value);
            }
            memcpy(&dp, &nextDp, sizeof(dp));
        }
        cout << dp[w] << endl;
    }
}