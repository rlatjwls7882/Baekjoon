#include<bits/stdc++.h>
using namespace std;

int cnt, a[100'000], parent[100'000], sz[100'000];

int find(int x) {
    if(x==parent[x]) return x;
    return parent[x] = find(parent[x]);
}

void _union(int x, int y) {
    x = find(x);
    y = find(y);
    if(x==y) return;
    if(a[x]<0) cnt-=sz[x];
    if(a[y]<0) cnt-=sz[y];
    if(x<y) {
        parent[y]=x;
        a[x]+=a[y];
        sz[x]+=sz[y];
        if(a[x]<0) cnt+=sz[x];
    } else {
        parent[x]=y;
        a[y]+=a[x];
        sz[y]+=sz[x];
        if(a[y]<0) cnt+=sz[y];
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> a[i];
    for(int i=0;i<n;i++) {
        int b; cin >> b;
        a[i]-=b;
        parent[i]=i;
        sz[i]=1;
        if(a[i]<0) cnt++;
    }

    while(m--) {
        int x; cin >> x;
        if(x==1) {
            int y, z; cin >> y >> z;
            _union(y-1, z-1);
        } else {
            cout << cnt << '\n';
        }
    }
}