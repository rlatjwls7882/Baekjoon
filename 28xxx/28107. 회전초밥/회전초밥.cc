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

int cnt[100'001];
queue<int> li[200'001];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) {
        int k; cin >> k;
        while(k--) {
            int a; cin >> a;
            li[a].push(i);
        }
    }
    while(m--) {
        int b; cin >> b;
        if(!li[b].empty()) {
            cnt[li[b].front()]++;
            li[b].pop();
        }
    }
    for(int i=1;i<=n;i++) cout << cnt[i] << ' ';
}