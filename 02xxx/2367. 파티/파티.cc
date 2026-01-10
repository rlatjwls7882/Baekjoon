#include<bits/stdc++.h>
using namespace std;

const int S=0, E=301;
const int MAX = 302;
const int INF = 0x3f3f3f3f;

int c[MAX][MAX], f[MAX][MAX], prv[MAX];
vector<vector<int>> conn(MAX);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k, d; cin >> n >> k >> d;
    for(int i=n+1;i<=n+d;i++) {
        cin >> c[i][E];
        conn[E].push_back(i);
        conn[i].push_back(E);
    }
    for(int i=1;i<=n;i++) {
        int z; cin >> z;
        conn[S].push_back(i);
        conn[i].push_back(S);
        c[S][i]=k;
        while(z--) {
            int j; cin >> j;
            conn[i].push_back(j+n);
            conn[j+n].push_back(i);
            c[i][j+n]=1;
        }
    }

    int total=0;
    while(true) {
        memset(prv, -1, sizeof prv);
        queue<int> q; q.push(S);
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:conn[cur]) {
                if(c[cur][next]-f[cur][next] && prv[next]==-1) {
                    prv[next]=cur;
                    if(next==E) break;
                    q.push(next);
                }
            }
        }
        if(prv[E]==-1) break;

        int flow=INF;
        for(int i=E;i!=S;i=prv[i]) {
            flow = min(flow, c[prv[i]][i]-f[prv[i]][i]);
        }
        for(int i=E;i!=S;i=prv[i]) {
            f[prv[i]][i]+=flow;
            f[i][prv[i]]-=flow;
        }
        total+=flow;
    }
    cout << total;
}