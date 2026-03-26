#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
#include <ext/rope>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;
using namespace __gnu_pbds;
using namespace __gnu_cxx;

#define x first
#define y second
#define sz(x) (int)(x).size()
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<ll> vll;
typedef vector<vll> vvll;
template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

int n, w;
int c[10001][2], dp[10001][3]; // [아래 위, 아래, 위]만 채워져있을 때

int sol() {
    for(int i=1;i<=n;i++) {
        dp[i][0]=dp[i-1][0]+2;
        if(c[i][0]+c[i][1]<=w) dp[i][0]=dp[i-1][0]+1;
        dp[i][1]=dp[i-1][0]+1;
        dp[i][2]=dp[i-1][0]+1;
        if(i>=2) {
            if(c[i-1][1]+c[i][1]<=w) dp[i][1] = min(dp[i][1], dp[i-1][2]+1);
            if(c[i-1][0]+c[i][0]<=w) dp[i][2] = min(dp[i][2], dp[i-1][1]+1);
            if(c[i-1][0]+c[i][0]<=w && c[i-1][1]+c[i][1]<=w) dp[i][0]=min(dp[i][0], dp[i-2][0]+2);
            dp[i][0] = min({dp[i][0], dp[i][1]+1, dp[i][2]+1});
        }
    }
    return dp[n][0];
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        cin >> n >> w;
        for(int i=0;i<2;i++) for(int j=1;j<=n;j++) cin >> c[j][i];

        int res=sol();
        if(n>=2) {
            if(c[1][0]+c[n][0]<=w) {
                int tmp1=c[1][0], tmp2=c[n][0];
                c[1][0]=c[n][0]=w;
                res = min(res, sol()-1);
                c[1][0]=tmp1, c[n][0]=tmp2;
            }
            if(c[1][1]+c[n][1]<=w) {
                c[1][1]=c[n][1]=w;
                res = min(res, sol()-1);
                if(c[1][0]+c[n][0]<=w) {
                    c[1][0]=c[n][0]=w;
                    res = min(res, sol()-2);
                }
            }
        }
        cout << res << '\n';
    }
}