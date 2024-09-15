#include<bits/stdc++.h>
using namespace std;

int N, M, p, maxVal;
int W[50][50];
int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};
bool visited[50][50] = {false, };

void dfs(int x, int y, int total, int cost, int last) {
    maxVal = max(maxVal, total);
    for(int i=0;i<4;i++) {
        int nextX = x+moveX[i];
        int nextY = y+moveY[i];
        if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || visited[nextX][nextY] || last!=i/2) continue;
        if(!visited[nextX][nextY]) {
            visited[nextX][nextY]=true;
            if(last==0) {
                if(cost+1<=p) dfs(nextX, nextY, total+W[nextX][nextY], cost+1, 0);
                if(cost+2<=p) dfs(nextX, nextY, total+W[nextX][nextY], cost+2, 1);
            } else {
                if(cost+1<=p) dfs(nextX, nextY, total+W[nextX][nextY], cost+1, 1);
                if(cost+2<=p) dfs(nextX, nextY, total+W[nextX][nextY], cost+2, 0);
            }
            visited[nextX][nextY]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> W[i][j];
        }
    }
    int x, y; cin >> x >> y >> p;

    visited[x][y]=true;
    dfs(x, y, W[x][y], 0, 0);
    dfs(x, y, W[x][y], 0, 1);
    cout << maxVal;
}