#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int n, k; cin >> n >> k;

    int coin[n+1];
    for(int i=1;i<=n;i++) {
        cin >> coin[i];
    }

    int dp[k+1] = {1, 0, };
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=k;j++) {
            if(j>=coin[i]) {
                dp[j] += dp[j-coin[i]];
            }
        }
    }
    cout << dp[k];
}