#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int w, h, p, q, t; cin >> w >> h >> p >> q >> t;
    p = p+t%(2*w)>w ? abs(2*w-p-t%(2*w)) : p+t%(2*w);
    q = q+t%(2*h)>h ? abs(2*h-q-t%(2*h)) : q+t%(2*h);
    cout << p << ' ' << q;
}