#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        double a, m; cin >> a >> m;
        cout << (int)(a*m*105.6/60000+0.000001) << '\n';
    }
}