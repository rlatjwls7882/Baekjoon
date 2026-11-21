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

ll arr[1002][1002];
int dx[4] = {0, 0, 1, -1};
int dy[4] = {1, -1, 0, 0};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) for(int j=1;j<=m;j++) cin >> arr[i][j];

    ll total=0;
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=m;j++) {
            ll cur=arr[i][j]-1;
            for(int k=0;k<4;k++) cur = min(cur, arr[i+dx[k]][j+dy[k]]);
            total+=max(cur, 0LL);
        }
    }
    cout << total;
}