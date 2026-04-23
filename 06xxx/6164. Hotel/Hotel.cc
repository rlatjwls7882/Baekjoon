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

struct GoldSeg {
    int SZ=1;
    struct node {
        ll sum=0, pref=0, suff=0, best=0, lazy=-1;
    };
    vector<node> arr;
    GoldSeg(int n) {
        while(SZ<n) SZ<<=1;
        arr = vector<node>(SZ*2);
        for(int i=SZ;i<SZ+n;i++) arr[i] = {1, 1, 1, 1};
        for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);
    }
    node merge(node a, node b) { return {a.sum+b.sum, a.pref<a.sum ? a.pref : a.sum+b.pref, b.pref<b.sum ? b.suff : b.sum+a.suff, max({a.best, b.best, a.suff+b.pref})}; }
    void set(int i, ll x) {
        i+=SZ;
        arr[i] = {x, x, x, x};
        while(i>1) {
            i>>=1;
            arr[i]=merge(arr[i*2], arr[i*2+1]);
        }
    }
    void apply(int i, ll x) {
        arr[i].lazy=x;
        if(!x) arr[i].pref=arr[i].suff=arr[i].best=0;
        else arr[i].pref=arr[i].suff=arr[i].best=arr[i].sum;
    }
    void push(int i) {
        if(arr[i].lazy==-1 || i>=SZ) return;
        apply(i*2, arr[i].lazy);
        apply(i*2+1, arr[i].lazy);
        arr[i].lazy=-1;
    }
    void update(int l, int r, ll x, int i, int s, int e) {
        if(r<s || e<l) return;
        if(l<=s && e<=r) {
            apply(i, x);
            return;
        }
        push(i);
        int m=s+e>>1;
        update(l, r, x, i*2, s, m);
        update(l, r, x, i*2+1, m+1, e);
        arr[i]=merge(arr[i*2], arr[i*2+1]);
    }
    void update(int l, int r, ll x) { update(l, r, x, 1, 0, SZ-1); }
    int kth(int k, int i, int s, int e) {
        if(arr[i].best<k) return -1;
        if(s==e) return s;
        push(i);
        int m=s+e>>1;
        if(arr[i*2].best>=k) return kth(k, i*2, s, m);
        if(arr[i*2].suff+arr[i*2+1].pref>=k) return m-arr[i*2].suff+1;
        return kth(k, i*2+1, m+1, e);
    }
    int kth(int k) { return kth(k, 1, 0, SZ-1); }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    GoldSeg g(n);
    while(m--) {
        int op, x, d; cin >> op;
        if(op==1) {
            cin >> d;
            int idx = g.kth(d);
            if(idx==-1) cout << "0\n";
            else {
                g.update(idx, idx+d-1, 0);
                cout << idx+1 << '\n';
            }
        } else {
            cin >> x >> d;
            g.update(x-1, x+d-2, 1);
        }
    }
}