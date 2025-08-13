#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'001;

int cnt, visited[MAX];
vector<vector<int>> conn(MAX);

void dfs(int cur) {
    visited[cur] = ++cnt;
    for(int next:conn[cur]) {
        if(!visited[next]) {
            dfs(next);
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, r; cin >> n >> m >> r;
    while(m--) {
        int u, v; cin >> u >> v;
        conn[u].push_back(v);
        conn[v].push_back(u);
    }
    for(int i=1;i<=n;i++) sort(conn[i].begin(), conn[i].end());

    dfs(r);
    for(int i=1;i<=n;i++) cout << visited[i] << '\n';
}