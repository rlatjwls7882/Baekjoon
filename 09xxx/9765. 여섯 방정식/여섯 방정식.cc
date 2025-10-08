#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll c1, c2, c3, c4, c5, c6; cin >> c1 >> c2 >> c3 >> c4 >> c5 >> c6;

    ll gcd1 = gcd(c1, c5);
    ll gcd2 = gcd(c3, c6);
    cout << c1/gcd1 << ' ' << gcd1 << ' ' << c5/gcd1 << ' ' << c6/gcd2 << ' ' << gcd2 << ' ' << c3/gcd2;
}