#include<bits/stdc++.h>
using namespace std;

bool conn[2001][2001];

struct edge {
    int u, v;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    vector<edge> edges(m);
    for(int i=0;i<m;i++) {
        cin >> edges[i].u >> edges[i].v;
        conn[edges[i].u][edges[i].v]=true;
    }

    int cnt=0;
    for(int i=0;i<m;i++) {
        for(int j=i+1;j<m;j++) {
            int u1 = edges[i].u, v1 = edges[i].v;
            int u2 = edges[j].u, v2 = edges[j].v;
            if(v1==v2 && !conn[u1][u2] && !conn[u2][u1]) cnt++;
        }
    }
    cout << cnt;
}