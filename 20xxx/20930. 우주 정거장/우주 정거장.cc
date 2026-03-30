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
typedef vector<ll> vll;
typedef vector<vll> vvll;
template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

int par[200'000];

int find(int x) {
    if(par[x]==x) return x;
    return par[x]=find(par[x]);
}

void merge(int x, int y) {
    x=find(x);
    y=find(y);
    if(x<y) par[y]=x;
    else par[x]=y;
}

struct element {
    int x1, y1, x2, y2, idx;
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q; cin >> n >> q;
    for(int i=0;i<n;i++) par[i]=i;

    vector<element> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].x1 >> v[i].y1 >> v[i].x2 >> v[i].y2;
        v[i].idx=i;
    }
    for(int i=0;i<n;i++) {
        if(v[i].x1>v[i].x2) {
            swap(v[i].x1, v[i].x2);
            swap(v[i].y1, v[i].y2);
        }
    }
    sort(all(v), [](auto a, auto b){ return a.x1 < b.x1; });

    int mx=v[0].x2;
    for(int i=1;i<n;i++) {
        if(v[i].x1<=mx) {
            merge(v[i].idx, v[i-1].idx);
        }
        mx = max(mx, v[i].x2);
    }

    for(int i=0;i<n;i++) {
        if(v[i].y1>v[i].y2) {
            swap(v[i].x1, v[i].x2);
            swap(v[i].y1, v[i].y2);
        }
    }
    sort(all(v), [](auto a, auto b){ return a.y1 < b.y1; });

    mx=v[0].y2;
    for(int i=1;i<n;i++) {
        if(v[i].y1<=mx) {
            merge(v[i].idx, v[i-1].idx);
        }
        mx = max(mx, v[i].y2);
    }

    while(q--) {
        int a, b; cin >> a >> b;
        cout << (find(a-1)==find(b-1)) << '\n';
    }
}