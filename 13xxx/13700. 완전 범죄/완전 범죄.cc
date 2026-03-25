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
template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

int vis[100'000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, s, d, f, b, k; cin >> n >> s >> d >> f >> b >> k;

    fill(vis, vis+n, INF);
    while(k--) {
        int l; cin >> l;
        vis[l-1]=0;
    }

    vis[s-1]=0;
    queue<int> q; q.push(s-1);
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        if(cur==d-1) return !(cout << vis[cur]);
        if(cur+f<n && vis[cur+f]>vis[cur]+1) {
            vis[cur+f]=vis[cur]+1;
            q.push(cur+f);
        }
        if(cur-b>=0 && vis[cur-b]>vis[cur]+1) {
            vis[cur-b]=vis[cur]+1;
            q.push(cur-b);
        }
    }
    cout << "BUG FOUND";
}