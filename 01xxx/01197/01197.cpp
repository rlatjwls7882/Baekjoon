#include<bits/stdc++.h>
using namespace std;

const int MAX = 20'000;

int parent[MAX];

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

bool _union(int x, int y) {
    x = _find(x);
    y = _find(y);

    if(x==y) return false;
    if(x<y) parent[y]=x;
    else parent[x]=y;
    return true;
}

struct edge {
    int a, b, c;
    bool operator<(const edge e) const {
        return c < e.c;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int v, e; cin >> v >> e;
    vector<edge> edges;
    while(e--) {
        int a, b, c; cin >> a >> b >> c;
        edges.push_back({a-1, b-1, c});
    }
    for(int i=0;i<v;i++) parent[i]=i;

    int total=0;
    sort(edges.begin(), edges.end());
    for(auto e : edges) {
        if(_union(e.a, e.b)) {
            total += e.c;
        }
    }
    cout << total;
}