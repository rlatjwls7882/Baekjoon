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

int t, n, d;
const ll MOD = 1e9+7;
vector<vvll> board(100, vvll(20, vll(20)));

vvll mult(vvll a, vvll b) {
    vvll ret(n, vll(n));
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            for(int k=0;k<n;k++) {
                ret[i][j]=(ret[i][j]+a[i][k]*b[k][j])%MOD;
            }
        }
    }
    return ret;
}

vvll pow(vvll a, ll b) {
    vvll ret(n, vll(n));
    for(int i=0;i<n;i++) ret[i][i]=1;
    while(b) {
        if(b&1) ret = mult(ret, a);
        b>>=1;
        a = mult(a, a);
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> t >> n >> d;
    for(int i=0;i<t;i++) {
        int m; cin >> m;
        while(m--) {
            int a, b, c; cin >> a >> b >> c;
            board[i][a-1][b-1]=c;
        }
    }
    vvll res(n, vll(n));
    for(int i=0;i<n;i++) res[i][i]=1;
    for(int i=0;i<t;i++) res = mult(res, board[i]);
    res = pow(res, d/t);
    for(int i=0;i<d%t;i++) res = mult(res, board[i]);

    for(auto e:res) {
        for(auto ee:e) cout << ee << ' ';
        cout << '\n';
    }
}