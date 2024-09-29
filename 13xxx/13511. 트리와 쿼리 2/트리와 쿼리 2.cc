#include<bits/stdc++.h>
using namespace std;

vector<vector<pair<int, int>>> conn(100000);
int parent[100000][18];
long long cost[100000][18];
int depth[100000];

void dfs(int cur) {
    for(auto next:conn[cur]) {
        if(depth[next.first]==-1) {
            depth[next.first]=depth[cur]+1;
            parent[next.first][0]=cur;
            cost[next.first][0]=next.second;
            dfs(next.first);
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    for(int i=0;i<N-1;i++) {
        int u, v, w; cin >> u >> v >> w;
        conn[u-1].push_back({v-1, w});
        conn[v-1].push_back({u-1, w});
    }
    fill(depth+1, depth+N, -1);
    memset(parent, -1, sizeof(parent));
    dfs(0);

    for(int i=0;i<17;i++) {
        for(int j=1;j<N;j++) {
            if(parent[j][i]!=-1) {
                parent[j][i+1] = parent[parent[j][i]][i];
                cost[j][i+1] = cost[j][i]+cost[parent[j][i]][i];
            }
        }
    }

    int M; cin >> M;
    while(M-->0) {
        int a, u, v; cin >> a >> u >> v; u--; v--;
        long long totalCost=0;
        int tmpu=u, tmpv=v;
        if(depth[tmpu]<depth[tmpv]) swap(tmpu, tmpv);
        int diff = depth[tmpu]-depth[tmpv];
        for(int i=0;diff;i++) {
            if(diff%2==1) {
                totalCost += cost[tmpu][i];
                tmpu = parent[tmpu][i];
            }
            diff/=2;
        }
        if(tmpu!=tmpv) {
            for(int i=17;i>=0;i--) {
                if(parent[tmpu][i]!=-1 && parent[tmpu][i]!=parent[tmpv][i]) {
                    totalCost += cost[tmpu][i] + cost[tmpv][i];
                    tmpu=parent[tmpu][i];
                    tmpv=parent[tmpv][i];
                }
            }
            totalCost += cost[tmpu][0] + cost[tmpv][0];
            tmpu = parent[tmpu][0];
        }
        if(a==1) {
            cout << totalCost << '\n';
        } else {
            int k; cin >> k; k--;
            int parentNode = tmpu;
            diff = depth[u]-depth[parentNode];
            if(k<=diff) {
                for(int i=0;k;i++) {
                    if(k%2==1) u = parent[u][i];
                    k/=2;
                }
                cout << u+1 << '\n';
            } else {
                k -= diff;
                diff = depth[v]-depth[parentNode]-k;
                for(int i=0;diff;i++) {
                    if(diff%2==1) v = parent[v][i];
                    diff/=2;
                }
                cout << v+1 << '\n';
            }
        }
    }
}