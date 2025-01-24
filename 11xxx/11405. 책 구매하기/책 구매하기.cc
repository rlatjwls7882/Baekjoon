#include<bits/stdc++.h>
using namespace std;

const int MAX = 202;
const int S = MAX-2, E = MAX-1;
const int INF = 0x3f3f3f3f;

int c[MAX][MAX], f[MAX][MAX], curCost[MAX], cost[MAX][MAX], prv[MAX];
bool inQueue[MAX];
vector<vector<int>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) {
        cin >> c[i][E];
        conn[E].push_back(i);
        conn[i].push_back(E);
    }
    for(int i=n;i<n+m;i++) {
        cin >> c[S][i];
        conn[i].push_back(S);
        conn[S].push_back(i);
    }

    for(int i=n;i<n+m;i++) {
        for(int j=0;j<n;j++) {
            cin >> cost[i][j];
            cost[j][i]=-cost[i][j];
            conn[i].push_back(j);
            conn[j].push_back(i);
            c[i][j]=INF;
        }
    }

    int totalCost=0;
    while(true) {
        memset(prv, -1, sizeof prv);
        memset(inQueue, 0, sizeof inQueue);
        fill(curCost, curCost+MAX, INF);
        curCost[S]=0;
        queue<int> q; q.push(S);
        inQueue[S]=true;
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            inQueue[cur]=false;
            for(int next:conn[cur]) {
                if(c[cur][next]-f[cur][next]>0 && curCost[next]>curCost[cur]+cost[cur][next]) {
                    curCost[next] = curCost[cur] + cost[cur][next];
                    prv[next] = cur;
                    if(!inQueue[next]) {
                        q.push(next);
                        inQueue[next]=true;
                    }
                }
            }
        }
        if(prv[E]==-1) break;

        int flow = INF;
        for(int i=E;i!=S;i=prv[i]) {
            flow = min(flow, c[prv[i]][i]-f[prv[i]][i]);
        }
        for(int i=E;i!=S;i=prv[i]) {
            f[prv[i]][i] += flow;
            f[i][prv[i]] -= flow;
            totalCost += cost[prv[i]][i]*flow;
        }
    }
    cout << totalCost;
}