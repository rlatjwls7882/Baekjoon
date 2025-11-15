#include<bits/stdc++.h>
using namespace std;

bool board[1000][1000];
int visited[1000][1000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int r, c; cin >> r >> c;
    for(int i=0;i<r;i++) for(int j=0;j<c;j++) cin >> board[i][j];

    int n; cin >> n;
    vector<pair<int, int>> mv(n);
    for(int i=0;i<n;i++) cin >> mv[i].first >> mv[i].second;

    queue<pair<int, int>> q;
    memset(visited, -1, sizeof visited);
    for(int i=0;i<c;i++) {
        if(board[0][i]) {
            q.push({0, i});
            visited[0][i]=0;
        }
    }
    while(!q.empty()) {
        auto [x, y] = q.front(); q.pop();
        if(x==r-1) {
            cout << visited[x][y];
            return 0;
        }
        for(int i=0;i<n;i++) {
            int nx = x+mv[i].first;
            int ny = y+mv[i].second;
            if(nx<0 || nx>=r || ny<0 || ny>=c || visited[nx][ny]!=-1 || !board[nx][ny]) continue;
            q.push({nx, ny});
            visited[nx][ny]=visited[x][y]+1;
        }
    }
    cout << -1;
}