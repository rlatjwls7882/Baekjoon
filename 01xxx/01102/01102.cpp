#include<bits/stdc++.h>
#include<ext/pb_ds/assoc_container.hpp>
#include<ext/pb_ds/tree_policy.hpp>
#include<ext/rope>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;
using namespace __gnu_pbds;
using namespace __gnu_cxx;

#define x first
#define y second
#define sz(x) (int)(x).size()
#define all(x) x.begin(), x.end()
#define rep(x) for(int __i=(x);__i>0;--__i)
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef __int128 i128;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<ll> vll;
typedef vector<vll> vvll;
template<typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template<typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

string s;
int p, cnt, n, cost[17][17], dp[17][1<<18];

int get(int depth, int cur) {
    if(dp[depth][cur]!=INF) return dp[depth][cur];
    if(depth==cnt) return dp[depth][cur]=0;

    for(int i=0;i<n;i++) {
        if(cur&(1<<i) && s[i]=='N') {
            int mn=INF;
            for(int j=0;j<n;j++) {
                if(i!=j && cur&(1<<j)) mn=min(mn, cost[j][i]);
            }
            dp[depth][cur] = min(dp[depth][cur], get(depth-1, cur^(1<<i))+mn*(depth<=p));
        }
    }
    return dp[depth][cur];
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n;
    for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin >> cost[i][j];
    cin >> s >> p;
    for(int i=0;i<n;i++) cnt+=s[i]=='Y';
    fill(&dp[0][0], &dp[16][1<<18], INF);
    cout << (get(n, (1<<n)-1)==INF ? -1 : get(n, (1<<n)-1));
}