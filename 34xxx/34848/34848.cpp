#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        int cnt=0;
        while(n>1) {
            cnt += n&1;
            n = (n+1)/2;
        }
        cout << cnt << '\n';
    }
}