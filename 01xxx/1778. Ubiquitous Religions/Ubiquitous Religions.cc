#include<bits/stdc++.h>
using namespace std;

int parent[50000];

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
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int t=1;;t++) {
        int n, m; cin >> n >> m;
        if(n==0) break;
        for(int i=0;i<n;i++) parent[i]=i;
        while(m-->0) {
            int i, j; cin >> i >> j;
            _union(i-1, j-1);
        }

        int cnt=0;
        for(int i=0;i<n;i++) if(parent[i]==i) cnt++;
        cout << "Case " << t << ": " << cnt << "\n";
    }
}