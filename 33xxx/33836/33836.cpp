#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int q; cin >> q;
    while(q--) {
        int x, y; cin >> x >> y;
        if(x>=0 && y==0) cout << "0\n";
        else if(x>=0 || y==0 || x>=y) cout << "1\n";
        else cout << "2\n";
    }
}