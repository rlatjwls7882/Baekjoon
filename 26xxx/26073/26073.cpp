#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int x, y, k; cin >> x >> y >> k;
        int gcdVal; cin >> gcdVal;
        while(k-->1) {
            int b; cin >> b;
            gcdVal = gcd(gcdVal, b);
        }
        cout << (x%gcdVal==0 && y%gcdVal==0 ? "Ta-da\n" : "Gave up\n");
    }
}