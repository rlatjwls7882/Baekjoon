#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string a, b, c; cin >> a >> b >> c;
    cout << a;
    if(a.back() == b[0]) cout << '\'' << b.substr(1, b.size()-1);
    else cout << b;
    if(b.back() == c[0]) cout << '\'' << c.substr(1, c.size()-1);
    else cout << c;
}