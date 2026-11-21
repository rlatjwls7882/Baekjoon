#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int x, y, z, u, v, w; cin >> x >> y >> z >> u >> v >> w;
    cout << u/100*x + v/50*y + w/20*z;
}