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

struct element {
    int d;
    vector<int> v;
    bool operator<(const element e) const {
        return d>e.d;
    }
};

int a[30];
vector<element> v;

void add(int i) {
    for(auto e:v[i].v) a[e]++;
}

void del(int i) {
    for(auto e:v[i].v) a[e]--;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k, d; cin >> n >> k >> d;
    for(int i=0;i<n;i++) {
        int m, d; cin >> m >> d;
        v.push_back({d});
        while(m--) {
            int a; cin >> a;
            v[i].v.push_back(a-1);
        }
    }
    sort(all(v));

    add(0);
    int res=0, last=0;
    for(int i=1;i<n;i++) {
        while(last<i && v[last].d-v[i].d>d) del(last++);
        add(i);

        int cnt=0;
        for(int j=0;j<k;j++) cnt += a[j] && a[j]!=i-last+1;
        res = max(res, cnt*(i-last+1));
    }
    cout << res;
}