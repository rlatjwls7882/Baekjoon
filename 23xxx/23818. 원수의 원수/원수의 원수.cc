#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int parent[MAX], error[MAX], color[MAX];
vector<vector<pair<int, int>>> conn(MAX);

int _find(int x) {
    if(x==parent[x]) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x>y) parent[x]=y;
    else parent[y]=x;
}

void dfs(int cur, int curColor, int prv) {
    color[cur] = curColor;
    for(auto next:conn[cur]) {
        if(color[next.first]==-1) dfs(next.first, curColor^next.second, cur);
        else if(color[next.first]!=curColor^next.second) error[_find(next.first)]=true;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
    for(int i=1;i<=n;i++) parent[i]=i;

    while(m--) {
        int t, a, b; cin >> t >> a >> b;
        _union(a, b);
        conn[a].push_back({b, t});
        conn[b].push_back({a, t});
    }

    memset(color, -1, sizeof color);
    for(int i=1;i<=n;i++) {
        if(parent[i]==i) {
            dfs(i, 0, -1);
        }
    }

    while(k--) {
        int a, b; cin >> a >> b;
        if(_find(a)!=_find(b)) cout << "Unknown\n";
        else if(error[_find(a)]) cout << "Error\n";
        else if(color[a]==color[b]) cout << "Friend\n";
        else cout << "Enemy\n";
    }
}