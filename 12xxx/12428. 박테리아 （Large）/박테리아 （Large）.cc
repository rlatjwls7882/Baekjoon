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

struct HopcroftKarp { // O(E√V)
    int match=0;
    const int aSZ, bSZ;
    vector<int> a, b, level, work;
    vector<vector<int>> conn;

    HopcroftKarp(int _sz1, int _sz2):aSZ(_sz1), bSZ(_sz2) {
        level = vector<int>(aSZ);
        work = a = vector<int>(aSZ, -1);
        b = vector<int>(bSZ, -1);
        conn = vector<vector<int>>(aSZ);
    }

    void edge(int u, int v) {
        conn[u].push_back(v);
    }

    void bfs() {
        queue<int> q;
        for(int i=0;i<aSZ;i++) {
            if(a[i]==-1) {
                level[i]=0;
                q.push(i);
            } else {
                level[i]=-1;
            }
        }
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:conn[cur]) {
                if(b[next]!=-1 && level[b[next]]==-1) {
                    level[b[next]]=level[cur]+1;
                    q.push(b[next]);
                }
            }
        }
    }

    bool dfs(int cur) {
        for(int &i=work[cur];i<conn[cur].size();i++) {
            int next=conn[cur][i];
            if(b[next]==-1 || level[b[next]]==level[cur]+1 && dfs(b[next])) {
                b[next]=cur;
                a[cur]=next;
                return true;
            }
        }
        return false;
    }

    int res() {
        while(true) {
            bfs();
            int flow=0;
            fill(work.begin(), work.end(), 0);
            for(int i=0;i<aSZ;i++) flow+=a[i]==-1 && dfs(i);
            if(!flow) break;
            match+=flow;
        }
        return match;
    }

    bool isUnique() {
        vector<int> inDegree(aSZ+bSZ);
        vector<vector<int>> dag(aSZ+bSZ);
        for(int cur=0;cur<aSZ;cur++) {
            for(int next:conn[cur]) {
                if(a[cur]==next) {
                    dag[aSZ+next].push_back(cur);
                    inDegree[cur]++;
                } else {
                    dag[cur].push_back(aSZ+next);
                    inDegree[aSZ+next]++;
                }
            }
        }

        queue<int> q;
        for(int i=0;i<aSZ+bSZ;i++) {
            if(!inDegree[i]) q.push(i);
        }
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:dag[cur]) {
                if(!(--inDegree[next])) q.push(next);
            }
        }
        for(int i=0;i<aSZ+bSZ;i++) {
            if(inDegree[i]) return false;
        }
        return true;
    }

    vector<vector<int>> cover() {
        auto visA = vector<unsigned char>(aSZ);
        auto visB = vector<unsigned char>(bSZ);

        queue<int> q;
        for(int i=0;i<aSZ;i++) {
            if(a[i]==-1) {
                q.push(i);
                visA[i]=true;
            }
        }
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:conn[cur]) {
                if(!visB[next] && b[next]!=-1 && !visA[b[next]]) {
                    visB[next]=true;
                    visA[b[next]]=true;
                    q.push(b[next]);
                }
            }
        }
        vector<vector<int>> ret(2);
        for(int i=0;i<aSZ;i++) if(!visA[i]) ret[0].push_back(i);
        for(int i=0;i<bSZ;i++) if(visB[i]) ret[1].push_back(i);
        return ret;
    }
};

int n, m, k;
string s[50][20];
int vis[50][20][20];
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        cin >> n >> m >> k;
        for(int a=0;a<k;a++) {
            for(int b=0;b<n;b++) {
                cin >> s[a][b];
            }
        }

        int evenIdx=0, oddIdx=0;
        memset(vis, -1, sizeof vis);
        for(int a=0;a<k;a++) {
            for(int b=0;b<n;b++) {
                for(int c=0;c<m;c++) {
                    if(s[a][b][c]=='.' && vis[a][b][c]==-1) {
                        queue<pii> q; q.push({b, c});
                        vis[a][b][c] = a%2 ? oddIdx : evenIdx;
                        while(!q.empty()) {
                            auto [x, y] = q.front(); q.pop();
                            for(int d=0;d<4;d++) {
                                int nx = x+dx[d];
                                int ny = y+dy[d];
                                if(nx<0 || nx>=n || ny<0 || ny>=m || vis[a][nx][ny]!=-1 || s[a][nx][ny]=='#') continue;
                                vis[a][nx][ny] = a%2 ? oddIdx : evenIdx;
                                q.push({nx, ny});
                            }
                        }
                        if(a%2) oddIdx++;
                        else evenIdx++;
                    }
                }
            }
        }

        vector<set<int>> conn(evenIdx);
        HopcroftKarp hk(evenIdx, oddIdx);
        for(int a=0;a<k;a+=2) {
            for(int b=0;b<n;b++) {
                for(int c=0;c<m;c++) {
                    if(a+1<k && vis[a][b][c]!=-1 && vis[a+1][b][c]!=-1) conn[vis[a][b][c]].insert(vis[a+1][b][c]);
                    if(a-1>=0 && vis[a][b][c]!=-1 && vis[a-1][b][c]!=-1) conn[vis[a][b][c]].insert(vis[a-1][b][c]);
                }
            }
        }
        for(int i=0;i<evenIdx;i++) {
            for(int j:conn[i]) {
                hk.edge(i, j);
            }
        }
        cout << "Case #" << tc << ": " << evenIdx+oddIdx-hk.res() << '\n';
    }
}