#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 100'001;

int a[MAX], sqrtN, _size=1, arr[MAX*4];

void update(int idx, int val) {
    idx += _size/2;
    arr[idx]+=val;
    while(idx>1) {
        idx>>=1;
        arr[idx] = arr[idx<<1]+arr[idx<<1|1];
    }
}

int query(int L, int R) {
    int ret=0;
    for(L+=_size/2, R+=_size/2;L<=R;L>>=1, R>>=1) {
        if(L%2==1) ret += arr[L++];
        if(R%2==0) ret += arr[R--];
    }
    return ret;
}

struct element {
    int s, e, idx;
    bool operator<(const element el) const {
        if(s/sqrtN!=el.s/sqrtN) return s/sqrtN < el.s/sqrtN;
        return e < el.e;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    sqrtN = sqrt(n);

    vector<int> vals(1);
    for(int i=1;i<=n;i++) {
        cin >> a[i];
        vals.push_back(a[i]);
    }
    sort(vals.begin(), vals.end());
    vals.erase(unique(vals.begin(), vals.end()), vals.end());
    for(int i=1;i<=n;i++) a[i] = lower_bound(vals.begin(), vals.end(), a[i])-vals.begin();

    while(_size<vals.size()) _size<<=1;
    _size<<=1;

    vector<element> v(m);
    for(int i=0;i<m;i++) {
        cin >> v[i].s >> v[i].e;
        v[i].idx=i;
    }
    sort(v.begin(), v.end());

    update(0, 1);
    ll cnt=0;
    int l=0, r=0;
    vector<ll> res(m);
    for(auto [s, e, idx]:v) {
        while(l<s) {
            cnt -= query(0, a[l]-1);
            update(a[l++], -1);
        }
        while(s<l) {
            update(a[--l], 1);
            cnt += query(0, a[l]-1);
        }
        while(r<e) {
            update(a[++r], 1);
            cnt += query(a[r]+1, vals.size()-1);
        }
        while(e<r) {
            cnt -= query(a[r]+1, vals.size()-1);
            update(a[r--], -1);
        }
        res[idx]=cnt;
    }
    for(ll e:res) cout << e << '\n';
}