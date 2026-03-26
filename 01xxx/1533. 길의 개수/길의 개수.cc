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

const ll MOD = 1'000'003;

struct Matrix {
    vvll v;
    Matrix(int n, int m) {
        v = vvll(n, vll(m));
    }
    void operator*=(Matrix b) {
        int n=sz(v), m=sz(b.v), l=sz(b.v[0]);
        Matrix ret(n, l);
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                for(int k=0;k<l;k++) {
                    ret.v[i][j]=(ret.v[i][j]+v[i][k]*b.v[k][j])%MOD;
                }
            }
        }
        v=ret.v;
    }
};

int n, s, e, t;

Matrix pow(Matrix a, ll b) {
    Matrix ret(n, n);
    for(int i=0;i<n;i++) ret.v[i][i]=1;
    while(b) {
        if(b&1) ret*=a;
        b>>=1;
        a*=a;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n >> s >> e >> t;
    n*=5;
    Matrix res(n, n);

    for(int i=0;i<n;i+=5) {
        for(int j=0;j<4;j++) {
            res.v[i+j][i+j+1]=1;
        }
    }
    for(int i=0;i<n/5;i++) {
        string s; cin >> s;
        for(int j=0;j<n/5;j++) {
            if(s[j]!='0') {
                res.v[(i+1)*5-1][(j+1)*5-(s[j]-'0')]=1;
            }
        }
    }
    res = pow(res, t);
    cout << res.v[s*5-1][e*5-1];
}