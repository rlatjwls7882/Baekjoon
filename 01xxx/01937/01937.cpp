#include <bits/stdc++.h>
using namespace std;

int n;
int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};

int m[500][500];
int dp[500][500];

int dfs(int x, int y) {
    if(dp[x][y]!=-1) return dp[x][y];

    for(int i=0;i<4;i++) {
        int nextX = x+moveX[i];
        int nextY = y+moveY[i];
        if(nextX<0 || nextX>=n || nextY<0 || nextY>=n || m[x][y]>=m[nextX][nextY]) continue;
        dp[x][y] = max(dp[x][y], dfs(nextX, nextY)+1);
    }
    
    if(dp[x][y]==-1) return dp[x][y]=1;
    else return dp[x][y];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cin >> m[i][j];
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            dp[i][j]=-1;
        }
    }

    int maxCnt=1;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            maxCnt = max(maxCnt, dfs(i, j));
        }
    }
    cout << maxCnt;
}