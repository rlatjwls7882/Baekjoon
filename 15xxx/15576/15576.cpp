#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define all(x) x.begin(), x.end()

typedef long long ll;
typedef long double ld;

const ld PI = acosl(-1);

typedef complex<double> cpx;

void fft(vector<cpx> &f, cpx w) {
    int n=f.size();
    if(n==1) return;

    vector<cpx> even, odd;
    for(int i=0;i<n;i++) {
        if(i%2) odd.push_back(f[i]);
        else even.push_back(f[i]);
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
    string a, b; cin >> a >> b;

    vector<cpx> A, B;
    for(int i=a.size()-1;i>=0;i--) A.push_back(a[i]-'0');
    for(int i=b.size()-1;i>=0;i--) B.push_back(b[i]-'0');

    auto c = mult(A, B);

    vector<ll> res;
    for(auto e:c) res.push_back(e.real()+0.500000000001);
    for(int i=0;i<res.size();i++) {
        if(res[i]>=10) {
            res[i+1]+=res[i]/10;
            res[i]%=10;
        }
    }
    while(res.size()>1 && res.back()==0) res.pop_back();
    reverse(all(res));
    for(auto e:res) cout << e;
}