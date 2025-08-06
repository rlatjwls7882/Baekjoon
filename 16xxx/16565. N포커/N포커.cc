#include<bits/stdc++.h>
using namespace std;

const int MOD = 10'007;

int pow(int a, int b) {
    if(b==0) return 1;
    if(b==1) return a;

    int ret = pow(a, b/2);
    if(b%2) return ret*ret%MOD*a%MOD;
    return ret*ret%MOD;
}

int comb(int n, int r) {
    int ret=1;
    for(int i=n;i>n-r;i--) ret = ret * i % MOD;
    for(int i=2;i<=r;i++) ret = ret * pow(i, MOD-2) % MOD;
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    int sum=0;
    for(int i=1;i<=n/4;i++) {
        if(i%2) sum += comb(13, i) * comb(52-i*4, n-i*4) % MOD;
        else sum -= comb(13, i) * comb(52-i*4, n-i*4) % MOD;
    }
    cout << (sum+MOD*100) % MOD;
}