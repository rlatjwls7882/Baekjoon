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

struct Dinic { // O(V²E), 모든 간선의 용량이 1이면 O(min(V^(2/3), √E)E)
    struct Edge {
        int to, rev;
        ll c;
    };
    const int S, E;
    vector<int> level, work;
    vector<vector<Edge>> conn;
    ll total=0;

    Dinic(int SZ, int s, int e):S(s), E(e) {
        work = level = vector<int>(SZ);
        conn = vector<vector<Edge>>(SZ);
    }

    void edge(int u, int v, ll cap) {
        conn[u].push_back({v, (int)conn[v].size(), cap});
        conn[v].push_back({u, (int)conn[u].size()-1, 0});
    }

    bool bfs() {
        fill(level.begin(), level.end(), -1);
        queue<int> q; q.push(S);
        level[S]=0;
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(Edge &next:conn[cur]) {
                if(level[next.to]==-1 && next.c) {
                    level[next.to]=level[cur]+1;
                    q.push(next.to);
                }
            }
        }
        return level[E]!=-1;
    }

    ll dfs(int cur, ll curFlow) {
        if(cur==E) return curFlow;
        for(int &i=work[cur];i<conn[cur].size();i++) {
            Edge &next=conn[cur][i];
            if(level[next.to]==level[cur]+1 && next.c) {
                ll flow = dfs(next.to, min(curFlow, next.c));
                if(flow) {
                    next.c-=flow;
                    conn[next.to][next.rev].c+=flow;
                    return flow;
                }
            }
        }
        return 0;
    }

    ll res() {
        ll flow;
        while(bfs()) {
            fill(work.begin(), work.end(), 0);
            while(flow=dfs(S, LINF)) total+=flow;
        }
        return total;
    }
};

int a[100][100];
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) for(int j=0;j<m;j++) cin >> a[i][j];
    Dinic dinic(n*m+1, 0, n*m);

    int s=0, e=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if((i+j)%2) {
                if(a[i][j]==2) dinic.edge(dinic.S, i*m+j, 2), s+=2;
                else if(a[i][j]==3) dinic.edge(dinic.S, i*m+j, 1), s++;

                for(int k=0;k<4;k++) {
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
                    if(a[i][j]==2 && a[nx][ny]==3 || a[i][j]==3 && a[nx][ny]!=4) dinic.edge(i*m+j, nx*m+ny, 1);
                }
            } else {
                if(a[i][j]==2) dinic.edge(i*m+j, dinic.E, 2), e+=2;
                else if(a[i][j]==3) dinic.edge(i*m+j, dinic.E, 1), e++;
            }
        }
    }
    cout << (s==e && s==dinic.res() ? "HAPPY" : "HOMELESS");
}