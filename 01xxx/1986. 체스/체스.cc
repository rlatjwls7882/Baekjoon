#include<bits/stdc++.h>
using namespace std;

int n, m;
int board[1000][1000];

void knight(int r, int c) {
    int moveX[] = {2, 2, -2, -2, 1, 1, -1, -1};
    int moveY[] = {1, -1, 1, -1, 2, -2, 2, -2};
    for(int i=0;i<8;i++) {
        int curR = r+moveX[i];
        int curC = c+moveY[i];
        if(0<=curR && curR<=n && 0<=curC && curC<=m && board[curR][curC]==0) {
            board[curR][curC]=4;
        }
    }
}

void queen(int r, int c) {
    int moveX[] = {1, 1, 1, 0, 0, -1, -1, -1};
    int moveY[] = {-1, 0, 1, -1, 1, -1, 0, 1};
    for(int i=0;i<8;i++) {
        int curR = r;
        int curC = c;
        while(true) {
            curR += moveX[i];
            curC += moveY[i];
            if(curR<0 || curR>=n || curC<0 || curC>=m || 1<=board[curR][curC] && board[curR][curC]<=3) break;
            board[curR][curC]=4;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;

    int Q; cin >> Q;
    while(Q--) {
        int r, c; cin >> r >> c;
        board[r-1][c-1]=1;
    }

    int K; cin >> K;
    while(K--) {
        int r, c; cin >> r >> c;
        board[r-1][c-1]=2;
    }

    int P; cin >> P;
    while(P--) {
        int r, c; cin >> r >> c;
        board[r-1][c-1]=3;
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(board[i][j]==1) {
                queen(i, j);
            } else if(board[i][j]==2) {
                knight(i, j);
            }
        }
    }

    int cnt=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(board[i][j]==0) cnt++;
        }
    }
    cout << cnt;
}