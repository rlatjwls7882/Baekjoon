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
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
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

ll n, res;
vector<pii> v(20);
bool vis[20];

void back(int depth=0, int start=0) {
    if(depth==n/2) {
        vector<pii> st, en;
        for(int i=0;i<n;i++) {
            if(vis[i]) st.push_back(v[i]);
            else en.push_back(v[i]);
        }
        ll x=0, y=0;
        for(int i=0;i<n/2;i++) {
            x+=en[i].x-st[i].x;
            y+=en[i].y-st[i].y;
        }
        res = min(res, x*x+y*y);
        return;
    }
    for(int i=start;i<n;i++) {
        vis[i]=true;
        back(depth+1, i+1);
        vis[i]=false;
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        cin >> n;
        for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;
        res=LINF;
        back();
        cout << setprecision(7) << fixed << sqrtl(res) << '\n';
    }
}