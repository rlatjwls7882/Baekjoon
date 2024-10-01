#include<bits/stdc++.h>
using namespace std;

long long MOD = 1000000007;

long long expo_square(long long a, long long b) {
    long long ret=1;
    while(b>0) {
        if(b%2) {
            ret = ret*a%MOD;
        }
        a=a*a%MOD;
        b>>=1;
    }
    return ret;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M; cin >> M;
    long long res=0;
    while(M-->0) {
        long long N, S; cin >> N >> S;
        // S/N
        long long gcdVal = gcd(N, S);
        N /= gcdVal;
        S /= gcdVal;
        res = (res+S*expo_square(N, MOD-2)%MOD)%MOD;
    }
    cout << res;
}