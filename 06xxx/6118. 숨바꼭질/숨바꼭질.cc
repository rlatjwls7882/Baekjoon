#include<bits/stdc++.h>
using namespace std;

int dist[50001];
vector<vector<int>> conn(50001);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;
    while(M-->0) {
        int u, v; cin >> u >> v;
        conn[u].push_back(v);
        conn[v].push_back(u);
    }

    queue<int> q; q.push(1);
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(next!=1 && dist[next]==0) {
                q.push(next);
                dist[next] = dist[cur]+1;
            }
        }
    }

    int maxDist=-1, cnt, idx;
    for(int i=1;i<=N;i++) {
        if(dist[i]>maxDist) {
            maxDist = dist[i];
            cnt=1;
            idx=i;
        } else if(dist[i]==maxDist) {
            cnt++;
        }
    }
    cout << idx << ' ' << maxDist << ' ' << cnt;
}