#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

ll a[5001], pSum1[5001], b[5001], pSum2[5001];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;
    for(int i=1;i<=n;i++) {
        cin >> a[i];
        pSum1[i]=a[i]+pSum1[i-1];
    }
    for(int i=1;i<=n;i++) {
        cin >> b[i];
        pSum2[i]=b[i]+pSum2[i-1];
    }

    ll res=LONG_LONG_MAX;
    for(int i=0;i<=k;i++) {
        int aLen=n-i;
        int bLen=n-(k-i);

        ll aSz=LONG_LONG_MAX, bSz=LONG_LONG_MAX;
        for(int i=0;i+aLen<=n;i++) aSz = min(aSz, pSum1[i+aLen]-pSum1[i]);
        for(int i=0;i+bLen<=n;i++) bSz = min(bSz, pSum2[i+bLen]-pSum2[i]);
        res = min(res, max(aSz, bSz));
    }
    cout << res;
}