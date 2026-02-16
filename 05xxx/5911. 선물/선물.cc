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

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

ll p[1000], s[1000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll n, b; cin >> n >> b;
    for(int i=0;i<n;i++) cin >> p[i] >> s[i];

    ll res=0;
    for(int i=0;i<n;i++) {
        vector<int> price;
        for(int j=0;j<n;j++) {
            price.push_back((i==j ? p[j]/2 : p[j])+s[j]);
        }
        sort(all(price));

        ll curB=b, cur=0;
        for(int i=0;i<n;i++) {
            curB-=price[i];
            if(curB>=0) cur++;
            else break;
        }
        res = max(res, cur);
    }
    cout << res;
}