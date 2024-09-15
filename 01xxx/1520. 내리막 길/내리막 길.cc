#include<bits/stdc++.h>
using namespace std;

int M, N;
int m[500][500];
int dp[500][500];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
void dfs(int x, int y) {
    if(x==0 && y==0) return;
    dp[x][y]=0;
    for(int i=0;i<4;i++) {
        int nextX = x+moveX[i];
        int nextY = y+moveY[i];
        if(nextX<0 || nextX>=M || nextY<0 || nextY>=N || m[x][y]>=m[nextX][nextY]) continue;
        if(dp[nextX][nextY]==-1) dfs(nextX, nextY);
        dp[x][y]+=dp[nextX][nextY];
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> M >> N;
    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            cin >> m[i][j];
        }
    }

    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            dp[i][j]=-1;
        }
    }
    dp[0][0]=1;

    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            if(dp[i][j]==-1) {
                dfs(i, j);
            }
        }
    }
    cout << dp[M-1][N-1];
}