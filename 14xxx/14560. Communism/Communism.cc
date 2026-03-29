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

ll a[30];

vll back(int depth, int limit) {
    if(depth==limit) return {0};
    vll v1 = back(depth+1, limit), v2=v1, v3=v1;
    for(auto &e:v2) e-=a[depth];
    for(auto &e:v3) e+=a[depth];
    int n=sz(v1);

    int idx=0;
    vll ret(n*3);
    for(int i1=0, i2=0, i3=0;i1<n || i2<n || i3<n;) {
        if(i1<n && (i3==n && i2<n && v1[i1]<v2[i2] || i2==n && i3<n && v1[i1]<v3[i3] || i2<n && i3<n && v1[i1]<v2[i2] && v1[i1]<v3[i3])) {
            ret[idx++]=v1[i1++];
        } else if(i2<n && (i3==n || i3<n && v2[i2]<v3[i3])) {
            ret[idx++]=v2[i2++];
        } else {
            ret[idx++]=v3[i3++];
        }
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];
    ll d; cin >> d;

    vll A=back(0, n/2), B=back(n/2, n);
    n=sz(B);

    ll cnt=0, l=0, r=0;
    for(auto e:A) {
        while(l<n && e-d>B[l]) l++;
        while(r<n && e+d>=B[r]) r++;
        cnt+=r-l;
    }
    cout << cnt << '\n';
}