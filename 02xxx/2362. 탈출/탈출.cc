#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

struct Dinic { // O(V²E), 모든 간선의 용량이 1이면 O(min(V^(2/3), E^(1/2))E)
    struct Edge {
        int to, rev;
        ll c;
    };
    int S, E;
    vector<int> level, work;
    vector<vector<Edge>> conn;

    Dinic(int SZ, int s, int e) {
        S=s; E=e;
        work = vector<int>(SZ);
        level = vector<int>(SZ);
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
        ll total=0, flow;
        while(bfs()) {
            fill(work.begin(), work.end(), 0);
            while(flow=dfs(S, LINF)) total+=flow;
        }
        return total;
    }
};

string board[100];
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;
    for(int i=0;i<n;i++) cin >> board[i];

    Dinic dinic(2*n*n+2, 0, 2*n*n+1);
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            int cur=i*n+j+1;
            if(board[i][j]=='X') dinic.edge(dinic.S, cur*2, INF);
            if(board[i][j]=='O') dinic.edge(cur*2-1, dinic.E, INF);
            if(board[i][j]!='+') dinic.edge(cur*2-1, cur*2, 1);
            for(int k=0;k<4;k++) {
                int nx=i+dx[k];
                int ny=j+dy[k];
                if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
                int next = nx*n+ny+1;
                dinic.edge(cur*2, next*2-1, INF);
            }
        }
    }
    int res = dinic.res();
    if(res<=k) cout << "Yes\n" << res;
    else cout << "No";
}