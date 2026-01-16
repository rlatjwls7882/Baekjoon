#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

struct Math {
    const ll MOD;
    vector<ll> factorial = {1};
    Math(ll mod):MOD(mod) {}
    ll pow(ll a, ll b) {
        ll ret=1;
        while(b) {
            if(b&1) ret=ret*a%MOD;
            a=a*a%MOD;
            b>>=1;
        }
        return ret;
    }

    ll fact(ll n) {
        while(factorial.size()<=n) factorial.push_back(factorial.back()*factorial.size()%MOD);
        return factorial[n];
    }

    ll comb(ll n, ll r) {
        if(r<0 || r>n) return 0;
        return fact(n)*pow(fact(n-r)*fact(r)%MOD, MOD-2)%MOD;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll n, m; cin >> n >> m;
    Math math(1'000'000'007);
    cout << math.comb(n, m);
}