#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef vector<ll> vll;
typedef vector<vll> vvll;

const ll MOD = 1e9;

vvll square(vvll a, vvll b) {
    vvll ret = {
        {0, 0},
        {0, 0},
    };
    for(int i=0;i<2;i++) {
        for(int j=0;j<2;j++) {
            for(int k=0;k<2;k++) {
                ret[i][j] += (a[i][k] * b[k][j]);
            }
            ret[i][j] %= MOD;
        }
    }
    return ret;
}

ll fibo(ll n) {
    vvll ret = {
        {1, 0},
        {0, 1},
    };
    vvll a = {
        {1, 1},
        {1, 0},
    };
    while(n) {
        if(n & 1) {
            ret = square(ret, a);
        }
        n>>=1;
        a = square(a, a);
    }
    return ret[1][0];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll a, b; cin >> a >> b;
    cout << (fibo(b+2) - fibo(a+1) + MOD) % MOD;
}