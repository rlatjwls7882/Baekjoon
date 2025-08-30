#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll x, y;

ll solve() {
    // x = A+B = A^B + (A&B)<<1
    // (A&B)<<1 = x-y
    if(y>x || (x-y)&1) return 0;

    ll ret=1;
    ll tmp = x-y >> 1;
    while(tmp || y) {
        if(y&1) {
            if(tmp&1) return 0;
            ret<<=1;
        }
        tmp>>=1; y>>=1;
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        cin >> x >> y;
        cout << solve() << '\n';
    }
}