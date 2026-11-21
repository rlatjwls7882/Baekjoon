#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
#include <ext/rope>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;
using namespace __gnu_pbds;
using namespace __gnu_cxx;

#define x first
#define y second
#define sz(x) (int)(x).size()
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<ll> vll;
typedef vector<vll> vvll;
template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

int cnt[101];

bool chk(int p) {
    for(int i=p+1;i<=100;i++) {
        if(cnt[i]) return false;
    }
    cnt[p]--;
    return true;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;

    vector<pii> stk;
    queue<pii> q;
    while(n--) {
        int p, w; cin >> p >> w;
        q.push({p, w});
        cnt[p]++;
    }

    int res=0;
    while(q.size()) {
        auto cur = q.front(); q.pop();
        if(chk(cur.x)) {
            vector<pii> nxt;
            while(stk.size() && stk.back().x==cur.x &&  stk.back().y<cur.y) {
                nxt.push_back(stk.back());
                res+=stk.back().y*2;
                stk.pop_back();
            }
            res+=cur.y;
            stk.push_back(cur);
            while(nxt.size()) {
                stk.push_back(nxt.back());
                nxt.pop_back();
            }
        } else {
            q.push(cur);
            res+=cur.y;
        }
    }
    cout << res;
}