#include<bits/stdc++.h>
using namespace std;

const int MAX = 10'001;

int minCost[MAX], inDegree[MAX], visited[MAX];

struct edge {
    int u, v, c, idx;
};

vector<vector<edge>> conn(MAX), prv(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    vector<edge> edges(m);
    for(int i=0;i<m;i++) {
        cin >> edges[i].u >> edges[i].v >> edges[i].c;
        edges[i].idx=i;
        inDegree[edges[i].v]++;
        conn[edges[i].u].push_back(edges[i]);
    }
    int s, e; cin >> s >> e;

    queue<int> q; q.push(s);
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(auto next : conn[cur]) {
            int nextCost = minCost[cur]+next.c;
            if(minCost[next.v] < nextCost) {
                minCost[next.v] = nextCost;
                prv[next.v] = {next};
            } else if(minCost[next.v] == nextCost) {
                prv[next.v].push_back(next);
            }
            if(--inDegree[next.v]==0) q.push(next.v);
        }
    }

    q.push(e);
    int cnt=0;
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        cnt += prv[cur].size();
        for(auto p : prv[cur]) {
            if(!visited[p.u]) {
                visited[p.u]=true;
                q.push(p.u);
            }
        }
    }
    cout << minCost[e] << '\n' << cnt;
}