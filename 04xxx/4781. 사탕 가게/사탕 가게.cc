#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();

    while(true) {
        int n, m; double tmp; cin >> n >> tmp; m = (int)(tmp*100+0.1);
        if(n==0 && m==0) {
            break;
        }

        int dp[m+1] = {0, };
        for(int i=0;i<n;i++) {
            int c, p; cin >> c >> tmp; p = (int)(tmp*100+0.1);

            for(int j=p;j<=m;j++) {
                dp[j] = max(dp[j], dp[j-p]+c);
            }
        }
        cout << dp[m] << endl;
    }
}