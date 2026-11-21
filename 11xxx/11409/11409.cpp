#include<bits/stdc++.h>
using namespace std;

const int MAX = 802;
const int S = MAX-2, E = MAX-1;
const int INF = 0x3f3f3f3f;

int c[MAX][MAX], f[MAX][MAX], cost[MAX][MAX], prv[MAX], curCost[MAX];
bool inQueue[MAX];
vector<vector<int>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) {
        c[S][i]=1;
        conn[i].push_back(S);
        conn[S].push_back(i);
    }
    for(int i=n;i<n+m;i++) {
        c[i][E]=1;
        conn[i].push_back(E);
        conn[E].push_back(i);
    }
    for(int i=0;i<n;i++) {
        int cnt; cin >> cnt;
        while(cnt--) {
            int v; cin >> v; cin >> cost[i][n+v-1];
            cost[n+v-1][i] = cost[i][n+v-1];
            cost[i][n+v-1] *= -1;
            c[i][n+v-1]=1;
            conn[i].push_back(n+v-1);
            conn[n+v-1].push_back(i);
        }
    }

    int totalCost=0, flow=0;
    while(true) {
        memset(prv, -1, sizeof prv);
        fill(curCost, curCost+MAX, INF);
        queue<int> q; q.push(S);
        inQueue[S]=true;
        curCost[S]=0;
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

        for(int i=E;i!=S;i=prv[i]) {
            f[prv[i]][i]++;
            f[i][prv[i]]--;
            totalCost += cost[prv[i]][i];
        }
        flow++;
    }
    cout << flow << '\n' << -totalCost;
}