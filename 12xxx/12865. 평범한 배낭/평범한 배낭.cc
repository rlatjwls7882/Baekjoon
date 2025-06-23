#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;
const int INF = -0x3f3f3f3f;

int dp[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;

    fill(dp, dp+MAX, INF);
    dp[0]=0;
    for(int i=0;i<n;i++) {
        int w, v; cin >> w >> v;
        for(int i=k;i-w>=0;i--) {
            dp[i] = max(dp[i], dp[i-w]+v);
        }
    }

    int res=0;
    for(int i=0;i<=k;i++) res = max(res, dp[i]);
    cout << res;
}