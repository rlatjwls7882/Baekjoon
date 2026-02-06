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
    ld d1, d2, x; cin >> d1 >> d2 >> x;
    if(d1<d2) swap(d1, d2);

    ld v1 = x/d1;
    ld v2 = (100-x)/d2;
    cout << setprecision(7) << fixed << 100/(v1+v2);
}