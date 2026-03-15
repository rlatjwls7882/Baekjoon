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
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef tree<int, null_type, less<int>, rb_tree_tag, tree_order_statistics_node_update> ordered_set;
typedef tree<int, int, less<int>, rb_tree_tag, tree_order_statistics_node_update> ordered_map;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

const int MAX = 1500;

int par[MAX*MAX], tot[MAX*MAX];
bool vis[MAX][MAX];
vvi conn(MAX*MAX);
string s[MAX];

int dx[4] = {0, 0, 1, -1};
int dy[4] = {1, -1, 0, 0};

int find(int x) {
    if(x==par[x]) return x;
    return par[x] = find(par[x]);
}

void merge(int x, int y) {
    x=find(x);
    y=find(y);
    if(x==y) return;
    if(x<y) {
        par[y]=x;
        tot[x]+=tot[y];
    } else {
        par[x]=y;
        tot[y]+=tot[x];
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int r, c; cin >> r >> c;
    for(int i=0;i<r;i++) cin >> s[i];

    int cnt=0;
    for(int i=0;i<r*c;i++) {
        if(s[i/c][i%c]=='L') {
            tot[i]=1;
            cnt++;
        }
        par[i]=i;
    }

    queue<int> q;
    for(int i=0;i<r;i++) {
        for(int j=0;j<c;j++) {
            if(s[i][j]=='.' || s[i][j]=='L') {
                q.push(i*c+j);
                vis[i][j]=true;
                if(par[i*c+j]==i*c+j) {
                    queue<int> baekjo;
                    baekjo.push(i*c+j);

                    while(!baekjo.empty()) {
                        int cur = baekjo.front(); baekjo.pop();
                        int cx=cur/c, cy=cur%c;
                        for(int k=0;k<4;k++) {
                            int nx=cx+dx[k];
                            int ny=cy+dy[k];
                            int next=nx*c+ny;
                            if(nx<0 || nx>=r || ny<0 || ny>=c || s[nx][ny]=='X' || find(cur)==find(next)) continue;
                            merge(cur, next);
                            baekjo.push(next);
                        }
                    }
                }
            }
        }
    }

    for(int t=1;;t++) {
        queue<int> nq;
        int mx=0;
        while(!q.empty()) {
            int cur=q.front(); q.pop();
            int cx=cur/c, cy=cur%c;
            for(int i=0;i<4;i++) {
                int nx=cx+dx[i];
                int ny=cy+dy[i];
                int next=nx*c+ny;
                if(nx<0 || nx>=r || ny<0 || ny>=c || vis[nx][ny]) continue;
                vis[nx][ny]=true;
                merge(cur, next);
                for(int j=0;j<4;j++) {
                    int nnx=nx+dx[j];
                    int nny=ny+dy[j];
                    if(nnx<0 || nnx>=r || nny<0 || nny>=c || !vis[nnx][nny]) continue;
                    merge(next, nnx*c+nny);
                }
                mx = max(mx, tot[find(cur)]);
                nq.push(next);
            }
        }
        q=nq;
        if(mx==cnt) {
            cout << t;
            return 0;
        }
    }
}