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
    int n; cin >> n;

    if(n==1) return !(cout << 1);
    if(n==2) return !(cout << 2);
    n-=2;

    int a=1, b=1;
    for(int i=3;;i++) {
        int c = a+b;
        a=b;
        b=c;
        n-=c;
        if(n<=0) return !(cout << i);
    }
}