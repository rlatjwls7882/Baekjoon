#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;

    if(n<=k) cout << 0;
    else if(n%2 && k%2) cout << n-1;
    else cout << n;
}