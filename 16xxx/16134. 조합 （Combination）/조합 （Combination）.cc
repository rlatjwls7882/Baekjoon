#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll MOD = 1e9+7;

ll fact[1'000'001];

ll pow(ll a, ll b) {
    ll ret=1;
    while(b) {
        if(b&1) ret=ret*a%MOD;
        a=a*a%MOD;
        b>>=1;
    }
    return ret;
}

ll comb(ll n, ll r) {
    if(r<0 || r>n) return 0;
    return fact[n]*pow(fact[n-r]*fact[r]%MOD, MOD-2)%MOD;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, r; cin >> n >> r;
    fact[0]=1;
    for(int i=1;i<=n;i++) fact[i]=fact[i-1]*i%MOD;
    cout << comb(n, r);
}