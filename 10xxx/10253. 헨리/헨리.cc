#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll lcm(ll a, ll b) {
    return a*b/gcd(a, b);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        ll a, b; cin >> a >> b;
        for(ll i=1;a!=1;i++) {
            ll lcmVal = lcm(b, i);
            a *= lcmVal/b;
            b = lcmVal;

            if(lcmVal/i<=a) {
                a -= lcmVal/i;
            }

            ll gcdVal = gcd(a, b);
            a /= gcdVal;
            b /= gcdVal;
        }
        cout << b << '\n';
    }
}