#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll total, parent[200'000], _size[200'000];

int _find(int x) {
    if(x==parent[x]) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x==y) return;
    if(x<y) parent[y]=x;
    else parent[x]=y;
    total -= (_size[x]-1)*_size[x]/2 + (_size[y]-1)*_size[y]/2;
    _size[x] = _size[y] = _size[x]+_size[y];
    total += (_size[x]-1)*_size[x]/2;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) {
        parent[i]=i;
        _size[i]=1;
    }

    total=n;
    while(m--) {
        int a, b; cin >> a >> b;
        _union(a-1, b-1);
        cout << total << '\n';
    }
}