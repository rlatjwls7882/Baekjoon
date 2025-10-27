#include<bits/stdc++.h>
using namespace std;

int n, m;
string board[1000];
int dx[4] = {0, 1, 0, -1};
int dy[4] = {1, 0, -1, 0};

int left(int x, int y, int dir) {
    int cnt=0;
    while(board[x][y]!='E') {
        dir = (dir+3)%4;
        while(board[x+dx[dir]][y+dy[dir]]=='*') dir = (dir+1)%4;
        x += dx[dir];
        y += dy[dir];
        cnt++;
    }
    return cnt;
}

int right(int x, int y, int dir) {
    int cnt=0;
    while(board[x][y]!='E') {
        dir = (dir+1)%4;
        while(board[x+dx[dir]][y+dy[dir]]=='*') dir = (dir+3)%4;
        x += dx[dir];
        y += dy[dir];
        cnt++;
    }
    return cnt;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;

    int x, y;
    for(int i=0;i<n;i++) {
        cin >> board[i];
        for(int j=0;j<m;j++) {
            if(board[i][j]=='S') x=i, y=j;
        }
    }
    int dir;
    if(y==0) dir=0;
    else if(x==0) dir=1;
    else if(y==m-1) dir=2;
    else dir=3;

    int l = left(x, y, dir);
    int r = right(x, y, dir);
    if(l==r) cout << "SAME";
    else if(l<r) cout << "LEFT IS BEST";
    else cout << "RIGHT IS BEST";
}