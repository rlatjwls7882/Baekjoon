#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll sqrtN, a[100'001], cur[2'000'001];

struct element {
    int s, e, idx;
    bool operator<(const element el) const {
        if(s/sqrtN!=el.s/sqrtN) return s/sqrtN < el.s/sqrtN;
        return e < el.e;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    for(int i=1;i<=n;i++) {
        cin >> a[i];
        a[i]^=a[i-1];
    }
    sqrtN = sqrt(n);

    int m; cin >> m;
    vector<element> v(m);
    for(int i=0;i<m;i++) {
        cin >> v[i].s >> v[i].e;
        v[i].idx=i;
    }
    sort(v.begin(), v.end());

    vector<ll> res(m);
    cur[k]=1;
    ll cnt=0, l=0, r=0;
    for(auto [s, e, idx]:v) {
        while(l+1<s) {
            cur[k^a[l]]--;
            cnt -= cur[a[l++]];
        }
        while(s<=l) {
            cnt += cur[a[--l]];
            cur[k^a[l]]++;
        }
        while(r<e) {
            cnt += cur[a[++r]];
            cur[k^a[r]]++;
        }
        while(e<r) {
            cur[k^a[r]]--;
            cnt -= cur[a[r--]];
        }
        res[idx] = cnt;
    }
    for(ll e:res) cout << e << '\n';
}