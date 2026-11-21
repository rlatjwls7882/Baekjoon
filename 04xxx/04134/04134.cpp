#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

bool isSosu(ll n) {
    if(n<=1) return false;
    for(ll i=2;i*i<=n;i++) {
        if(n%i==0) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        ll n; cin >> n;
        while(true) {
            if(isSosu(n)) {
                cout << n << '\n';
                break;
            }
            n++;
        }
    }
}