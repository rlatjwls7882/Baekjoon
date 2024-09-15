#include<bits/stdc++.h>
using namespace std;

bool visited[1000];
vector<vector<pair<int, int>>> conn(1000);

int dfs(int cur, int goal) {
    visited[cur]=true;
    for(auto next:conn[cur]) {
        if(!visited[next.first]) {
            int sum = dfs(next.first, goal);
            if(sum || next.first==goal) return sum + next.second;
        }
    }
    visited[cur]=false;
    return 0;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n-1;i++) {
        int u, v, c; cin >> u >> v >> c;
        conn[u-1].push_back({v-1, c});
        conn[v-1].push_back({u-1, c});
    }

    while(m-->0) {
        int u, v; cin >> u >> v;
        fill(visited, visited+n, false);
        cout << dfs(u-1, v-1) << '\n';
    }
}