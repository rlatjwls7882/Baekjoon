#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

ll gcd(ll a, ll b) {
    while(b!=0) {
        ll tmp=a%b;
        a=b;
        b=tmp;
    }
    return a;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll a, d; cin >> a >> d;
    int q; cin >> q;

    while(q-->0) {
        ll c, l, r; cin >> c >> l >> r;
        if(c==1) {
            cout << a*(r-l+1)+((r-1)*r/2-(l-2)*(l-1)/2)*d << '\n';
        } else {
            if(l==r) cout << a+(l-1)*d << '\n';
            else cout << gcd(a+(l-1)*d, a+l*d) << '\n';
        }
    }
}