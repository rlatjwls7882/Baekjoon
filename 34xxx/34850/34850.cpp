#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll x, y, p, a, b; cin >> x >> y >> p >> a >> b;
    p += b*(y-1);

    ll sum=0;
    while(x--) {
        sum += p;
        p -= a;
    }
    cout << sum;
}