#include<bits/stdc++.h>
using namespace std;

int arr[5][5];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
bool visited[5][5];

struct pos {
    int x, y, dist;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=0;i<5;i++) for(int j=0;j<5;j++) cin >> arr[i][j];
    int r, c; cin >> r >> c;

    queue<pos> q; q.push({r, c, 0});
    visited[r][c]=true;
    while(!q.empty()) {
        pos cur = q.front(); q.pop();
        if(arr[cur.x][cur.y]==1) {
            cout << cur.dist;
            return 0;
        }
        for(int i=0;i<4;i++) {
            pos next = {cur.x+moveX[i], cur.y+moveY[i], cur.dist+1};
            if(next.x<0 || next.x>=5 || next.y<0 || next.y>=5 || arr[next.x][next.y]==-1 || visited[next.x][next.y]) continue;
            visited[next.x][next.y]=true;
            q.push(next);
        }
    }
    cout << -1;
}