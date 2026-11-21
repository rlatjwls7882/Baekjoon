#include<bits/stdc++.h>
using namespace std;

typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<vvi> vvvi;
typedef pair<int, int> pi;

const int MAX = 200'000;

vvvi conn(2, vvi(MAX));
int cost[2][MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, e; cin >> n >> e;
    while(e--) {
        int a, b, v; cin >> a >> b >> v;
        conn[v][a].push_back(b);
        conn[v][b].push_back(a);
    }

    memset(cost, -1, sizeof cost);
    queue<pi> q; q.push({0, 0}); q.push({1, 0}); // {v, pos}
    cost[0][0] = cost[1][0] = 0;
    while(!q.empty()) {
        auto cur = q.front(); q.pop();
        if(cur.second == n-1) {
            cout << cost[cur.first][cur.second];
            return 0;
        }
        for(int next : conn[cur.first][cur.second]) {
            pi nn = {cur.first^1, next};
            if(cost[nn.first][nn.second]==-1) {
                cost[nn.first][nn.second] = cost[cur.first][cur.second]+1;
                q.push(nn);
            }
        }
    }
    cout << -1;
}