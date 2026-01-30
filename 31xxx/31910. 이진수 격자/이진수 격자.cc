#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

ll dp[31];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=n;j++) {
            int cur; cin >> cur;
            dp[j] = max(dp[j-1], dp[j])*2+cur;
        }
    }
    cout << dp[n];
}