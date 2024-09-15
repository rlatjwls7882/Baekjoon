#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int dice[4][3] = {
    {-1, 0, -1},
    {0, 0, 0},
    {-1, 0, -1},
    {-1, 0, -1},
};
int moveX[4] = {0, 0, -1, 1};
int moveY[4] = {1, -1, 0, 0};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, x, y, K; cin >> N >> M >> x >> y >> K;
    int m[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> m[i][j];
        }
    }

    int diceTopX=1, diceBottomX=3;
    while(K-->0) {
        int tmp; cin >> tmp; tmp--;
        int nextX = x+moveX[tmp];
        int nextY = y+moveY[tmp];
        if(nextX<0 || nextX>=N || nextY<0 || nextY>=M) continue;
        x = nextX;
        y = nextY;

        if(tmp==0) {
            int top = dice[diceTopX][1];
            dice[diceTopX][1] = dice[1][2];
            dice[1][2] = dice[diceBottomX][1];
            dice[diceBottomX][1] = dice[1][0];
            dice[1][0] = top;
        } else if(tmp==1) {
            int top = dice[diceTopX][1];
            dice[diceTopX][1] = dice[1][0];
            dice[1][0] = dice[diceBottomX][1];
            dice[diceBottomX][1] = dice[1][2];
            dice[1][2] = top;
        } else {
            diceTopX = (diceTopX+moveX[tmp]+4)%4;
            diceBottomX = (diceBottomX+moveX[tmp]+4)%4;
        }

        if(m[x][y]==0) {
            m[x][y] = dice[diceBottomX][1];
        } else {
            dice[diceBottomX][1] = m[x][y];
            m[x][y]=0;
        }
        cout << dice[diceTopX][1] << '\n';
    }
}