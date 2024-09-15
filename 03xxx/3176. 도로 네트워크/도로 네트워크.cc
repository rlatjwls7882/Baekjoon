#include<bits/stdc++.h>
using namespace std;

int depth[100000];
int parent[100000][18];
int minDist[100000][18], maxDist[100000][18];
vector<vector<pair<int, int>>> conn(100000);

void dfs(int cur) {
    for(pair<int, int> next:conn[cur]) {
        if(depth[next.first]==-1) {
            depth[next.first]=depth[cur]+1;
            parent[next.first][0]=cur;
            minDist[next.first][0]=maxDist[next.first][0]=next.second;
            dfs(next.first);
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
    fill(depth, depth+N, -1);
    memset(parent, -1, sizeof(parent));
    depth[0]=0;
    dfs(0);

    for(int i=0;i<17;i++) {
        for(int j=1;j<N;j++) {
            if(parent[j][i]!=-1) {
                parent[j][i+1] = parent[parent[j][i]][i];
                minDist[j][i+1] = min(minDist[j][i], minDist[parent[j][i]][i]);
                maxDist[j][i+1] = max(maxDist[j][i], maxDist[parent[j][i]][i]);
            }
        }
    }

    int M; cin >> M;
    while(M-->0) {
        int u, v; cin >> u >> v; u--; v--;
        if(depth[u]<depth[v]) swap(u, v);
        int diff = depth[u]-depth[v];
        int curMin=INT_MAX, curMax=0;
        for(int i=0;diff!=0;i++) {
            if(diff%2==1) {
                curMin = min(curMin, minDist[u][i]);
                curMax = max(curMax, maxDist[u][i]);
                u = parent[u][i];
            }
            diff/=2;
        }

        if(u!=v) {
            for(int i=17;i>=0;i--) {
                if(parent[u][i]!=-1 && parent[u][i]!=parent[v][i]) {
                    curMin = min(min(curMin, minDist[u][i]), minDist[v][i]);
                    curMax = max(max(curMax, maxDist[u][i]), maxDist[v][i]);
                    u = parent[u][i];
                    v = parent[v][i];
                }
            }
            curMin = min(min(curMin, minDist[u][0]), minDist[v][0]);
            curMax = max(max(curMax, maxDist[u][0]), maxDist[v][0]);
        }
        cout << curMin << ' ' << curMax << '\n';
    }
}