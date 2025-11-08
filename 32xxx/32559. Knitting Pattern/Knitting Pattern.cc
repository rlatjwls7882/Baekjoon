#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long n, p; cin >> n >> p;
    if(n%p==0) cout << 0;
    else cout << (n-p)/2%p*2;
}