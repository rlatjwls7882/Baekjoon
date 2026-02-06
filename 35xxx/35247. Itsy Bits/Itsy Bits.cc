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
    ll n; cin >> n;

    int a=1;
    while(n>1) {
        a++;
        n>>=1;
    }

    int res=1;
    while(res<a) res<<=1;

    cout << res;
    if(res==1) cout << " bit";
    else cout << " bits";
}