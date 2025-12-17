#include<bits/stdc++.h>
using namespace std;

int l[1001], conn[1001][1001], conn2[1001][1001];
vector<pair<int, int>> edges;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) cin >> l[i];
    while(m--) {
        int a, b; cin >> a >> b;
        edges.push_back({min(a, b), max(a, b)});
        conn[a][b]=conn[b][a]=true;
    }

    int res=-1;
    for(auto [a, b]:edges) {
        for(int c=a+1;c<=n;c++) {
            if(conn[b][c]) {
                if(conn2[a][c]) res = max(res, l[b]+conn2[a][c]);
                conn2[a][c]=conn2[c][a] = max(conn2[a][c], l[a]+l[b]+l[c]);
            }
        }
    }
    cout << res;
}