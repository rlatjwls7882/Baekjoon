#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        ll n; cin >> n;
        ll ret = lcm(lcm(n, n-1), n-2);
        if(n>=4) ret = max({ret, lcm(lcm(n, n-1), n-3), lcm(lcm(n-1, n-2), n-3)});
        cout << ret << '\n';
    }
}