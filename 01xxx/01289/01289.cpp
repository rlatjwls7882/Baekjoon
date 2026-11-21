#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

const int MAX = 100'001;
const ll MOD = 1e9+7;

ll res;
bool visited[MAX];
vector<vector<pair<int, int>>> conn(MAX);

ll dfs(int cur=1, ll edgeCost=0) {
    visited[cur]=true;

    vector<ll> rets;
    for(auto next : conn[cur]) {
        if(!visited[next.first]) {
            rets.push_back(dfs(next.first, next.second));
        }
    }
    int n = rets.size();
    if(!n) return edgeCost;

    vector<ll> preSum(n+1);
    for(int i=0;i<n;i++) preSum[i+1] = (preSum[i] + rets[i]) % MOD;

    for(int i=1;i<n;i++) res = (res+(preSum[n]-preSum[i]+MOD)*rets[i-1]) % MOD;
    res = (res+preSum[n]) % MOD;
    return (preSum[n]+1)*edgeCost % MOD;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n-1;i++) {
        int a, b, w; cin >> a >> b >> w;
        conn[a].push_back({b, w});
        conn[b].push_back({a, w});
    }
    dfs();
    cout << res;
}