#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

struct MCMF { // O(FVE) F는 최대유량
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

int c[7];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        int n; cin >> n;
        for(int i=1;i<=6;i++) cin >> c[i];

        MCMF mcmf(8, 0, 7);
        for(int i=1;i<=3;i++) {
            mcmf.edge(mcmf.S, i, c[i], 0);
            mcmf.edge(i+3, mcmf.E, c[i+3], 0);
            for(int j=4;j<=6;j++) {
                int cost; cin >> cost;
                mcmf.edge(i, j, INF, -cost);
            }
        }
        cout << "Case #" << tc << ": " << -mcmf.res().second << '\n';
    }
}