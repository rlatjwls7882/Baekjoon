#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string a, b; cin >> a >> b;
    int dx = abs(a[0]-b[0]), dy = abs(a[1]-b[1]);
    cout << min(dx, dy) << ' ' << max(dx, dy);
}