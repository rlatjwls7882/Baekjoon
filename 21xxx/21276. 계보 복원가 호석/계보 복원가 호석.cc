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

map<string, int> inDegree;
map<string, vector<string>> child, res;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    vector<string> v(n);
    for(int i=0;i<n;i++) cin >> v[i];
    sort(all(v));

    int m; cin >> m;
    while(m--) {
        string a, b; cin >> a >> b;
        child[b].push_back(a);
        inDegree[a]++;
    }

    vector<string> grand;
    queue<string> q;
    for(int i=0;i<n;i++) {
        if(!inDegree[v[i]]) {
            q.push(v[i]);
            grand.push_back(v[i]);
        }
    }
    while(!q.empty()) {
        auto cur = q.front(); q.pop();
        for(auto next:child[cur]) {
            if(--inDegree[next]==0) {
                q.push(next);
                res[cur].push_back(next);
            }
        }
    }

    cout << sz(grand) << '\n';
    for(auto e:grand) cout << e << ' '; cout << '\n';
    for(int i=0;i<n;i++) {
        cout << v[i] << ' ' << sz(res[v[i]]);
        sort(all(res[v[i]]));
        for(auto e:res[v[i]]) cout << ' ' << e;
        cout << '\n';
    }
}