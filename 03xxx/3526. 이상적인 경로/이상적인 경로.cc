#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int n, m;
int depth[MAX];

struct element {
    int e, c;
    bool operator<(const element e) const {
        return c < e.c;
    }
};

vector<vector<element>> conn(MAX);

void bfs() {
    depth[n]=1;
    queue<int> q; q.push(n);
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(auto next:conn[cur]) {
            if(!depth[next.e]) {
                q.push(next.e);
                depth[next.e] = depth[cur]+1;
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    while(m--) {
        int a, b, c; cin >> a >> b >> c;
        conn[a].push_back({b, c});
        conn[b].push_back({a, c});
    }
    bfs(); // 최단경로를 찾기 위한 역방향 bfs

    vector<int> res;
    queue<int> q; q.push(1);
    while(!q.empty()) {
        if(q.front()==n) break;

        // 모든 다음 깊이의 후보 탐색
        vector<element> nextCandidates;
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(auto next:conn[cur]) {
                if(depth[next.e]==depth[cur]-1) {
                    nextCandidates.push_back(next);
                }
            }
        }
        sort(nextCandidates.begin(), nextCandidates.end());

        // c가 가장 작은 다음 깊이의 후보만 남기기
        int minC = (*nextCandidates.begin()).c;
        vector<bool> visited(n+1);
        for(auto e : nextCandidates) {
            if(minC == e.c && !visited[e.e]) {
                q.push(e.e);
                visited[e.e]=true;
            }
        }
        res.push_back(minC);
    }

    cout << res.size() << '\n';
    for(int e : res) cout << e << ' ';
}