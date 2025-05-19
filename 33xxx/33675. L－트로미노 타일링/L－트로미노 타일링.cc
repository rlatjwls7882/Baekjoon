#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        if(n%2) cout << "0\n";
        else cout << setprecision(0) << fixed << pow(2, n/2) << '\n';
    }
}