#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
const int MAX = 200'000;

int n, aToIdx[MAX], groupIdx[MAX];
vector<ll> a, b;

bool chk(ll m) {
    int idx=0;
    vector<vector<ll>> group(1);
    group[0].push_back(b[0]);
    for(int i=1;i<n;i++) {
        if(abs(b[i]-b[i-1])>m) group.push_back(vector<ll>()), idx++;
        group.back().push_back(b[i]);
        groupIdx[i]=idx;
    }

    vector<int> work(group.size());
    for(int i=0;i<n;i++) {
        int idx = groupIdx[aToIdx[i]];
        if(b[i]!=group[idx][work[idx]++]) return false;
    }
    return true;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n;
    a = vector<ll>(n);
    for(int i=0;i<n;i++) cin >> a[i];
    b=a;
    sort(b.begin(), b.end());
    for(int i=0;i<n;i++) aToIdx[i]=lower_bound(b.begin(), b.end(), a[i])-b.begin();

    ll l=0, r=1e18;
    while(l<r) {
        ll m = l+r>>1;
        if(chk(m)) r=m;
        else l=m+1;
    }
    cout << l;
}