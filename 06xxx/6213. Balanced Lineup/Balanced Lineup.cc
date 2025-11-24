#include<bits/stdc++.h>
using namespace std;

const int MAX = 50001;

int _size=1, big[MAX*4], small[MAX*4];

int query(int L, int R) {
    int b=0, s=INT_MAX;
    for(L+=_size, R+=_size;L<=R;L>>=1, R>>=1) {
        if(L&1) {
            b = max(b, big[L]);
            s = min(s, small[L++]);
        }
        if(!(R&1)) {
            b = max(b, big[R]);
            s = min(s, small[R--]);
        }
    }
    return b-s;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    while(_size<n) _size<<=1;
    for(int i=_size+1;i<=_size+n;i++) {
        cin >> big[i];
        small[i] = big[i];
    }
    for(int i=_size-1;i>=1;i--) {
        big[i] = max(big[i*2], big[i*2+1]);
        small[i] = min(small[i*2], small[i*2+1]);
    }

    while(q--) {
        int a, b; cin >> a >> b;
        cout << query(a, b) << '\n';
    }
}