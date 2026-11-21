#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n, m, k, d; cin >> n >> m >> k >> d;
        int cur = k*n*(m*(m-1)/2) + m*m*(n*(n-1)/2);
        if(cur>d) cout << "-1\n";
        else cout << d/cur*cur << '\n';
    }
}