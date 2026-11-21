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
#define rep(x) for(int __i=(x);__i>0;--__i)
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef __int128 i128;
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

bool vis[300];
bool cant[300][300];
int a[300], b[300];
string s[300];
map<string, int> ord;
vector<vector<int>> conn(300);

bool dfs(int cur) {
    vis[cur]=true;
    for(int nxt:conn[cur]) {
        if(b[nxt]==-1 || !vis[b[nxt]] && dfs(b[nxt])) {
            a[cur]=nxt;
            b[nxt]=cur;
            return true;
        }
    }
    return false;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        cin >> s[i];
        ord[s[i]]=i;
    }

    int r; cin >> r;
    while(r--) {
        int m, w; cin >> m >> w;
        vector<bool> lst(n);
        for(int i=0;i<m;i++) {
            string ss; cin >> ss;
            lst[ord[ss]]=true;
        }
        for(int i=0;i<n;i++) {
            if(lst[i]) {
                for(int j=0;j<w-1;j++) {
                    cant[i][j]=true;
                }
            } else {
                cant[i][w-1]=true;
            }
        }
    }
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(!cant[i][j]) {
                conn[i].push_back(j);
            }
        }
    }

    memset(b, -1, sizeof b);
    for(int i=0;i<n;i++) {
        memset(vis, 0, sizeof vis);
        dfs(i);
    }
    int idx=0;
    for(int i=0;i<n;i++) cout << s[b[i]] << ' ';
}
