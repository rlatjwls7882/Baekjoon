#include<bits/stdc++.h>
using namespace std;

const int MAX = 2000;
const int INF = 0x3f3f3f3f;

int c[MAX][MAX], f[MAX][MAX], cost[MAX][MAX], prv[MAX], curCost[MAX];
bool inQueue[MAX];
vector<vector<int>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int v, e; cin >> v >> e;
        if(cin.fail()) break;

        memset(c, 0, sizeof c);
        memset(f, 0, sizeof f);
        memset(cost, 0, sizeof cost);
        for(int i=0;i<v*2;i++) conn[i].clear();

        for(int i=0;i<v*2;i+=2) {
            c[i][i+1]=1; // 짝수: 들어오는곳, 홀수: 나가는곳
            conn[i].push_back(i+1);
            conn[i+1].push_back(i);
        }

        while(e-->0) {
            int ai, bi, ci; cin >> ai >> bi >> ci;
            int s = (ai-1)*2+1, e = (bi-1)*2;
            c[s][e]=1;
            cost[s][e]=ci;
            cost[e][s]=-ci;
            conn[s].push_back(e);
            conn[e].push_back(s);
        }

        int S=1, E=(v-1)*2;
        int totalCost=0;
        for(int i=0;i<2;i++) {
            memset(prv, -1, sizeof prv);
            fill(curCost, curCost+v*2, INF);
            queue<int> q; q.push(S);
            curCost[S]=0;
            inQueue[S]=true;
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

            for(int j=E;j!=S;j=prv[j]) {
                f[prv[j]][j]++;
                f[j][prv[j]]--;
                totalCost += cost[prv[j]][j];
            }
        }
        cout << totalCost << '\n';
    }
}