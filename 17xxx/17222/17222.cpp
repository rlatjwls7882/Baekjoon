#include<bits/stdc++.h>
using namespace std;

const int LINF = 0x3f3f3f3f3f3f3f3f;

int limit[201];

struct EdmondKarp { // O(VE²)
    typedef long long ll;
    const int INF = 0x3f3f3f3f;
    int S=0, E;
    vector<int> prv;
    vector<vector<ll>> c, f, conn;

    inline EdmondKarp(int SZ) {
        E=SZ-1;
        prv = vector<int>(SZ);
        c = vector<vector<ll>>(SZ, vector<ll>(SZ));
        f = vector<vector<ll>>(SZ, vector<ll>(SZ));
        conn = vector<vector<ll>>(SZ);
    }

    inline void undirect(int u, int v, ll cost) {
        conn[u].push_back(v);
        conn[v].push_back(u);
        c[u][v]=cost;
    }

    inline void direct(int u, int v, ll cost) {
        conn[u].push_back(v);
        c[u][v]=cost;
    }

    inline int res() {
        ll total=0;
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

            ll flow=LINF;
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
    int s=0, e=n+m+1;
    EdmondKarp flow(n+m+2);
    for(int i=1;i<=n;i++) {
        cin >> limit[i];
        flow.undirect(s, i, LINF);
    }
    for(int j=n+1;j<=n+m;j++) {
        cin >> limit[j];
        flow.undirect(j, e, limit[j]);
    }
    for(int j=n+1;j<=n+m;j++) {
        int k; cin >> k;
        while(k--) {
            int i; cin >> i;
            flow.undirect(i, j, limit[i]);
        }
    }
    cout << flow.res();
}