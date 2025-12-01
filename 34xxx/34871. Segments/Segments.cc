#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;

    int maxL=0, minR=INT_MAX;
    while(n--) {
        int l, r, y; cin >> l >> r >> y;
        maxL = max(maxL, l);
        minR = min(minR, r);
    }
    while(q--) {
        int p; cin >> p;
        cout << max({p-minR, maxL-p, 0}) << '\n';
    }
}