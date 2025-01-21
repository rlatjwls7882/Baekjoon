#include<bits/stdc++.h>
using namespace std;

const int MAX = 300;
const int INF = 0x3f3f3f3f;

int c[MAX][MAX], f[MAX][MAX], prv[MAX];
vector<set<int>> conn(MAX);
vector<pair<int, int>> edges;

bool bfs(int s, int e) {
    memset(prv, -1, sizeof prv);
    queue<int> q; q.push(s);
    while(!q.empty() && prv[e]==-1) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(c[cur][next]-f[cur][next]>0 && prv[next]==-1) {
                prv[next]=cur;
                q.push(next);
                if(next==e) return true;
            }
        }
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int K; cin >> K;
    while(K--) {
        int N, M; cin >> N >> M;
        memset(c, 0, sizeof c);
        memset(f, 0, sizeof f);
        edges.clear();
        for(int i=0;i<N;i++) conn[i].clear();
        while(M--) {
            int f, t, b; cin >> f >> t >> b;
            c[f-1][t-1] += b;
            conn[f-1].insert(t-1);
            conn[t-1].insert(f-1);
            edges.push_back({f-1, t-1});
        }

        int s=0, e=N-1;
        while(bfs(s, e)) {
            int flow=INF;
            for(int i=e;i!=s;i=prv[i]) {
                flow = min(flow, c[prv[i]][i]-f[prv[i]][i]);
            }
            for(int i=e;i!=s;i=prv[i]) {
                f[prv[i]][i] += flow;
                f[i][prv[i]] -= flow;
            }
        }

        int cnt=0;
        for(auto e:edges) {
            if(!bfs(e.first, e.second)) cnt ++;
        }
        cout << cnt << '\n';
    }
}