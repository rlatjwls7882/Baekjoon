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

int par[100'001];
int v[100'001];

pii find(int x) {
    if(par[x]!=x) {
        auto ret = find(par[x]);
        par[x] = ret.x;
        v[x] += ret.y;
    }
    return {par[x], v[x]};
}

void merge(int x, int y, int w) {
    auto a = find(x);
    auto b = find(y);
    if(a.x==b.x) return;
    if(v[y]) v[b.x]=v[x]-v[y]+w;
    else v[b.x]=v[x]+v[y]+w;
    par[b.x]=a.x;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    while(true) {
        int n, m; cin >> n >> m;
        if(!n) break;
        for(int i=1;i<=n;i++) {
            par[i]=i;
            v[i]=0;
        }

        while(m--) {
            char ch; int a, b, w; cin >> ch >> a >> b;
            if(ch=='!') {
                cin >> w;
                merge(a, b, w);
            } else {
                if(find(a).x!=find(b).x) cout << "UNKNOWN\n";
                else cout << v[b]-v[a] << '\n';
            }
        }
    }
}