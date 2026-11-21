#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

struct Pos {
    ll x, lastX, cost, cnt;
    bool operator<(const Pos a) const {
        if(this->cost == a.cost) return this->cnt < a.cnt;
        return this->cost > a.cost;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    vector<vector<pair<int, int>>> conn(n);
    while(m-->0) {
        int u, v, w; cin >> u >> v >> w;
        conn[u-1].push_back({v-1, w});
        conn[v-1].push_back({u-1, w});
    }
    bool A[n];
    int total=0;
    for(int i=0;i<n;i++) {
        cin >> A[i];
        if(A[i]) total++;
    }

    priority_queue<Pos> pq; pq.push({0, -1, 0, A[0]});
    ll prev[n], cost[n]; fill(cost, cost+n, LONG_LONG_MAX);
    while(!pq.empty()) {
        Pos cur = pq.top(); pq.pop();
        if(cost[cur.x]<cur.cost || cost[cur.x]==cur.cost && cur.x!=n-1) continue;
        prev[cur.x] = cur.lastX;
        cost[cur.x] = cur.cost;

        if(cur.x==n-1) {
            if(cur.cnt==total) {
                vector<int> v;
                for(int i=cur.x;i!=-1;i=prev[i]) {
                    v.push_back(i+1);
                }
                cout << v.size() << '\n';
                for(int i=v.size()-1;i>=0;i--) cout << v[i] << ' ';
                return 0;
            }
            continue;
        }

        for(auto next:conn[cur.x]) {
            if(cost[next.first]>=cur.cost+next.second) {
                pq.push({next.first, cur.x, cur.cost+next.second, cur.cnt + A[next.first]});
            }
        }
    }
    cout << -1;
}