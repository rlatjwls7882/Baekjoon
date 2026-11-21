#include<bits/stdc++.h>
using namespace std;

int n, m;
int before[30][30], after[30][30];
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};
bool visited[30][30];

struct pos {
    int x, y;
};

bool chk(pos start) {
    if(start.x==-1) return true;

    queue<pos> q; q.push(start);
    int startBefore = before[start.x][start.y];
    int startAfter = after[start.x][start.y];
    visited[start.x][start.y]=true;
    before[start.x][start.y]=startAfter;
    while(!q.empty()) {
        pos cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            int nx = cur.x+dx[i];
            int ny = cur.y+dy[i];
            if(nx<0 || nx>=n || ny<0 || ny>=m || startBefore!=before[nx][ny] || visited[nx][ny]) continue;
            visited[nx][ny]=true;
            before[nx][ny]=startAfter;
            q.push({nx, ny});
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(before[i][j]!=after[i][j]) return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            cin >> before[i][j];
        }
    }
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            cin >> after[i][j];
        }
    }

    pos start = {-1, -1};
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(before[i][j]!=after[i][j]) {
                start = {i, j};
            }
        }
    }
    if(chk(start)) cout << "YES";
    else cout << "NO";
}