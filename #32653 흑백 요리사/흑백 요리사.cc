#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    long long total=1;
    while(n-->0) {
        long long x; cin >> x;
        total *= 2*x/gcd(2*x, total);
    }
    cout << total;
}