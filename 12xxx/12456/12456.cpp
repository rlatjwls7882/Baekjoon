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

struct element {
    ll c, t, s;
    bool operator<(const element e) const {
        return t<e.t;
    }
};

struct element2 {
    ll c, s;
    bool operator<(const element2 e) const {
        return s>e.s;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int T; cin >> T;
    for(int tc=1;tc<=T;tc++) {
        ll n, k; cin >> n >> k;
        vector<element> v;
        while(n--) {
            ll c, t, s; cin >> c >> t >> s;
            v.push_back({c, t, s});
        }
        sort(all(v));

        ll res=0, curK=0;
        priority_queue<element2> pq;
        for(auto [c, t, s]:v) {
            pq.push({c, s});
            curK+=c;
            res+=c*s;
            while(curK>t) {
                ll cnt = curK-t;
                auto cur = pq.top(); pq.pop();
                if(cur.c>cnt) {
                    cur.c-=cnt;
                    curK-=cnt;
                    res-=cnt*cur.s;
                    pq.push(cur);
                } else {
                    curK-=cur.c;
                    res-=cur.c*cur.s;
                }
            }
        }
        cout << "Case #" << tc << ": " << res << '\n';
    }
}