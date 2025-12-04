#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; string s; cin >> n >> s;
        for(char ch:s) cout << (n+ch-'0')%10;
        cout << '\n';
    }
}