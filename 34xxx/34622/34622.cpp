#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, d, e, x, y; cin >> n >> m >> d >> e >> x >> y;

    cout << "3\n";
    if(x>=0 && y>=0) {
        cout << "1 1 " << x+y+e << '\n';
        cout << "2 1 " << y+e << '\n';
        cout << "1 2 " << e;
    } else if(x<0 && y<0) {
        cout << "2 1 " << d-x << '\n';
        cout << "1 2 " << d-x-y << '\n';
        cout << "1 1 " << e;
    } else if(x<0) {
        cout << "2 1 " << d-x << '\n';
        cout << "1 1 " << y+e << '\n';
        cout << "1 2 " << e;
    } else {
        cout << "1 2 " << d-y << '\n';
        cout << "1 1 " << x+e << '\n';
        cout << "2 1 " << e;
    }
}