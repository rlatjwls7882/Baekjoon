#include<bits/stdc++.h>
using namespace std;

int sz=1, arr[2002*4];

void update(int i) {
    i+=sz;
    arr[i]++;
    while(i>1) {
        i>>=1;
        arr[i] = arr[i*2] + arr[i*2+1];
    }
}

int query(int l, int r) {
    int ret=0;
    for(l+=sz, r+=sz;l<=r;l>>=1, r>>=1) {
        if(l&1) ret += arr[l++];
        if(!(r&1)) ret += arr[r--];
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    while(sz<=n+1) sz<<=1;

    vector<pair<int, int>> v(m);
    for(int i=0;i<m;i++) cin >> v[i].first >> v[i].second;
    sort(v.begin(), v.end());

    long long cnt=0;
    for(auto [s, e]:v) {
        cnt += query(e+1, n+1);
        update(e);
    }
    cout << cnt;
}