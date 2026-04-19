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

struct Hungarian { // O(N^3)
    int n;
    vvll cost;
    vll row, col, slack;
    vi matchCol, prevCol, used;
    Hungarian(vvll& cost) : n(sz(cost)-1), cost(cost), row(n+1), col(n+1), matchCol(n+1), prevCol(n+1), slack(n+1), used(n+1) {}

    ll res() {
        for(int i=1;i<=n;i++) {
            matchCol[0] = i;
            fill(all(slack), LINF);
            fill(all(used), 0);

            int j0=0;
            do {
                used[j0] = 1;
                int i0 = matchCol[j0], j1 = 0;
                ll delta = LINF;

                for(int j=1;j<=n;j++) {
                    if(!used[j]) {
                        ll cur = cost[i0][j] - row[i0] - col[j];
                        if(cur<slack[j]) slack[j] = cur, prevCol[j] = j0;
                        if(slack[j]<delta) delta = slack[j], j1 = j;
                    }
                }

                for(int j=0;j<=n;j++) {
                    if(used[j]) row[matchCol[j]] += delta, col[j] -= delta;
                    else slack[j] -= delta;
                }
                j0 = j1;
            } while(matchCol[j0]);

            do {
                int j1 = prevCol[j0];
                matchCol[j0] = matchCol[j1];
                j0 = j1;
            } while(j0);
        }
        return -col[0];
    }

    vi getMatching() {
        vi ret(n + 1);
        for (int j=1;j<=n;j++) ret[matchCol[j]] = j;
        return ret;
    }
};

int p[502][502];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) for(int j=1;j<=n;j++) cin >> p[i][j];
    vvll cost((n+1)/2+1, vll((n+1)/2+1));
    for(int i=1;i<=n;i+=2) {
        for(int j=1;j<=n;j+=2) {
            cost[(i+1)/2][(j+1)/2]=p[j-1][i]+p[i][j+1];
        }
    }
    Hungarian h(cost);
    cout << h.res();
}