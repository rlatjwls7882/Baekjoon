#include<bits/stdc++.h>
using namespace std;

int cnt, a[100'000], b[100'000], parent[100'000], sz[100'000];

int find(int x) {
    if(x==parent[x]) return x;
    return parent[x] = find(parent[x]);
}

void _union(int x, int y) {
    x = find(x);
    y = find(y);
    if(x==y) return;
    if(a[x]<b[x]) cnt-=sz[x];
    if(a[y]<b[y]) cnt-=sz[y];
    if(x<y) {
        parent[y]=x;
        a[x]+=a[y];
        b[x]+=b[y];
        sz[x]+=sz[y];
        if(a[x]<b[x]) cnt+=sz[x];
    } else {
        parent[x]=y;
        a[y]+=a[x];
        b[y]+=b[x];
        sz[y]+=sz[x];
        if(a[y]<b[y]) cnt+=sz[y];
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> a[i];
    for(int i=0;i<n;i++) {
        cin >> b[i];
        parent[i]=i;
        sz[i]=1;
        if(a[i]<b[i]) cnt++;
    }

    while(m--) {
        int a; cin >> a;
        if(a==1) {
            int b, c; cin >> b >> c;
            _union(b-1, c-1);
        } else {
            cout << cnt << '\n';
        }
    }
}