#include<bits/stdc++.h>
using namespace std;

const int MAX = 10'000;

int dp[MAX][2]; // [][우수마을X, 우수마을O]
int cost[MAX];
bool visited[MAX];
vector<vector<int>> conn(MAX);

void dfs(int cur) {
    visited[cur]=true;
    dp[cur][1] = cost[cur];
    for(int next:conn[cur]) {
        if(!visited[next]) {
            dfs(next);
            dp[cur][0] += max(dp[next][0], dp[next][1]);
            dp[cur][1] += dp[next][0];
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> cost[i];
    for(int i=0;i<n-1;i++) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }
    dfs(0);
    cout << max(dp[0][0], dp[0][1]);
}