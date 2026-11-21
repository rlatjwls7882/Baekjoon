#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    cout << "? " << n << ' ' << 1 << '\n' << flush;
    int a; cin >> a;

    cout << "? " << n << ' ' << a << '\n' << flush;
    int b; cin >> b;

    int c;
    if(n==b) {
        c=a;
    } else {
        cout << "? " << n-b << ' ' << a << '\n' << flush;
        cin >> c;
    }
    cout << "! " << b << ' ' << c << '\n' << flush; // c r
}