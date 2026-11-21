#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        ll n, r, k; cin >> n >> r >> k;
        ll leftR = n-r%n, rightR = r%n;
        ll leftK = k%n, rightK = n-k%n;
        cout << min(leftK, leftR)*(r/n)*(k/n+1) + max(leftK-leftR, 0LL)*(r/n+1)*(k/n+1) + max(leftR-leftK, 0LL)*(r/n)*(k/n) + min(rightR, rightK)*(r/n+1)*(k/n) << '\n';
    }
}