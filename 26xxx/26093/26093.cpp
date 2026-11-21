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

ll dp[101][10001];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;
    for(int i=1;i<=n;i++) for(int j=1;j<=k;j++) cin >> dp[i][j];

    for(int i=1;i<=n;i++) {
        ll mx1=0, mx2=0;
        for(int j=1;j<=k;j++) {
            if(dp[i-1][j]>mx1) {
                mx2=mx1;
                mx1=dp[i-1][j];
            } else if(dp[i-1][j]>mx2) {
                mx2=dp[i-1][j];
            }
        }
        for(int j=1;j<=k;j++) {
            if(dp[i-1][j]==mx1) dp[i][j]+=mx2;
            else dp[i][j]+=mx1;
        }
    }

    ll mx=0;
    for(int i=1;i<=k;i++) mx=max(mx, dp[n][i]);
    cout << mx;
}