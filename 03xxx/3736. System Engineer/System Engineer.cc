#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

struct Dinic { // O(V²E), 모든 간선의 용량이 1이면 O(min(V^(2/3), E^(1/2))E)
    struct Edge {
        int to, rev;
        ll c;
    };
    const int S, E;
    vector<int> level, work;
    vector<vector<Edge>> conn;

    Dinic(int SZ, int s, int e):S(s), E(e) {
        work = vector<int>(SZ);
        level = vector<int>(SZ);
        conn = vector<vector<Edge>>(SZ);
    }

    void edge(int u, int v, ll cap) {
        conn[u].push_back({v, (int)conn[v].size(), cap});
        conn[v].push_back({u, (int)conn[u].size()-1, 0});
    }

    bool bfs() {
        fill(level.begin(), level.end(), -1);
        queue<int> q; q.push(S);
        level[S]=0;
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(Edge &next:conn[cur]) {
                if(level[next.to]==-1 && next.c) {
                    level[next.to]=level[cur]+1;
                    q.push(next.to);
                }
            }
        }
        return level[E]!=-1;
    }

    ll dfs(int cur, ll curFlow) {
        if(cur==E) return curFlow;
        for(int &i=work[cur];i<conn[cur].size();i++) {
            Edge &next=conn[cur][i];
            if(level[next.to]==level[cur]+1 && next.c) {
                ll flow = dfs(next.to, min(curFlow, next.c));
                if(flow) {
                    next.c-=flow;
                    conn[next.to][next.rev].c+=flow;
                    return flow;
                }
            }
        }
        return 0;
    }

    ll res() {
        ll total=0, flow;
        while(bfs()) {
            fill(work.begin(), work.end(), 0);
            while(flow=dfs(S, LINF)) total+=flow;
        }
        return total;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    while(true) {
        int n; cin >> n;
        if(cin.fail()) break;

        Dinic dinic(2*n+2, 0, 2*n+1);
        for(int i=1;i<=n;i++) {
            dinic.edge(0, i, 1);
            dinic.edge(i+n, 2*n+1, 1);
        }
        for(int i=1;i<=n;i++) {
            string s; cin >> s >> s;
            int k = stoi(s.substr(1, s.length()-2));
            while(k--) {
                int conn; cin >> conn;
                dinic.edge(i, conn+1, 1);
            }
        }
        cout << dinic.res() << '\n';
    }
}