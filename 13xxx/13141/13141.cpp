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
template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename K, typename V> using ordered_map = tree<K, V, less<K>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

int mx[200][200], mn[200][200];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    fill(&mn[0][0], &mn[199][200], INF);
    while(m--) {
        int s, e, l; cin >> s >> e >> l;
        mn[s-1][e-1] = mn[e-1][s-1] = min(mn[s-1][e-1], l);
        mx[s-1][e-1] = mx[e-1][s-1] = max(mx[s-1][e-1], l);
    }
    for(int i=0;i<n;i++) {
        if(mn[i][i]==INF) {
            mn[i][i]=0;
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            for(int k=0;k<n;k++) {
                mn[j][k] = min(mn[j][k], mn[j][i]+mn[i][k]);
            }
        }
    }

    int res=INF;
    for(int i=0;i<n;i++) {
        int cur=0;
        for(int j=0;j<n;j++) {
            for(int k=0;k<n;k++) {
                cur = max(cur, mn[i][j]+mn[i][k]+mx[j][k]);
            }
        }
        res = min(res, cur);
    }
    cout << setprecision(1) << fixed << res/2.0;
}