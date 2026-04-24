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

struct SlopeTrick {
    priority_queue<ll> L;
    priority_queue<ll, vector<ll>, greater<>> R;
    ll addL=0, addR=0, res=0;
    ll topL() { return L.top()+addL; }
    ll topR() { return R.top()+addR; }
    void pushL(ll x) { L.push(x-addL); }
    void pushR(ll x) { R.push(x-addR); }
    void addLeft(ll x, int cnt=1) {
        while(cnt--) {
            if(!R.empty() && topR()<x) res+=x-topR(), pushL(topR()), R.pop(), pushR(x);
            else pushL(x);
        }
    }
    void addRight(ll x, int cnt=1) {
        while(cnt--) {
            if(!L.empty() && x<topL()) res+=topL()-x, pushR(topL()), L.pop(), pushL(x);
            else pushR(x);
        }
    }
    void addAbs(ll x, int cnt=1) {
        while(cnt--) {
            addLeft(x);
            addRight(x);
        }
    }
    void slide(ll l, ll r) {
        addL+=l;
        addR+=r;
    }
};
SlopeTrick st;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll n, x, y, z; cin >> n >> x >> y >> z;

    ll tot=0;
    for(int i=0;i<n;i++) {
        int a, b; cin >> a >> b;
        tot+=a*y+b*x;
        st.addRight(0, a);
        st.addLeft(x+y, b);
        st.slide(-z, z);
    }
    cout << tot-st.res;
}