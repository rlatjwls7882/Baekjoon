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

struct node {
    ll sum, mx;
} arr[4'444'444];

ll res;

void lazy(int nodeNum) {
    arr[nodeNum].sum = arr[nodeNum*2].sum+arr[nodeNum*2+1].sum;
    arr[nodeNum].mx = max(arr[nodeNum*2].mx+arr[nodeNum*2+1].sum, arr[nodeNum*2+1].mx);
}

void init(int nodeNum=1, int s=1, int e=1'000'000) {
    if(s==e) {
        arr[nodeNum].mx=s;
        return;
    }
    int m=s+e>>1;
    init(nodeNum*2, s, m);
    init(nodeNum*2+1, m+1, e);
    lazy(nodeNum);
}

void update(int x, int v, int nodeNum=1, int s=1, int e=1'000'000) {
    if(s==e) {
        arr[nodeNum].mx+=v;
        arr[nodeNum].sum+=v;
        return;
    }
    int m=s+e>>1;
    if(x<=m) update(x, v, nodeNum*2, s, m);
    else update(x, v, nodeNum*2+1, m+1, e);
    lazy(nodeNum);
}

void query(int x, int nodeNum=1, int s=1, int e=1'000'000) {
    if(e<=x) {
        res = max(arr[nodeNum].mx, res+arr[nodeNum].sum);
        return;
    }
    int m=s+e>>1;
    query(x, nodeNum*2, s, m);
    if(m<x) query(x, nodeNum*2+1, m+1, e);
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    init();
    int q; cin >> q;
    vector<pii> event(q+1);
    for(int i=1;i<=q;i++) {
        char ch; int a, b; cin >> ch >> a;
        if(ch=='+') {
            cin >> b;
            update(a, b);
            event[i]={a, b};
        } else if(ch=='-') {
            update(event[a].x, -event[a].y);
        } else {
            res=0;
            query(a);
            cout << res-a << '\n';
        }
    }
}