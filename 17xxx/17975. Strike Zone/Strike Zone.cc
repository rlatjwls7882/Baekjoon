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

int SZ=1;

struct node {
    ll sum, maxPref, maxSuff, best, minPref, minSuff, worst;
} arr[10000];

node merge(node a, node b) {
    return {a.sum+b.sum, max(a.maxPref, a.sum+b.maxPref), max(b.maxSuff, b.sum+a.maxSuff), max({a.best, b.best, a.maxSuff+b.maxPref}), min(a.minPref, a.sum+b.minPref), min(b.minSuff, b.sum+a.minSuff), min({a.worst, b.worst, a.minSuff+b.minPref})};
}

void update(int i, ll val) {
    arr[i].sum+=val;
    arr[i].maxPref+=val;
    arr[i].maxSuff+=val;
    arr[i].best+=val;
    arr[i].minPref+=val;
    arr[i].minSuff+=val;
    arr[i].worst+=val;
    while(i>1) {
        i>>=1;
        arr[i]=merge(arr[i*2], arr[i*2+1]);
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n1; cin >> n1;
    vector<pii> v1(n1);
    vector<int> l;
    for(int i=0;i<n1;i++) {
        cin >> v1[i].x >> v1[i].y;
        l.push_back(v1[i].x);
        l.push_back(v1[i].y);
    }
    int n2; cin >> n2;
    vector<pii> v2(n2);
    for(int i=0;i<n2;i++) {
        cin >> v2[i].x >> v2[i].y;
        l.push_back(v2[i].x);
        l.push_back(v2[i].y);
    }
    ll c1, c2; cin >> c1 >> c2;
    compress(l);
    for(int i=0;i<n1;i++) {
        v1[i].x = lower_bound(all(l), v1[i].x)-l.begin();
        v1[i].y = lower_bound(all(l), v1[i].y)-l.begin();
    }
    for(int i=0;i<n2;i++) {
        v2[i].x = lower_bound(all(l), v2[i].x)-l.begin();
        v2[i].y = lower_bound(all(l), v2[i].y)-l.begin();
    }
    sort(all(v1));
    sort(all(v2));

    ll res=0;
    while(SZ<sz(l)) SZ<<=1;
    for(int x1=0;x1<sz(l);x1++) {
        for(int i=1;i<2*SZ;i++) arr[i] = {};
        int last1=0, last2=0;
        while(last1<n1 && v1[last1].x<x1) last1++;
        while(last2<n2 && v2[last2].x<x1) last2++;
        for(int x2=x1;x2<sz(l);x2++) {
            while(last1<n1 && v1[last1].x<=x2) {
                update(SZ+v1[last1].y, c1);
                last1++;
            }
            while(last2<n2 && v2[last2].x<=x2) {
                update(SZ+v2[last2].y, -c2);
                last2++;
            }
            res = max(res, arr[1].best);
        }
    }
    cout << res << '\n';
}