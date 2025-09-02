#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};
int dist[1000][1000];
bool visited[1000][1000], A[1000][1000];

struct pos {
    int x, y;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) for(int j=0;j<m;j++) cin >> A[i][j];
    int sr, sc, er, ec; cin >> sr >> sc >> er >> ec;

    queue<pos> q;
    q.push({sr-1, sc-1}); q.push({er-1, ec-1});
    visited[sr-1][sc-1] = visited[er-1][ec-1] = true;
    while(!q.empty()) {
        pos cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            pos next = {cur.x+dx[i], cur.y+dy[i]};
            if(next.x<0 || next.x>=n || next.y<0 || next.y>=m || visited[next.x][next.y] || !A[next.x][next.y]) continue;
            visited[next.x][next.y]=true;
            q.push(next);
        }
    }

    q.push({sr-1, sc-1});
    fill(&dist[0][0], &dist[999][1000], INF);
    dist[sr-1][sc-1]=0;
    while(!q.empty()) {
        pos cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            pos next = {cur.x+dx[i], cur.y+dy[i]};
            if(next.x<0 || next.x>=n || next.y<0 || next.y>=m || dist[next.x][next.y]<=dist[cur.x][cur.y]+!visited[next.x][next.y]) continue;
            dist[next.x][next.y]=dist[cur.x][cur.y]+!visited[next.x][next.y];
            q.push(next);
        }
    }
    if(dist[er-1][ec-1]) cout << dist[er-1][ec-1]+1;
    else cout << 0;
}