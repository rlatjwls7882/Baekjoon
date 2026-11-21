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

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll n, p, h; cin >> n >> p >> h;

    ll sz=(1LL)<<n;
    stack<bool> fold;
    for(int i=0;i<n;i++) {
        if(h>sz/2) {
            fold.push(true);
            h=sz-h+1;
        } else {
            fold.push(false);
        }
        sz/=2;
    }

    ll curLen=(1LL)<<n;
    while(n--) {
        bool top=fold.top(); fold.pop();
        if(top) {
            if(p<=curLen/2) p=curLen/2-p+1, cout << "L";
            else p=curLen-p+1, cout << "R";
        } else {
            if(p<=curLen/2) cout << "R";
            else p-=curLen/2, cout << "L";
        }
        curLen/=2;
    }
}
