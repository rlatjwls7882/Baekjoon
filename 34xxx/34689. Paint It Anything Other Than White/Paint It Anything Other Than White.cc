#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int INF = 0x3f3f3f3f;

int SZ=1;
struct seg {
    struct node {
        ll sum=-INF, pref=-INF, suff=-INF, best=-INF;
    } arr[400'000];
    node merge(node a, node b) { return {a.sum+b.sum, max(a.pref, a.sum+b.pref), max(b.suff, b.sum+a.suff), max({a.best, b.best, a.suff+b.pref})}; }
    void update(int i, ll val) {
        i+=SZ;
        arr[i].sum=arr[i].pref=arr[i].suff=arr[i].best=val;
        while(i>1) {
            i>>=1;
            arr[i]=merge(arr[i*2], arr[i*2+1]);
        }
    }
    node query(int l, int r, int i=1, int s=0, int e=SZ-1) {
        if(r<s || e<l) return {};
        if(l<=s && e<=r) return arr[i];
        int m=s+e>>1;
        return merge(query(l, r, i*2, s, m), query(l, r, i*2+1, m+1, e));
    }
} s[3];

map<char, int> m = {
    {'K', 0},
    {'R', 1},
    {'G', 2},
    {'Y', 3},
    {'B', 4},
    {'P', 5},
    {'C', 6},
    {'W', 7},
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;
    while(SZ<n) SZ<<=1;
    while(k--) {
        char op, x; int i, j; cin >> op >> i;
        if(op=='Q') {
            cin >> j;
            ll res=0;
            for(int l=0;l<3;l++) res = max(res, s[l].query(i-1, j-1).best);
            cout << res << '\n';
        } else {
            cin >> x;
            for(int l=0;l<3;l++) {
                if((1<<l)&m[x]) s[l].update(i-1, -INF);
                else s[l].update(i-1, 1);
            }
        }
    }
}