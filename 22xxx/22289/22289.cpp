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

vector<ll> mult(vector<cpx> a, vector<cpx> b) {
    int n=2;
    while(n<a.size()+b.size()) n<<=1;
    a.resize(n); b.resize(n);
    fft(a); fft(b);

    for(int i=0;i<n;i++) a[i]*=b[i];
    fft(a, true);

    vector<ll> ret(n);
    for(int i=0;i<n;i++) ret[i]=llround(a[i].real());
    for(int i=0;i<n;i++) {
        if(ret[i]>=10) {
            ret[i+1]+=ret[i]/10;
            ret[i]%=10;
        }
    }
    while(ret.size()>1 && ret.back()==0) ret.pop_back();
    reverse(all(ret));
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    string A, B; cin >> A >> B;
    vector<cpx> a, b;
    for(int i=A.size()-1;i>=0;i--) a.push_back(A[i]-'0');
    for(int i=B.size()-1;i>=0;i--) b.push_back(B[i]-'0');

    vector<ll> res = mult(a, b);
    for(auto e:res) cout << e;
}