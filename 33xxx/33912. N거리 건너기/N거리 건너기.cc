#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll n, m, a[100'001];

void solve() {
    ll cw=0;
    for(int i=1;i<m;i++) {
        ll next = cw/n*n+a[i];
        while(cw>next) next+=n;
        cw=next;
    }

    ll ccw=0;
    for(int i=n;i>=m;i--) {
        ll next = ccw/n*n+a[i];
        while(ccw>next) next+=n;
        ccw=next;
    }
    cout << (cw<ccw ? "CW" : cw==ccw ? "EQ" : "CCW");
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<n;i++) {
        int on; cin >> on;
        a[on]=i;
    }
    solve();
}