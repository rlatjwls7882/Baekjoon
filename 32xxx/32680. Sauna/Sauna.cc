#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    int l=0, r=2e5;
    while(n--) {
        int a, b; cin >> a >> b;
        l = max(a, l);
        r = min(r, b);
    }
    if(l<=r) cout << r-l+1 << ' ' << l;
    else cout << "bad news";
}