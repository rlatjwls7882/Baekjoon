#include<bits/stdc++.h>
using namespace std;

int idx, a[100'001];
vector<unordered_set<int>> conn(100'001);

void dfs(int cur) {
    while(true) {
        if(conn[cur].count(a[idx])) dfs(a[idx++]);
        else return;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<n;i++) {
        int u, v; cin >> u >> v;
        conn[u].insert(v);
        conn[v].insert(u);
    }
    for(int i=0;i<n;i++) cin >> a[i];
    dfs(a[idx++]);

    cout << (a[0]==1 && idx==n);
}