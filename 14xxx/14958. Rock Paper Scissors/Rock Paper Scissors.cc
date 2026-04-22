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

struct FFT {
    typedef complex<double> cpx;
    void fft(vector<cpx> &a, bool inv=false) {
        int n=a.size();
        for(int i=1, j=0;i<n;i++) {
            int bit=n>>1;
            while(j>=bit) j^=bit, bit>>=1;
            j^=bit;
            if(i<j) swap(a[i], a[j]);
        }

        for(int len=2;len<=n;len<<=1) {
            ld ang = 2*PI/len * (inv ? -1 : 1);
            cpx w(cos(ang), sin(ang));
            for(int i=0;i<n;i+=len) {
                cpx wp(1, 0);
                for(int j=0;j<len/2;j++) {
                    cpx u=a[i+j];
                    cpx v=a[i+j+len/2]*wp;
                    a[i+j]=u+v;
                    a[i+j+len/2]=u-v;
                    wp*=w;
                }
            }
        }
        if(inv) for(int i=0;i<n;i++) a[i]/=n;
    }

    vector<ll> mult(vector<ll> &_a, vector<ll> &_b) {
        vector<cpx> a(all(_a)), b(all(_b));
        int n=2;
        while(n<a.size()+b.size()) n<<=1;
        a.resize(n); b.resize(n);
        fft(a); fft(b);

        for(int i=0;i<n;i++) a[i]*=b[i];
        fft(a, true);

        vector<ll> ret(n);
        for(int i=0;i<n;i++) ret[i]=llround(a[i].real());
        return ret;
    }
};
FFT fft;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    string a, b; cin >> a >> b;
    reverse(all(a));

    vector<ll> A(n), B(m);
    for(int i=0;i<n;i++) A[i]=a[i]=='P';
    for(int i=0;i<m;i++) B[i]=b[i]=='S';
    auto e1 = fft.mult(A, B);

    for(int i=0;i<n;i++) A[i]=a[i]=='S';
    for(int i=0;i<m;i++) B[i]=b[i]=='R';
    auto e2 = fft.mult(A, B);

    for(int i=0;i<n;i++) A[i]=a[i]=='R';
    for(int i=0;i<m;i++) B[i]=b[i]=='P';
    auto e3 = fft.mult(A, B);

    ll mx=0;
    for(int i=0;i<n;i++) mx=max(mx, e1[i]+e2[i]+e3[i]);
    cout << mx;
}