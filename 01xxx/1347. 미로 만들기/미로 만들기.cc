#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {0, -1, 0, 1};
int moveY[4] = {1, 0, -1, 0};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; string s; cin >> N >> s;

    char m[101][101];
    for(int i=0;i<=100;i++) {
        for(int j=0;j<=100;j++) {
            m[i][j]='#';
        }
    }

    int curX=50, curY=50, left=50, right=50, up=50, down=50, move=0;
    m[50][50]='.';
    for(int i=0;i<N;i++) {
        if(s[i]=='R') {
            move = (move+1)%4;
        } else if(s[i]=='L') {
            move = (move+3)%4;
        } else {
            curX = curX+moveX[move];
            curY = curY+moveY[move];
            left = min(left, curX);
            right = max(right, curX);
            up = min(up, curY);
            down = max(down, curY);
            m[curY][curX]='.';
        }
    }

    for(int i=up;i<=down;i++) {
        for(int j=left;j<=right;j++) {
            cout << m[i][j];
        }
        cout << '\n';
    }
}