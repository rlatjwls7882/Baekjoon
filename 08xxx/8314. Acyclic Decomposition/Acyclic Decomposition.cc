#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

bool visited[MAX];
vector<vector<int>> conn(MAX);

bool dfs(int cur) {
    visited[cur]=true;
    
    for(int next:conn[cur]) {
        if(visited[next] || !dfs(next)) return false;
    }
    visited[cur]=false;
    conn[cur].clear();
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    vector<vector<int>> res(2);
    for(int i=1;i<=m;i++) {
        int a, b; cin >> a >> b;
        conn[a].push_back(b);
        if(a<b) res[0].push_back(i);
        else res[1].push_back(i);
    }
    
    bool chk=true;
    for(int i=1;i<=n;i++) chk &= dfs(i);
    if(chk) {
        cout << "1\n" << m;
        for(int i=1;i<=m;i++) cout << ' ' << i;
        return 0;
    }
    
    if(res[0].empty()) swap(res[0], res[1]);
    if(res[1].empty()) res.pop_back();
    
    if(res.size()==2 && res[0].size()>res[1].size()) swap(res[0], res[1]);

    cout << res.size() << '\n';
    for(auto &group : res) {
        cout << group.size();
        sort(group.begin(), group.end());
        for(int e : group) cout << ' ' << e;
        cout << '\n';
    }
}