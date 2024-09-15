#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long a, b; cin >> a >> b;
    long long gcdVal = gcd(a, b);
    cout << a/gcdVal << '/' << b/gcdVal;
}