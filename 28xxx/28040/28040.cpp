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

int x[1000], y[1000];
vector<vector<int>> conn(1000);
bool vis[1000], vis1[1000][3];
pii link1, link2;

void dfs(int cur, int d) {
    vis[cur]=true;
    vis1[cur][d]=true;
    for(int nxt:conn[cur]) {
        if(!vis[nxt] && link1!=make_pair(cur, nxt) && link2!=make_pair(cur, nxt)) {
            dfs(nxt, d);
        }
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        cin >> x[i] >> y[i];
        x[i]--;
        y[i]--;
        conn[x[i]].push_back(i);
        conn[y[i]].push_back(i);
    }

    for(int i=0;i<n;i++) {
        link1={x[i], i};
        link2={y[i], i};
        memset(vis1, 0, sizeof vis1);
        memset(vis, 0, sizeof vis); dfs(i, 0);
        memset(vis, 0, sizeof vis); dfs(x[i], 1);
        memset(vis, 0, sizeof vis); dfs(y[i], 2);
        bool chk=false;
        for(int i=0;i<n;i++) chk|=vis1[i][0]&&vis1[i][1]&&vis1[i][2];
        cout << (chk ? "Y" : "N");
    }
}
