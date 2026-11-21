#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);
const ll MOD = 1e9+7;

ll fact[52];

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
    fact[0]=1;
    for(int i=1;i<=51;i++) fact[i]=fact[i-1]*i%MOD;

    ll k, n; cin >> k >> n;
    ll res=1;
    for(int i=0;i<k+1;i++) res=res*(n+k-i)%MOD;
    cout << res*pow(fact[k+1], MOD-2)%MOD;
}