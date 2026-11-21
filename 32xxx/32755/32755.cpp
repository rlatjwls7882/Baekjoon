#include<bits/stdc++.h>
using namespace std;

vector<vector<int>> conn(501);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=1;i<n;i++) {
        int u, v; cin >> u >> v;
        conn[u].push_back(v);
        conn[v].push_back(u);
    }

    for(int i=1;i<=n;i++) {
        if(conn[i].size()==n-1) return !(cout << n-1);
    }
    cout << n;
}