#include<bits/stdc++.h>
using namespace std;

struct EdmondKarp {
    const int INF = 0x3f3f3f3f;
    int S=0, E;
    vector<int> prv;
    vector<vector<int>> c, f, conn;

    inline EdmondKarp(int SZ) {
        E=SZ-1;
        prv = vector<int>(SZ);
        c = vector<vector<int>>(SZ, vector<int>(SZ));
        f = vector<vector<int>>(SZ, vector<int>(SZ));
        conn = vector<vector<int>>(SZ);
    }

    inline void undirect(int u, int v, int cost) {
        conn[u].push_back(v);
        conn[v].push_back(u);
        c[u][v]=cost;
    }

    inline void direct(int u, int v, int cost) {
        conn[u].push_back(v);
        c[u][v]=cost;
    }

    inline int res() {
        int total=0;
        while(true) {
            fill(prv.begin(), prv.end(), -1);
            queue<int> q; q.push(S);
            while(!q.empty()) {
                int cur = q.front(); q.pop();
                for(int next:conn[cur]) {
                    if(c[cur][next]-f[cur][next] && prv[next]==-1) {
                        prv[next]=cur;
                        if(next==E) break;
                        q.push(next);
                    }
                }
            }
            if(prv[E]==-1) break;

            int flow=INF;
            for(int i=E;i!=S;i=prv[i]) {
                flow = min(flow, c[prv[i]][i]-f[prv[i]][i]);
            }
            for(int i=E;i!=S;i=prv[i]) {
                f[prv[i]][i]+=flow;
                f[i][prv[i]]-=flow;
            }
            total+=flow;
        }
        return total;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    int S=0, E=n+m+1;

    EdmondKarp flow(n+m+2);
    for(int i=1;i<=n;i++) {
        int c; cin >> c;
        flow.undirect(S, i, c);
    }
    for(int i=n+1;i<=n+m;i++) {
        int c; cin >> c;
        flow.undirect(i, E, c);
    }
    for(int i=n+1;i<=n+m;i++) {
        for(int j=1;j<=n;j++) {
            int c; cin >> c;
            flow.undirect(j, i, c);
        }
    }
    cout << flow.res();
}