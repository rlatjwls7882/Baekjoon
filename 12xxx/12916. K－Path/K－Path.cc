#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef vector<ll> vll;
typedef vector<vll> vvll;

const ll MOD = 1e9+7;

int n, k;

vvll square(vvll a, vvll b) {
    vvll ret(n, vll(n));
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            for(int k=0;k<n;k++) {
                ret[i][k] += a[i][j] * b[j][k];
                ret[i][k] %= MOD;
            }
        }
    }
    return ret;
}

ll solve(vvll a) {
    vvll ret(n, vll(n));
    for(int i=0;i<n;i++) ret[i][i]=1;

    while(k) {
        if(k & 1) ret = square(a, ret);
        a = square(a, a);
        k>>=1;
    }

    ll cnt=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cnt += ret[i][j];
        }
    }
    return cnt % MOD;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> k;

    vvll a(n, vll(n));
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cin >> a[i][j];
        }
    }
    cout << solve(a) % MOD;
}