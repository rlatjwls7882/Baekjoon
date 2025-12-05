#include<bits/stdc++.h>
using namespace std;

string s[2];
int m, vis[2][50];
int dx[] = {1, -1, 0, 0};
int dy[] = {0, 0, 1, -1};

void bfs(int x, int y) {
    vis[x][y]=1;
    queue<pair<int, int>> q; q.push({x, y});
    while(!q.empty()) {
        auto [x, y] = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx<0 || nx>=2 || ny<0 || ny>=m || vis[nx][ny]<=vis[x][y]+1 || s[nx][ny]=='#') continue; 
            vis[nx][ny]=vis[x][y]+1;
            q.push({nx, ny});
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> m;
    cin >> s[0] >> s[1];
    fill(&vis[0][0], &vis[1][50], INT_MAX);
    if(s[0][0]=='.') bfs(0, 0);
    if(s[1][0]=='.') bfs(1, 0);

    int cnt = -min(vis[0][m-1], vis[1][m-1]);
    for(int i=0;i<2;i++) for(int j=0;j<m;j++) cnt += s[i][j]=='.';
    cout << cnt;
}