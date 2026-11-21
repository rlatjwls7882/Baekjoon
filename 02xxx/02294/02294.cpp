#include <bits/stdc++.h>

using namespace std;

int INF = 1000000000;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int n, k; cin >> n >> k;

    int dp[k+1] = {0, };
    for(int i=1;i<=k;i++) {
        dp[i]=INF;
    }

    while(n-->0) {
        int coin; cin >> coin;
        for(int i=coin;i<=k;i++) {
            dp[i] = min(dp[i], dp[i-coin]+1);
        }
    }
    cout << (dp[k]==INF ? -1 : dp[k]);
}