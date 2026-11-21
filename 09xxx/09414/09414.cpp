#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define x first
#define y second
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
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

ll pow(ll n, ll r) {
    ll ret=1;
    while(r--) {
        ret*=n;
        if(ret>5'000'000) return -1;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        vector<ll> p;
        while(true) {
            ll l; cin >> l;
            if(!l) break;
            p.push_back(l);
        }
        sort(all(p), greater<ll>());

        ll sum=0;
        for(int i=0;i<p.size();i++) {
            ll cur = 2*pow(p[i], i+1);
            if(cur==-1) {
                sum=5'000'001;
                break;
            }
            sum+=cur;
        }
        cout << (sum>5'000'000 ? "Too expensive" : to_string(sum)) << '\n';
    }
}