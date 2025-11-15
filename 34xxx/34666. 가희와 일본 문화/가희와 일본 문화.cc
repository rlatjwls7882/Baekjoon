#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int q; cin >> q;
    while(q--) {
        int a, b, c, d; cin >> a >> b >> c >> d;
        cout << (a<=2 && d>=50 && (max(b, c)*3<(a==1 ? 100 : 90) || b<22 || c<22) ? "YES\n" : "NO\n");
    }
}