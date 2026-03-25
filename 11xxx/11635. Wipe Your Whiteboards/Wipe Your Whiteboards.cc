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
template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

tuple<ll, ll, ll> EEA(ll a, ll b) {
    if(!b) return {a, 1, 0};
    auto [g, x, y] = EEA(b, a%b);
    return {g, y, x-a/b*y};
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        ll r, s, q; cin >> r >> s >> q;
        auto [g, x, y] = EEA(r, s);
        if(g<0) {
            g*=-1;
            x*=-1;
            y*=-1;
        }
        x*=q/g; y*=q/g;
        ll le=-1e8, ri=1e8;
        while(le<ri) {
            ll mi = le+ri>>1;
            if(x-s/g*mi>0 && y+r/g*mi>0) ri=mi;
            else le=mi+1;
        }
        x-=s/g*le;
        y+=r/g*le;
        cout << x << ' ' << y << '\n';
    }
}