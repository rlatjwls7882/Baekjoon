#include<bits/stdc++.h>
using namespace std;

int board[501][501];
bool visited[501][501];
int dx[4] = {0, 0, 1, -1};
int dy[4] = {1, -1, 0, 0};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
    for(int i=1;i<=k;i++) {
        int x, y; cin >> x >> y;
        board[x][y]=i;
    }
    int u1, v1, u2, v2; cin >> u1 >> v1 >> u2 >> v2;

    int requireMove=0, left=0, right=n*m+1;
    for(int i=u1;i<=u2;i++) {
        for(int j=v1;j<=v2;j++) {
            if(board[i][j]) {
                requireMove++;
                left = max(left, board[i][j]);
            }
        }
    }

    while(left<right) {
        int mid = left+right>>1;

        int canMove=0;
        memset(visited, 0, sizeof visited);
        queue<pair<int, int>> q; q.push({u1, v1});
        visited[u1][v1]=true;
        while(!q.empty()) {
            auto [x, y] = q.front(); q.pop();
            for(int i=0;i<4;i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx<=0 || nx>n || ny<=0 || ny>m || visited[nx][ny] || board[nx][ny]>mid) continue;
                if(!board[nx][ny] && (nx<u1 || nx>u2 || ny<v1 || ny>v2)) canMove++;
                visited[nx][ny]=true;
                q.push({nx, ny});
            }
        }
        if(canMove>=requireMove) right=mid;
        else left=mid+1;
    }
    cout << (left==n*m+1 ? -1 : left);
}