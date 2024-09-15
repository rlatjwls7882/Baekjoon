#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {0, 1, 0, -1};
int moveY[4] = {1, 0, -1, 0};

struct Pos {
    int x, y, cntR, cntL;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C, K; cin >> R >> C >> K;
    string m[R];
    for(int i=0;i<R;i++) {
        cin >> m[i];
    }

    bool visited[R][C][K+1][K+1];
    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            for(int k=0;k<=K;k++) {
                for(int l=0;l<=K;l++) {
                    visited[i][j][k][l]=false;
                }
            }
        }
    }

    for(int i=0;i<=K;i++) {
        for(int j=0;j<=K;j++) {
            visited[0][0][i][j]=true;
        }
    }
    queue<Pos> q; q.push({0, 0, 0, 0});
    while(!q.empty()) {
        Pos cur = q.front(); q.pop();
        if(cur.x==R-1 && cur.y==C-1) {
            cout << "Yes";
            return 0;
        }
        int move;
        if(m[cur.x][cur.y]=='R') move=0;
        else if(m[cur.x][cur.y]=='D') move=1;
        else if(m[cur.x][cur.y]=='L') move=2;
        else move=3;

        int nextX = cur.x+moveX[move];
        int nextY = cur.y+moveY[move];
        if(0<=nextX && nextX<R && 0<=nextY && nextY<C && !visited[nextX][nextY][cur.cntR][cur.cntL]) {
            for(int i=cur.cntR;i<=K;i++) {
                for(int j=cur.cntL;j<=K;j++) {
                    visited[nextX][nextY][i][j]=true;
                }
            }
            q.push({nextX, nextY, cur.cntR, cur.cntL});
        }

        if(cur.cntR+1<=K) {
            int nextX = cur.x+moveX[(move+1)%4];
            int nextY = cur.y+moveY[(move+1)%4];
            if(0<=nextX && nextX<R && 0<=nextY && nextY<C && !visited[nextX][nextY][cur.cntR+1][cur.cntL]) {
                for(int i=cur.cntR+1;i<=K;i++) {
                    for(int j=cur.cntL;j<=K;j++) {
                        visited[nextX][nextY][i][j]=true;
                    }
                }
                q.push({nextX, nextY, cur.cntR+1, cur.cntL});
            }
        }

        if(cur.cntR+2<=K) {
            int nextX = cur.x+moveX[(move+2)%4];
            int nextY = cur.y+moveY[(move+2)%4];
            if(0<=nextX && nextX<R && 0<=nextY && nextY<C && !visited[nextX][nextY][cur.cntR+2][cur.cntL]) {
                for(int i=cur.cntR+2;i<=K;i++) {
                    for(int j=cur.cntL;j<=K;j++) {
                        visited[nextX][nextY][i][j]=true;
                    }
                }
                q.push({nextX, nextY, cur.cntR+2, cur.cntL});
            }
        }

        if(cur.cntR+3<=K) {
            int nextX = cur.x+moveX[(move+3)%4];
            int nextY = cur.y+moveY[(move+3)%4];
            if(0<=nextX && nextX<R && 0<=nextY && nextY<C && !visited[nextX][nextY][cur.cntR+3][cur.cntL]) {
                for(int i=cur.cntR+3;i<=K;i++) {
                    for(int j=cur.cntL;j<=K;j++) {
                        visited[nextX][nextY][i][j]=true;
                    }
                }
                q.push({nextX, nextY, cur.cntR+3, cur.cntL});
            }
        }

        if(cur.cntL+1<=K) {
            int nextX = cur.x+moveX[(move+3)%4];
            int nextY = cur.y+moveY[(move+3)%4];
            if(0<=nextX && nextX<R && 0<=nextY && nextY<C && !visited[nextX][nextY][cur.cntR][cur.cntL+1]) {
                for(int i=cur.cntR;i<=K;i++) {
                    for(int j=cur.cntL+1;j<=K;j++) {
                        visited[nextX][nextY][i][j]=true;
                    }
                }
                q.push({nextX, nextY, cur.cntR, cur.cntL+1});
            }
        }

        if(cur.cntL+2<=K) {
            int nextX = cur.x+moveX[(move+2)%4];
            int nextY = cur.y+moveY[(move+2)%4];
            if(0<=nextX && nextX<R && 0<=nextY && nextY<C && !visited[nextX][nextY][cur.cntR][cur.cntL+2]) {
                for(int i=cur.cntR;i<=K;i++) {
                    for(int j=cur.cntL+2;j<=K;j++) {
                        visited[nextX][nextY][i][j]=true;
                    }
                }
                q.push({nextX, nextY, cur.cntR, cur.cntL+2});
            }
        }

        if(cur.cntL+3<=K) {
            int nextX = cur.x+moveX[(move+1)%4];
            int nextY = cur.y+moveY[(move+1)%4];
            if(0<=nextX && nextX<R && 0<=nextY && nextY<C && !visited[nextX][nextY][cur.cntR][cur.cntL+3]) {
                for(int i=cur.cntR;i<=K;i++) {
                    for(int j=cur.cntL+3;j<=K;j++) {
                        visited[nextX][nextY][i][j]=true;
                    }
                }
                q.push({nextX, nextY, cur.cntR, cur.cntL+3});
            }
        }
    }
    cout << "No";
}