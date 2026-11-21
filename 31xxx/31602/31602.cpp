#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    vector<vector<pair<int, int>>> conn(n);
    while(m-->0) {
        int u, v, t; cin >> u >> v >> t;
        conn[u-1].push_back({v-1, t});
        conn[v-1].push_back({u-1, t});
    }

    int prev[n]; fill(prev, prev+n, -1);
    int dist[n]; fill(dist, dist+n, -1);
    priority_queue<tuple<int, int, int>, vector<tuple<int, int, int>>, greater<tuple<int, int, int>>> pq; pq.push({0, 0, -1});
    while(!pq.empty()) {
        auto cur = pq.top(); pq.pop(); // {dist, cur, prev}
        int curDist = get<0>(cur), curNode = get<1>(cur), prevNode = get<2>(cur);
        if(dist[curNode]!=-1) continue;
        dist[curNode]=curDist;
        prev[curNode]=prevNode;
        for(auto next:conn[curNode]) {
            if(dist[next.first]==-1) {
                pq.push({curDist+next.second, next.first, curNode});
            }
        }
    }
    if(dist[n-1]==-1) {
        cout << -1;
        return 0;
    }

    bool minDistPath[n] = {false, };
    for(int i=n-1;i!=-1;i=prev[i]) minDistPath[i]=true;

    int minDist = INT_MAX;
    for(int i=0;i<n;i++) {
        if(!minDistPath[i]) {
            for(auto next:conn[i]) {
                if(minDistPath[next.first]) {
                    minDist = min(minDist, dist[i]+next.second+dist[n-1]-dist[next.first]);
                }
            }
        } else {
            for(auto next:conn[i]) {
                if(!minDistPath[next.first]) {
                    minDist = min(minDist, dist[n-1]+next.second*2);
                } else if(prev[next.first]!=i && prev[i]!=next.first) {
                    minDist = min(minDist, dist[i]+next.second+dist[n-1]-dist[next.first]);
                }
            }
        }
    }
    if(minDist==INT_MAX) cout << -1;
    else cout << dist[n-1] + minDist;
}