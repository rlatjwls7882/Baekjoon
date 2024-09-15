#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C; cin >> R >> C;
    string m[R], nextM[R];
    for(int i=0;i<R;i++) {
        cin >> m[i];
        nextM[i]=m[i];
    }

    int up=R-1, down=0, left=C-1, right=0;
    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            if(m[i][j]=='X') {
                int cnt=0;
                for(int k=0;k<4;k++) {
                    int nextX = i+moveX[k];
                    int nextY = j+moveY[k];
                    if(0<=nextX && nextX<R && 0<=nextY && nextY<C && m[nextX][nextY]=='X') continue;
                    cnt++;
                }
                if(cnt>=3) nextM[i][j]='.';
            }
            if(nextM[i][j]=='X') {
                up = min(up, i);
                down = max(down, i);
                left = min(left, j);
                right = max(right, j);
            }
        }
    }

    for(int i=up;i<=down;i++) {
        for(int j=left;j<=right;j++) {
            cout << nextM[i][j];
        }
        cout << '\n';
    }
}