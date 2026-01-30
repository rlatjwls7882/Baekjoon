#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, p, m; cin >> n >> p >> m;
    while(m--) {
        int u, v; cin >> u >> v;
        if(p==u) p=v;
        else if(p==v) p=u;
    }
    cout << p;
}