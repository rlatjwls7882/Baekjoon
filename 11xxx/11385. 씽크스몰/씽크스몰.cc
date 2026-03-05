#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define f first
#define s second
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

typedef complex<ld> cpx;

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
    int n=2;
    while(n<_a.size()+_b.size()) n<<=1;
    vector<cpx> a1(n), a2(n), b1(n), b2(n);
    for(int i=0;i<_a.size();i++) {
        a1[i]=_a[i]&((1<<10)-1);
        a2[i]=_a[i]>>10;
    }
    for(int i=0;i<_b.size();i++) {
        b1[i]=_b[i]&((1<<10)-1);
        b2[i]=_b[i]>>10;
    }
    fft(a1); fft(a2); fft(b1); fft(b2);

    vector<cpx> x(n), y(n), z(n);
    for(int i=0;i<n;i++) {
        x[i]=a1[i]*b1[i];
        y[i]=a1[i]*b2[i]+a2[i]*b1[i];
        z[i]=a2[i]*b2[i];
    }
    fft(x, true); fft(y, true); fft(z, true);

    vector<ll> ret(n);
    for(int i=0;i<n;i++) ret[i]=llround(x[i].real()) + (llround(y[i].real())<<10) + (llround(z[i].real())<<20);
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    vector<ll> f(n+1), g(m+1);
    for(int i=0;i<=n;i++) cin >> f[i];
    for(int i=0;i<=m;i++) cin >> g[i];

    auto h = mult(f, g);

    ll res=0;
    for(auto e:h) res^=e;
    cout << res;
}