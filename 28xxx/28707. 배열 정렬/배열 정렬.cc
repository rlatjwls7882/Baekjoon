#include<bits/stdc++.h>
using namespace std;

struct element {
    vector<int> v;
    int cost;
    bool operator<(const element e) const {
        return cost > e.cost;
    }
};

map<vector<int>, int> minCost;
vector<vector<pair<int, int>>> conn(10);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> A(n);
    for(int i=0;i<n;i++) cin >> A[i];

    int m; cin >> m;
    while(m--) {
        int l, r, c; cin >> l >> r >> c;
        conn[l-1].push_back({r-1, c});
        conn[r-1].push_back({l-1, c});
    }

    priority_queue<element> pq; pq.push({A, 0});
    while(!pq.empty()) {
        auto cur = pq.top(); pq.pop();
        if(minCost.count(cur.v) && minCost[cur.v] <= cur.cost) continue;
        minCost[cur.v] = cur.cost;
        for(int i=0;i<n;i++) {
            for(auto next : conn[i]) {
                element n = {cur.v, cur.cost+next.second};
                swap(n.v[i], n.v[next.first]);
                if(minCost.count(n.v) && minCost[n.v] <= n.cost) continue;
                pq.push(n);
            }
        }
    }
    sort(A.begin(), A.end());
    cout << (minCost.count(A) ? minCost[A] : -1);
}