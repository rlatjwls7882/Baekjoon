#include<bits/stdc++.h>
using namespace std;

vector<vector<pair<int, int>>> conn(101);

void dijkstra(int *visited, int cur) {
    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq; pq.push({0, cur});
    while(!pq.empty()) {
        auto cur = pq.top(); pq.pop();
        if(visited[cur.second]!=-1) continue;
        visited[cur.second]=cur.first;

        for(auto next:conn[cur.second]) {
            if(visited[next.first]==-1) {
                pq.push({cur.first+next.second, next.first});
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int v, m; cin >> v >> m;
    while(m-->0) {
        int a, b, c; cin >> a >> b >> c;
        conn[a].push_back({b, c});
        conn[b].push_back({a, c});
    }
    int j, s; cin >> j >> s;

    int visitedJ[v+1]; fill(visitedJ, visitedJ+v+1, -1);
    int visitedS[v+1]; fill(visitedS, visitedS+v+1, -1);
    dijkstra(visitedJ, j);
    dijkstra(visitedS, s);

    int minDist=INT_MAX;
    for(int i=1;i<=v;i++) {
        if(i!=j && i!=s) minDist = min(minDist, visitedJ[i]+visitedS[i]);
    }

    int idx=-1, curDist=INT_MAX;
    for(int i=1;i<=v;i++) {
        if(i!=j && i!=s && minDist==visitedJ[i]+visitedS[i] && visitedJ[i]<=visitedS[i] && curDist>visitedJ[i]) {
            curDist=visitedJ[i];
            idx=i;
        }
    }
    cout << idx;
}