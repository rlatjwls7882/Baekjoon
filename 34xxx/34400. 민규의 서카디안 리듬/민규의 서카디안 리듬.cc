#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T; cin >> T;
    while(T--) {
        int t; cin >> t;
        if(t%25<17) cout << "ONLINE\n";
        else cout << "OFFLINE\n";
    }
}