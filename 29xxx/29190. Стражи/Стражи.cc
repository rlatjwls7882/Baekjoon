#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m, x, y, k; cin >> n >> m >> x >> y >> k;

    int cnt=-1;
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=m;j++) {
            cnt += abs(i-x)+abs(j-y)<=k;
        }
    }
    cout << cnt;
}