#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
const int MAX = 200;

int n, m;
int minDist[MAX], step[MAX];
vector<vector<pair<int, int>>> conn(MAX);

struct pos {
    int idx, last, cost;
    bool operator<(const pos p) const {
        return cost > p.cost;
    }
};

void dijkstra(int first) {
    fill(minDist, minDist+n, INF);
    memset(step, -1, sizeof step);

    priority_queue<pos> pq; pq.push({first, -1, 0});
    while(!pq.empty()) {
        auto cur = pq.top(); pq.pop();
        if(minDist[cur.idx]<=cur.cost) continue;
        minDist[cur.idx] = cur.cost;
        step[cur.idx] = cur.last;
        for(auto next : conn[cur.idx]) {
            if(minDist[next.first] > cur.cost+next.second) {
                pq.push({next.first, (cur.last==-1 ? next.first+1 : cur.last), cur.cost+next.second});
            }
        }
    }
    for(int i=0;i<n;i++) {
        if(step[i]==-1) cout << "- ";
        else cout << step[i] << ' ';
    }
    cout << '\n';
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    while(m--) {
        int a, b, c; cin >> a >> b >> c;
        conn[a-1].push_back({b-1, c});
        conn[b-1].push_back({a-1, c});
    }
    for(int i=0;i<n;i++) dijkstra(i);
}