#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
const int MAX = 20001;

struct element {
    int pos, cost;
    bool operator<(const element e) const {
        return cost > e.cost;
    }
};

int minCost[MAX];
vector<vector<element>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int v, e, k; cin >> v >> e >> k;
    while(e--) {
        int u, v, w; cin >> u >> v >> w;
        conn[u].push_back({v, w});
    }

    priority_queue<element> pq; pq.push({k, 0});
    fill(minCost, minCost+MAX, INF);
    while(!pq.empty()) {
        auto cur = pq.top(); pq.pop();
        if(minCost[cur.pos]<=cur.cost) continue;
        minCost[cur.pos] = cur.cost;

        for(auto next:conn[cur.pos]) {
            int nextCost = cur.cost + next.cost;
            if(nextCost<minCost[next.pos]) {
                pq.push({next.pos, nextCost});
            }
        }
    }

    for(int i=1;i<=v;i++) {
        if(minCost[i]==INF) cout << "INF\n";
        else cout << minCost[i] << '\n';
    }
}