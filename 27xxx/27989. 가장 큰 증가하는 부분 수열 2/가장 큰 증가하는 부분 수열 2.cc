#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

const int MAX = 300'000;

ll _size=1, a[MAX], arr[MAX*4];

void update(int i, ll val) {
    i+=_size;
    arr[i] = max(arr[i], val);
    while(i>1) {
        i>>=1;
        arr[i] = max(arr[i*2], arr[i*2+1]);
    }
}

ll query(int l, int r) {
    ll ret=0;
    for(l+=_size, r+=_size;l<=r;l>>=1, r>>=1) {
        if(l&1) ret = max(ret, arr[l++]);
        if(!(r&1)) ret = max(ret, arr[r--]);
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<ll> uniqA;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        uniqA.push_back(a[i]);
    }
    sort(uniqA.begin(), uniqA.end());
    uniqA.erase(unique(uniqA.begin(), uniqA.end()), uniqA.end());
    while(_size<uniqA.size()) _size<<=1;

    for(int i=0;i<n;i++) {
        int idx = lower_bound(uniqA.begin(), uniqA.end(), a[i])-uniqA.begin();
        ll cur=a[i];
        if(idx) cur += query(0, idx-1);
        update(idx, cur);
    }
    cout << arr[1];
}