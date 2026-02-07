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
    ll n, r, c; cin >> n >> r >> c;
    if(n==3 && r==2 && c==2) cout << 1;
    else if(n==3) cout << 4;
    else if((r+c)%2==0) cout << n*n-n*n/2;
    else cout << n*n/2;
}