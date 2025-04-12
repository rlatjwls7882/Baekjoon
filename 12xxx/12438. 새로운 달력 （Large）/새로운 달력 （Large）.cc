#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        long long a, b, c; cin >> a >> b >> c;
        cout << "Case #" << tc << ": " << a-1 - (a-1)/(c/gcd(b%c, c)) + (a*b+c-1)/c << '\n';
    }
}