#include<bits/stdc++.h>
using namespace std;

#define x first
#define y second
#define all(x) x.begin(), x.end()
#define sz(x) (int)(x).size()

typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const int SZ = 40;

map<pii, int> edge;
vector<vector<pii>> conn(50'001), large(50'001);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m, q; cin >> n >> m >> q;
    while(m--) {
        int u, v, t; cin >> u >> v >> t;
        conn[u].push_back({v, t});
        conn[v].push_back({u, t});
        if(edge[{u, v}]) edge[{u, v}]=edge[{v, u}]=min(edge[{u, v}], t);
        else edge[{u, v}]=edge[{v, u}]=t;
    }

    vector<int> res(q, INF);
    for(int i=0;i<q;i++) {
        int s, e; cin >> s >> e;
        res[i] = edge.count({s, e}) ? edge[{s, e}] : INF;
        if(sz(conn[s])<SZ && sz(conn[e])<SZ) {
            for(auto cur:conn[s]) {
                for(auto next:conn[e]) {
                    if(cur.x==next.x) res[i] = min(res[i], cur.y+next.y); // 길이 2
                    if(edge.count({cur.x, next.x})) res[i] = min(res[i], edge[{cur.x, next.x}]+cur.y+next.y); // 길이 3
                }
            }
        } else {
            if(sz(conn[s])>sz(conn[e])) large[s].push_back({e, i});
            else large[e].push_back({s, i});
        }
    }

    for(int s=1;s<=n;s++) {
        vector<int> cost;
        if(sz(large[s])) {
            cost = vector<int>(n+1, INF);
            cost[s]=0;
            for(auto cur:conn[s]) {
                cost[cur.x] = min(cost[cur.x], cur.y);
                for(auto next:conn[cur.x]) cost[next.x] = min(cost[next.x], cur.y+next.y);
            }
        }
        for(auto [e, i]:large[s]) {
            for(auto cur:conn[e]) res[i] = min(res[i], cost[cur.x]+cur.y);
        }
    }
    for(int i=0;i<q;i++) cout << (res[i]==INF ? -1 : res[i]) << '\n';
}