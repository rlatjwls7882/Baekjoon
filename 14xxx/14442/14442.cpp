#include <bits/stdc++.h>
using namespace std;

bool visited[1000][1000][10] = {false, };
int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};

struct Pos {
    int x, y, cost, breakCnt;
    Pos(int x, int y, int cost, int breakCnt) {
        this->x=x;
        this->y=y;
        this->cost=cost;
        this->breakCnt=breakCnt;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;

    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    queue<Pos> q; q.push(Pos(0, 0, 1, 0));
    visited[0][0][0]=true;
    while(!q.empty()) {
        Pos cur = q.front(); q.pop();
        if(cur.x==N-1 && cur.y==M-1) {
            cout << cur.cost;
            return 0;
        }

        for(int i=0;i<4;i++) {
            Pos next = Pos(cur.x+moveX[i], cur.y+moveY[i], cur.cost+1, cur.breakCnt);
            if(next.x<0 || next.x>=N || next.y<0 || next.y>=M) continue;
            if(m[next.x][next.y]=='1') next.breakCnt++;
            if(next.breakCnt>K || visited[next.x][next.y][next.breakCnt]) continue;
            visited[next.x][next.y][next.breakCnt]=true;
            q.push(next);
        }
    }
    cout << -1;
}