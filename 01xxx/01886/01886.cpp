#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

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

vector<vector<pii>> edges(144);
string s[12];
int n, m, cntS, cntE, t;
int vis[12][12], idx[12][12];
int dx[4] = {0, 0, 1, -1};
int dy[4] = {1, -1, 0, 0};

bool chk(int cur) {
    HopcroftKarp hk(cntS, cntE*cur+1);
    for(int i=0;i<cntS;i++) {
        for(auto e:edges[i]) {
            while(e.ss<=cur) hk.edge(i, e.ff*cur+e.ss++);
        }
    }
    return hk.res()==cntS;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n >> m;
    for(int i=0;i<n;i++) {
        cin >> s[i];
        for(int j=0;j<m;j++) {
            if(s[i][j]=='.') idx[i][j]=cntS++;
            else if(s[i][j]=='D') idx[i][j]=cntE++;
        }
    }
    t=n*m+cntS;

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(s[i][j]=='.') {
                memset(vis, -1, sizeof vis);
                vis[i][j]=0;
                queue<pii> q; q.push({i, j});
                while(!q.empty()) {
                    auto [x, y] = q.front(); q.pop();
                    for(int k=0;k<4;k++) {
                        int nx = x+dx[k];
                        int ny = y+dy[k];
                        if(nx<0 || nx>=n || ny<0 || ny>=m || s[nx][ny]=='X' || vis[nx][ny]!=-1) continue;
                        vis[nx][ny]=vis[x][y]+1;
                        if(s[nx][ny]=='D') edges[idx[i][j]].push_back({idx[nx][ny], vis[nx][ny]});
                        else q.push({nx, ny});
                    }
                }
            }
        }
    }

    int l=0, r=t+1;
    while(l<r) {
        int mid = l+r>>1;
        if(chk(mid)) r=mid;
        else l=mid+1;
    }
    if(l==t+1) return !(cout << "impossible");
    cout << l;
}