#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, c, d; cin >> a >> b >> c >> d;
    cout << 2*min(max(a, c)+b+d, max(b, d)+a+c);
}