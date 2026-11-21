#include<bits/stdc++.h>
using namespace std;

const int MAX = 301;

vector<vector<pair<int, int>>> conn(MAX);
int cost[MAX][MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
    while(k--) {
        int a, b, c; cin >> a >> b >> c;
        if(a<b) conn[a].push_back({b, c});
    }

    for(int i=1;i<=n;i++) {
        for(int j=0;j<m;j++) {
            if(cost[i][j]>0 || i==1 && j==0) {
                for(auto next : conn[i]) {
                    cost[next.first][j+1] = max(cost[next.first][j+1], cost[i][j] + next.second);
                }
            }
        }
    }
    cout << *max_element(&cost[n][0], &cost[n][m]);
}