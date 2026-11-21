#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;

    int go[n][n];
    memset(go, -1, sizeof(go));
    for(int i=0;i<n;i++) {
        go[i][i]=0;
    }

    while(m-->0) {
        int u, v, b; cin >> u >> v >> b;
        go[u-1][v-1]=0;
        if(b==1) go[v-1][u-1]=0;
        else go[v-1][u-1]=1;
    }

    for(int mid=0;mid<n;mid++) {
        for(int start=0;start<n;start++) {
            for(int end=0;end<n;end++) {
                if(go[start][mid]!=-1 && go[mid][end]!=-1) {
                    if(go[start][end]==-1) go[start][end] = go[start][mid] + go[mid][end];
                    else go[start][end] = min(go[start][end], go[start][mid] + go[mid][end]);
                }
            }
        }
    }

    int k; cin >> k;
    while(k-->0) {
        int s, e; cin >> s >> e;
        cout << go[s-1][e-1] << '\n';
    }
}