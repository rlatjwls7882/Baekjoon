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

vi manacher(const string &inp) {
    int n=sz(inp)*2+1;
    vi ret(n);
    string s="#";
    for(auto e:inp) s+=e, s+="#";
    for(int i=0, p=-1, r=-1;i<n;i++) {
        ret[i] = i<=r ? min(r-i, ret[2*p-i]) : 0;
        while(i-ret[i]-1>=0 && i+ret[i]+1<n && s[i-ret[i]-1]==s[i+ret[i]+1]) ret[i]++;
        if(i+ret[i]>r) r=i+ret[i], p=i;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    string s; cin >> s;
    vi v = manacher(s);

    ll res=0;
    for(int i=0;i<sz(v);i++) res+=v[i]+1>>1;
    cout << res;
}