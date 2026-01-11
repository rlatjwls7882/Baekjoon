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

int a[101];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=1;i<=2*n;i++) cin >> a[i];
    int t, f; cin >> t >> f;

    MCMF mcmf_min(2*n+2, 0, 2*n+1), mcmf_max(2*n+2, 0, 2*n+1);
    for(int i=1;i<=n;i++) {
        mcmf_min.edge(mcmf_min.S, i, 1, 0);
        mcmf_min.edge(i+n, mcmf_min.E, 1, 0);
        mcmf_max.edge(mcmf_max.S, i, 1, 0);
        mcmf_max.edge(i+n, mcmf_max.E, 1, 0);
        for(int j=n+1;j<=2*n;j++) {
            if(a[j]>a[i]) {
                if(a[j]-a[i]>t) {
                    mcmf_min.edge(i, j, 1, 0);
                    mcmf_max.edge(i, j, 1, 0);
                } else {
                    mcmf_min.edge(i, j, 1, min(f, (t-(a[j]-a[i]))*(t-(a[j]-a[i]))));
                    mcmf_max.edge(i, j, 1, -min(f, (t-(a[j]-a[i]))*(t-(a[j]-a[i]))));
                }
            }
        }
    }
    auto res1 = mcmf_min.res();
    auto res2 = mcmf_max.res();
    if(res1.first!=n) cout << -1;
    else cout << res1.second << ' ' << -res2.second;
}