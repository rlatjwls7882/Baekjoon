#include<bits/stdc++.h>
using namespace std;

int cost[101][101];
vector<int> path[101][101];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    memset(cost, -1, sizeof cost);

    while(m-->0) {
        int u, v, c; cin >> u >> v >> c;
        if(cost[u][v]==-1 || cost[u][v]>c) {
            cost[u][v]=c;
            path[u][v].clear();
            path[u][v].push_back(v);
        }
    }

    for(int m=1;m<=n;m++) {
        for(int s=1;s<=n;s++) {
            for(int e=1;e<=n;e++) {
                if(s!=e && cost[s][m]!=-1 && cost[m][e]!=-1 && (cost[s][e]==-1 || cost[s][m]+cost[m][e]<cost[s][e])) {
                    cost[s][e] = cost[s][m]+cost[m][e];
                    path[s][e].clear();
                    for(int el:path[s][m]) path[s][e].push_back(el);
                    for(int el:path[m][e]) path[s][e].push_back(el);
                }
            }
        }
    }

    for(int i=1;i<=n;i++) {
        for(int j=1;j<=n;j++) {
            cout << max(0, cost[i][j]) << ' ';
        }
        cout << '\n';
    }
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=n;j++) {
            if(path[i][j].size()) {
                cout << path[i][j].size()+1 << ' ' << i;
                for(int e:path[i][j]) cout << ' ' << e;
                cout << '\n';
            } else {
                cout << "0\n";
            }
        }
    }
}