#include<bits/stdc++.h>
using namespace std;

bool chk;
bool visited[5][5];
int dx[] = {1, -1, 0, 0};
int dy[] = {0, 0, 1, -1};
int board[5][5];

bool dfs(int x, int y, int cost, int cnt) {
    visited[x][y]=true;
    if(board[x][y]==1) cnt++;

    if(cnt==2) return true;
    if(cost==3) {
        visited[x][y]=false;
        return false;
    }

    for(int i=0;i<4;i++) {
        int nx = x+dx[i];
        int ny = y+dy[i];
        if(nx<0 || nx>=5 || ny<0 || ny>=5 || visited[nx][ny] || board[nx][ny]==-1) continue;
        if(dfs(nx, ny, cost+1, cnt)) return true;
    }
    visited[x][y]=false;
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=0;i<5;i++) {
        for(int j=0;j<5;j++) {
            cin >> board[i][j];
        }
    }

    int r, c; cin >> r >> c;
    if(dfs(r, c, 0, 0)) cout << 1;
    else cout << 0;
}