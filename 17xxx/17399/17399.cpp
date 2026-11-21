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

const int MAX=100'001;

vvi conn(MAX);
int par[MAX][20], depth[MAX];

void dfs(int cur) {
    for(int next:conn[cur]) {
        if(depth[next]==-1) {
            depth[next]=depth[cur]+1;
            par[next][0]=cur;
            dfs(next);
        }
    }
}

int find(int u, int d) {
    for(int i=0;d;i++) {
        if(u==-1) break;
        if(d&1) u=par[u][i];
        d>>=1;
    }
    return u;
}

int lca(int u, int v) {
    if(depth[u]<depth[v]) swap(u, v);
    int ret=depth[u]-depth[v];
    u = find(u, ret);

    if(u!=v) {
        for(int i=19;i>=0;i--) {
            if(par[u][i]!=par[v][i] && par[u][i]!=-1) {
                u=par[u][i];
                v=par[v][i];
                ret+=2<<i;
            }
        }
        ret+=2;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=0;i<n-1;i++) {
        int u, v; cin >> u >> v;
        conn[u].push_back(v);
        conn[v].push_back(u);
    }

    memset(par, -1, sizeof par);
    memset(depth, -1, sizeof depth);
    depth[1]=0;
    dfs(1);

    for(int i=0;i<19;i++) {
        for(int j=1;j<=n;j++) {
            if(par[j][i]!=-1) {
                par[j][i+1] = par[par[j][i]][i];
            }
        }
    }

    int q; cin >> q;
    while(q--) {
        int a, b, c; cin >> a >> b >> c;
        int dist = max({lca(a, b), lca(a, c), lca(b, c)});
        if(dist&1) {
            cout << "-1\n";
            continue;
        }
        dist>>=1;
        int u = find(a, dist);
        int v = find(b, dist);
        int w = find(c, dist);

        if(u!=-1 && lca(u, a)==dist && lca(u, b)==dist && lca(u, c)==dist) cout << u << '\n';
        else if(v!=-1 && lca(v, a)==dist && lca(v, b)==dist && lca(v, c)==dist) cout << v << '\n';
        else if(w!=-1 && lca(w, a)==dist && lca(w, b)==dist && lca(w, c)==dist) cout << w << '\n';
        else cout << "-1\n";
    }
}