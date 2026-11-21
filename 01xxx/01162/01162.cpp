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

ll vis[10000][21];
vector<vector<pii>> conn(10000);

struct element {
    ll cur, cost, skip;
    bool operator<(const element e) const {
        if(cost==e.cost) return skip > e.skip;
        return cost > e.cost;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m, k; cin >> n >> m >> k;
    while(m--) {
        int u, v, w; cin >> u >> v >> w;
        conn[u-1].push_back({v-1, w});
        conn[v-1].push_back({u-1, w});
    }

    fill(&vis[0][0], &vis[9999][21], LINF);
    priority_queue<element> pq; pq.push({0, 0, 0});
    while(!pq.empty()) {
        auto [cu, co, sk] = pq.top(); pq.pop();
        if(co>=vis[cu][sk]) continue;
        for(int i=sk;i<=k;i++) vis[cu][i]=min(vis[cu][i], co);

        for(auto n:conn[cu]) {
            if(vis[n.x][sk]>vis[cu][sk]+n.y) pq.push({n.x, vis[cu][sk]+n.y, sk});
            if(sk+1<=k && vis[n.x][sk+1]>vis[cu][sk]+n.y) pq.push({n.x, vis[cu][sk], sk+1});
        }
    }
    cout << *min_element(&vis[n-1][0], &vis[n-1][k+1]);
}