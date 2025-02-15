#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, c, d, e, f; cin >> a >> b >> c >> d >> e >> f;
    cout << a+b+c-max({a, b, c}) + d+e+f-max({d, e, f}) + abs(max({a, b, c}) - max({d, e, f}));
}