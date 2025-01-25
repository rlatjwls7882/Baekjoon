#include<bits/stdc++.h>
using namespace std;

const int MAX = 1004;
const int S = 1001, E = 1002;
const int INF = 0x3f3f3f3f;

int c[MAX][MAX], f[MAX][MAX], cost[MAX][MAX], prv[MAX], curCost[MAX];
bool inQueue[MAX];
vector<vector<int>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        memset(c, 0, sizeof c);
        memset(f, 0, sizeof f);
        memset(cost, 0, sizeof cost);
        for(int i=0;i<MAX;i++) conn[i].clear();

        int n, m; cin >> n >> m;
        for(int i=0;i<MAX;i+=2) {
            c[i][i+1]=INF; // 짝수: 도착 지점, 홀수: 출발 지점
            conn[i].push_back(i+1);
            conn[i+1].push_back(i);
        }
        while(m-->0) {
            int x, y; cin >> x >> y;
            int s1=(x-1)*2+1, e1=(x-1)*2;
            int s2=(y-1)*2+1, e2=(y-1)*2;
            cost[s1][e2]=cost[s2][e1]=1;
            cost[e2][s1]=cost[e1][s2]=-1;
            c[s1][e2]=c[s2][e1]=INF;
            conn[s1].push_back(e2);
            conn[e2].push_back(s1);
            conn[s2].push_back(e1);
            conn[e1].push_back(s2);
        }

        vector<int> node(n), coin(n);
        for(int i=0;i<n;i++) cin >> node[i];
        for(int i=0;i<n;i++) cin >> coin[i];

        for(int i=0;i<n;i++) {
            if(coin[i]==1) { // 하얀색 동전의 위치를 시작점과 연결
                c[S][i*2]=1;
                conn[S].push_back(i*2);
                conn[i*2].push_back(S);
            }
            if(node[i]==1) { // 하얀색 정점의 위치를 도착점과 연결
                c[i*2+1][E]=1;
                conn[E].push_back(i*2+1);
                conn[i*2+1].push_back(E);
            }
        }

        int totalCost=0;
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

            totalCost += curCost[E];
            for(int i=E;i!=S;i=prv[i]) {
                f[prv[i]][i]++;
                f[i][prv[i]]--;
            }
        }
        cout << totalCost << '\n';
    }
}