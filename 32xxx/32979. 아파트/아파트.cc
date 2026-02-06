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
    int n, t; cin >> n >> t;

    queue<int> q;
    for(int i=0;i<2*n;i++) {
        int a; cin >> a;
        q.push(a);
    }
    while(t--) {
        int b; cin >> b;
        while(b-->1) {
            q.push(q.front()); q.pop();
        }
        cout << q.front() << ' ';
    }
}