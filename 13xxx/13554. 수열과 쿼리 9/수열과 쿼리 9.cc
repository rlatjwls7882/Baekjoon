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

struct Fenwick {
    vector<ll> arr;
    Fenwick(int sz) : arr(sz) {}
    void update(int i, ll val) {
        while(i<sz(arr)) {
            arr[i]+=val;
            i+=i&-i;
        }
    }
    ll query(int i) {
        ll ret=0;
        while(i) {
            ret+=arr[i];
            i-=i&-i;
        }
        return ret;
    }
    ll res(int i, int j) {
        return query(j)-query(i-1);
    }
};

int sz=317, a[100'002], b[100'002];
Fenwick fa(100'002), fb(100'002);

struct element {
    int i, j, k, idx;
    bool operator<(const element e) const {
        if(i/sz!=e.i/sz) return i<e.i;
        return j<e.j;
    }
};

ll solve(ll k) {
    ll ret=0, sq=sqrt(k);
    for(int i=1;i<=sq;i++) {
        ret+=fa.res(i, i)*fb.res(sq+1, k/i);
        ret+=fb.res(i, i)*fa.res(1, k/i);
    }
    return ret;
}

void add(int i) {
    fa.update(a[i], 1);
    fb.update(b[i], 1);
}

void rem(int i) {
    fa.update(a[i], -1);
    fb.update(b[i], -1);
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    a[0]=b[0]=100'001;
    for(int i=1;i<=n;i++) cin >> a[i];
    for(int i=1;i<=n;i++) cin >> b[i];

    int m; cin >> m;
    vector<element> q(m);
    for(int i=0;i<m;i++) {
        cin >> q[i].i >> q[i].j >> q[i].k;
        q[i].idx=i;
    }
    sort(all(q));

    ll l=0, r=0;
    vector<ll> res(m);
    for(auto [i, j, k, idx]:q) {
        while(r<j) add(++r);
        while(i<l) add(--l);
        while(l<i) rem(l++);
        while(j<r) rem(r--);
        res[idx]=solve(k);
    }
    for(auto e:res) cout << e << '\n';
}