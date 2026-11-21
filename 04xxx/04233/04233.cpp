#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

ll pow(ll a, ll p, ll mod) {
    if(p==1) return a;

    ll sum = pow(a, p/2, mod);
    if(p%2==0) return (sum*sum)%mod;
    else return ((sum*sum)%mod*a)%mod;
}

bool isPrime(ll p) {
    for(ll i=2;i*i<=p;i++) {
        if(p%i==0) {
            return false;
        }
    }
    return true;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        ll p, a; cin >> p >> a;
        if(p==0) break;

        if(!isPrime(p) && pow(a, p, p)==a) cout << "yes\n";
        else cout << "no\n";
    }
}