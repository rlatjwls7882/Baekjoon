#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

int h[100], minDist[1001];
vector<vector<pair<int, int>>> conn(1001);

struct element {
    int u, c;
    bool operator<(const element e) const {
        return c > e.c;
    }
};

void dijkstra(int s) {
    fill(minDist, minDist+1001, INF);
    priority_queue<element> pq; pq.push({s, 0});
    while(!pq.empty()) {
        auto [cur, curDist] = pq.top(); pq.pop();
        if(minDist[cur]<=curDist) continue;
        minDist[cur]=curDist;
        for(auto [next, nextDist]:conn[cur]) {
            if(minDist[next]>curDist+nextDist) pq.push({next, curDist+nextDist});
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, v, e, a, b; cin >> n >> v >> e >> a >> b;
    for(int i=0;i<n;i++) cin >> h[i];

    while(e--) {
        int u, v, l; cin >> u >> v >> l;
        conn[u].push_back({v, l});
        conn[v].push_back({u, l});
    }

    int ret=0;
    for(int i=0;i<n;i++) {
        dijkstra(h[i]);
        if(minDist[a]==INF) ret--;
        else ret += minDist[a];
        if(minDist[b]==INF) ret--;
        else ret += minDist[b];
    }
    cout << ret;
}