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

struct LiChao {
    struct Line {
        ll a=0, b=-LINF;
        ll get(ll x) { return a*x+b; }
    };
    struct Node {
        ll s, e;
        Line line;
        int l=-1, r=-1;
    };
    vector<Node> arr;
    LiChao(ll s, ll e) {
        arr.push_back({s, e});
    }

    void update(Line l, int nodeNum=0) {
        ll s=arr[nodeNum].s, e=arr[nodeNum].e;

        Line low = arr[nodeNum].line, high = l;
        if(low.get(s) > high.get(s)) swap(low, high);

        if(low.get(e)<=high.get(e)) {
            arr[nodeNum].line=high;
            return;
        }

        ll m = s+e>>1;
        if(low.get(m)<high.get(m)) {
            arr[nodeNum].line=high;
            if(arr[nodeNum].r==-1) {
                arr[nodeNum].r=arr.size();
                arr.push_back({m+1, e});
            }
            update(low, arr[nodeNum].r);
        } else {
            arr[nodeNum].line=low;
            if(arr[nodeNum].l==-1) {
                arr[nodeNum].l=arr.size();
                arr.push_back({s, m});
            }
            update(high, arr[nodeNum].l);
        }
    }

    ll query(ll x, int nodeNum=0) {
        if(nodeNum==-1) return -LINF;
        ll s=arr[nodeNum].s, e=arr[nodeNum].e;
        ll m = s+e>>1;
        if(x<=m) return max(arr[nodeNum].line.get(x), query(x, arr[nodeNum].l));
        return max(arr[nodeNum].line.get(x), query(x, arr[nodeNum].r));
    }
};

ll dist[100'000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=1;i<n;i++) {
        cin >> dist[i];
        dist[i]+=dist[i-1];
    }

    ll last=0;
    LiChao liChao(0, dist[n-1]);
    ll p, s; cin >> p >> s;
    liChao.update({-s, -p});
    for(int i=1;i<n-1;i++) {
        cin >> p >> s;
        last = -liChao.query(dist[i]);
        liChao.update({-s, -(p+last-s*dist[i])});
    }
    cout << -liChao.query(dist[n-1]);
}