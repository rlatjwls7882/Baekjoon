#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double ld;
const int MAX = 200'001;
const ll LINF = 0x3f3f3f3f3f3f3f3f;

vector<vector<pair<int, int>>> conn(MAX);
vector<ll> distFromStart(MAX, LINF);
vector<ll> distFromEnd(MAX, LINF);

struct element {
    int cur;
    ll cost;
    bool operator<(const element e) const {
        return cost > e.cost;
    }
};

void dijkstra(vector<ll> &minCost, int start) {
    priority_queue<element> pq; pq.push({start, 0});
    while(!pq.empty()) {
        auto [cur, cost] = pq.top(); pq.pop();
        if(cost>=minCost[cur]) continue;
        minCost[cur] = cost;
        for(auto [next, nextCost]:conn[cur]) {
            if(cost+nextCost<minCost[next]) pq.push({next, cost+nextCost});
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
    while(m--) {
        int i, j, l; cin >> i >> j >> l;
        conn[i].push_back({j, l});
        conn[j].push_back({i, l});
    }

    vector<pair<int, ld>> store(k);
    for(int i=0;i<k;i++) cin >> store[i].first >> store[i].second;

    dijkstra(distFromStart, 1);
    dijkstra(distFromEnd, n);
    sort(store.begin(), store.end(), [](pair<int, double> a, pair<int, double> b){
        return distFromStart[a.first]+distFromEnd[a.first] < distFromStart[b.first]+distFromEnd[b.first];
    });

    bool prob1=false;
    ld res=0, total=1;
    for(auto [u, prob]:store) {
        ll dist = distFromStart[u]+distFromEnd[u];
        if(dist<=LINF) res += dist*(total*prob);
        total *= 1-prob;
        if(prob==1) prob1=true;
    }
    if(prob1) cout << setprecision(10) << fixed << res;
    else cout << "impossible";
}