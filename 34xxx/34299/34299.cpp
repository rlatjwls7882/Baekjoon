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
    int h1, m1, s1, h2, m2, s2; char ch; cin >> h1 >> ch >> m1 >> ch >> s1 >> h2 >> ch >> m2 >> ch >> s2;
    if(h1<12 && h2>=12) cout << "1 ";
    else cout << "0 ";
    cout << h2-h1 << ' ' << h2*60+m2-(h1*60+m1);
}