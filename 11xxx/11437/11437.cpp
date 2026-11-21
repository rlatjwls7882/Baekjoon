#include<bits/stdc++.h>
#define MAX 17
using namespace std;

int depth[50000];
int parent[50000][MAX];
vector<vector<int>> conn(50000);

void dfs(int cur) {
    for(int next:conn[cur]) {
        if(depth[next]==-1) {
            depth[next]=depth[cur]+1;
            parent[next][0]=cur;
            dfs(next);
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    for(int i=0;i<N-1;i++) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }
    memset(depth, -1, sizeof(depth));
    memset(parent, -1, sizeof(parent));
    depth[0]=0;
    dfs(0);

    for(int i=0;i<MAX-1;i++) {
        for(int j=1;j<N;j++) {
            if(parent[j][i]!=-1) {
                parent[j][i+1] = parent[parent[j][i]][i];
            }
        }
    }

    int M; cin >> M;
    while(M-->0) {
        int u, v; cin >> u >> v; u--; v--;
        if(depth[u]<depth[v]) swap(u, v);
        int diff = depth[u]-depth[v];
        for(int i=0;diff;i++) {
            if(diff%2) u = parent[u][i];
            diff/=2;
        }

        if(u!=v) {
            for(int i=MAX-1;i>=0;i--) {
                if(parent[u][i]!=-1 && parent[u][i]!=parent[v][i]) {
                    u = parent[u][i];
                    v = parent[v][i];
                }
            }
            u = parent[u][0];
        }
        cout << u+1 << '\n';
    }
}