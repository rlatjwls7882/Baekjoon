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
    vector<ll> fib = {0, 1, 1};
    while(true) {
        ll next = fib[sz(fib)-2]+fib.back();
        if(next>=1e9) break;
        fib.push_back(next);
    }
    while(t--) {
        ll n; cin >> n;
        ll a=1, b=n;
        for(int i=2;i<sz(fib);i++) {
            ll A=fib[i-1], B=fib[i];
            auto [g, x, y] = EEA(A, B);
            if(g<0) {
                g=-g;
                x=-x;
                y=-y;
            }
            if(n%g) continue;
            x*=n/g;
            y*=n/g;

            ll le=-1e9, ri=1e9;
            while(le<ri) {
                ll mi = le+ri+1>>1;
                if(x+B/g*mi<=0) le=mi+1;
                else if(y-A/g*mi<x+B/g*mi) ri=mi-1;
                else le=mi;
            }
            x+=B/g*le;
            y-=A/g*le;
            if(x<=0 || y<x) continue;

            if(y<b || y==b && x<a) {
                a=x;
                b=y;
            }
        }
        cout << a << ' ' << b << '\n';
    }
}