#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int par[101][70];

int find(ll x) {
    int ret=1;
    for(int i=0;x;i++) {
        if(x&1) ret = par[ret][i];
        x>>=1;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll n, t; cin >> n >> t;
    for(int i=1;i<=n;i++) cin >> par[i][0];

    for(int i=0;i<69;i++) {
        for(int j=1;j<=n;j++) {
            par[j][i+1]=par[par[j][i]][i];
        }
    }
    cout << find(t);
}