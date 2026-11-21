#include<bits/stdc++.h>
using namespace std;

int parent[80000], visited[80000];
vector<vector<pair<int, int>>> conn(80000);

int find(int x) {
    if(x==parent[x]) return x;
    return parent[x] = find(parent[x]);
}

struct soldier {
    int a, t;
    bool operator<(const soldier s) const {
        return t > s.t;
    }
};

int dijkstra(int p, int q) {
    fill(visited, visited+80000, 0x3f3f3f3f);
    priority_queue<soldier> pq; pq.push({p, 0});
    while(!pq.empty()) {
        soldier cur = pq.top(); pq.pop();
        if(visited[cur.a]<=cur.t) continue;
        if(cur.a==q) return cur.t;
        visited[cur.a]=true;
        for(auto next:conn[cur.a]) {
            if(visited[next.first]>cur.t+next.second) {
                pq.push({next.first, cur.t+next.second});
            }
        }
    }
    return -1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        int n; cin >> n;
        for(int i=0;i<n;i++) {
            conn[i].clear();
            parent[i]=i;
        }
        map<string, int> exist;
        for(int i=0;i<n;i++) {
            string s; cin >> s;
            if(exist[s]) {
                parent[i]=exist[s];
            } else {
                exist[s]=i;
            }
        }
        
        int m; cin >> m;
        while(m--) {
            int a, b, t; cin >> a >> b >> t;
            int pa = parent[a-1], pb = parent[b-1];
            if(pa!=pb) {
                conn[pa].push_back({pb, t});
            }
        }
        
        cout << "Case #" << tc << ":\n";
        int s; cin >> s;
        while(s--) {
            int p, q; cin >> p >> q;
            cout << dijkstra(parent[p-1], parent[q-1]) << '\n';
        }
    }
}