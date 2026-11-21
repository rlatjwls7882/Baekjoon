#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int q; cin >> q;
    while(q--) {
        ll c, k; cin >> c >> k;
        cout << c*k << ' ' << c/k << '\n';
    }
}