#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;
using namespace __gnu_pbds;

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
typedef tree<int, null_type, less<int>, rb_tree_tag, tree_order_statistics_node_update> ordered_set;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

int n, m, use, k;
vvi conn(2001);

void dfs(int cur) {
    if(use==k) return;
    while(conn[cur].size()>m) {
        if(use==k) return;
        n++;
        use++;
        for(int i=0;i<m;i++) {
            conn[n].push_back(conn[cur].back());
            conn[cur].pop_back();
        }
        conn[cur].push_back(n);
    }
    for(int next:conn[cur]) {
        dfs(next);
    }
}


int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n >> m >> k;

    unordered_set<int> s;
    for(int i=1;i<=n;i++) s.insert(i);
    for(int i=1;i<=n;i++) {
        int c; cin >> c;
        while(c--) {
            int v; cin >> v;
            conn[i].push_back(v);
            s.erase(v);
        }
    }
    for(int root:s) dfs(root);

    for(int i=1;i<=n;i++) {
        if(conn[i].size()>m) {
            return !(cout << 0);
        }
    }
    cout << "1\n" << use << '\n';
    for(int i=1;i<=n;i++) {
        cout << conn[i].size();
        for(auto e:conn[i]) cout << ' ' << e;
        cout << '\n';
    }
}