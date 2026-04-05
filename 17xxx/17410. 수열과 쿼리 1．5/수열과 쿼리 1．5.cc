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

vvi bucket(500);
int sz, a[100'000];

int query(int l, int r, int k) {
    int ret=0;
    while(l<=r && l%sz) ret += a[l++]>k;
    while(l<=r && r%sz!=sz-1) ret += a[r--]>k;
    while(l<=r) {
        ret += bucket[l/sz].end()-upper_bound(all(bucket[l/sz]), k);
        l+=sz;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    sz = sqrt(n);
    for(int i=0;i<n;i++) {
        cin >> a[i];
        bucket[i/sz].push_back(a[i]);
    }
    for(auto &e:bucket) sort(all(e));

    int m; cin >> m;
    while(m--) {
        int op, i, j, k, v; cin >> op >> i;
        i--;
        if(op==1) {
            cin >> v;
            bucket[i/sz].erase(lower_bound(all(bucket[i/sz]), a[i]));
            bucket[i/sz].insert(upper_bound(all(bucket[i/sz]), v), v);
            a[i]=v;
        } else {
            cin >> j >> k;
            j--;
            cout << query(i, j, k) << '\n';
        }
    }
}