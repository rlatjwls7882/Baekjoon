#include<bits/stdc++.h>
using namespace std;

bool isSosu(int n) {
    for(int i=2;i*i<=n;i++) {
        if(n%i==0) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        if(isSosu(n+1)) cout << "1\n1 " << n+1 << '\n';
        else cout << "0\n";
    }
}