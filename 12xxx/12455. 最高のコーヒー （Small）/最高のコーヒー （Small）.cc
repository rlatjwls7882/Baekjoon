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

int n, k;
vector<pii> res;

int sel(int s, int t) {
    for(int i=t-1;i>=0;i--) {
        if(res[i].x<s) return i;
    }
    return -1;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int T; cin >> T;
    for(int tc=1;tc<=T;tc++) {
        cin >> n >> k;
        res = vector<pii>(k);
        while(n--) {
            int c, t, s; cin >> c >> t >> s;
            while(c--) {
                int cs=s, ct=t;
                while(true) {
                    int i = sel(cs, ct);
                    if(i==-1 || res[i].x==cs) break;
                    swap(res[i].x, cs);
                    swap(res[i].y, ct);
                }
            }
        }

        int r=0;
        for(auto e:res) r+=e.x;
        cout << "Case #" << tc << ": " << r << '\n';
    }
}