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

struct Faker {
    struct Edge {
        ll x, a, b;
        bool operator<(const Edge& e) const {
            i128 l = (i128)b*e.a;
            i128 r = (i128)e.b*a;
            if(l!=r) return l>r;
            return x>e.x;
        }
    };
    int n, root;
    vector<ll> cnt, p;
    vector<int> par, used, head, tail, nxt;
    Faker(int n, int root) : n(n), root(root), cnt(n+1), p(n+1), par(n+1), used(n+1), head(n+1), tail(n+1), nxt(n+1) { for(int i=1;i<=n;i++) head[i]=tail[i]=i; }
    int find(int x) { return used[x] ? par[x]=find(par[x]) : x; }
    void link(int p, int x) {
        if(!head[p]) head[p] = head[x];
        else nxt[tail[p]] = head[x];
        tail[p] = tail[x];
    }
    ll res() {
        priority_queue<Edge> pq;
        ll ret=0;
        for(int i=1;i<=n;i++) {
            ret+=cnt[i]*p[i];
            if(i!=root) pq.push({i, cnt[i], p[i]});
        }
        for(int i=1;i<n;i++) {
            while(true) {
                auto [x, ca, cb] = pq.top(); pq.pop();
                if(used[x] || ca!=cnt[x] || cb!=p[x]) continue;
                int pp=find(par[x]);
                link(pp, x);
                ret+=p[x]*cnt[pp];
                used[x]=1;
                par[x]=pp;
                cnt[pp]+=cnt[x];
                p[pp]+=p[x];
                if(pp!=root) pq.push({pp, cnt[pp], p[pp]});
                break;
            }
        }
        return ret;
    }
    vector<int> trace() {
        vector<int> ret;
        for(int cur=head[root];cur;cur=nxt[cur]) ret.push_back(cur);
        return ret;
    }
};

int par[300'001];
bool vis[300'001];
vector<vector<int>> conn(300'001);

void dfs(int cur) {
    vis[cur]=true;
    for(int next:conn[cur]) {
        if(!vis[next]) {
            dfs(next);
            par[next]=cur;
        }
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll n, r; cin >> n >> r;
    Faker f(n, r);
    for(int i=1;i<=n;i++) {
        f.cnt[i]=1;
        f.p[i]=i;
    }
    for(int i=0;i<n-1;i++) {
        int u, v; cin >> u >> v;
        conn[u].push_back(v);
        conn[v].push_back(u);
    }
    dfs(r);
    for(int i=1;i<=n;i++) f.par[i]=par[i];
    cout << f.res();
}