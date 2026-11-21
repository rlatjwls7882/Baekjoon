#include<bits/stdc++.h>
using namespace std;

int board[100][100];
bool visited[100][100][2]; // [][][0] : gram=0, [][][1] : gram=1

int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};

struct pos {
    int x, y, gram, cost;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, t; cin >> n >> m >> t;

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            cin >> board[i][j];
        }
    }

    int cost=t+1;
    queue<pos> q; q.push({0, 0, 0, 0});
    while(!q.empty()) {
        pos cur = q.front(); q.pop();
        if(cur.x==n-1 && cur.y==m-1) {
            cost=cur.cost;
            break;
        }

        for(int i=0;i<4;i++) {
            pos next = {cur.x+dx[i], cur.y+dy[i], cur.gram, cur.cost+1};
            if(board[next.x][next.y]==2) next.gram=1;
            if(next.x<0 || next.x>=n || next.y<0 || next.y>=m || visited[next.x][next.y][next.gram] || next.gram==0 && board[next.x][next.y]==1) continue;
            visited[next.x][next.y][next.gram]=true;
            q.push(next);
        }
    }
    if(cost>t) cout << "Fail";
    else cout << cost;
}