#include<bits/stdc++.h>
using namespace std;

long long dp[1000001][3];
const long long MOD = 1'000'000'007;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    vector<int> v(n);
    for(int i=0;i<n;i++) cin >> v[i];

    for(int i=0;i<n;i++) {
        if(i>0) {
            dp[i][0] = dp[i-1][0];
            dp[i][1] = dp[i-1][1];
            dp[i][2] = dp[i-1][2];
        }
        if(v[i]==1) dp[i][0]++;
        else if(v[i]==2) dp[i][1] += dp[i-1][0] + dp[i-1][1];
        else dp[i][2] += dp[i-1][1];
        dp[i][0]%=MOD; dp[i][1]%=MOD; dp[i][2]%=MOD;
    }
    cout << dp[n-1][2];
}