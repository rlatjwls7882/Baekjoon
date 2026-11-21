#include<bits/stdc++.h>
#include<ext/pb_ds/assoc_container.hpp>
#include<ext/pb_ds/tree_policy.hpp>
#include<ext/rope>
#pragma GCC optimize("O3,unroll-loops")
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

const int MAX = 400'000;

int SZ=1;

struct node {
    ll sum=0, pref=-LINF, suff=-LINF, best=-LINF;
} arr[MAX];

node merge(node a, node b) {
    return {a.sum+b.sum, max(a.pref, a.sum+b.pref), max(b.suff, b.sum+a.suff), max({a.best, b.best, a.suff+b.pref})};
}

node query(int l, int r, int i=1, int s=0, int e=SZ-1) {
    if(e<l || r<s) return {};
    if(l<=s && e<=r) return arr[i];
    int m=s+e>>1;
    return merge(query(l, r, i*2, s, m), query(l, r, i*2+1, m+1, e));
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(SZ<n) SZ<<=1;
    for(int i=SZ;i<SZ+n;i++) {
        int a; cin >> a;
        arr[i] = {a, a, a, a};
    }
    for(int i=SZ-1;i>0;i--) arr[i] = merge(arr[i*2], arr[i*2+1]);

    int m; cin >> m;
    while(m--) {
        int l, r; cin >> l >> r;
        cout << query(l-1, r-1).best << '\n';
    }
}