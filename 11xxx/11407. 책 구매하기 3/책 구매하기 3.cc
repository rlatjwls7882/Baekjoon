#include<bits/stdc++.h>
using namespace std;

const int MAX = 202;
const int S = MAX-2, E = MAX-1;
const int INF = 0x3f3f3f3f;

int c[MAX][MAX], f[MAX][MAX], cost[MAX][MAX], prv[MAX], curCost[MAX];
bool inQueue[MAX];
vector<vector<int>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=m;i<n+m;i++) {
        cin >> c[i][E];
        conn[E].push_back(i);
        conn[i].push_back(E);
    }
    for(int i=0;i<m;i++) {
        cin >> c[S][i];
        conn[S].push_back(i);
        conn[i].push_back(S);
    }
    for(int i=0;i<m;i++) {
        for(int j=m;j<n+m;j++) {
            cin >> c[i][j];
        }
    }
    for(int i=0;i<m;i++) {
        for(int j=m;j<n+m;j++) {
            cin >> cost[i][j];
            cost[j][i] = -cost[i][j];
            conn[i].push_back(j);
            conn[j].push_back(i);
        }
    }

    int totalCost=0, totalFlow=0;
    while(true) {
        memset(prv, -1, sizeof prv);
        fill(curCost, curCost+MAX, INF);
        curCost[S]=0;
        inQueue[S]=true;
        queue<int> q; q.push(S);
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            inQueue[cur]=false;
            for(int next:conn[cur]) {
                if(c[cur][next]-f[cur][next]>0 && curCost[next] > curCost[cur] + cost[cur][next]) {
                    curCost[next] = curCost[cur] + cost[cur][next];
                    prv[next]=cur;
                    if(!inQueue[next]) {
                        inQueue[next]=true;
                        q.push(next);
                    }
                }
            }
        }
        if(prv[E]==-1) break;

        int flow=INF;
        for(int i=E;i!=S;i=prv[i]) {
            flow = min(flow, c[prv[i]][i]-f[prv[i]][i]);
        }
        for(int i=E;i!=S;i=prv[i]) {
            f[prv[i]][i] += flow;
            f[i][prv[i]] -= flow;
            totalCost += flow*cost[prv[i]][i];
        }
        totalFlow += flow;
    }
    cout << totalFlow << '\n' << totalCost;
}