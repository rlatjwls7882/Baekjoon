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

ll cnt;
vll li;
vector<ll> curVis;
bool vis[500'000];
vector<vector<int>> conn(500'000);

void dfs(int cur) {
    vis[cur]=true;
    cnt+=sz(conn[cur]);
    curVis.push_back(li[cur]);
    for(int next:conn[cur]) {
        if(!vis[next]) {
            dfs(next);
        }
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    ll tot=0;
    vector<pii> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].x >> v[i].y;
        li.push_back(v[i].x);
        li.push_back(v[i].y);
        tot+=v[i].x+v[i].y;
    }
    compress(li);
    for(int i=0;i<n;i++) {
        int a = lower_bound(all(li), v[i].x)-li.begin();
        int b = lower_bound(all(li), v[i].y)-li.begin();
        conn[a].push_back(b);
        conn[b].push_back(a);
    }

    for(int i=0;i<2*n;i++) {
        if(!vis[i] && sz(conn[i])) {
            curVis.clear();
            cnt=0;
            dfs(i);
            cnt/=2;
            sort(all(curVis));
            for(int i=0;i<cnt;i++) tot-=curVis[i];
        }
    }
    cout << tot;
}