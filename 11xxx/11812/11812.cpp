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

ll n, k, q, len=2, dep[100] = {0, 1, };

void mv(ll &d, ll &x) {
    x = dep[d-2]+(x-dep[d-1]-1)/k+1;
    d--;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n >> k >> q;
    if(k==1) {
        while(q--) {
            ll x, y; cin >> x >> y;
            cout << abs(y-x) << '\n';
        }
        return 0;
    }
    for(;dep[len-1]<=n;len++) dep[len]=dep[len-1]*k;
    for(int i=1;i<len;i++) dep[i]+=dep[i-1];

    while(q--) {
        ll x, y; cin >> x >> y;
        ll d1=lower_bound(dep, dep+len, x)-dep, d2=lower_bound(dep, dep+len, y)-dep;

        int cnt=0;
        while(d1!=d2) {
            if(d1>d2) {
                mv(d1, x);
                cnt++;
            } else {
                mv(d2, y);
                cnt++;
            }
        }
        while(x!=y) {
            mv(d1, x);
            mv(d2, y);
            cnt+=2;
        }
        cout << cnt << '\n';
    }
}