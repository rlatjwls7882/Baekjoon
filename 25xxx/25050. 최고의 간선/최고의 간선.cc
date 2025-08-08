#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

const ll LINF = 0x3f3f3f3f3f3f3f3f;

struct element {
    ll u, v, w, idx;
    bool operator<(const element e) const {
        return w > e.w; // pq
    }
};

int n, m;
int cnt[5000];
ll cost[2000];
vector<vector<element>> conn(2000);

int dfs(int cur) {
    int curCost=1;
    for(auto next:conn[cur]) {
        if(cost[next.v] == cost[cur] + next.w) {
            int nextCost = dfs(next.v);
            cnt[next.idx] += nextCost;
            curCost += nextCost;
        }
    }
    return curCost;
}

void dijkstra(int s) {
    fill(cost, cost+n, LINF);
    priority_queue<element> pq; pq.push({-1, s, 0, -1});
    while(!pq.empty()) {
        auto cur = pq.top(); pq.pop();
        if(cur.w>=cost[cur.v]) continue;
        cost[cur.v] = cur.w;

        for(auto next : conn[cur.v]) {
            if(cost[next.v] > cur.w + next.w) {
                pq.push({-1, next.v, cur.w + next.w, next.idx});
            }
        }
    }
    dfs(s);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<m;i++) {
        ll u, v, w; cin >> u >> v >> w;
        conn[u-1].push_back({u-1, v-1, w, i});
    }

    for(int i=0;i<n;i++) {
        dijkstra(i);
    }

    int maxCnt = *max_element(cnt, cnt+m);
    vector<int> res;
    for(int i=0;i<m;i++) {
        if(maxCnt==cnt[i]) {
            res.push_back(i+1);
        }
    }
    cout << res.size() << '\n';
    for(int e : res) cout << e << ' ';
}