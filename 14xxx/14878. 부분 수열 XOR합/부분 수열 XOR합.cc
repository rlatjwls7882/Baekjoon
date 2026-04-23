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

struct FWHT {
    void fwht(vector<ll> &a, bool inv=false) {
        int n=a.size();
        for(int len=1;len<n;len<<=1) {
            for(int i=0;i<n;i+=len<<1) {
                for(int j=0;j<len;j++) {
                    ll u=a[i+j];
                    ll v=a[i+j+len];
                    a[i+j]=u+v;
                    a[i+j+len]=u-v;
                }
            }
        }
        if(inv) for(int i=0;i<n;i++) a[i]/=n;
    }

    vector<ll> mult(vector<ll> &_a, vector<ll> &_b) {
        vector<ll> a(all(_a)), b(all(_b));
        int n=1;
        while(n<a.size()+b.size()) n<<=1;
        a.resize(n); b.resize(n);
        fwht(a); fwht(b);

        for(int i=0;i<n;i++) a[i]*=b[i];
        fwht(a, true);
        return a;
    }
};
FWHT fwht;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    vll cnt(1<<16);
    cnt[0]=1;
    int la=0;
    for(int i=0;i<n;i++) {
        int a; cin >> a;
        la^=a;
        cnt[la]++;
    }
    auto ret = fwht.mult(cnt, cnt);

    ll idx=0, res=0;
    for(int i=0;i<sz(cnt);i++) {
        if(i) ret[i]=ret[i]/2;
        else ret[i]=(ret[i]-(n+1))/2;
        if(res<ret[i]) {
            res=ret[i];
            idx=i;
        }
    }
    cout << idx << ' ' << res;
}