#include<bits/stdc++.h>
using namespace std;

int depth[40000];
int distFromRoot[40000];
int parent[40000][17];
vector<vector<pair<int, int>>> conn(40000);

void dfs(int cur, int sum) {
    distFromRoot[cur]=sum;
    for(pair<int, int> next:conn[cur]) {
        if(depth[next.first]==-1) {
            depth[next.first]=depth[cur]+1;
            parent[next.first][0]=cur;
            dfs(next.first, sum+next.second);
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    for(int i=0;i<N-1;i++) {
        int u, v, c; cin >> u >> v >> c;
        conn[u-1].push_back({v-1, c});
        conn[v-1].push_back({u-1, c});
    }
    memset(depth, -1, sizeof(depth));
    memset(parent, -1, sizeof(parent));
    depth[0]=0;
    dfs(0, 0);

    for(int i=0;i<16;i++) {
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
        int tmpu=u, tmpv=v;
        for(int i=0;diff!=0;i++) {
            if(diff%2==1) tmpu = parent[tmpu][i];
            diff/=2;
        }

        if(tmpu!=tmpv) {
            for(int i=16;i>=0;i--) {
                if(parent[tmpu][i]!=-1 && parent[tmpu][i]!=parent[tmpv][i]) {
                    tmpu = parent[tmpu][i];
                    tmpv = parent[tmpv][i];
                }
            }
            tmpu = parent[tmpu][0];
        }
        cout << distFromRoot[u]-distFromRoot[tmpu]+distFromRoot[v]-distFromRoot[tmpu] << '\n';
    }
}