#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    if(n==1) cout << 0;
    else cout << (n*n+1)/2;
}