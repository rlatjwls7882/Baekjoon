#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    long long mul=1;
    n = (n+1)/2;
    while(n-->0) {
        mul = (mul*2)%16769023;
    }
    cout << mul;
}