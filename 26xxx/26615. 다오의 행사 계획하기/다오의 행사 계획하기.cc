#include<bits/stdc++.h>
using namespace std;

int depth[100000];
int parent[100000][18];
long long dist[100000][18];
vector<vector<int>> conn(100000);

void dfs(int cur) {
    for(int next:conn[cur]) {
        if(depth[next]==-1) {
            depth[next]=depth[cur]+1;
            parent[next][0]=cur;
            dist[next][0]=1;
            dfs(next);
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m, t; cin >> n >> m >> t;
    for(int i=0;i<n-1;i++) {
        for(int j=0;j<m;j++) {
            int A; cin >> A;
            if(!A) {
                conn[i*m+j].push_back((i+1)*m+j);
                conn[(i+1)*m+j].push_back(i*m+j);
            }
        }
    }
    for(int i=0;i<n;i++) {
        for(int j=0;j<m-1;j++) {
            int A; cin >> A;
            if(!A) {
                conn[i*m+j].push_back(i*m+j+1);
                conn[i*m+j+1].push_back(i*m+j);
            }
        }
    }
    fill(depth+1, depth+n*m, -1);
    memset(&parent, -1, sizeof(parent));
    dfs(0);

    for(int i=0;i<17;i++) {
        for(int j=0;j<n*m;j++) {
            if(parent[j][i]!=-1) {
                dist[j][i+1] = dist[j][i]+dist[parent[j][i]][i];
                parent[j][i+1] = parent[parent[j][i]][i];
            }
        }
    }

    long long table[t+1] = {0, };
    int k; cin >> k;
    while(k-->0) {
        int S, E, a, b, c, d, V; cin >> S >> E >> a >> b >> c >> d >> V;

        long long totalDist=1;
        int u = a*m+b, v = c*m+d;
        if(depth[u]<depth[v]) swap(u, v);
        int diff = depth[u]-depth[v];
        for(int i=0;diff;i++) {
            if(diff%2) {
                totalDist += dist[u][i];
                u = parent[u][i];
            }
            diff/=2;
        }

        if(u!=v) {
            for(int i=17;i>=0;i--) {
                if(parent[u][i]!=-1 && parent[u][i]!=parent[v][i]) {
                    totalDist += dist[u][i]*2;
                    u = parent[u][i];
                    v = parent[v][i];
                }
            }
            totalDist+=2;
        }
        table[S-1] += totalDist*V;
        table[E] -= totalDist*V;
    }

    for(int i=0;i<t;i++) {
        table[i+1] += table[i];
        cout << table[i] << '\n';
    }
}