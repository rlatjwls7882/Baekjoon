#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        string x; cin >> x;
        int sum=0;
        for(char ch:x) sum += ch-'0';
        if(sum%9==0) cout << "YES\n";
        else cout << "NO\n";
    }
}