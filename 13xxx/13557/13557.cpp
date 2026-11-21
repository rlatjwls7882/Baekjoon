#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll LINF = 0x3f3f3f3f3f3f3f3f;

int SZ=1;

struct node {
    ll sum=0, pref=-LINF, suff=-LINF, best=-LINF;
} arr[444'444];

node merge(node a, node b) {
    return {a.sum+b.sum, max(a.pref, a.sum+b.pref), max(b.suff, b.sum+a.suff), max({a.best, b.best, a.suff+b.pref})};
}

node query(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL) return {};
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int m=nodeL+nodeR>>1;
    return merge(query(L, R, nodeNum*2, nodeL, m), query(L, R, nodeNum*2+1, m+1, nodeR));
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(SZ<n) SZ<<=1;
    for(int i=SZ;i<SZ+n;i++) {
        int a; cin >> a;
        arr[i] = {a, a, a, a};
    }
    for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);

    int m; cin >> m;
    while(m--) {
        int x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;
        if(y1<x2) cout << query(x1-1, y1-1).suff+query(y1, x2-2).sum+query(x2-1, y2-1).pref << '\n';
        else cout << max({query(x2-1, y1-1).best, query(x1-1, x2-2).suff+query(x2-1, y1-1).pref, query(x1-1, y1-1).suff+query(y1, y2-1).pref}) << '\n';
    }
}