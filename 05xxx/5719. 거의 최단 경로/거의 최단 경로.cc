#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
const int MAX = 500;

int n, m, s, d;
bool visited[MAX];

struct edge {
    int u, v, c;
    bool operator==(const edge e) const {
        return u==e.u && v==e.v;
    }
};

vector<vector<edge>> conn, prv;

struct pos {
    int idx, val;
    bool operator<(const pos p) const {
        return val > p.val;
    }
};

int dijkstra() {
    vector<int> maxCost(n, INF);
    prv = vector<vector<edge>>(n);
    priority_queue<pos> pq; pq.push({s, 0});
    maxCost[s]=0;
    while(!pq.empty()) {
        pos cur = pq.top(); pq.pop();
        if(maxCost[cur.idx] < cur.val || cur.idx==d) continue;

        for(edge &next:conn[cur.idx]) {
            if(maxCost[next.v]>cur.val+next.c) {
                maxCost[next.v] = cur.val+next.c;
                prv[next.v] = {next};
                pq.push({next.v, maxCost[next.v]});
            } else if(maxCost[next.v]==cur.val+next.c) {
                prv[next.v].push_back(next);
            }
        }
    }

    vector<bool> visited(n);
    queue<int> q; q.push(d);
    visited[d]=true;
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        if(cur==s) continue;
        prv[cur].erase(unique(prv[cur].begin(), prv[cur].end()), prv[cur].end());
        for(edge next:prv[cur]) {
            conn[next.u].erase(find(conn[next.u].begin(), conn[next.u].end(), next));
            if(!visited[next.u]) {
                visited[next.u]=true;
                q.push(next.u);
            }
        }
    }
    return (maxCost[d] == INF ? -1 : maxCost[d]);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        cin >> n >> m >> s >> d;
        if(!n) break;
        conn = vector<vector<edge>>(n);
        memset(visited, 0, sizeof visited);
        while(m--) {
            int u, v, c; cin >> u >> v >> c;
            conn[u].push_back({u, v, c});
        }
        dijkstra();
        cout << dijkstra() << '\n';
    }
}