#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
bool visited[2000][2000] = {false, };

struct Pos {
    int x, y, c;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;

    queue<Pos> q;
    int m[N][M];
    pair<int, int> S;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> m[i][j];
            if(m[i][j]==3) {
                q.push({i, j, 0});
                m[i][j]=1;
            } else if(m[i][j]==4) {
                m[i][j]=1;
                S = {i, j};
            }
        }
    }

    while(!q.empty()) {
        Pos cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            Pos next = {cur.x+moveX[i], cur.y+moveY[i], cur.c+1};
            if(next.x<0 || next.x>=N || next.y<0 || next.y>=M || visited[next.x][next.y] || next.c>K) continue;
            m[next.x][next.y]=1;
            visited[next.x][next.y]=true;
            q.push(next);
        }
    }

    q.push({S.first, S.second, 0});
    while(!q.empty()) {
        Pos cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            Pos next = {cur.x+moveX[i], cur.y+moveY[i], cur.c+1};
            if(next.x<0 || next.x>=N || next.y<0 || next.y>=M || m[next.x][next.y]==1) continue;
            if(m[next.x][next.y]==2) {
                cout << next.c;
                return 0;
            }
            m[next.x][next.y]=1;
            q.push(next);
        }
    }
    cout << -1;
}