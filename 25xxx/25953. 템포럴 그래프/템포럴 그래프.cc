#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
int dp[1001][10000]; // dp[i][j] : 시간 i일때 s -> j번 정점으로의 최소 거리

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, t, m, s, e; cin >> n >> t >> m >> s >> e;

    for(int i=0;i<n;i++) dp[0][i]=INF;
    dp[0][s]=0;

    for(int i=0;i<t;i++) {
        memcpy(dp[i+1], dp[i], sizeof dp[i]);
        for(int j=0;j<m;j++) {
            int u, v, w; cin >> u >> v >> w;
            dp[i+1][v] = min(dp[i+1][v], dp[i][u]+w);
            dp[i+1][u] = min(dp[i+1][u], dp[i][v]+w);
        }
    }
    cout << (dp[t][e]==INF ? -1 : dp[t][e]);
}