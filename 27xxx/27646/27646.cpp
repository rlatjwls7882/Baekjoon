#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        cout << n-1 << '\n';
        for(int i=0;i<n-1;i++) cout << 0 << ' ' << i << '\n';
    }
}