#include<bits/stdc++.h>
using namespace std;

int vis[2000];
vector<vector<int>> conn(2000);

bool dfs(int cur, int depth) {
    vis[cur]=depth;
    for(int next:conn[cur]) {
        if(vis[next]==0) {
            if(!dfs(next, depth+1)) {
                return false;
            }
        } else if(vis[next]%2==vis[cur]%2) {
            return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(m--) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }

    bool chk=true;
    for(int i=0;i<n;i++) {
        if(!vis[i]) {
            chk &= dfs(i, 1);
        }
    }
    if(chk) cout << 1;
    else cout << 0;
}