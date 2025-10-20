#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll MOD = 1'000'000'007;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    ll res=1;
    while(n--) res = res*3%MOD;
    cout << res-1;
}