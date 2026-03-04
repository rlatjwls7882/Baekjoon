#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define all(x) x.begin(), x.end()

typedef long long ll;
typedef long double ld;
typedef vector<int> vi;

const ld PI = acosl(-1);

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

vi mult(vi &_a, vi &_b) {
    vector<cpx> a(all(_a)), b(all(_b));
    int n=2;
    while(n<a.size()+b.size()) n<<=1;
    a.resize(n); b.resize(n);
    fft(a); fft(b);

    for(int i=0;i<n;i++) a[i]*=b[i];
    fft(a, true);

    vi ret(n);
    for(int i=0;i<n;i++) ret[i] = min((int)round(a[i].real()), 1);
    return ret;
}

void solve(vi a, int n) {
    vi res=a;
    while(n) {
        if(n&1) res = mult(res, a);
        a=mult(a, a);
        n>>=1;
    }
    for(int i=1;i<res.size();i++) {
        if(res[i]) cout << i << ' ';
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;
    vi a(1001);
    while(n--) {
        int c; cin >> c;
        a[c]=1;
    }
    solve(a, k-1);
}