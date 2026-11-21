#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int g, gb, y, r, ry, T; cin >> g >> gb >> y >> r >> ry >> T;

    int a=0, b=0, c=0;
    while(T>0) {
        a += min(g, T);
        T -= min(g, T);

        a += min(gb, T)/2;
        T -= min(gb, T);

        b += min(y, T);
        T -= min(y, T);

        c += min(r, T);
        T -= min(r, T);

        b += min(ry, T);
        c += min(ry, T);
        T -= min(ry, T);
    }
    cout << c << ' ' << b << ' ' << a;
}