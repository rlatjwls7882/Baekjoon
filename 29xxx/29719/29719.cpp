#include<bits/stdc++.h>
using namespace std;

const long long MOD = 1e9+7;

long long pow(long long n, long long r) {
    if(r==0) return 1;
    if(r==1) return n;

    long long ret = pow(n, r/2);

    if(r%2==0) return ret*ret%MOD;
    return ret*ret%MOD*n%MOD;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long n, m; cin >> n >> m;

    cout << (pow(m, n) - pow(m-1, n) + MOD) % MOD;
}