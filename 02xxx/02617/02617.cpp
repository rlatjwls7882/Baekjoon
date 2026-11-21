#include<bits/stdc++.h>
using namespace std;

bool visited[99]; // 이미 방문한 위치인지 확인
vector<vector<int>> conn1(99); // conn1[A][B]: B가 A보다 무겁다.
vector<vector<int>> conn2(99); // conn2[A][B]: A가 B보다 무겁다.

int bfs(vector<vector<int>> conn, int cur) {
    int cnt=1;
    memset(visited, 0, sizeof visited);
    queue<int> q; q.push(cur);
    visited[cur]=true;

    while(!q.empty()) {
        cur = q.front(); q.pop();

        for(int next:conn[cur]) {
            if(!visited[next]) {
                q.push(next);
                visited[next]=true;
                cnt++;
            }
        }
    }
    return cnt;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    while(m--) {
        int a, b; cin >> a >> b;
        conn1[b-1].push_back(a-1);
        conn2[a-1].push_back(b-1);
    }

    int cnt=0;
    for(int i=0;i<n;i++) {
        memset(visited, 0, sizeof visited);
        int sum1 = bfs(conn1, i); // i가 앞에서 최소 몇번째 위치하는지

        memset(visited, 0, sizeof visited);
        int sum2 = bfs(conn2, i); // i가 뒤에서 최소 몇번째 위치하는지

        // 중간 무게가 될 수 없는 경우 확인
        if(!(sum1<=(n+1)/2 && (n+1)/2<=n-sum2+1)) cnt++;
    }
    cout << cnt;
}