#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n, m; cin >> n >> m;

    ll ret=1;
    for(int i=1;i<=n;i++) ret = ret*i%m;
    cout << ret;
}