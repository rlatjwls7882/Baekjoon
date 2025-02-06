#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, c; cin >> a >> b >> c;
    if(a==c) cout << a << b << a;
    else if(b==c) cout << a << b << b << a;
    else cout << a << b << c << b << a;
}