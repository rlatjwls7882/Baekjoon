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

int vis[300][300], a[300][300];
int dx[] = {1, 0};
int dy[] = {0, 1};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<m;i++) for(int j=0;j<n;j++) cin >> a[i][j];

    queue<pii> q; q.push({0, 0});
    vis[0][0]=true;
    while(!q.empty()) {
        auto [x, y] = q.front(); q.pop();
        for(int i=0;i<2;i++) {
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx<0 || nx>=m || ny<0 || ny>=n || !a[nx][ny] || vis[nx][ny]) continue;
            q.push({nx, ny});
            vis[nx][ny]=true;
        }
    }
    cout << (vis[m-1][n-1] ? "Yes" : "No");
}