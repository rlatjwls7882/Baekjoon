#include<bits/stdc++.h>
#define MAX 16
using namespace std;

int depth[30000];
int parent[30000][MAX];
vector<vector<int>> conn(30000);

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
    int n; cin >> n;
    for(int i=0;i<n-1;i++) {
        int a, b; cin >> a >> b;
        conn[a-1].push_back(b-1);
        conn[b-1].push_back(a-1);
    }
    memset(depth, -1, sizeof(depth));
    memset(parent, -1, sizeof(parent));
    depth[0]=0;
    dfs(0);

    for(int i=0;i<MAX-1;i++) {
        for(int j=1;j<n;j++) {
            if(parent[j][i]!=-1) {
                parent[j][i+1] = parent[parent[j][i]][i];
            }
        }
    }

    int m; cin >> m;
    int last=0; cin >> last; last--;
    int cost=0;
    while(m-->1) {
        int cur; cin >> cur; cur--;
        int u=last, v=cur;
        if(depth[u]<depth[v]) swap(u, v);
        int diff = depth[u]-depth[v];
        for(int i=0;diff;i++) {
            if(diff%2==1) {
                u = parent[u][i];
                cost += pow(2, i);
            }
            diff/=2;
        }

        if(u!=v) {
            for(int i=MAX-1;i>=0;i--) {
                if(parent[u][i]!=-1 && parent[u][i]!=parent[v][i]) {
                    u = parent[u][i];
                    v = parent[v][i];
                    cost += 2*pow(2, i);
                }
            }
            cost+=2;
        }
        last=cur;
    }
    cout << cost;
}