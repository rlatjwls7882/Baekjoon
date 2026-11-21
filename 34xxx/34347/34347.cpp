#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        if(n==2) cout << "YES\n1 2\n1 2\n";
        else if(n==4) cout << "YES\n1 2 3 4\n1 4 2 3\n";
        else cout << "NO\n";
    }
}