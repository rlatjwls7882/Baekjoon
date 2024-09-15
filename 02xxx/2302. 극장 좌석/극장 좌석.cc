#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int dp[n]; fill(dp, dp+n, -1);
    int m; cin >> m;
    while(m-->0) {
        int i; cin >> i;
        dp[i-1]=0;
    }

    int cnt=1;
    for(int i=0;i<n;i++) {
        if(dp[i]==0) {
            cnt *= max(1, dp[i-1]);
            continue;
        }

        if(i==0 || dp[i-1]==0) dp[i]=1;
        else if(dp[i-1]==1) dp[i]=2;
        else dp[i] = dp[i-1] + dp[i-2];
    }
    cnt *= max(1, dp[n-1]);

    cout << cnt;
}