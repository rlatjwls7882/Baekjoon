#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    double l, n, t; cin >> l >> n >> t;
    while(n--) {
        double f, b; cin >> f >> b;
        if(l/f+l/b<t) {
            cout << "HOPE";
            return 0;
        }
    }
    cout << "DOOMED";
}