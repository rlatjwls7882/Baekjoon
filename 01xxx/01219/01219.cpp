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

ll mx[50], gain[50], cycle[50];
vector<vector<int>> conn(50);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, a, b, m; cin >> n >> a >> b >> m;
    vector<tuple<int, int, int>> edge;
    while(m--) {
        int x, y, z; cin >> x >> y >> z;
        conn[x].push_back(y);
        edge.push_back({x, y, z});
    }
    for(int i=0;i<n;i++) cin >> gain[i];

    fill(mx, mx+n, -LINF);
    mx[a]=gain[a];
    for(int i=0;i<n;i++) {
        for(auto [x, y, z]:edge) {
            if(mx[x]!=-LINF && mx[y]<mx[x]+gain[y]-z) {
                mx[y]=mx[x]+gain[y]-z;
                if(i==n-1) cycle[y]=true;
            }
        }
    }
    for(int i=0;i<n;i++) {
        if(cycle[i]) {
            queue<int> q; q.push(i);
            vector<bool> vis(n);
            vis[i]=true;
            while(!q.empty()) {
                int cur = q.front(); q.pop();
                for(int next:conn[cur]) {
                    if(!vis[next]) {
                        vis[next]=true;
                        q.push(next);
                    }
                }
            }
            if(vis[b]) return !(cout << "Gee");
        }
    }
    cout << (mx[b]==-LINF ? "gg" : to_string(mx[b]));
}