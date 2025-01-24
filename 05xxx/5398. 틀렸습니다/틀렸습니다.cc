#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
const int S = 1000, E = 1001;
const int MAX = 1002;

int posA[500][2], posB[500][2];
string a[500], b[500];
int f[MAX][MAX], c[MAX][MAX], prv[MAX];
vector<vector<int>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int h, v; cin >> h >> v;
        for(int i=0;i<MAX;i++) conn[i].clear();
        memset(f, 0, sizeof f);
        memset(c, 0, sizeof c);

        for(int i=0;i<h;i++) {
            cin >> posA[i][0] >> posA[i][1] >> a[i];
            c[S][i]=1;
            conn[i].push_back(S);
            conn[S].push_back(i);
        }
        for(int i=0;i<v;i++) {
            cin >> posB[i][0] >> posB[i][1] >> b[i];
            c[h+i][E]=1;
            conn[h+i].push_back(E);
            conn[E].push_back(h+i);
        }

        for(int i=0;i<h;i++) {
            for(int j=0;j<v;j++) {
                if(posA[i][0]<=posB[j][0] && posB[j][0]<posA[i][0]+a[i].length() && posB[j][1]<=posA[i][1] && posA[i][1]<posB[j][1]+b[j].length()) {
                    if(a[i][posB[j][0]-posA[i][0]]!=b[j][posA[i][1]-posB[j][1]]) {
                        conn[i].push_back(h+j);
                        conn[h+j].push_back(i);
                        c[i][h+j]=INF;
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
        cout << h+v-total_flow << '\n';
    }
}