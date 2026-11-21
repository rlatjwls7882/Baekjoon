#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll u, o, s; cin >> u >> o >> s;

    ll res=min({u, o, s});
    u-=res;
    o-=res;
    s-=res;
    if(!s) res += min(o, u/3);
    cout << res;
}