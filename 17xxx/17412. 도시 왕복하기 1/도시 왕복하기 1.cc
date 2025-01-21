#include <bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
const int MAX = 400;

int c[MAX][MAX], f[MAX][MAX], prv[MAX];
vector<set<int>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, P; cin >> N >> P;
    while(P--) {
        int u, v; cin >> u >> v;
        c[u-1][v-1]++;
        conn[u-1].insert(v-1);
        conn[v-1].insert(u-1);
    }

    int flow=0;
    while(true) {
        memset(prv, -1, sizeof prv);
        queue<int> q; q.push(0);

        while(!q.empty() && prv[1]==-1) {
            int cur = q.front(); q.pop();
            for(int next:conn[cur]) {
                if(c[cur][next]-f[cur][next]>0 && prv[next]==-1) {
                    prv[next] = cur;
                    q.push(next);
                    if(next==1) break;
                }
            }
        }
        if(prv[1]==-1) break;

        int F=INF;
        for(int i=1;i!=0;i=prv[i]) {
            F = min(F, c[prv[i]][i]-f[prv[i]][i]);
        }
        for(int i=1;i!=0;i=prv[i]) {
            f[prv[i]][i] += F;
            f[i][prv[i]] -= F;
        }
        flow += F;
    }
    cout << flow;
}