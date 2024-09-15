#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;

    vector<set<int>> conn(n);
    while(m-->0) {
        int i, j; cin >> i >> j;
        conn[i-1].insert(j-1);
        conn[j-1].insert(i-1);
    }

    int q; cin >> q;
    while(q-->0) {
        int i, j; cin >> i >> j;
        conn[i-1].insert(j-1);
        conn[j-1].insert(i-1);

        int visited[n]; fill(visited, visited+n, -1);
        queue<int> q; q.push(0);
        visited[0]=0;
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:conn[cur]) {
                if(visited[next]==-1) {
                    visited[next]=visited[cur]+1;
                    q.push(next);
                }
            }
        }
        for(int i=0;i<n;i++) cout << visited[i] << ' ';
        cout << '\n';
    }
}