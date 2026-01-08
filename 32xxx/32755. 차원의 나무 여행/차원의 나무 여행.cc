#include<bits/stdc++.h>
using namespace std;

const int MAX = 501;

bool vis[MAX];
vector<vector<int>> conn(MAX);

bool dfs(int cur, int depth) {
    if(depth==4) return true;
    vis[cur]=true;

    bool ret=false;
    for(int next:conn[cur]) {
        if(!vis[next]) {
            ret |= dfs(next, depth+1);
        }
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=1;i<n;i++) {
        int u, v; cin >> u >> v;
        conn[u].push_back(v);
        conn[v].push_back(u);
    }

    for(int i=1;i<=n;i++) {
        memset(vis, 0, sizeof vis);
        if(dfs(i, 1)) return !(cout << n);
    }

    cout << n-1;
}