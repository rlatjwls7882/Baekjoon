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

struct element {
    ll x, y, w;
    bool operator<(const element e) const {
        return y<e.y;
    }
};

int SZ=1;

struct node {
    ll sum=0, pref=0, suff=0, best=0;
} arr[25'000];

node merge(node a, node b) {
    return {a.sum+b.sum, max(a.pref, a.sum+b.pref), max(b.suff, b.sum+a.suff), max({a.best, b.best, a.suff+b.pref})};
}

void update(int i, ll val) {
    arr[i].sum+=val;
    arr[i].pref+=val;
    arr[i].suff+=val;
    arr[i].best+=val;
    while(i>1) {
        i>>=1;
        arr[i]=merge(arr[i*2], arr[i*2+1]);
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    vector<element> v(n);

    vector<int> pl;
    for(int i=0;i<n;i++) {
        cin >> v[i].x >> v[i].y >> v[i].w;
        pl.push_back(v[i].x);
        pl.push_back(v[i].y);
    }
    compress(pl);
    for(int i=0;i<n;i++) {
        v[i].x = lower_bound(all(pl), v[i].x)-pl.begin();
        v[i].y = lower_bound(all(pl), v[i].y)-pl.begin();
    }
    sort(all(v));

    ll res=0;
    while(SZ<sz(pl)) SZ<<=1;
    for(int y1=0;y1<sz(pl);y1++) {
        for(int i=1;i<2*SZ;i++) arr[i] = {};
        int last=0;
        while(last<n && v[last].y<y1) last++;
        for(int y2=y1;y2<sz(pl);y2++) {
            while(last<n && v[last].y<=y2) {
                update(SZ+v[last].x, v[last].w);
                last++;
            }
            res = max(res, arr[1].best);
        }
    }
    cout << res;
}