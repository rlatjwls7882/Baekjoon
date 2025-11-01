#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    ll sum1=n, sum2=m;
    while(n--) {
        ll a; cin >> a;
        sum1 += a;
    }
    while(m--) {
        ll b; cin >> b;
        sum2 += b;
    }

    if(sum1>sum2) cout << "ALICE";
    else if(sum2>sum1) cout << "BOB";
    else cout << "TIED";
}