#include<bits/stdc++.h>
using namespace std;

bool isPrime(int n) {
    for(int i=2;i*i<=n;i++) {
        if(n%i==0) return false;
    }
    return n!=1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int a, b; cin >> a >> b;
        if(a+2==b && isPrime(a) && isPrime(b)) cout << "Y\n";
        else cout << "N\n";
    }
}