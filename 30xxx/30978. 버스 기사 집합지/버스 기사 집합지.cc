#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define all(x) x.begin(), x.end()

typedef long long ll;

const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ll FULL = (1LL<<51)-1;
const int MAX = 800'000;
int SZ=1;

struct node {
    ll mx, mn, zero, one, lazyOr=0, lazyAnd=0;
} arr[MAX];

node merge(node &a, node &b) {
    return {max(a.mx, b.mx), min(a.mn, b.mn), a.zero&b.zero, a.one&b.one};
}

void propagate(int i) {
    arr[i].mn&=~arr[i].lazyAnd;
    arr[i].mx&=~arr[i].lazyAnd;
    arr[i].zero|=arr[i].lazyAnd;
    arr[i].one&=~arr[i].lazyAnd;

    arr[i].mn|=arr[i].lazyOr;
    arr[i].mx|=arr[i].lazyOr;
    arr[i].zero&=~arr[i].lazyOr;
    arr[i].one|=arr[i].lazyOr;

    if(i<SZ) {
        for(int j:{i*2, i*2+1}) {
            arr[j].lazyAnd=(arr[j].lazyAnd&~arr[i].lazyOr)|arr[i].lazyAnd;
            arr[j].lazyOr=(arr[j].lazyOr&~arr[i].lazyAnd)|arr[i].lazyOr;
        }
    }
    arr[i].lazyAnd=arr[i].lazyOr=0;
}

void AND(int l, int r, ll x, int i=1, int s=0, int e=SZ-1) {
    propagate(i);
    if(e<l || r<s) return;
    x&=~arr[i].zero;
    if(l<=s && e<=r && (x&arr[i].one)) {
        arr[i].lazyAnd=x&arr[i].one;
        x&=~arr[i].one;
        propagate(i);
    }
    if(!x) return;
    int mid=s+e>>1;
    AND(l, r, x, i*2, s, mid);
    AND(l, r, x, i*2+1, mid+1, e);
    arr[i]=merge(arr[i*2], arr[i*2+1]);
}

void OR(int l, int r, ll x, int i=1, int s=0, int e=SZ-1) {
    propagate(i);
    if(e<l || r<s) return;
    x&=~arr[i].one;
    if(l<=s && e<=r && (x&arr[i].zero)) {
        arr[i].lazyOr=x&arr[i].zero;
        x&=~arr[i].zero;
        propagate(i);
    }
    if(!x) return;
    int mid=s+e>>1;
    OR(l, r, x, i*2, s, mid);
    OR(l, r, x, i*2+1, mid+1, e);
    arr[i]=merge(arr[i*2], arr[i*2+1]);
}

void update(int k, int i=1, int s=0, int e=SZ-1) {
    propagate(i);
    if(s==e) return;
    int m=s+e>>1;
    if(k<=m) update(k, i*2, s, m);
    else update(k, i*2+1, m+1, e);
}

ll queryMn(int l, int r, int i=1, int s=0, int e=SZ-1) {
    propagate(i);
    if(e<l || r<s) return LINF;
    if(l<=s && e<=r) return arr[i].mn;
    int m=s+e>>1;
    return min(queryMn(l, r, i*2, s, m), queryMn(l, r, i*2+1, m+1, e));
}

ll queryMx(int l, int r, int i=1, int s=0, int e=SZ-1) {
    propagate(i);
    if(e<l || r<s) return 0;
    if(l<=s && e<=r) return arr[i].mx;
    int m=s+e>>1;
    return max(queryMx(l, r, i*2, s, m), queryMx(l, r, i*2+1, m+1, e));
}

void pull(int i) {
    while(i>>=1) {
        propagate(i*2);
        propagate(i*2+1);
        arr[i] = merge(arr[i*2], arr[i*2+1]);
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(SZ<n) SZ<<=1;
    for(int i=SZ;i<SZ+n;i++) {
        int m; cin >> m;
        ll x=0;
        while(m--) {
            int l; cin >> l;
            x|=(1LL<<l);
        }
        arr[i]={x, x, x^FULL, x};
    }
    for(int i=SZ+n;i<2*SZ;i++) arr[i]={0, LINF, FULL, 0};
    for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);

    int q; cin >> q;
    while(q--) {
        int op, a, b, m; cin >> op >> a;
        if(op==1) {
            cin >> b >> m;
            ll x=0;
            while(m--) {
                int l; cin >> l;
                x|=(1LL<<l);
            }
            OR(a-1, b-1, x);
        } else if(op==2) {
            cin >> b >> m;
            ll x=0;
            while(m--) {
                int l; cin >> l;
                x|=(1LL<<l);
            }
            AND(a-1, b-1, x^FULL);
        } else if(op==3) {
            cin >> m;
            ll x=0;
            while(m--) {
                int l; cin >> l;
                x|=(1LL<<l);
            }
            AND(a-1, a-1, x^FULL);
            OR(a-1, a-1, x);
        } else if(op==4) {
            cin >> b;
            update(a-1); update(b-1);
            swap(arr[a-1+SZ], arr[b-1+SZ]);
            pull(a-1+SZ);
            pull(b-1+SZ);
        } else if(op==5) {
            cin >> b;
            ll mn = queryMn(a-1, b-1);
            vector<int> res;
            for(int i=0;i<=50;i++) {
                if(mn&(1LL<<i)) res.push_back(i);
            }
            for(auto e:res) cout << e << ' ';
            if(res.empty()) cout << -1;
            cout << '\n';
        } else if(op==6) {
            cin >> b;
            ll mx = queryMx(a-1, b-1);
            vector<int> res;
            for(int i=0;i<=50;i++) {
                if(mx&(1LL<<i)) res.push_back(i);
            }
            for(auto e:res) cout << e << ' ';
            if(res.empty()) cout << -1;
            cout << '\n';
        } else {
            cin >> b;
            ll mx = queryMx(a-1, b-1);
            ll mn = queryMn(a-1, b-1);
            vector<int> res;
            for(int i=50;i>=0;i--) {
                ll cur = (1LL<<i);
                if(mx&cur) {
                    if(!(mn&cur)) res.push_back(i);
                } else if(mn&cur) {
                    break;
                }
            }
            sort(all(res));
            for(auto e:res) cout << e << ' ';
            if(res.empty()) cout << -1;
            cout << '\n';
        }
    }
}