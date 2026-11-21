#include<bits/stdc++.h>
using namespace std;

const int MAX = 1102;
const int INF = 0x3f3f3f3f;
const int S=0, E=MAX-1;

vector<vector<int>> conn(MAX);
int cap[MAX][MAX], f[MAX][MAX], level[MAX], work[MAX];

bool bfs() {
    memset(level, -1, sizeof level);
    level[S]=0;
    queue<int> q; q.push(S);
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(cap[cur][next]-f[cur][next]>0 && level[next]==-1) {
                level[next]=level[cur]+1;
                q.push(next);
            }
        }
    }
    return level[E]!=-1;
}

int dfs(int cur=S, int flow=INF) {
    if(cur==E) return flow;
    for(int &i=work[cur];i<conn[cur].size();i++) {
        int next = conn[cur][i];
        if(cap[cur][next]-f[cur][next]>0 && level[next]==level[cur]+1) {
            int ret = dfs(next, min(flow, cap[cur][next]-f[cur][next]));
            if(ret) {
                f[cur][next]+=ret;
                f[next][cur]-=ret;
                return ret;
            }
        }
    }
    return 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=m;i++) { // 색 -> E
        conn[i+n].push_back(E);
        conn[E].push_back(i+n);
        cap[i+n][E]=1;
    }
    for(int i=1;i<=n;i++) {
        // 국기 -> 색
        int k; cin >> k;
        while(k--) {
            int c; cin >> c;
            conn[i].push_back(c+n);
            conn[c+n].push_back(i);
            cap[i][c+n]=1;
        }

        // S -> 국기
        conn[S].push_back(i);
        conn[i].push_back(S);
        cap[S][i]=1;
    }

    int flow=0;
    while(bfs()) {
        memset(work, 0, sizeof work);
        while(true) {
            int curFlow = dfs();
            if(!curFlow) break;
            flow += curFlow;
        }
    }
    cout << flow;
}