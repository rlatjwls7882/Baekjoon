#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
const ll MOD = 1e9+7;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    ll res; cin >> res;
    for(int i=0;i<n;i++) {
        ll cur; cin >> cur;
        if(i==0 && res==1 || cur==1) res=(res+cur)%MOD;
        else res=res*cur%MOD;
    }
    cout << res;
}