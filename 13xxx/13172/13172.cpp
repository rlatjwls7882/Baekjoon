#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

const ll MOD = 1e9+7;

ll exPow(ll a, ll b) {
    ll ret=1;
    while(b>0) {
        if(b%2) ret = ret*a%MOD;
        a=a*a%MOD;
        b>>=1;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int m; cin >> m;
    ll res=0;
    while(m-->0) {
        ll n, s; cin >> n >> s;
        res += s*exPow(n, MOD-2)%MOD;
    }
    cout << res%MOD;
}