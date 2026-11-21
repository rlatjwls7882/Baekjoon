#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

const int MAX = 1000'001;

ll _size=1, arr[MAX*4];

void update(int i, ll val) {
    i += _size;
    arr[i] += val;
    while(i>1) {
        i>>=1;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

ll query(int L, int R) {
    ll ret=0;
    for(L+=_size, R+=_size;L<=R;L>>=1, R>>=1) {
        if(L&1) ret += arr[L++];
        if(!(R&1)) ret += arr[R--];
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    while(_size<n) _size<<=1;
    while(q--) {
        ll x, p, q; cin >> x >> p >> q;
        if(x==1) update(p, q);
        else cout << query(p, q) << '\n';
    }
}