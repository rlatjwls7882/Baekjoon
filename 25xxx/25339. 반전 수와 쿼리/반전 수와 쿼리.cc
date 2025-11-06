#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;

    int ret=0;
    while(q--) {
        int a, l, r; cin >> a >> l >> r;
        if(a==1) ret ^= 1;
        else ret ^= (r-l+1)/2%2;
        cout << ret << '\n';
    }
}