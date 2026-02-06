#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;

    int from=0, to=9999999;
    while(t--) {
        int h1, m1, h2, m2; cin >> h1 >> m1 >> h2 >> m2;
        from = max(h1*60+m1, from);
        to = min(h2*60+m2, to);
    }
    if(from>=to) return !(cout << "NE");
    cout << "TAIP\n" << from/60 << ' ' << from%60 << ' ' << to/60 << ' ' << to%60;
}