#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    double s, d, t; cin >> s >> d >> t;
    cout << (d/(s*5280/3600)<t ? "MADE IT" : "FAILED TEST");
}