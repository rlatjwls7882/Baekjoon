#include<bits/stdc++.h>
using namespace std;

const int MAX = 300'001;

int vis[MAX];
vector<vector<int>> conn(MAX);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m, s, e; cin >> n >> m >> s >> e;
    while(m--) {
        int a, b; cin >> a >> b;
        conn[a].push_back(b);
        conn[b].push_back(a);
    }
    memset(vis, -1, sizeof vis);

    vis[s]=0;
    queue<int> q; q.push(s);
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        if(cur-1>=0 && vis[cur-1]==-1) {
            vis[cur-1]=vis[cur]+1;
            q.push(cur-1);
        }
        if(cur+1<=n && vis[cur+1]==-1) {
            vis[cur+1]=vis[cur]+1;
            q.push(cur+1);
        }
        for(int next:conn[cur]) {
            if(vis[next]==-1) {
                q.push(next);
                vis[next]=vis[cur]+1;
            }
        }
    }
    cout << vis[e];
}