#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int x; cin >> x;
        if(!x) cout << "1\n2\n";
        else cout << "2\n" << (1<<30) << ' ' << (1<<30)+1 << '\n';
    }
}