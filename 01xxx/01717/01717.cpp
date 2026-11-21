#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'000;

int parent[MAX];

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x<y) parent[y]=x;
    else parent[x]=y;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<=n;i++) parent[i]=i;

    while(m--) {
        int op, a, b; cin >> op >> a >> b;
        if(op==0) _union(a, b);
        else cout << (_find(a) == _find(b) ? "YES\n" : "NO\n");
    }
}