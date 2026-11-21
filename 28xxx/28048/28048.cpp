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

int r, c;
int b[100][100];
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};
bool vis[100][100];

int bfs(int sx, int sy) {
    queue<pii> q; q.push({sx, sy});
    memset(vis, 0, sizeof vis);
    vis[sx][sy]=true;
    int cnt=0;
    while(!q.empty()) {
        auto [x, y]=q.front(); q.pop();
        cnt++;
        for(int i=0;i<4;i++) {
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx<0 || nx>=r || ny<0 || ny>=c || vis[nx][ny] || b[x][y]>b[nx][ny]) continue;
            vis[nx][ny]=true;
            q.push({nx, ny});
        }
    }
    return cnt;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> r >> c;
    for(int i=0;i<r;i++) for(int j=0;j<c;j++) cin >> b[i][j];
    int mx=0;
    for(int i=0;i<r;i++) for(int j=0;j<c;j++) mx=max(mx, bfs(i, j));
    cout << mx;
}
