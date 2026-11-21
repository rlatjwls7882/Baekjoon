#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
bool visited[1000][1000][2] = {false, };

struct Pos {
    int x, y, dist, breakCnt;

    Pos(int x, int y, int dist, int breakCnt) {
        this->x=x;
        this->y=y;
        this->dist=dist;
        this->breakCnt=breakCnt;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    queue<Pos> q; q.push(Pos(0, 0, 1, 0));
    visited[0][0][0]=visited[0][0][1]=true;
    while(!q.empty()) {
        Pos curPos = q.front(); q.pop();

        if(curPos.x==N-1 && curPos.y==M-1) {
            cout << curPos.dist;
            return 0;
        }

        for(int i=0;i<4;i++) {
            Pos nextPos = Pos(curPos.x+moveX[i], curPos.y+moveY[i], curPos.dist+1, curPos.breakCnt);
            if(nextPos.x<0 || nextPos.x>=N || nextPos.y<0 || nextPos.y>=M) continue;
            if(m[nextPos.x][nextPos.y]=='1') { // 벽인 경우
                if(nextPos.breakCnt==0 && !visited[nextPos.x][nextPos.y][1]) {
                    nextPos.breakCnt++;
                    visited[nextPos.x][nextPos.y][1]=true;
                    q.push(nextPos);
                }
            } else { // 빈칸인 경우
                if(nextPos.breakCnt==0 && !visited[nextPos.x][nextPos.y][0]) {
                    visited[nextPos.x][nextPos.y][0]=true;
                    q.push(nextPos);
                } else if(nextPos.breakCnt==1 && !visited[nextPos.x][nextPos.y][1]) {
                    visited[nextPos.x][nextPos.y][1]=true;
                    q.push(nextPos);
                }
            }
        }
    }
    cout << -1;
}