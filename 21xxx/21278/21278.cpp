#include<bits/stdc++.h>
using namespace std;

int vis[100];
vector<vector<int>> conn(100);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(m--) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }

    int minCost=INT_MAX, a, b;
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            memset(vis, -1, sizeof vis);
            int curCost=0;
            vis[i]=vis[j]=0;
            queue<int> q; q.push(i); q.push(j);
            while(!q.empty()) {
                int cur = q.front(); q.pop();
                for(int next:conn[cur]) {
                    if(vis[next]==-1) {
                        vis[next]=vis[cur]+1;
                        q.push(next);
                        curCost += vis[next]*2;
                    }
                }
            }
            if(curCost<minCost) {
                minCost=curCost;
                a=i+1;
                b=j+1;
            }
        }
    }
    cout << a << ' ' << b << ' ' << minCost;
}