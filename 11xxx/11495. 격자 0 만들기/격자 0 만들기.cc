#include<bits/stdc++.h>
using namespace std;

const int S = 2500, E = 2501;
const int MAX = 2502;
const int INF = 0x3f3f3f3f;

int input[MAX], c[MAX][MAX], f[MAX][MAX], prv[MAX];
vector<vector<int>> conn(MAX);

int main() {
    int T; cin >> T;
    while(T--) {
        int n, m; cin >> n >> m;
        memset(c, 0, sizeof c);
        memset(f, 0, sizeof f);
        for(int i=0;i<MAX;i++) conn[i].clear();

        int sum=0;
        for(int i=0;i<n*m;i++) {
            cin >> input[i];
            sum += input[i];
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if((i+j)%2==0) {
                    conn[S].push_back(i*m+j);
                    conn[i*m+j].push_back(S);
                    c[S][i*m+j] += input[i*m+j];
                    if(j<m-1) {
                        conn[i*m+j].push_back(i*m+j+1);
                        conn[i*m+j+1].push_back(i*m+j);
                        c[i*m+j][i*m+j+1]=INF;
                    }
                    if(i<n-1) {
                        conn[i*m+j].push_back((i+1)*m+j);
                        conn[(i+1)*m+j].push_back(i*m+j);
                        c[i*m+j][(i+1)*m+j]=INF;
                    }
                } else {
                    conn[i*m+j].push_back(E);
                    conn[E].push_back(i*m+j);
                    c[i*m+j][E] += input[i*m+j];
                    if(j<m-1) {
                        conn[i*m+j].push_back(i*m+j+1);
                        conn[i*m+j+1].push_back(i*m+j);
                        c[i*m+j+1][i*m+j]=INF;
                    }
                    if(i<n-1) {
                        conn[i*m+j].push_back((i+1)*m+j);
                        conn[(i+1)*m+j].push_back(i*m+j);
                        c[(i+1)*m+j][i*m+j]=INF;
                    }
                }
            }
        }

        int total_flow=0;
        while(true) {
            memset(prv, -1, sizeof prv);
            queue<int> q; q.push(S);
            while(!q.empty() && prv[E]==-1) {
                int cur = q.front(); q.pop();
                for(int next:conn[cur]) {
                    if(c[cur][next]-f[cur][next]>0 && prv[next]==-1) {
                        prv[next]=cur;
                        q.push(next);
                        if(next==E) break;
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
            }
            total_flow += flow;
        }
        cout << sum-total_flow << '\n';
    }
}