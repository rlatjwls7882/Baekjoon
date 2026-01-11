#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;

struct MCMF { // O(FVE)
    int S, E;
    vector<int> prv;
    vector<bool> inQ;
    vector<ll> curCost;
    vector<vector<int>> conn;
    vector<vector<ll>> c, cost;

    inline MCMF(int SZ, int s, int e) {
        S=s; E=e;
        prv = vector<int>(SZ);
        inQ = vector<bool>(SZ);
        curCost = vector<ll>(SZ);
        conn = vector<vector<int>>(SZ);
        c = vector<vector<ll>>(SZ, vector<ll>(SZ));
        cost = vector<vector<ll>>(SZ, vector<ll>(SZ));
    }

    inline void edge(int u, int v, ll cap, ll co) {
        c[u][v]=cap;
        cost[u][v]=co;
        cost[v][u]=-co;
        conn[u].push_back(v);
        conn[v].push_back(u);
    }

    inline pair<ll, ll> res() {
        ll totalFlow=0, totalCost=0;
        while(true) {
            queue<int> q; q.push(S);
            fill(prv.begin(), prv.end(), -1);
            fill(curCost.begin()+1, curCost.end(), LINF);
            while(!q.empty()) {
                int cur = q.front(); q.pop();
                inQ[cur]=false;
                for(int next:conn[cur]) {
                    if(c[cur][next] && curCost[next]>curCost[cur]+cost[cur][next]) {
                        curCost[next]=curCost[cur]+cost[cur][next];
                        prv[next]=cur;
                        if(!inQ[next]) {
                            q.push(next);
                            inQ[next]=true;
                        }
                    }
                }
            }
            if(prv[E]==-1) break;

            ll flow=LINF;
            for(int i=E;i!=S;i=prv[i]) {
                flow = min(flow, c[prv[i]][i]);
            }
            for(int i=E;i!=S;i=prv[i]) {
                c[prv[i]][i]-=flow;
                c[i][prv[i]]+=flow;
            }
            totalFlow+=flow;
            totalCost+=curCost[E]*flow;
        }
        return {totalFlow, totalCost};
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    MCMF mcmf(2*n+2, 0, 2*n+1);
    for(int i=1;i<=n;i++) {
        mcmf.edge(mcmf.S, i, 1, 0);
        for(int j=n+1;j<=2*n;j++) {
            ll cost; cin >> cost;
            mcmf.edge(i, j, 1, cost);
        }
    }
    for(int j=n+1;j<=2*n;j++) {
        mcmf.edge(j, mcmf.E, 1, 0);
    }
    cout << mcmf.res().second;
}