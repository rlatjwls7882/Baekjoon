#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 100'000;
const ll MOD = 1e9+7;

ll dp[MAX], nextDp[MAX];
vector<vector<int>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(m--) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }

    fill(dp, dp+n, 1);
    for(int i=0;i<7;i++) {
        memset(nextDp, 0, sizeof nextDp);
        for(int cur=0;cur<n;cur++) {
            for(int next:conn[cur]) {
                nextDp[next] = (nextDp[next]+dp[cur])%MOD;
            }
        }
        memcpy(dp, nextDp, sizeof dp);
    }
    cout << accumulate(dp, dp+n, 0LL)%MOD << '\n';
}