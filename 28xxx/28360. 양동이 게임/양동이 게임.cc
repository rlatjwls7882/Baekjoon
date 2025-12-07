#include<bits/stdc++.h>
using namespace std;

const int MAX = 51;

double w[MAX];
bool vis[MAX];
vector<vector<int>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(m--) {
        int v, w; cin >> v >> w;
        conn[v].push_back(w);
    }

    w[1]=100;
    priority_queue<int, vector<int>, greater<int>> pq; pq.push(1);
    while(!pq.empty()) {
        int cur = pq.top(); pq.pop();
        if(vis[cur]) continue;
        vis[cur]=true;

        for(int next:conn[cur]) {
            w[next] += w[cur]/conn[cur].size();
            pq.push(next);
        }
        if(!conn[cur].empty()) w[cur]=0;
    }
    cout << setprecision(6) << fixed << *max_element(w, w+n+1);
}