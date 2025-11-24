#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

const int MAX = 1'000'001;

ll _size=1, arr[MAX*4];

void update(int i, ll val) {
    i+=_size;
    arr[i]=val;
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
    int n, m, k; cin >> n >> m >> k;
    while(_size<n) _size<<=1;
    for(int i=_size+1;i<=_size+n;i++) cin >> arr[i];
    for(int i=_size-1;i>=1;i--) arr[i] = arr[i*2]+arr[i*2+1];

    for(int i=0;i<m+k;i++) {
        ll a, b, c; cin >> a >> b >> c;
        if(a==1) update(b, c);
        else cout << query(b, c) << '\n';
    }
}