#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    long long resA=1, resB=1;
    for(int i=0;i<n;i++) {
        long long a, b; cin >> a >> b;

        long long gcdVal = gcd(a, b);
        a /= gcdVal;
        b /= gcdVal;

        if(i==0) resA=a;

        gcdVal = gcd(resB, b);
        resA = gcd(resA*b/gcdVal, a*resB/gcdVal);
        resB *= b/gcdVal;
    }
    cout << resA << ' ' << resB;
}