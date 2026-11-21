#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'000;

int c[1000];
bool visited[1001][MAX];
vector<vector<int>> conn(1001);

struct element {
    int pos, t;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, t; cin >> n >> m >> t;
    while(m--) {
        int a, b; cin >> a >> b;
        conn[a].push_back(b);
        conn[b].push_back(a);
    }
    for(int i=0;i<t;i++) cin >> c[i];

    queue<element> q; q.push({1, 0});
    while(!q.empty()) {
        auto cur = q.front(); q.pop();
        if(cur.t>=MAX) break;
        if(cur.pos==n) {
            cout << cur.t;
            return 0;
        }
        if(c[cur.t%t] == cur.pos) {
            if(!visited[c[(cur.t+1)%t]][cur.t+1]) {
                visited[c[(cur.t+1)%t]][cur.t+1]=true;
                q.push({c[(cur.t+1)%t], cur.t+1});
            }
        } else {
            if(!visited[cur.pos][cur.t+1]) {
                visited[cur.pos][cur.t+1]=true;
                q.push({cur.pos, cur.t+1});
            }
            for(int next:conn[cur.pos]) {
                if(!visited[next][cur.t+1]) {
                    visited[next][cur.t+1]=true;
                    q.push({next, cur.t+1});
                }
            }
        }
    }
    cout << -1;
}