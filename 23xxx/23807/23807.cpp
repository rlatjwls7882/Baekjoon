#include<bits/stdc++.h>
#define INF 10000000000000
using namespace std;

int N, M, X, Z, P;
long long YtoY[100][100000];
vector<vector<pair<int, int>>> conn(100000);

void dijkstra(int start, int i) {
    priority_queue<pair<long long, int>, vector<pair<long long, int>>, greater<pair<long long, int>>> pq; pq.push({0, start});
    bool visited[N] = {false, };
    while(!pq.empty()) {
        auto cur = pq.top(); pq.pop();
        if(visited[cur.second]) continue;
        visited[cur.second]=true;
        YtoY[i][cur.second]=cur.first;

        for(auto next:conn[cur.second]) {
            if(!visited[next.first]) {
                pq.push({cur.first+next.second, next.first});
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    while(M-->0) {
        int u, v, w; cin >> u >> v >> w;
        conn[u-1].push_back({v-1, w});
        conn[v-1].push_back({u-1, w});
    }
    cin >> X >> Z >> P;
    int Y[P];
    for(int i=0;i<P;i++) cin >> Y[i];

    fill(&YtoY[0][0], &YtoY[P-1][N], INF);
    for(int i=0;i<P;i++) dijkstra(Y[i]-1, i);

    long long minCnt=INF;
    for(int i=0;i<P;i++) {
        for(int j=0;j<P;j++) {
            for(int k=0;k<P;k++) {
                if(i!=j && i!=k && j!=k) minCnt = min(minCnt, YtoY[i][X-1]+YtoY[i][Y[j]-1]+YtoY[j][Y[k]-1]+YtoY[k][Z-1]);
            }
        }
    }
    if(minCnt==INF) cout << -1;
    else cout << minCnt;
}