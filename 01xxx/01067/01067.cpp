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

typedef complex<double> cpx;
void fft(vector<cpx> &f, cpx w) {
    int n=f.size();
    if(n==1) return;

    vector<cpx> even(n/2), odd(n/2);
    for(int i=0;i<n;i++) {
        if(i%2) odd[i/2]=f[i];
        else even[i/2]=f[i];
    }
    fft(even, w*w);
    fft(odd, w*w);

    cpx wp(1, 0);
    for(int i=0;i<n/2;i++) {
        f[i]=even[i]+wp*odd[i];
        f[i+n/2]=even[i]-wp*odd[i];
        wp*=w;
    }
}

vector<cpx> mult(vector<cpx> a, vector<cpx> b) {
    ll n=1;
    while(n<a.size() || n<b.size()) n<<=1;
    n<<=1;
    a.resize(n);
    b.resize(n);
    vector<cpx> c(n);

    cpx w(cos(2*PI/n), sin(2*PI/n));
    fft(a, w);
    fft(b, w);
    for(int i=0;i<n;i++) c[i]=a[i]*b[i];

    fft(c, cpx(1, 0)/w);
    for(int i=0;i<n;i++) {
        c[i]/=cpx(n, 0);
        c[i]=cpx(ll(c[i].real()+0.500000000001), ll(c[i].imag()+0.500000000001));
    }
    return c;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    vector<cpx> x(2*n), y(2*n);
    for(int i=0;i<n;i++) {
        cin >> x[i];
        x[i+n]=x[i];
    }
    for(int i=n-1;i>=0;i--) cin >> y[i];
    auto z = mult(x, y);

    ll res=0;
    for(int i=n;i<2*n;i++) res=max(res, (ll)z[i].real());
    cout << res;
}