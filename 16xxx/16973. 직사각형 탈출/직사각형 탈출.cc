#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
int board[1001][1001];
int preSum[1001][1001];
bool visited[1001][1001];

struct Pos {
    int x, y, cost;
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    for(int i=1;i<=N;i++) {
        for(int j=1;j<=M;j++) {
            cin >> board[i][j];
            preSum[i][j] = board[i][j] + preSum[i-1][j] + preSum[i][j-1] - preSum[i-1][j-1];
        }
    }
    int H, W, Sr, Sc, Fr, Fc; cin >> H >> W >> Sr >> Sc >> Fr >> Fc;

    queue<Pos> q; q.push({Sr, Sc, 0});
    visited[Sr][Sc]=true;
    while(!q.empty()) {
        Pos cur = q.front(); q.pop();
        if(cur.x==Fr && cur.y==Fc) {
            cout << cur.cost;
            return 0;
        }
        for(int i=0;i<4;i++) {
            Pos next = {cur.x + moveX[i], cur.y + moveY[i], cur.cost+1};
            if(next.x<=0 || next.x+H-1>N || next.y<=0 || next.y+W-1>M || preSum[next.x+H-1][next.y+W-1] - preSum[next.x+H-1][next.y-1] - preSum[next.x-1][next.y+W-1] + preSum[next.x-1][next.y-1] != 0 || visited[next.x][next.y]) continue;
            visited[next.x][next.y]=true;
            q.push(next);
        }
    }
    cout << -1;
}