#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;

    int cnt5=0;
    for(ll i=5;i<=n;i*=5) {
        cnt5 += n/i;
    }
    for(ll i=5;i<=m;i*=5) {
        cnt5 -= m/i;
    }
    for(ll i=5;i<=(n-m);i*=5) {
        cnt5 -= (n-m)/i;
    }

    int cnt2=0;
    for(ll i=2;i<=n;i*=2) {
        cnt2 += n/i;
    }
    for(ll i=2;i<=m;i*=2) {
        cnt2 -= m/i;
    }
    for(ll i=2;i<=(n-m);i*=2) {
        cnt2 -= (n-m)/i;
    }
    cout << min(cnt2, cnt5);
}