#include<bits/stdc++.h>
using namespace std;

const int MAX = 5001;

int h[MAX], depth[MAX];
vector<vector<int>> conn(MAX);

int dfs(int cur) {
    if(depth[cur]) return depth[cur];
    if(conn[cur].empty()) return depth[cur]=1;

    for(int next:conn[cur]) {
        depth[cur] = max(depth[cur], dfs(next)+1);
    }
    return depth[cur];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) cin >> h[i];
    while(m--) {
        int u, v; cin >> u >> v;
        if(h[u]<h[v]) conn[u].push_back(v);
        else if(h[u]>h[v]) conn[v].push_back(u);
    }
    for(int i=1;i<=n;i++) {
        memset(depth, 0, sizeof depth);
        cout << dfs(i) << '\n';
    }
}