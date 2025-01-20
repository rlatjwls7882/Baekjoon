#include<bits/stdc++.h>
using namespace std;

int cost[101][101], pa[101][101];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    memset(cost, -1, sizeof cost);
    memset(pa, -1, sizeof pa);

    while(m-->0) {
        int u, v, c; cin >> u >> v >> c;
        if(cost[u][v]==-1 || cost[u][v]>c) {
            cost[u][v]=c;
            pa[u][v]=v;
        }
    }

    for(int m=1;m<=n;m++) {
        for(int s=1;s<=n;s++) {
            for(int e=1;e<=n;e++) {
                if(s!=e && cost[s][m]!=-1 && cost[m][e]!=-1 && (cost[s][e]==-1 || cost[s][m]+cost[m][e]<cost[s][e])) {
                    cost[s][e] = cost[s][m]+cost[m][e];
                    pa[s][e] = pa[s][m];
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
            if(cost[i][j]==-1) {
                cout << "0\n";
            } else {
                vector<int> res;
                for(int k=i;;k=pa[k][j]) {
                    res.push_back(k);
                    if(k==j) break;
                }
                cout << res.size();
                for(int e:res) cout << ' ' << e;
                cout << '\n';
            }
        }
    }
}