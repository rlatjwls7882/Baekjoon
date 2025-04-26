#include<bits/stdc++.h>
using namespace std;

const int MAX = 100;

struct edge {
    int from, weight;
};

vector<vector<edge>> conn(MAX);
int dp[MAX][MAX]; // dp[i][j] : 부품 i를 만드는데 필요한 부품 j의 개수

void dfs(int cur) {
    if(dp[cur][0]!=-1) return;
    for(int i=0;i<MAX;i++) dp[cur][i]=0;

    for(edge next:conn[cur]) {
        dfs(next.from);
        for(int i=0;i<MAX;i++) {
            dp[cur][i] += dp[next.from][i]*next.weight;
        }
    }
    if(conn[cur].empty()) {
        dp[cur][cur]=1;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(m--) {
        int x, y, k; cin >> x >> y >> k;
        conn[x-1].push_back({y-1, k});
    }

    memset(dp, -1, sizeof dp);
    dfs(n-1);

    for(int i=0;i<n;i++) {
        if(dp[n-1][i]!=0) {
            cout << i+1 << ' ' << dp[n-1][i] << '\n';
        }
    }
}