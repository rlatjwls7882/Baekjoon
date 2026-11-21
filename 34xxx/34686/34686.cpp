#include<bits/stdc++.h>
using namespace std;

int l[1000], diag[1000][1000];
vector<vector<int>> conn(1000);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> l[i];
    while(m--) {
        int a, b; cin >> a >> b;
        conn[a-1].push_back(b-1);
        conn[b-1].push_back(a-1);
    }

    int res=-1;
    for(int a=0;a<n;a++) {
        for(int j=0;j<conn[a].size();j++) {
            for(int k=j+1;k<conn[a].size();k++) {
                int b = conn[a][j];
                int c = conn[a][k];
                if(diag[b][c]) res = max(res, l[a]+l[b]+l[c]+diag[b][c]);
                diag[b][c]=diag[c][b] = max(diag[b][c], l[a]);
            }
        }
    }
    cout << res;
}