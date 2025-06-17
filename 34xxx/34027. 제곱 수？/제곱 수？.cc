#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        int sqrtN = sqrt(n);
        cout << (sqrtN*sqrtN==n) << '\n';
    }
}