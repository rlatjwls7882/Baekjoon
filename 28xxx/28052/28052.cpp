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

string ss[1000];
bool vis[1000][100][2];
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int r, c; cin >> r >> c;
    string s; cin >> s;
    string s2=s;
    reverse(all(s2));
    for(int i=0;i<r;i++) cin >> ss[i];

    queue<tuple<int, int, int>> q;
    for(int i=0;i<c;i++) {
        bool chk1=true;
        for(int j=0;j<c;j++) {
            if(s[j]=='1' && ss[0][(i+j)%c]=='1') {
                chk1=false;
                break;
            }
        }
        bool chk2=true;
        for(int j=0;j<c;j++) {
            if(s2[j]=='1' && ss[0][(i+j)%c]=='1') {
                chk2=false;
                break;
            }
        }
        if(chk1) q.push({0, i, 0});
        if(chk2) q.push({0, i, 1});
        vis[0][i][0]=true;
        vis[0][i][1]=true;
    }

    while(!q.empty()) {
        auto [x, y, d]=q.front(); q.pop();
        if(x==r-1) return !(cout << "Y");
        for(int i=0;i<4;i++) {
            int nx=x+dx[i];
            int ny=(y+dy[i]+c)%c;
            if(nx<0 || nx>=r || vis[nx][ny][d]) continue;
            vis[nx][ny][d]=true;
            if(d==0) {
                bool chk=true;
                for(int j=0;j<c;j++) {
                    if(s[j]=='1' && ss[nx][(ny+j)%c]=='1') {
                        chk=false;
                        break;
                    }
                }
                if(chk) q.push({nx, ny, 0});
            } else {
                bool chk=true;
                for(int j=0;j<c;j++) {
                    if(s2[j]=='1' && ss[nx][(ny+j)%c]=='1') {
                        chk=false;
                        break;
                    }
                }
                if(chk) q.push({nx, ny, 1});
            }
        }
    }
    cout << "N";
}
