#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    if(n==m) cout << (n-1)*(n-1)-(n-2)*2;
    else cout << (int)pow(max(min(n-1, m), min(n, m-1))-1, 2);
}