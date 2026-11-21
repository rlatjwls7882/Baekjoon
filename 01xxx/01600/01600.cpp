#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
int moveHorseX[8] = {2, 2, 1, 1, -1, -1, -2, -2};
int moveHorseY[8] = {1, -1, 2, -2, 2, -2, 1, -1};

struct Pos {
    int x, y, cnt, cost;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int K, W, H; cin >> K >> W >> H;

    int m[H][W];
    for(int i=0;i<H;i++) {
        for(int j=0;j<W;j++) {
            cin >> m[i][j];
        }
    }

    bool visited[H][W][K+1];
    for(int i=0;i<H;i++) {
        for(int j=0;j<W;j++) {
            for(int k=0;k<=K;k++) {
                visited[i][j][k]=false;
            }
        }
    }
    for(int i=0;i<=K;i++) visited[0][0][i]=true;
    queue<Pos> q; q.push({0, 0, 0, 0});
    while(!q.empty()) {
        Pos cur = q.front(); q.pop();
        if(cur.x==H-1 && cur.y==W-1) {
            cout << cur.cost;
            return 0;
        }

        if(cur.cnt<K) {
            for(int i=0;i<8;i++) {
                int nextX = cur.x+moveHorseX[i];
                int nextY = cur.y+moveHorseY[i];
                if(nextX<0 || nextX>=H || nextY<0 || nextY>=W || m[nextX][nextY] || visited[nextX][nextY][cur.cnt+1]) continue;
                visited[nextX][nextY][cur.cnt+1]=true;
                q.push({nextX, nextY, cur.cnt+1, cur.cost+1});
            }
        }
        for(int i=0;i<4;i++) {
            int nextX = cur.x+moveX[i];
            int nextY = cur.y+moveY[i];
            if(nextX<0 || nextX>=H || nextY<0 || nextY>=W || m[nextX][nextY] || visited[nextX][nextY][cur.cnt]) continue;
            visited[nextX][nextY][cur.cnt]=true;
            q.push({nextX, nextY, cur.cnt, cur.cost+1});
        }
    }
    cout << -1;
}