#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 100'001;

int sqrtN, a[MAX], fenwick[MAX];

struct element {
    int s, e, idx;
    bool operator<(const element el) const {
        if(s/sqrtN!=el.s/sqrtN) return s/sqrtN < el.s/sqrtN;
        return e < el.e;
    }
};

void update(int idx, ll val) {
    while(idx<MAX) {
        fenwick[idx]+=val;
        idx += idx&-idx;
    }
}

int query(int idx) {
    int ret=0;
    while(idx>=1) {
        ret += fenwick[idx];
        idx -= idx&-idx;
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    sqrtN = sqrt(MAX);
    for(int i=1;i<=n;i++) cin >> a[i];

    int q; cin >> q;
    vector<element> v(q);
    for(int i=0;i<q;i++) {
        cin >> v[i].s >> v[i].e;
        v[i].idx=i;
    }
    sort(v.begin(), v.end());

    a[0]=1;
    update(1, 1);
    vector<ll> res(q);
    ll cnt=0, left=0, right=0;
    for(auto [s, e, idx]:v) {
        while(left<s) {
            update(a[left], -1);
            cnt -= query(min(a[left]+k, MAX-1)) - query(max(a[left]-k-1, 0));
            left++;
        }
        while(s<left) {
            left--;
            cnt += query(min(a[left]+k, MAX-1)) - query(max(a[left]-k-1, 0));
            update(a[left], 1);
        }
        while(right<e) {
            right++;
            cnt += query(min(a[right]+k, MAX-1)) - query(max(a[right]-k-1, 0));
            update(a[right], 1);
        }
        while(e<right) {
            update(a[right], -1);
            cnt -= query(min(a[right]+k, MAX-1)) - query(max(a[right]-k-1, 0));
            right--;
        }
        res[idx]=cnt;
    }
    for(ll e:res) cout << e << '\n';
}