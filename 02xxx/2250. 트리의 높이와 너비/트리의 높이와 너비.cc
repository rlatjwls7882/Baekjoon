#include<bits/stdc++.h>
using namespace std;

int depthMax[10001], depthMin[10001];
int child[10001][2], parent[10001];
int pos[10001];
int curPos=0;

void init(int n) {
    fill(parent, parent+n+1, -1);
    fill(depthMax, depthMax+n+1, INT_MIN);
    fill(depthMin, depthMin+n+1, INT_MAX);
}

void dfs(int cur, int depth) {
    if(child[cur][0]!=-1) dfs(child[cur][0], depth+1);
    pos[cur]=curPos++;
    depthMax[depth] = max(depthMax[depth], pos[cur]);
    depthMin[depth] = min(depthMin[depth], pos[cur]);
    if(child[cur][1]!=-1) dfs(child[cur][1], depth+1);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    init(n);

    for(int i=0;i<n;i++) {
        int p; cin >> p; cin >> child[p][0] >> child[p][1];
        if(child[p][0]>=0) parent[child[p][0]]=p;
        if(child[p][1]>=0) parent[child[p][1]]=p;
    }

    int root=1;
    while(parent[root]!=-1) {
        root = parent[root];
    }
    dfs(root, 1);

    int maxWidth=1, depth=1;
    for(int i=1;i<=n;i++) {
        if(maxWidth<depthMax[i]-depthMin[i]+1) {
            maxWidth = depthMax[i]-depthMin[i]+1;
            depth=i;
        }
    }
    cout << depth << ' ' << maxWidth;
}