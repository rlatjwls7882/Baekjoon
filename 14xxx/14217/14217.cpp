#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;

    vector<set<int>> conn(n);
    while(m-->0) {
        int u, v; cin >> u >> v;
        conn[u-1].insert(v-1);
        conn[v-1].insert(u-1);
    }

    int q; cin >> q;
    while(q-->0) {
        int a, u, v; cin >> a >> u >> v;
        if(a==1) {
            conn[u-1].insert(v-1);
            conn[v-1].insert(u-1);
        } else {
            conn[u-1].erase(v-1);
            conn[v-1].erase(u-1);
        }

        int visited[n]; fill(visited, visited+n, -1);
        visited[0]=0;
        queue<int> q; q.push(0);
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:conn[cur]) {
                if(visited[next]==-1) {
                    visited[next] = visited[cur]+1;
                    q.push(next);
                }
            }
        }

        for(int i=0;i<n;i++) {
            cout << visited[i] << ' ';
        }
        cout << '\n';
    }
}