#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    double t, r, v; cin >> t >> r >> v;
    cout.precision(7);
    cout << fixed;
    cout << max(0.0, v*t-2*r)/t;
}