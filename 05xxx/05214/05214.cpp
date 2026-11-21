#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'001;

int cost[MAX];
vector<vector<int>> conn(MAX);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k, m; cin >> n >> k >> m;
    for(int i=1;i<=m;i++) {
        for(int j=0;j<k;j++) {
            int v; cin >> v;
            conn[n+i].push_back(v);
            conn[v].push_back(n+i);
        }
    }

    memset(cost, -1, sizeof cost);
    cost[1]=1;
    queue<int> q; q.push(1);
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(cost[next]==-1) {
                cost[next]=cost[cur]+1;
                q.push(next);
            }
        }
    }
    cout << (cost[n]==-1 ? -1 : cost[n]/2+1);
}