#include<bits/stdc++.h>
using namespace std;

int N, M, maxDist=0;
bool visited[50][50];
int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};
string m[50];

struct Move {
    int x, y, cost;
};

void bfs(int x, int y) {
    queue<Move> q; q.push({x, y, 0});
    memset(visited, false, sizeof(visited));
    visited[x][y]=true;
    while(!q.empty()) {
        Move cur = q.front(); q.pop();
        maxDist = max(maxDist, cur.cost);
        for(int i=0;i<4;i++) {
            Move next = {cur.x+moveX[i], cur.y+moveY[i], cur.cost+1};
            if(next.x<0 || next.x>=N || next.y<0 || next.y>=M || visited[next.x][next.y] || m[next.x][next.y]=='W') continue;
            visited[next.x][next.y]=true;
            q.push(next);
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;

    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]=='L') {
                bfs(i, j);
            }
        }
    }
    cout << maxDist;
}