#include<bits/stdc++.h>
using namespace std;

const int MINF = -0x3f3f3f3f;
int dp[5], curDp[5];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    fill(dp+1, dp+5, MINF);
    int n; cin >> n;
    while(n--) {
        int val; cin >> val;
        for(int i=1;i<=4;i++) curDp[i] = max(dp[i], dp[i-1] + (i%2 ? -val : val));
        memcpy(dp, curDp, sizeof dp);
    }
    cout << dp[4];
}