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

bool vis[10000];
ll n, a, b, c, d, x[10000], dist[10000];

ll op(ll i, ll j) {
    if(i>j) swap(i, j);
    return ((i128)x[i]*a+(i128)x[j]*b)%c^d;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n >> a >> b >> c >> d;
    for(int i=0;i<n;i++) cin >> x[i];

    ll res=0, last=0;
    vis[0]=true;
    fill(dist+1, dist+n, LINF);
    rep(n-1) {
        for(int i=0;i<n;i++) {
            if(!vis[i]) {
                dist[i]=min(dist[i], op(last, i));
            }
        }

        ll mn=LINF, nx;
        for(int j=0;j<n;j++) {
            if(!vis[j] && mn>dist[j]) {
                mn=dist[j];
                nx=j;
            }
        }
        res+=dist[nx];
        vis[nx]=true;
        last=nx;
    }
    cout << res;
}