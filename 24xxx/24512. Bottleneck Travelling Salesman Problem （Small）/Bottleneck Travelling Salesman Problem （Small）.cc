#include<bits/stdc++.h>
using namespace std;

const int MAX = 9;
const int INF = 0x3f3f3f3f;

int n, m, minCost=INF;
int cost[MAX][MAX];
bool visited[MAX];

vector<int> minVis, vis;

void dfs(int depth=1, int cur=0, int curCost=0) {
    if(depth==n) {
        if(cost[cur][0]) {
            int nextCost = max(curCost, cost[cur][0]);
            if(minCost>nextCost) {
                minCost=nextCost;
                minVis = vis;
            }
        }
        return;
    }

    for(int i=0;i<n;i++) {
        if(cost[cur][i] && !visited[i]) {
            visited[i]=true;
            vis.push_back(i);
            dfs(depth+1, i, max(curCost, cost[cur][i]));
            vis.pop_back();
            visited[i]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    while(m--) {
        int a, b, c; cin >> a >> b >> c;
        cost[a-1][b-1]=c;
    }
    visited[0]=true;
    vis.push_back(0);
    dfs();

    if(minCost==INF) {
        cout << -1;
    } else {
        cout << minCost << '\n';
        for(int e : minVis) cout << e+1 << ' ';
    }
}