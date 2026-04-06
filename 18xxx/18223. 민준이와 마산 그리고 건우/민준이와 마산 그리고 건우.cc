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
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
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

struct element {
    int x, c, p;
    bool operator<(const element e) const {
        if(c==e.c) return p < e.p;
        return c > e.c;
    }
};

ll cost[5001];
vector<vector<element>> conn(5001);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int v, e, p; cin >> v >> e >> p;
    while(e--) {
        int a, b, c; cin >> a >> b >> c;
        conn[a].push_back({b, c});
        conn[b].push_back({a, c});
    }

    fill(cost, cost+v+1, INF);
    priority_queue<element> pq; pq.push({1, 0, 0});
    while(!pq.empty()) {
        auto cur = pq.top(); pq.pop();
        if(cur.c>=cost[cur.x]) continue;
        cost[cur.x]=cur.c;
        if(cur.x==p) cur.p=true;
        if(cur.x==v && cur.p) return !(cout << "SAVE HIM");

        for(auto next:conn[cur.x]) {
            if(cost[next.x]>cur.c+next.c) {
                pq.push({next.x, cur.c+next.c, cur.p});
            }
        }
    }
    cout << "GOOD BYE";
}