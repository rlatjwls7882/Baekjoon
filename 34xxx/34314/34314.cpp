#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define x first
#define y second
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

const ll MOD = 1e9+7;

ll dp[30001];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        int g, d; cin >> g >> d;
        memset(dp, 0, sizeof dp);
        dp[0]=1;
        ll res=0;
        for(int i=0;i<g;i++) {
            for(int j=1;j<=d;j++) {
                if(i+j<g) {
                    dp[i+j] = (dp[i+j]+dp[i])%MOD;
                } else {
                    res = (res+dp[i])%MOD;
                    break;
                }
            }
        }
        cout << res << '\n';
    }
}