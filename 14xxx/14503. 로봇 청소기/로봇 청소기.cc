#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {-1, 0, 1, 0};
int moveY[4] = {0, 1, 0, -1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int r, c, d; cin >> r >> c >> d;

    int m[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> m[i][j];
        }
    }

    int x=r, y=c, totalClean=0;
    while(true) {
        if(m[x][y]==0) { // 1.
            m[x][y]=2;
            totalClean++;
        }

        int cnt=0;
        for(int i=0;i<4;i++) {
            int nextX = x+moveX[i];
            int nextY = y+moveY[i];
            if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || m[nextX][nextY]!=0) continue;
            cnt++;
        }

        if(cnt==0) { // 2.
            int nextX = x+moveX[(d+2)%4]; // 2-2.
            int nextY = y+moveY[(d+2)%4];
            if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || m[nextX][nextY]==1) break;

            x = nextX; // 2-1.
            y = nextY;
        } else { // 3.
            d = (d+3)%4; // 3-1.
            
            int nextX = x+moveX[d]; // 3-2.
            int nextY = y+moveY[d];
            if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || m[nextX][nextY]!=0) continue;
            x = nextX;
            y = nextY;
        }
    }
    cout << totalClean;
}