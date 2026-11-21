#include<bits/stdc++.h>
#include<ext/pb_ds/assoc_container.hpp>
#include<ext/pb_ds/tree_policy.hpp>
#include<ext/rope>
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
template<typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template<typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

int cost[201][201];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;

    fill(&cost[0][0], &cost[200][201], INF);
    for(int i=1;i<=n;i++) cost[i][i]=0;
    while(m--) {
        int a, b; cin >> a >> b;
        cin >> cost[a][b];
    }

    for(int m=1;m<=n;m++) {
        for(int s=1;s<=n;s++) {
            for(int e=1;e<=n;e++) {
                cost[s][e] = min(cost[s][e], cost[s][m]+cost[m][e]);
            }
        }
    }

    int k; cin >> k;
    vector<int> li(k);
    for(int i=0;i<k;i++) cin >> li[i];

    vector<int> res;
    int mn=INT_MAX;
    for(int i=1;i<=n;i++) {
        int cur=0;
        for(int j:li) cur=max(cur, cost[j][i]+cost[i][j]);
        if(cur<mn) {
            res.clear();
            mn=cur;
        }
        if(cur==mn) res.push_back(i);
    }
    for(auto e:res) cout << e << ' ';
}