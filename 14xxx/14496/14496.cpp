#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a, b; cin >> a >> b;
    int N, M; cin >> N >> M;

    vector<vector<int>> connect = vector<vector<int>>(N+1);
    while(M-->0) {
        int u, r; cin >> u >> r;
        connect[u].push_back(r);
        connect[r].push_back(u);
    }

    int visited[N+1] = {false, };
    queue<P> q; q.push(P(a, 0));
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        if(visited[cur.first]) continue;
        visited[cur.first]=true;
        if(cur.first==b) {
            cout << cur.second;
            return 0;
        }

        for(int next:connect[cur.first]) {
            if(visited[next]) continue;
            q.push(P(next, cur.second+1));
        }
    }
    cout << -1;
}