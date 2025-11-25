#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int r, c; cin >> r >> c;
    int n; cin >> n;
    while(n--) {
        int r2, c2; cin >> r2 >> c2;
        if(r2==r || c2==c) cout << "0\n";
        else cout << "1\n";
    }
}