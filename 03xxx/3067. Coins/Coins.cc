#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int t; cin >> t;

    while(t-->0) {
        int n; cin >> n;

        int coin[n];
        for(int i=0;i<n;i++) {
            cin >> coin[i];
        }
        int m; cin >> m;

        int dp[m+1] = {1, 0, };
        for(int i=0;i<n;i++) {
            for(int j=1;j<=m;j++) {
                if(j-coin[i]>=0) {
                    dp[j] += dp[j-coin[i]];
                }
            }
        }
        cout << dp[m] << endl;
    }
}